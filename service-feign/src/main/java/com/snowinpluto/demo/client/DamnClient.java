package com.snowinpluto.demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "testapp", fallback = DamnClientHystric.class)
public interface DamnClient {

    @RequestMapping(value = "/damn", method = RequestMethod.GET)
    String damn();
}
