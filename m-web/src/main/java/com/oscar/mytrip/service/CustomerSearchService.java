package com.oscar.mytrip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerSearchService {

    @Autowired
    private RestTemplate rest;
    private String url = "http://localhost:8090/";

    public String getCustomerName() {
        return rest.getForObject(url, String.class);
    }

}