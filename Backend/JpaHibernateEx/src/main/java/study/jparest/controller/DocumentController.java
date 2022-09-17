package study.jparest.controller;

import java.io.IOException;
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
import study.jparest.repository.DocumentRepository;
import study.jparest.repository.FolderRepository;

@Controller
public class DocumentController {
    @Autowired
    DocumentRepository docRepository;
    
    @Autowired
    FolderRepository folderRepository;
    
    
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
		document.setFolder_info_tbl(new Folder_info_tbl());
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


    
    
}
