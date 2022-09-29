package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person= new Person();
		person.setId(18);
		person.setName("ritha");
		person.setGender("female");
		
		
		Pan pan= new Pan();
		pan.setId(8);
		pan.setNum("SDFS8956");
		pan.setType("Business");
		
		//person.setPan(pan);
		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}
}
