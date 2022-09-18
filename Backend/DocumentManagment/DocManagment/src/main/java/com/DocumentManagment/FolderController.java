package com.DocumentManagment;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FolderController 
{
	@Autowired
	private FolderRepo dr1;
	
	@GetMapping("/createfolder")
	public String getFolder(Model model)
	{
		List<Folders> list = dr1.findAll();
		model.addAttribute("list", list);
		//return "Home";
		
		
		return "FolderHome";
		
		
	}
	@PostMapping("/create")
	public String CreateFolder(@RequestParam("folName") String folName,RedirectAttributes ra) throws IOException
	{
		//String filename =StringUtils.cleanPath(multipartFile.getOriginalFilename());
		//Documents document = new Documents();
		Folders folder = new Folders();
		//document.setFile_name(filename);
		folder.setFolderName(folName);
		//document.setContent(multipartFile.getBytes());
		
		//document.setSize(multipartFile.getSize());
		//document.setUploadTime(new Date());
		//dr.save(document);
		dr1.save(folder);
		//ra.addFlashAttribute("message", "The file has been Uploaded");
		ra.addFlashAttribute("message1", "The Folder has been Create");
		return "redirect:/createfolder";
		//<a th:href="@{'/download?id='+${doc.doc_id}}">[[${doc.file_name}]]</a>
		
	}
	

}
