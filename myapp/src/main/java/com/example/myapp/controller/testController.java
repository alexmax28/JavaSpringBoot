package com.example.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.service.TestService;


@RestController

public class testController {

  // private final TestService testService;

  @Autowired TestService testService;

  
  @GetMapping("/hello")
    public String Hello() {
      return "Hellooo";
    }

  @GetMapping("/aaa")
  public String aaa() {
    String str = testService.number();
    return str;
  }
}
