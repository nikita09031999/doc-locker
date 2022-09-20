package com.DocumentManagment;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.resource.HttpResource;

import com.DocumentManagment.Qrcode.QRCodeService;



@Controller
//@RequestMapping("/doc")
public class AppController 
{
	@Autowired
	private DocumetsRepository dr;
	 @Autowired
	    private QRCodeService qrCodeService;
	
	
	
	@GetMapping("/")
	public String viewHomePage(Model model)
	{
		List<Documents> list = dr.findAll();
		model.addAttribute("list", list);
		return "Home";
	}
	@PostMapping("/upload")
	public String uploadFile(@RequestParam("document") MultipartFile multipartFile,
			RedirectAttributes ra) throws IOException
	{
		String filename =StringUtils.cleanPath(multipartFile.getOriginalFilename());
		Documents document = new Documents();
		document.setFile_name(filename);
		document.setContent(multipartFile.getBytes());
		document.setSize(multipartFile.getSize());
		document.setUploadTime(new Date());
		dr.save(document);
		ra.addFlashAttribute("message", "The file has been Uploaded");
		
		return "redirect:/";
		
		
	}
	@GetMapping("/download")
	public void downloadFile(@Param("id")Long id,HttpServletResponse response) throws Exception
	{
		Optional<Documents> result =dr.findById(id);
		if(!result.isPresent())
		{
			throw new Exception("Could Not Find Documents Of Given ID :"+id);
			
		}
		Documents document =result.get();
		response.setContentType("application/octet-stream");
		String headerKey="Content-Disposition";
		String headerValue="attachment; filename="+ document.getFile_name();
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
		
		//int id=Integer.parseInt(fol_id);
		//String filename =StringUtils.cleanPath(multipartFile.getOriginalFilename());
		//Documents document = new Documents();
		//Folders folder = new Folders();
		//document.setFile_name(filename);
		//folder.setFolderName(folName);
		//document.setContent(multipartFile.getBytes());
		System.out.println(id);
		dr.deleteById(id);
		//document.setSize(multipartFile.getSize());
		//document.setUploadTime(new Date());
		//dr.save(document);
		//dr1.save(folder);
		//ra.addFlashAttribute("message", "The file has been Uploaded");
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
		Documents document=new Documents();
		List<Documents> list = dr.findAll();
		for(Documents d:list)
		{
			if(d.getDoc_id()==doc_id)
			{
				document.setFile_name(d.getFile_name());
				document.setDoc_id(d.getDoc_id());
				document.setContent(d.getContent());
				document.setSize(d.getSize());
				document.setUploadTime(d.getUploadTime());
				break;
			}
				
		}
		List<Documents> list1=new ArrayList<>();
		list1.add(document);
		model.addAttribute("list1", list1);
//<a th:href="@{'/download?id='+${doc.doc_id}}">[[${doc.file_name}]]</a>
		return "share";
	}
	
	
	
	
	
	

}
