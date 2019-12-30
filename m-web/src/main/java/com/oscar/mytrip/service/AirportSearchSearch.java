package com.oscar.mytrip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AirportSearchSearch {

    @Autowired
    private RestTemplate rest;
    private String url = "http://localhost:9090/";

    public String getAirportName() {
        return rest.getForObject(url, String.class);
    }

}