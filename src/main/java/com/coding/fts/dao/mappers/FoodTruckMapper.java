package com.coding.fts.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.coding.fts.representations.FoodTruck;

public class FoodTruckMapper implements ResultSetMapper<FoodTruck> {
   public FoodTruck map(int index, ResultSet r, StatementContext ctx)
   throws SQLException {
      System.out.println("resultset = " + r);
      return new FoodTruck(
	r.getInt("locationid"), r.getString("Applicant"), 
	r.getString("FacilityType"), r.getInt("cnn"),
	r.getString("LocationDescription"), r.getString("Address"),
	r.getString("blocklot"), r.getString("block"),
	r.getString("lot"), r.getString("permit"),
	r.getString("Status"), r.getString("FoodItems"), 
        r.getInt("X"), r.getInt("Y"),
 	r.getFloat("Latitude"), r.getFloat("Longitude"),
	r.getString("Schedule"), r.getDate("NOISent"),
	r.getDate("Approved"), r.getString("Received"), 
	r.getBoolean("PriorPermit"), r.getDate("ExpirationDate") );
   }
}