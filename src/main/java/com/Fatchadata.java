package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fatchadata {
	
	public static void main(String[] args) {
		
		    SessionFactory sf = new Configuration().configure("com/hibernate.cfg.xml").buildSessionFactory();
		    
		     Session session = sf.openSession();
		     
				/*
				 * Student student = session.load(Student.class, 1);
				 * System.out.println(student);
				 */
		               
		               Student student1 =  session.get(Student.class, 1);
		               System.out.println(student1);
		     
		     session.close();
		   
		    sf.close();
	}

}
