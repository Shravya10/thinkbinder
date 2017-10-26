package com.javasampleapproach.angularjs.model;

import java.sql.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "createuser")
public class Customer {
	
	private String firstname;
	private String lastname;
	private String contactno;
	private String email;
	private Date dob;
	private String technology;

	public Customer() {
	}

	public Customer( String firstname, String lastname, String contactno, String email, Date dob,
			String technology) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.contactno = contactno;
		this.email = email;
		this.dob = dob;
		this.technology = technology;
	}

	// firstname
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	// lastname
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [ firstname=" + firstname + ", lastname=" + lastname + ", contactno=" + contactno
				+ ", email=" + email + ", dob=" + dob + ", technology=" + technology + "]";
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
}