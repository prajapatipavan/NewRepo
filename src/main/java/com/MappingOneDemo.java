package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingOneDemo {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure("com/hibernate.cfg.xml").buildSessionFactory();

		Question que = new Question();
		Answer ans = new Answer();
		Answer ans1 = new Answer();
		Answer ans2 = new Answer();
		
	

		// Set properties
		que.setQueId(101);
		que.setQuestion("What is Java?");

		ans.setAnsId(201);
		ans.setAnswer("Java is a programming language.");
		ans.setQuestion(que);

		ans1.setAnsId(202);
		ans1.setAnswer("Java is used for building applications.");
		ans1.setQuestion(que);

		ans2.setAnsId(203);
		ans2.setAnswer("Java is object-oriented.");
		ans2.setQuestion(que);
		
	

		List<Answer> dataans = new ArrayList<>();
		dataans.add(ans);
		dataans.add(ans1);
		dataans.add(ans2);

		que.setAns(dataans);

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(que);

		tx.commit();

		Question question = session.get(Question.class, 101);
		System.out.println(question.getQuestion());
		
		 for (Answer answer : question.getAns()) {
			
			 System.out.println(answer.getAnswer());
		  }

		session.close();
		sf.close();
	}
}
