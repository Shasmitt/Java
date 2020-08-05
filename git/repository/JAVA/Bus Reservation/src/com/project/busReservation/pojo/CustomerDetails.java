package com.project.busReservation.pojo;

public class CustomerDetails {
	
	private Integer cust_id;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private String comments;
	public CustomerDetails(Integer cust_id, String fname, String lname, String email, String phone, String comments) {
		super();
		this.cust_id = cust_id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.comments = comments;
	}
	public Integer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	

}
