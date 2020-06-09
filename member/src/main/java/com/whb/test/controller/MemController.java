package com.whb.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MemController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/memTest")
    public String memTest() {
        String str = restTemplate.getForObject("http://order-server/orderTest", String.class);
        return str;
    }
}