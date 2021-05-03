package com.example.ProjectDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logincontroller {
   @RequestMapping("/getdata")
   public void getdata() {
	   System.out.println("hello");
   }
	
}
