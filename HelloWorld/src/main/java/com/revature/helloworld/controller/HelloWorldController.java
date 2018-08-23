package com.revature.helloworld.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.revature.helloworld.DAO.UserDao;
import com.revature.helloworld.model.Person;
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
	        List<User> uselist = null;
	        uselist.add(dao.getUserByUsername("joe@gmail.com"));
	        uselist.add(dao.getUserByUsername("jime@gmail.com"));
	        uselist.add(dao.getUserByUsername("bob@gmail.com"));
	        uselist.add(dao.getUserByUsername("robby@gmail.com"));
	        return uselist;
	    }
}