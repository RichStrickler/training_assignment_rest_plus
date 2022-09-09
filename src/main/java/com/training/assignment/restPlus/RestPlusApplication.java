package com.training.assignment.restPlus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Objectives List *
 * 
 * 1) Change to YML instead of properties ✓
 * 
 * 2) Shift the url to YML ✓
 * 
 * 3) Spring profile
 * 
 * 4) Use proper package structure (controller, model, service, dao, utils, entity, constants etc) ✓
 * 
 * 5) Use the layered architecture - controller/service/dao ✓
 * 
 * 6) implement GET, POST, PUT and DELETE
 * 
 * 7) Make sure to have .gitignore file ✓
 * 
 * 8) Indentation - Use Google Styles (look in Discord) ✓
 * 
 * 9) use standard naming conventions ✓
 * 
 * 10) Change the response of REST calls to class objects instead of String (both server and client)
 * ✓
 * 
 * 11) Use Java to JSON with a complicated structure, use Jackson annotations
 * 
 * 12) Use ObjectMapper to deserialize
 * 
 * 13) Use ObjectMapper to write a java object to a file (in JSON)
 */

@SpringBootApplication
public class RestPlusApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestPlusApplication.class, args);
  }

}
