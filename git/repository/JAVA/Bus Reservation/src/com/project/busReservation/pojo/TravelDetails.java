package com.project.busReservation.pojo;

public class TravelDetails {
	
	private Integer travel_id;
	private String place;
	private String from;
	private String to;
	private String details;
	private String cost;
	public TravelDetails(Integer travel_id, String place, String from, String to, String details, String cost) {
		super();
		this.travel_id = travel_id;
		this.place = place;
		this.from = from;
		this.to = to;
		this.details = details;
		this.cost = cost;
	}
	public Integer getTravel_id() {
		return travel_id;
	}
	public void setTravel_id(Integer travel_id) {
		this.travel_id = travel_id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	

}
