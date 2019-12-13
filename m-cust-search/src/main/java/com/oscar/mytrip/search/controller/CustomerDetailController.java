package com.oscar.mytrip.search.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDetailController {

    @RequestMapping(path = "/")
    public String hello() {
        return "Welcome to Mac !!";
    }

    @RequestMapping(path = "/name")
    public String getName() {
        return "DK";
    }

    
}