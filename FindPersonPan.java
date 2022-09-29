package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindPersonPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, 10); 
		if(person!=null) {
			System.out.println("*****Person info******");
			System.out.println(" Id :" + person.getId());
			System.out.println("Name :" + person.getName());
			System.out.println("Gender :" + person.getGender());
		
		Pan pan = person.getPan();
		if (pan != null) {
			System.out.println("****pan info*****");
			System.out.println("Id : "+pan.getId());
			System.out.println("Num :"+pan.getNum());
			System.out.println("Type :"+pan.getType());
		}
		}
		else {
		System.out.println("invalid id");
		}
	}
}
