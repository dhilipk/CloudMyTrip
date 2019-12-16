package com.oscar.mytrip.airport.search.mairportdetails;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchAirportDetails {

    @RequestMapping(path = "/")
    public String getAirportName() {
        return "SAN";
    }
}