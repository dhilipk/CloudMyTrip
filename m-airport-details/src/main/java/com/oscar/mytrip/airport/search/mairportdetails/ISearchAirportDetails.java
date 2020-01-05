package com.oscar.mytrip.airport.search.mairportdetails;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public interface ISearchAirportDetails {
    @GetMapping(path = "/")
    String getAirportName();

    @GetMapping(path = "/{airportCode}")
    String getAirportNameByCode(@PathParam(value = "airportCode") String airportCode);
}