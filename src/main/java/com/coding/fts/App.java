package com.coding.fts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.coding.fts.resources.FoodTruckResource;
import org.skife.jdbi.v2.DBI;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.jdbi.logging.LogbackLog;
import java.io.OutputStream;
import org.skife.jdbi.v2.logging.PrintStreamLog;
import org.skife.jdbi.v2.logging.Log4JLog;

public class App extends Application <FoodTruckConfiguration>
{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Override
    public void initialize(Bootstrap<FoodTruckConfiguration> b) {}

    @Override
    public void run(FoodTruckConfiguration c, Environment e) throws Exception {
        LOGGER.info("Method App#run() called");

        // Create a DBI factory and build a JDBI instance
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory
                .build(e, c.getDataSourceFactory(), "mysql");
	jdbi.setSQLLog(new PrintStreamLog());
	// jdbi.setSQLLog(new PrintStreamLog(System.out));
	//LoggerFactory.getLogger("org.skife.jdbi").setLevel(java.util.logging.Level.ALL);
        // Add the resource to the environment
        e.jersey().register(new FoodTruckResource(jdbi));
    }

    public static void main( String[] args ) throws Exception
    {
        new App().run(args);
    }
}
