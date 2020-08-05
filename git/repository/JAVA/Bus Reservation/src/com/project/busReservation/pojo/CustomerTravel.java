package com.project.busReservation.pojo;

public class CustomerTravel {

	private Integer TravelId;
	private Integer Cust_id;
	private String Traveled_date;
	private String Travel_duration;
	private String status;
	public CustomerTravel(Integer travelId, Integer cust_id, String traveled_date, String travel_duration,
			String status) {
		super();
		TravelId = travelId;
		Cust_id = cust_id;
		Traveled_date = traveled_date;
		Travel_duration = travel_duration;
		this.status = status;
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
	public String getTraveled_date() {
		return Traveled_date;
	}
	public void setTraveled_date(String traveled_date) {
		Traveled_date = traveled_date;
	}
	public String getTravel_duration() {
		return Travel_duration;
	}
	public void setTravel_duration(String travel_duration) {
		Travel_duration = travel_duration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
