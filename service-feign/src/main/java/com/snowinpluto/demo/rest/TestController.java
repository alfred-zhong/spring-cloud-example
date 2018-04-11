package com.snowinpluto.demo.rest;

import com.snowinpluto.demo.client.DamnClient;
import com.snowinpluto.demo.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

  @Autowired
  private HelloClient helloClient;

  @Autowired
  private DamnClient damnClient;

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello(@RequestParam("name") String name) {
    return helloClient.hello(name);
  }

  @RequestMapping(value = "/damn", method = RequestMethod.GET)
  public String damn() {
      return damnClient.damn();
  }
}
