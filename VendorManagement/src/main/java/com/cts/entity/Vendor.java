package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Vendor")
public class Vendor  {

	private String firstName;
	private String lastName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vendorId;
	private String mobileNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	public long getVendorId() {
		return vendorId;
	}

	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	

	public Vendor(String firstName, String lastName, long vendorId, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.vendorId = vendorId;
		this.mobileNumber = mobileNumber;
	}

	public Vendor() {
		super();
	}

}