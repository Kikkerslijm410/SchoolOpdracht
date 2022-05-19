package com;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.howtodoinjava.demo.model.Department;
import com.howtodoinjava.demo.model.User;

public class GsonManager {

  public static void Gson(){
    
    String test = "test";

    Gson gson = new GsonBuilder()
    .setPrettyPrinting()
    .create();

    String jsonString = gson.toJson(test);

    System.out.println(jsonString);
  }
}

