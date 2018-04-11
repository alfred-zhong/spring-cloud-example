package com.snowinpluto.demo.client;

import org.springframework.stereotype.Component;

@Component
public class DamnClientHystric implements DamnClient {
    @Override
    public String damn() {
        return "RTFM";
    }
}
