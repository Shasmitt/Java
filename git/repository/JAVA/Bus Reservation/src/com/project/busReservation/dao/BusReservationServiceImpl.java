package com.project.busReservation.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.project.busReservation.pojo.CustomerDetails;
import com.project.busReservation.pojo.CustomerTravel;
import com.project.busReservation.pojo.TravelDetails;
import com.project.busReservation.pojo.TravelHotel;
import com.project.busReservation.pojo.TravelReview;


public class BusReservationServiceImpl extends BusReservationDAO implements BusReservationService {
	
    public boolean insertCustomer(CustomerDetails cust1) throws SQLException {
        String sql = "INSERT INTO cust_details (CUST_ID, FNAME, LNAME,EMAIL, PH_NO,COMMENTS) VALUES (?, ?, ?,?,?,?)";
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setLong(1, cust1.getCust_id());
        statement.setString(2, cust1.getFname());
        statement.setString(3, cust1.getLname());
        statement.setString(4, cust1.getEmail());
        statement.setString(5, cust1.getPhone());
        statement.setString(6, cust1.getComments());
         
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
	
	

	
	
	
	
	
//	public ArrayList<CustomerDetails> getAllCustomerDetails(int cust_id) {
//
//		ArrayList<CustomerDetails> cdetails = new ArrayList<>();
//		//stmt = conn.createStatement();
//		String sqlquery = "select CUST_ID, FNAME, LNAME, EMAIL, PH_NO, COMMENTS from cust_details where CUST_ID =:TEMP ";
//		//sqlquery.replace(TEMP, cust_id);
//		//ResultSet rs = stmt.executeQuery(sql);
//		//while(rs.next()) {
//			
//			//int id = rs.getInt("CUST_ID");
//			//String first = rs.getString("FNAME");
//			//String last = rs.getString("LNAME");
//			//String email = rs.getString("EMAIL");
//			//String phone = rs.getString("PH_NO");
//			//String comments = rs.getString("COMMENTS");
//			
//			//CustomerDetails c = new CustomerDetails(id, first, last, email, phone, comments);
//			//cdetails.add(c);
//		}
//		//return cdetails;
//	//}

	@Override
	public ArrayList<TravelDetails> getAllTravelDetails(int travel_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TravelHotel> getAllTravelHotelDetails(int hotel_id, int travel_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CustomerTravel> getCustomerTravelDetails(int cust_id, int travel_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TravelReview> getReview(int cust_id, int travel_id) {
		// TODO Auto-generated method stub
		return null;
	}








	@Override
	public ArrayList<CustomerDetails> getAllCustomerDetails(int cust_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
