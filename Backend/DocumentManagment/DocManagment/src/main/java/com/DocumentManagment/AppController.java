package com.DocumentManagment;

import java.io.IOException;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.resource.HttpResource;



@Controller
//@RequestMapping("/doc")
public class AppController 
{
	@Autowired
	private DocumetsRepository dr;
	
	
	
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
	
	
	
	

}
