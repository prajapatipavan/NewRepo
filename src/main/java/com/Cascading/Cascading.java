package com.Cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Answer;
import com.Question;

public class Cascading {
	
	public static void main(String[] args) {
		
		  SessionFactory sf = new Configuration().configure("com/hibernate.cfg.xml").buildSessionFactory();
		  
		  
		  
		            Session session = sf.openSession();
		            
		            Question que = new Question();
		            
		            que.setQueId(122);
		            que.setQuestion("what is Spring?");
		            
		            Answer ans = new Answer();
		            
		            ans.setAnsId(1233);
		            ans.setAnswer("spring is framwork!!");
		            ans.setQuestion(que);
		            
                    Answer ans2 = new Answer();
		            
		            ans2.setAnsId(2332);
		            ans2.setAnswer("2  spring is framwork!!");
		            ans2.setQuestion(que);
		            
                    Answer ans3 = new Answer();
		            
		            ans3.setAnsId(3234);
		            ans3.setAnswer("3  spring is framwork!!");
		            ans3.setQuestion(que);
		            
		            List<Answer> list = new ArrayList<>();
		            
		             list.add(ans);
		             list.add(ans2);
		             list.add(ans3);
		             
		             que.setAns(list);
		             
		          Transaction tx = session.beginTransaction();
		          
		            session.save(que);
		            
		            
		            tx.commit();
		            
		            session.close();
		            
		            sf.close();
	}

}
