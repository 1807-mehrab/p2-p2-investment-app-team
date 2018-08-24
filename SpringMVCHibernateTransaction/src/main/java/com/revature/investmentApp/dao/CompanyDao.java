package com.revature.investmentApp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.revature.investmentApp.model.Company;



@Transactional
public class CompanyDao {
	private SessionFactory sessionFactory;
	  
	  public void setSessionFactory(SessionFactory sessionFactory) {
	      this.sessionFactory = sessionFactory;
	  }
	 
	  @SuppressWarnings("unchecked")
	  public List<Company> getAllCompanies() {
	      Session session = this.sessionFactory.getCurrentSession();
	 
	      List<Company> list = session.createQuery("from Company").list();

	      return list;
	  }
	  
	  @SuppressWarnings("unchecked")
	  public Company getCompanyById(int id) {
		  Session session = this.sessionFactory.getCurrentSession();
		  List<Company> list = session.createQuery("from Company").list();
		  for(Company com:list) {
			  if(com.getCompany_id()==id) {
				  return com; 
			  } 
		  }
		  return null;
	  }
}
