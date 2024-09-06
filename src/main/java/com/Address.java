package com;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "AddressTab")
public class Address {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer addressId;
	 private String  city;
	 private String street;
	 private Boolean isOpen;
	 @Transient
	 private String x;
	 @Lob
	 private byte[] img;
	 @Temporal(TemporalType.DATE)
	 private Date addDate;
	 
	 
	 
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public Boolean getIsOpen() {
		return isOpen;
	}
	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}
	public Address(Integer addressId, String city, String street, Boolean isOpen, String x, byte[] img, Date addDate) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.street = street;
		this.isOpen = isOpen;
		this.x = x;
		this.img = img;
		this.addDate = addDate;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	
}
