package com.project.busReservation.pojo;

public class TravelHotel {
	
	private Integer travelhotel_id;
	private Integer travel_id;
	private String travel_hotel;
	private String travel_address;
	public TravelHotel(Integer travelhotel_id, Integer travel_id, String travel_hotel, String travel_address) {
		super();
		this.travelhotel_id = travelhotel_id;
		this.travel_id = travel_id;
		this.travel_hotel = travel_hotel;
		this.travel_address = travel_address;
	}
	public Integer getTravelhotel_id() {
		return travelhotel_id;
	}
	public void setTravelhotel_id(Integer travelhotel_id) {
		this.travelhotel_id = travelhotel_id;
	}
	public Integer getTravel_id() {
		return travel_id;
	}
	public void setTravel_id(Integer travel_id) {
		this.travel_id = travel_id;
	}
	public String getTravel_hotel() {
		return travel_hotel;
	}
	public void setTravel_hotel(String travel_hotel) {
		this.travel_hotel = travel_hotel;
	}
	public String getTravel_address() {
		return travel_address;
	}
	public void setTravel_address(String travel_address) {
		this.travel_address = travel_address;
	}
}
