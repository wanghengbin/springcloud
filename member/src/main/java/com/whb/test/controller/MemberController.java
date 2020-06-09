package com.whb.test.controller;

import com.whb.test.inter.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired
    private OrderFeign orderFeign;

    @RequestMapping("/memberTest")
    public String memTest() {
        String str = orderFeign.orderTest();
        return str;
    }
}