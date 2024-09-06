package com.sqlnative;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.Student;

public class Sqlnative {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure("com/hibernate.cfg.xml").buildSessionFactory();
		
		
		
		             Session s = sf.openSession();
		             
		             
		              String q = "select * from Student where name=:x ";
		              
		          
		                     
		                        
		              NativeQuery<Student> query = s.createNativeQuery(q, Student.class);
		              
		              query.setParameter("x", "rajesh");
		              
		              
		                    List<Student> list =query.list();
		                    
		                    for (Student student : list) {
		                    	
		                    	System.out.println(student.getName());
								
							}
		             
		             s.close();
		             sf.close();
	}

}
