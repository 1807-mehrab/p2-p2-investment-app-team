package org.o7planning.tutorial.springhibernate.controller;
 
import java.util.List;

import org.o7planning.dao.DepartmentDAO;
import org.o7planning.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.investmentApp.model.Person;
import com.revature.investmentApp.dao.UserTableDao;
import com.revature.investmentApp.model.UserTable;
 
@CrossOrigin
@Controller
@RequestMapping("/")
public class MainController {
 
@Autowired
private DepartmentDAO departmentDAO;
 @Autowired
 private UserTableDao userTableDao;
 
	
 @RequestMapping({ "/", "/home", "/index" })
 public String home(Model model) {
     return "index";
 }
 
	@GetMapping("/users")
	  public @ResponseBody UserTable getAllUsers() {
	   
		
		List<UserTable> users=userTableDao.getAllUsers();
	      for(UserTable user:users) {
	    	  System.out.println(user.toString());
	      }
			
	      return users.get(0);
	  }
	@CrossOrigin
	@RequestMapping(value="/view",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	    public @ResponseBody Person getPerson(){
	        Person person = new Person();
	        person.setId(1);
	        person.setName("hmk");
	        System.out.println("got the request");
	        return person;
	    }
	 
	 @RequestMapping({ "/deptList" })
	 public String deptList(Model model) {
	     departmentDAO.createDepartment("Dept Name", "Dept Location");
	 
	     List<Department> list = departmentDAO.listDepartment();
	     for (Department dept : list) {
	         System.out.println("Dept No " + dept.getDeptNo());
	     }
	     model.addAttribute("departments", list);
	     return "deptList";
	 }
}