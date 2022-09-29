package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GSTDriver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Company company=new Company();
		GST gst= new GST();
		gst.setNum("YTH89");
		gst.setStatus("Active");
		gst.setCompany(company);
		
		company.setName("SuperDry");
		company.setAddress("Bombay");
		
		entityTransaction.begin();
		entityManager.persist(gst);
		entityManager.persist(company);
		entityTransaction.commit();
	}
}
