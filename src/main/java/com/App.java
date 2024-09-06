package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) throws IOException
    {
        System.out.println("Hello World!");
        
        SessionFactory sf = new Configuration().configure("com/hibernate.cfg.xml").buildSessionFactory();
        
         System.out.println(sf);
         System.out.println(sf.isOpen());
         
         
               Student sd = new Student();
               Cirtificate cs = new Cirtificate();
               sd.setEmail("ppavan.tec@gmail.com");
               sd.setName("pavan");
               cs.setCourse("Java");
               cs.setDate("28/12");
               
                sd.setCirt(cs);
                
                
                Student sd1 = new Student();
                Cirtificate cs1= new Cirtificate();
                sd1.setEmail("ppavan.tec@gmail.com");
                sd1.setName("pavan");
                cs1.setCourse("Javas");
                cs1.setDate("28/12");
                
                 sd1.setCirt(cs1);
                 
                 Student sd2 = new Student();
                 Cirtificate cs2= new Cirtificate();
                 sd2.setEmail("pp.tec@gmail.com");
                 sd2.setName("Rajesh");
                 cs2.setCourse("c");
                 cs2.setDate("20/12");
                 
                  sd2.setCirt(cs2);
               
                
               Address ad = new Address();
               ad.setStreet("sreet1");
               ad.setIsOpen(false);
               ad.setCity("idar");
               ad.setAddDate(new Date());
               ad.setX("ssss");
               
               FileInputStream fs = new FileInputStream("src/main/java/com/adhar.jpeg");
               
               
               byte [] byt = new byte[fs.available()];
               
                  fs.read(byt);
                  ad.setImg(byt);
                  
               Session session = sf.openSession();
               
               Transaction tx = session.beginTransaction();
               
                session.merge(sd);
                session.merge(sd1);
                session.merge(ad);
                session.merge(sd2);
                
                tx.commit();
                
                session.close();
    }
} 
