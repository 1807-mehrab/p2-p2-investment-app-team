package com.revature.helloworld.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.helloworld.model.Company;
import com.revature.helloworld.model.Stock;

public class StockDao {
	public Stock getStockbyStockName(String companyname) {
    	//Session s = sessionFactory.getCurrentSession();
    	Stock bob = new Stock();
    	bob.setStockId(1);;
    	bob.setEmail("bob@gmail.com");
    	bob.setCompanyId(companyname);
    	bob.setNumShares(20);
    	//return (User)s.createQuery("from User where username = :username").setString("username", username).list().get(0);
    	return bob;
    }

}
