package com.coding.fts.dao;

import com.coding.fts.dao.mappers.FoodTruckMapper;
import com.coding.fts.representations.FoodTruck;
import org.skife.jdbi.v2.sqlobject.*;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.Set;

public interface FoodTruckDAO 
{
    @Mapper(FoodTruckMapper.class)
    //@SqlQuery("SELECT * from mobilefoodentity WHERE Latitude = :Latitude AND Longitude = :Longitude WHERE")
    @SqlQuery("SELECT * from mobilefoodentity WHERE Latitude BETWEEN (:Latitude - 0.00005) AND (:Latitude + 0.00005) AND Longitude BETWEEN (:Longitude - 0.00005) AND (:Longitude + 0.00005)")
    Set<FoodTruck> getFoodTruckByLoc(@Bind("Latitude") float Latitude, @Bind("Longitude") float Longitude);

    /*@Mapper(FoodTruckMapper.class)
    @SqlQuery("select * from mobilefoodentity where locationid = :locationid")
    FoodTruck getFoodTruckByLocId(@Bind("locationid") int locationid);*/

    /*@Mapper(FoodTruckMapper.class)
    @SqlQuery("select * from mobilefoodentity where FoodItems LIKE ('%:FoodItem1%') OR FoodItems LIKE ('%:FoodItem2%') OR FoodItems LIKE('Everything')")
    Set<FoodTruck> getFoodTruckByItems(@Bind("FoodItem1") String items, @Bind("FoodItem2") String FoodItem2);*/

    /* TODO: Unable to get tokenized string with LIKE clauses to render results.
    * Only get 0 results. So, plan to support separate path parameters for food items (say 2 parameters)
    * This would mean that web service client need to send 2 values
        // select * from mobilefoodentity where FoodItems LIKE ('%Everything%') OR FoodItems LIKE ('%cupcakes%')
        // @Mapper(FoodTruckMapper.class)
        // where clause updated by FoodTruckResource
        // @SqlQuery("select * from mobilefoodentity where :items")
        // @SqlQuery("select * from mobilefoodentity where FoodItems LIKE ('%Everything%')")
        // @SqlQuery("select * from mobilefoodentity where charindex(:FoodItems, FoodItems) > 0")
        // Set<FoodTruck> getFoodTruckByItems(@Bind("FoodItems") String FoodItems);
    */
}