package study.jparest.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import study.jparest.entity.Folder_info_tbl;
import study.jparest.entity.User_info_tbl;
import study.jparest.entity.User_tbl;
import study.jparest.repository.DocumentRepository;
import study.jparest.repository.FolderRepo;
import study.jparest.repository.FolderRepository;
import study.jparest.repository.UserRepo;
import study.jparest.repository.UserRepository;

@Controller
public class FolderController1 {

	@Autowired
	FolderRepo repo;
	
	@Autowired
	UserRepository repo1;
	
	@Autowired
	UserRepo repo2;
	
	@Autowired
	FolderRepository repo3;
	
	@Autowired
	DocumentRepository repo4;
	
	@GetMapping("/createfolder")
	public String getFolder(Model model,HttpSession session)
	{
		int id=repo2.getid();
		List<User_tbl> user1=new ArrayList<User_tbl>();
		int value=0;
		 user1 =repo2.findAll();
		 for(User_tbl u:user1)
		 {
			 if(u.getId()==id)
			 {
				 value=u.getSession_id();
				 break;
			 }
		 }
		System.out.println(value);
		
		List<Folder_info_tbl> list = repo3.findByfId(value);
	
		/*
		List<Folder_info_tbl> list = new ArrayList<Folder_info_tbl>();
		
		for(Folder_info_tbl f: list1)
		{
			System.out.println(f.getUser_info_tbl().getUserId());
			if(f.getUser_info_tbl().getUserId() == value)
			{
				list.add(f);
			}
		}
		*/
		model.addAttribute("list", list);
		
		//User_tbl user=new User_tbl();
		//user.setSession_id(1);
		//repo1.save(user);
		//System.out.println(repo1.getid());
		
		session.setAttribute("user_id",value );
		
		return "FolderHome";
	}
	
	@PostMapping("/create")
	public String CreateFolder(@RequestParam("folName") String folName,RedirectAttributes ra,HttpServletRequest request) throws IOException
	{
		
		HttpSession session=request.getSession();
		int id=(int) session.getAttribute("user_id");
		
		System.out.println("session"+id);
		
		
    	//Folder_info_tbl obj=new Folder_info_tbl(folName,id);
       //  repo.save(obj);
		
		//User_info_tbl u=new User_info_tbl();
		//u.setUserId(id);
		User_info_tbl u=repo1.findById(id).get();
    	Folder_info_tbl obj=new Folder_info_tbl(folName,u);
    	//obj.setFolderName(folName);
    	//obj.setUser_info_tbl(u);
         repo.save(obj);
		
		//repo.save(folder);
		ra.addFlashAttribute("message1", "The Folder has been Create");
		return "redirect:/createfolder";
	}
	
	
	@GetMapping("/delete")
	public String DeleteFolder(@RequestParam("fol_id") int fol_id,RedirectAttributes ra) throws IOException
	{
		int id=fol_id;
		repo4.deleteBydId(id);
		repo.deleteById(id);
		ra.addFlashAttribute("message1", "The Folder Has Been Deleted");
		return "redirect:/createfolder";
		//<a th:href="@{'/download?id='+${doc.doc_id}}">[[${doc.file_name}]]</a>
	}
}
