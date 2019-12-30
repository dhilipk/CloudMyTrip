package com.oscar.mytrip.search.controller;

import javax.websocket.server.PathParam;

import com.oscar.mytrip.search.service.CustomerDetailService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDetailController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerDetailController.class);

    @Autowired
    private CustomerDetailService customerDetailService;

    @RequestMapping(path = "/")
    public String getName() {
        LOG.info("Default Name : " + getName(""));
        return getName("");
    }

    @RequestMapping(path = "/{number}")
    public String getName(@PathParam(value = "number") String number) {
        LOG.info("Customer Number : " + number);
        String name = customerDetailService.getCustomerByID(number).getName();
        LOG.info("Customer Name : " + name);
        return name;
    }
    
}