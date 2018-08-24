package org.o7planning.tutorial.springhibernate.controller;
 
import java.util.List;

import org.o7planning.dao.DepartmentDAO;
import org.o7planning.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.investmentApp.dao.CompanyDao;
import com.revature.investmentApp.dao.UserTableDao;
import com.revature.investmentApp.model.Company;
import com.revature.investmentApp.model.Person;
import com.revature.investmentApp.model.UserTable;
 

@RestController
public class MainController {
 
@Autowired
private DepartmentDAO departmentDAO;
 @Autowired
 private UserTableDao userTableDao;
 
 @Autowired
 private CompanyDao companyDao;
 
	
 @RequestMapping({ "/", "/home", "/index" })
 public String home(Model model) {
     return "index";
 }
 
	@GetMapping(value="/users")
	  public List<UserTable> getAllUsers() {
	   
		List<UserTable> users=userTableDao.getAllUsers();
		/*
	      for(UserTable user:users) {
	    	  System.out.println(user.toString());
	      }
	      */
	      //System.out.println("got the request //user ");
	      return users;
	  }
	
	@GetMapping(value="/user/{email:.+}")
	  public UserTable getUserByEmail(@PathVariable(value="email") String email) {

	      return userTableDao.getUserByEmail(email);
	  }
	
	@GetMapping(value="/companies")
	  public List<Company> getAllCompanies() {
	   
		List<Company> companies=companyDao.getAllCompanies();
		/*
	      for(UserTable user:users) {
	    	  System.out.println(user.toString());
	      }
	      */
	      //System.out.println("got the request //user ");
	      return companies;
	  }
	
	@GetMapping(value="/company/{id}")
	  public Company getCompanyById(@PathVariable(value="id") int id) {
	      return companyDao.getCompanyById(id);
	  }
	@GetMapping(value="/list")
	 public Department list(Model model) {
	     //departmentDAO.createDepartment("Dept Name", "Dept Location");
	 
	     List<Department> list = departmentDAO.listDepartment();
	     for (Department dept : list) {
	         System.out.println("Dept No " + dept.getDeptNo());
	     }
	     //model.addAttribute("departments", list);
	     return list.get(0);
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
	 
		@RequestMapping(value="/view",method=RequestMethod.GET, produces = "application/json")
	    public Person getPerson(){
	        Person person = new Person();
	        person.setId(1);
	        person.setName("hmk");
	        //System.out.println("got the request //view");
	        return person;
	    }
}