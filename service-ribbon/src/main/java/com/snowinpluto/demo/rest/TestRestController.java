package com.snowinpluto.demo.rest;

import com.snowinpluto.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestRestController {

  @Autowired
  private HelloService helloService;

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello(@RequestParam("name") String name) {
    return helloService.hiService(name);
  }
}
