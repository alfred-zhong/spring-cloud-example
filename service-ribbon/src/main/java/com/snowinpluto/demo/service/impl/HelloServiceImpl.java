package com.snowinpluto.demo.service.impl;

import com.snowinpluto.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public String hiService(String name) {
    return restTemplate.getForObject("http://SERVICE-HELLO/hello?name=" + name, String.class);
  }
}
