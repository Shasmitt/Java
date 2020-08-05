package com.project.busReservation.pojo;

public class TravelReview {
	
	private Integer TravelId;
	private Integer Cust_id;
	private String review;
	public TravelReview(Integer travelId, Integer cust_id, String review) {
		super();
		TravelId = travelId;
		Cust_id = cust_id;
		this.review = review;
	}
	public Integer getTravelId() {
		return TravelId;
	}
	public void setTravelId(Integer travelId) {
		TravelId = travelId;
	}
	public Integer getCust_id() {
		return Cust_id;
	}
	public void setCust_id(Integer cust_id) {
		Cust_id = cust_id;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	

}
