package com.coding.fts;
  
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import javax.validation.constraints.Max;
import org.hibernate.validator.constraints.NotEmpty;
import io.dropwizard.db.DataSourceFactory;
  
public class FoodTruckConfiguration extends Configuration
{
    @JsonProperty
    @NotEmpty
    private String message;
    
    public String getMessage()
    {
        return message;
    }
      
  @JsonProperty
  private DataSourceFactory database = new DataSourceFactory();

  public DataSourceFactory getDataSourceFactory() {
      return database;
  }
}