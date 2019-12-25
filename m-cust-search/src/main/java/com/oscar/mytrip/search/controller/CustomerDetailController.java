package com.oscar.mytrip.search.controller;

import javax.websocket.server.PathParam;

import com.oscar.mytrip.search.service.CustomerDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDetailController {

    @Autowired
    private CustomerDetailService customerDetailService;

    @RequestMapping(path = "/")
    public String hello() {
        return getName("");
    }

    @RequestMapping(path = "/{number}")
    public String getName(@PathParam(value = "number") String number) {
        return customerDetailService.getCustomerByID("").getName();
    }
    
}