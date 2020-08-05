package com.project.busReservation.dao;

import java.sql.SQLException;

import com.project.busReservation.pojo.CustomerDetails;

public class Test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
			
			BusReservationDAO busresdao = new BusReservationDAO();
			
			CustomerDetails cus1 = new CustomerDetails(101,"shashank","Mittal","abc@gmail.com","9897101339" ,"first insert");
			
			BusReservationServiceImpl busresservimpl = new BusReservationServiceImpl();
			System.out.println("-------------------running-------------");
			
			System.out.println(busresservimpl.insertCustomer(cus1));
		
	}

}
