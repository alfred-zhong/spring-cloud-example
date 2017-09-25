package com.snowinpluto.demo.client;

import org.springframework.stereotype.Component;

@Component
public class HelloClientHystric implements HelloClient {

  @Override
  public String hello(String name) {
    return "sorry " + name;
  }
}
