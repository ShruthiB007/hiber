package com.ty.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BikeDriver {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.setId(1);
		bike.setName("Plusar");
		bike.setCost(78000);
		
		Bike bike2=new Bike();
		bike2.setId(2);
		bike2.setName("CBZ");
		bike2.setCost(125000);
		
		Charcy charcy=new Charcy();
		charcy.setId(1254);
		charcy.setType("Ladder");
		
		Charcy charcy2=new Charcy();
		charcy2.setId(4512);
		charcy2.setType("Ladder");
		
		bike.setCharcy(charcy);
		bike2.setCharcy(charcy2);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(bike);
		entityManager.persist(bike2);
		entityManager.persist(charcy);
		entityManager.persist(charcy2);
		entityTransaction.commit();
	}
}
