package com;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	 @Id
	  private Integer QueId;
	  private String question;
	  

	  @OneToMany(mappedBy = "question" ,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	  
	  private List<Answer> ans;
	  
	  
	public Integer getQueId() {
		return QueId;
	}
	public void setQueId(Integer queId) {
		QueId = queId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [QueId=" + QueId + ", question=" + question + ", ans=" + ans + "]";
	}
	  
	  
	  
	  
	  
}
