package com.revature.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.revature.helloworld.DAO.CompanyDao;
import com.revature.helloworld.DAO.StockDao;
import com.revature.helloworld.DAO.UserDao;
import com.revature.helloworld.model.Company;
import com.revature.helloworld.model.Person;
import com.revature.helloworld.model.Stock;
import com.revature.helloworld.model.User;

@CrossOrigin
@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC!";
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	/*
	 @RequestMapping(value= "/String", method = RequestMethod.GET, produces = "application/json")
	public String getString() {

		return "Some String";
	}
	 */
	 @RequestMapping("/view")
	    public @ResponseBody Person getPerson(){
	        Person person = new Person();
	        person.setId(1);
	        person.setName("hmk");
	        System.out.println("got the request");
	        return person;
	    }
	 
	 @RequestMapping("/user")
	    public @ResponseBody User getUser(){
		 	UserDao dao = new UserDao();
	        System.out.println("got the request");
	        return dao.getUserByUsername("bob@gmail.com");
	    }
	 
	 @RequestMapping("/users")
	    public @ResponseBody List<User> getUsers(){
		 	UserDao dao = new UserDao();
	        System.out.println("got the request");
	        List<User> uselist = new ArrayList<User>();
	        uselist.add(dao.getUserByUsername("joe@gmail.com"));
	        uselist.add(dao.getUserByUsername("jime@gmail.com"));
	        uselist.add(dao.getUserByUsername("bob@gmail.com"));
	        uselist.add(dao.getUserByUsername("robby@gmail.com"));
	        return uselist;
	    }
	 
	@PostMapping(value = "/usercheck")
	public ResponseEntity<User> receiveUser(@RequestBody User user, Errors errors) {
		if (errors.hasErrors()) {
			return null;
		}
		if(user.getPassword() == "password")
		{
			return ResponseEntity.ok(user);
		}else
			return null;
	}
	
	 @RequestMapping("/companies")
	    public @ResponseBody List<Company> getCompanies(){
		 	CompanyDao dao = new CompanyDao();
	        System.out.println("got the request");
	        List<Company> uselist = new ArrayList<Company>();
	        uselist.add(dao.getCompanyByCompanyname("Apple"));
	        uselist.add(dao.getCompanyByCompanyname("IBM"));
	        uselist.add(dao.getCompanyByCompanyname("USD"));
	        uselist.add(dao.getCompanyByCompanyname("Wal-Mart"));
	        return uselist;
	    }
	 
	 @RequestMapping("/stocks")
	    public @ResponseBody List<Stock> getStocks(){
		 	StockDao dao = new StockDao();
	        System.out.println("got the request");
	        List<Stock> uselist = new ArrayList<Stock>();
	        uselist.add(dao.getStockbyStockName("Apple"));
	        uselist.add(dao.getStockbyStockName("IBM"));
	        uselist.add(dao.getStockbyStockName("USD"));
	        uselist.add(dao.getStockbyStockName("Wal-Mart"));
	        return uselist;
	    }
}