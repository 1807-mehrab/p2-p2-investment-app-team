package com.revature.investmentApp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.revature.investmentApp.model.UserTable;

@Transactional
public class UserTableDao {

	  private SessionFactory sessionFactory;
	  
	  public void setSessionFactory(SessionFactory sessionFactory) {
	      this.sessionFactory = sessionFactory;
	  }
	 
	  @SuppressWarnings("unchecked")
	  public List<UserTable> getAllUsers() {
	      Session session = this.sessionFactory.getCurrentSession();
	 
	      List<UserTable> list = session.createQuery("from UserTable").list();

	      return list;
	  }
}
