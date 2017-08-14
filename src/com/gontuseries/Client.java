package com.gontuseries;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Client {

	public static void main(String[] args) {
		Address address1 = new Address();
		address1.setStreet("BTM");
		Address address2 = new Address();
		address2.setStreet("HAL");
		
		Student student1 = new Student();
		student1.setStudName("Susheel");
		student1.setAddress(address1);
		
		Student student2 = new Student();
		student2.setStudName("Soni");
		student2.setAddress(address2);
				
		(address1.getStudent()).add(student1);
		(address2.getStudent()).add(student2);
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(address1);
		session.save(address2);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
