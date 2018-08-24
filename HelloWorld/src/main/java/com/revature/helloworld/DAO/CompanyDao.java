package com.revature.helloworld.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.helloworld.model.Company;
import com.revature.helloworld.model.User;

public class CompanyDao {

	
    public Company getCompanyByCompanyname(String companyname) {
    	//Session s = sessionFactory.getCurrentSession();
    	Company bob = new Company();
    	bob.setCompanyName(companyname);
    	bob.setCompanyId(1);
    	bob.setCompanyValue(8000);
    	//return (User)s.createQuery("from User where username = :username").setString("username", username).list().get(0);
    	return bob;
    }
}
