package com.coding.fts.resources;

import com.coding.fts.representations.FoodTruck;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.skife.jdbi.v2.DBI;
import com.coding.fts.dao.FoodTruckDAO;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.StringTokenizer;
import java.util.Set;

@Path("/mobilefoodentity")
@Produces(MediaType.APPLICATION_JSON)
public class FoodTruckResource {

    private final FoodTruckDAO ftDao;

    public FoodTruckResource(DBI jdbi) 
    {
        ftDao = jdbi.onDemand(FoodTruckDAO.class);
    }

    @GET
    @Path("/{Latitude}/{Longitude}")
    public Response getFoodTruckByLoc(@PathParam("Latitude") float Latitude,
                                      @PathParam("Longitude") float Longitude)  
    {
        // retrieve information about the FodoTruck near lattitude and longitude of the user
	System.out.println("Latitude = " + Latitude);
	System.out.println("Longitude = " + Longitude);
        Set<FoodTruck> ft = ftDao.getFoodTruckByLoc(Latitude, Longitude);
	System.out.println("ft = " + ft);
        return Response
                .ok(ft)
                .build();
    }

    /*@GET
    @Path("/{locationid}")
    public Response getFoodTruckByLocId(@PathParam("locationid") int locationid)  
    {
        FoodTruck ft = ftDao.getFoodTruckByLocId(locationid);
	System.out.println("ft = " + ft);
        return Response
                .ok(ft)
                .build();
    }*/

    /*@GET
    @Path("/{items}")
    public Response getFoodTruckByItems(@PathParam("items") String items)  
    {
	StringTokenizer st = new StringTokenizer(items, ",");
	StringBuffer sb = new StringBuffer(32);
	boolean firstCondition = true;
	while (st.hasMoreTokens())
	{
		if (firstCondition)
		{
			//sb.append ("FoodItems LIKE ('%Everything%') OR");
			sb.append ("'%Everything%', ");
			firstCondition = false;
		}
		else
		{
			// sb.append (" OR ");
			sb.append (", ");
		}
		String item = st.nextToken();
		//sb.append (" ");
		//sb.append ("FoodItems LIKE ('%");
		//sb.append (item);
		//sb.append ("%') ");
		sb.append ("'%" +item + "%'");
	}

	String whereClause = sb.toString();
	System.out.println (this.getClass().getName() + "printing where clause: " + whereClause);
        Set<FoodTruck> ft = ftDao.getFoodTruckByItems(whereClause);
	//Set<FoodTruck> ft = ftDao.getFoodTruckByItems("FoodItems LIKE ('%Everything%')");
	System.out.println("ft = " + ft);
        return Response
                .ok(ft)
                .build();
    }*/

    /*@GET
    @Path("/{FoodItem1}/{FoodItem2}")
    public Response getFoodTruckByItems(@PathParam("FoodItem1") String FoodItem1, 
    					@PathParam("FoodItem2") String FoodItem2)
    {
        Set<FoodTruck> ft = ftDao.getFoodTruckByItems(FoodItem1, FoodItem2);
	System.out.println("ft = " + ft);
        return Response
                .ok(ft)
                .build();
    }*/
}
