package com.whb.test.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MemHystrixController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testError")
    @RequestMapping("/memHystrixTest")
    public String memTest(){
        String str = restTemplate.getForObject("http://order-server/orderTest",String.class);
        return str;
    }
    public String testError(){
        //远程调用失败，调用此方法
        return "error";
    }
}
