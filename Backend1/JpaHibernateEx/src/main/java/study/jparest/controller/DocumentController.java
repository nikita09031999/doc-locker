package study.jparest.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import study.jparest.entity.Doc_info_tbl;
import study.jparest.entity.Folder_info_tbl;
import study.jparest.models.URLdo;
import study.jparest.repository.DocumentRepository;
import study.jparest.repository.FolderRepository;
import study.jparest.service.QRCodeService;

@Controller
public class DocumentController {
    @Autowired
    DocumentRepository docRepository;
    
    @Autowired
    FolderRepository folderRepository;
    
   @Autowired
    private QRCodeService qrCodeService;
    
    
    @GetMapping("/")
	public String viewHomePage(Model model)
	{
		List<Doc_info_tbl> list = docRepository.findAll();
		model.addAttribute("list", list);
		return "Home.html";          //need to write html page(remaining)
	}
    
    @PostMapping("/upload")
	public String uploadFile(@RequestParam("document") MultipartFile multipartFile,
			RedirectAttributes ra) throws IOException
	{
		String filename =StringUtils.cleanPath(multipartFile.getOriginalFilename());
		Doc_info_tbl document = new Doc_info_tbl();
		document.setFileName(filename);
		document.setContent(multipartFile.getBytes());
		document.setFileSize(multipartFile.getSize());
		document.setDate(new Date());
		//folderRepository.findByFolderName(name);
		//document.setFolder_info_tbl(new Folder_info_tbl());
		docRepository.save(document);
		ra.addFlashAttribute("message", "The file has been Uploaded");
		
		return "redirect:/";
			
	}
    
    @GetMapping("/download")
	public void downloadFile(@Param("id")Long id,HttpServletResponse response) throws Exception
	{
		Optional<Doc_info_tbl> result =docRepository.findById(id);
		if(!result.isPresent())
		{
			throw new Exception("Could Not Find Documents Of Given ID :"+id);
			
		}
		Doc_info_tbl document =result.get();
		response.setContentType("application/octet-stream");
		String headerKey="Content-Disposition";
		String headerValue="attachment; filename="+ document.getFileName();
		response.setHeader (headerKey, headerValue);
		ServletOutputStream outputStream = response.getOutputStream() ;
		outputStream.write(document.getContent());
		outputStream.close();
		
	}
    
    @GetMapping("/docdelete")
	@RequestMapping(value = "/docdelete", method = RequestMethod.GET, params = "delete")
	public String DeleteDoc(@RequestParam("doc_id") int doc_id,RedirectAttributes ra) throws IOException
	{
		long id=doc_id;
	
		//System.out.println(id);
		docRepository.deleteById(id);
			ra.addFlashAttribute("message", "The File HAs Been Deleted");
		return "redirect:/";
		//<a th:href="@{'/download?id='+${doc.doc_id}}">[[${doc.file_name}]]</a>
		
	}
	@GetMapping("/docdelete")//For Show QR and Link
	@RequestMapping(value = "/docdelete", method = RequestMethod.GET, params = "share")
	public String ShareDoc(@RequestParam("doc_id") int doc_id,RedirectAttributes ra,Model model	)throws IOException
	{
		long id=doc_id;
		String url="http://localhost:8080/view/"+doc_id;
		URLdo urldo=new URLdo(url);
		List<URLdo> list=new ArrayList<URLdo>();
		list.add(urldo);
	
		model.addAttribute("list",list);
		model.addAttribute("qrCodeContent", "/generateQR?url=" + url);
        return "show-qr-code";
		
		
		
		//return "viewURL";
		//<a th:href="@{'/download?id='+${doc.doc_id}}">[[${doc.file_name}]]</a>
		
	}
	
	
	@GetMapping("/generateQR")
    public void generateQR(String url, HttpServletResponse response) throws IOException {
        response.setContentType("image/png");
        byte[] qrCode = qrCodeService.generateQRCode(url, 500, 500);
        OutputStream outputStream = response.getOutputStream();
        outputStream.write(qrCode);
    }
	@GetMapping("view/{doc_id}")//3rd PErson
	public String ViewDoc(@PathVariable long doc_id,Model model,HttpServletResponse response) throws IOException
	{
		Doc_info_tbl document=new Doc_info_tbl();
		List<Doc_info_tbl> list = docRepository.findAll();
		for(Doc_info_tbl d:list)
		{
			if(d.getDocId()==doc_id)
			{
				document.setFileName(d.getFileName());
				document.setDocId(d.getDocId());
				document.setContent(d.getContent());
				document.setFileSize(d.getFileSize());
				document.setDate(d.getDate());
				break;
			}
				
		}
		List<Doc_info_tbl> list1=new ArrayList<>();
		list1.add(document);
		model.addAttribute("list1", list1);
      //<a th:href="@{'/download?id='+${doc.doc_id}}">[[${doc.file_name}]]</a>
		return "share";
	}
	
	



    
    
}
