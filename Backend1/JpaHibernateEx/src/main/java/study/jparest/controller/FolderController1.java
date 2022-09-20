package study.jparest.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import study.jparest.entity.Folder_info_tbl;
import study.jparest.repository.FolderRepo;

@Controller
public class FolderController1 {

	@Autowired
	FolderRepo repo;
	
	@GetMapping("/createfolder")
	public String getFolder(Model model)
	{
		List<Folder_info_tbl> list = repo.findAll();
		model.addAttribute("list", list);
		return "FolderHome";
	}
	
	@PostMapping("/create")
	public String CreateFolder(@RequestParam("folName") String folName,RedirectAttributes ra) throws IOException
	{
		
		Folder_info_tbl folder = new Folder_info_tbl();
		folder.setFolderName(folName);
		repo.save(folder);
		ra.addFlashAttribute("message1", "The Folder has been Create");
		return "redirect:/createfolder";
	}
	
	@GetMapping("/delete")
	public String DeleteFolder(@RequestParam("fol_id") int fol_id,RedirectAttributes ra) throws IOException
	{
		long id=fol_id;
		repo.deleteById(id);
		ra.addFlashAttribute("message1", "The Folder HAs Been Deleted");
		return "redirect:/createfolder";
		//<a th:href="@{'/download?id='+${doc.doc_id}}">[[${doc.file_name}]]</a>
		
	}
	

}
