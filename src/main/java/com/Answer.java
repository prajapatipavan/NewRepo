package com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer {

	 @Id
	 private Integer ansId;
	 private String answer;
	  @ManyToOne
	  @JoinColumn(name = "queId")
	 private Question question;
	public Integer getAnsId() {
		return ansId;
	}
	public void setAnsId(Integer ansId) {
		this.ansId = ansId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", answer=" + answer + ", getAnsId()=" + getAnsId() + ", getAnswer()="
				+ getAnswer() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	 
	 
}
