package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindGST {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
	GST gst	=entityManager.find(GST.class, 6);
	if(gst!=null) {
		System.out.println("****GST Details******");
	System.out.println("Id :"+gst.getId());
	System.out.println("Num :"+gst.getNum());
	System.out.println("Status :"+gst.getStatus());
	
	Company company=gst.getCompany();
	if(company!=null) {
		System.out.println("*****Company Details*********");
		System.out.println("Company Id :"+company.getId());
		System.out.println("Company Name :"+company.getName());
		System.out.println("Company Address :"+company.getAddress());
	}
	}
	else {
		System.out.println("enter valid id");
	}
	}
}
