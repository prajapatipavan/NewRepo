package com.MtoM;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Manymapping {
	
	public static void main(String[] args) {
		
		 SessionFactory sf = new Configuration().configure("com/hibernate.cfg.xml").buildSessionFactory();
		 
		 
		 System.out.println("hello");
		 
		 
		   Project pr = new Project();
		   pr.setpId(1);
		   pr.setpName("HMS Project");
		   
		   Project pr1 = new Project();
		   pr1.setpId(2);
		   pr1.setpName("LMS Project");
		   
		   Emp emp = new Emp();
		   emp.setEmpId(101);
		   emp.setEmpName("pavan");
		    
		   
		   Emp emp1 = new Emp();
		   emp1.setEmpId(102);
		   emp1.setEmpName("Dahrmik");
		   
		   
		       List<Emp> emplist = new ArrayList<>();
		       emplist.add(emp1);
		       emplist.add(emp);
		       
		       List<Project> prlist = new ArrayList<>();
		       prlist.add(pr);
		       prlist.add(pr1);
		       
		       emp.setProjects(prlist);
		       pr.setEmployees(emplist);
		       
		       
		           Session session  = sf.openSession();
		           
		           Transaction tx = session.beginTransaction();
		           
		            session.save(pr);
		            session.save(pr1);
		            session.save(emp);
		            session.save(emp1);
		            
		          
		            
		            tx.commit();
		            
		            session.close();
		            sf.close();
		
	}

}
