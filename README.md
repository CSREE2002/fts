# fts

Create a service that tells the user what types of food trucks might be found near a specific location on a map.
https://data.sfgov.org/Permitting/Mobile-Food-Facility-Permit/rqzj-sfat

Back-end focus: includes minimal front-end (HTTP get request). Java programming language used. No auto generated code

Technology stack includes: 
1) Dropwizard, a java development framework for RESTful Web Services 
2) Jersey, reference implementation of JAX-RS standard, the Java API for RESTful Web
3) Jackson, configurable JSON processor is used by Jersey to transform plain java objects to JSON
4) JDBI, a library to create data access objects to interact with database
5) JDK (1.6)
6) Maven build manager
7) MySQL Database

API
GET /mobilefoODENTITY/{LATITUDE}/{LONGITUDE}

API Extensions
- Add Radius to path parameter in miles
- Search for a particular food truck company
- Search for one or more food items

Note:
MySQL Database records (668) are in local database. Webservice not hosted till we get the database replicated
