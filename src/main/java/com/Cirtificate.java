package com;

import jakarta.persistence.Embeddable;

@Embeddable
public  class Cirtificate {
	
	
	  private String course;
	  private String date;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Cirtificate [course=" + course + ", date=" + date + "]";
	}
	  
	  
	  

}
