package study.jparest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import study.jparest.entity.User_info_tbl;

import study.jparest.repository.UserRepository;

@CrossOrigin
@RestController
@RequestMapping(path ="/user")
public class UserController {
  
    
    @Autowired
    UserRepository repo;
    
    @GetMapping("/allusers")
	public List<User_info_tbl> f1()
	{
		
		List<User_info_tbl> list=repo.findAll();
		
		return list;
	}
    
    @PostMapping("/adduser")
	public String f2(@RequestBody User_info_tbl u)
	{
		
       User_info_tbl obj=new User_info_tbl(u.getFirstName(),u.getLastName(),u.getUserName(),u.getPassword(),u.getEmail(),u.getMobileNo());
        
       repo.save(obj);
		
		return "insert user";
	}
	
    
    @DeleteMapping("removeuser/{user_id}")
	public String f4(@PathVariable("user_id") int user_id)
	{
		repo.deleteById(user_id);
		return "user deleted";
	}
    
    @PostMapping("/signin")
	public String f3(@RequestBody User_info_tbl u)
	{
		
       User_info_tbl obj=new User_info_tbl(u.getUserName(),u.getPassword());
        
       System.out.println("one"+obj.getUserName()+""+obj.getPassword());
      List<User_info_tbl> list=repo.findAll();
      
      System.out.println("second"+list);
    
      for(User_info_tbl user:list)
      {
    	  System.out.println("third"+user.getUserName()+""+user.getPassword());
    	  if((user.getUserName()==obj.getUserName()) && (user.getPassword()==obj.getPassword()))
    	  {
    		  return "sign in success";
    	  }
      }
		
		return "sign in invalid";
	}
    
}