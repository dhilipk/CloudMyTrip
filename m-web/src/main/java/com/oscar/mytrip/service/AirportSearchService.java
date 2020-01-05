package com.oscar.mytrip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AirportSearchService {

    @Autowired
    private RestTemplate rest;
    private String url = "http://airportDetails";

    public String getAirportName() {
        return rest.getForObject(url, String.class);
    }


}