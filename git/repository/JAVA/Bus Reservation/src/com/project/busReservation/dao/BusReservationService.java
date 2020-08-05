package com.project.busReservation.dao;

import java.util.ArrayList;

import com.project.busReservation.pojo.CustomerDetails;
import com.project.busReservation.pojo.CustomerTravel;
import com.project.busReservation.pojo.TravelDetails;
import com.project.busReservation.pojo.TravelHotel;
import com.project.busReservation.pojo.TravelReview;

public interface BusReservationService {
	
	public ArrayList<CustomerDetails> getAllCustomerDetails(int cust_id);
	public ArrayList<TravelDetails> getAllTravelDetails(int travel_id);
	public ArrayList<TravelHotel> getAllTravelHotelDetails(int hotel_id, int travel_id);
	public ArrayList<CustomerTravel> getCustomerTravelDetails(int cust_id, int travel_id);
	public ArrayList<TravelReview> getReview(int cust_id, int travel_id );
	

}
