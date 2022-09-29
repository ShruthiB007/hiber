package com.ty.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindCharcy {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Charcy charcy=entityManager.find(Charcy.class, 1254);
		
		System.out.println(charcy.getId());
		System.out.println(charcy.getType());
		
		Bike bike=charcy.getBike();
		
		System.out.println(bike.getId());
		System.out.println(bike.getCost());
		System.out.println(bike.getName());
	}
}
