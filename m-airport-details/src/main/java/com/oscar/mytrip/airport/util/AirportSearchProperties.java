package com.oscar.mytrip.airport.util;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class AirportSearchProperties {
    private List<String> airports;
    private Map<String, String> airportCodes; 

    public List<String> getAirports() {
        return airports;
    }

    public void setAirports(List<String> airports) {
        this.airports = airports;
    }

    public Map<String, String> getAirportCodes() {
        return airportCodes;
    }

    public void setAirportCodes(Map<String, String> airportCodes) {
        this.airportCodes = airportCodes;
    }
    
}