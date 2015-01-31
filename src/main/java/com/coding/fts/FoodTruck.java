package com.coding.fts.representations;

import java.util.Date;
import java.lang.String;

public class FoodTruck
{
    private final int locationid;
    private final String Applicant;
    private final String FacilityType;
    private final int cnn;
    private final String LocationDescription;
    private final String Address;
    private final String blocklot;
    private final String block;
    private final String lot;
    private final String permit;
    private final String Status;
    private final String FoodItems;
    private final int X;
    private final int Y;
    private final float Latitude;
    private final float Longitude;
    private final String Schedule;
    private final Date NOISent;
    private final Date Approved;
    private final String Received;
    private final boolean PriorPermit;
    private final Date ExpirationDate;

    public FoodTruck(int locationid, String Applicant, String FacilityType, int cnn,
             String LocationDescription, String Address, String blocklot, String block,
             String lot, String permit, String Status, String FoodItems, 
             int X, int Y, float Latitude, float Longitude, 
	     String Schedule, Date NOISent, Date Approved, String Received, 
	     boolean PriorPermit, Date ExpirationDate)
    {
        this.locationid = locationid;
        this.Applicant = Applicant;
        this.FacilityType = FacilityType;
        this.cnn = cnn;
        this.LocationDescription = LocationDescription;
        this.Address = Address;
        this.blocklot = blocklot;
        this.block = block;
        this.lot = lot;
        this.permit = permit;
        this.Status = Status;
        this.FoodItems = FoodItems;
        this.X = X;
        this.Y = Y;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Schedule = Schedule;
        this.NOISent = NOISent;
        this.Approved = Approved;
        this.Received = Received;
        this.PriorPermit = PriorPermit;
        this.ExpirationDate = ExpirationDate;
    }

    public FoodTruck ()
    {
	this.locationid = 0;
        this.Applicant = "null";
        this.FacilityType = "null";
        this.cnn = 0;
        this.LocationDescription = "null";
        this.Address = "null";
        this.blocklot = "null";
        this.block = "null";
        this.lot = "null";
        this.permit = "null";
        this.Status = "null";
        this.FoodItems = "null";
        this.X = 0;
        this.Y = 0;
        this.Latitude = (float) 0.0;
        this.Longitude = (float) 0.0;
        this.Schedule = "null";
        this.NOISent = new Date(0);
        this.Approved = new Date(0);
        this.Received = "null";
        this.PriorPermit = false;
        this.ExpirationDate = new Date(0);

	// TODO: for some reason constructor chaining is not working
	/*int, java.lang.String, java.lang.String, int, 
	java.lang.String, java.lang.String, java.lang.String, java.lang.String, 
	java.lang.String, java.lang.String, java.lang.String, java.lang.String, 
	int,  int, float, float, 
	java.lang.String, java.util.Date, java.util.Date, java.lang.String, 
	boolean, java.util.Date*/

        /*this.FoodTruck (0, "null", 0,
                  	0, "null", "null", "null",
                  	"null", "null", "null", "null",
	                0, 0, (float) 0.0, (float) 0.0, 
			"null", new Date(0), new Date(0), "null",
			false, new Date(0));*/
    }



    public int getLocationid()
    {
        return locationid;
    }

    public String getApplicant()
    {
        return Applicant;
    }

    public String getFacilityType()
    {
        return FacilityType;
    }

    public int getCnn()
    {
        return cnn;
    }

    public String getLocationDescription()
    {
        return LocationDescription;
    }

    public String getAddress()
    {
        return Address;
    }

    public String getBlocklot()
    {
        return blocklot;
    }

    public String getBlock()
    {
        return block;
    }

    public String getLot()
    {
        return lot;
    }

    public String getPermit()
    {
        return permit;
    }

    public String getStatus()
    {
        return Status;
    }

    public String getFoodItems()
    {
        return FoodItems;
    }

    public int getX()
    {
        return X;
    }

    public int getY()
    {
        return Y;
    }

    public float getLatitude()
    {
        return Latitude;
    }

    public float getLongitude()
    {
        return Longitude;
    }

    public String getSchedule()
    {
        return Schedule;
    }

    public Date getNOISent()
    {
        return NOISent;
    }

    public Date getApproved()
    {
        return Approved;
    }

    public String getReceived()
    {
        return Received;
    }

    public boolean getPriorPermit()
    {
        return PriorPermit;
    }

    public Date getExpirationDate()
    {
        return ExpirationDate;
    }

}