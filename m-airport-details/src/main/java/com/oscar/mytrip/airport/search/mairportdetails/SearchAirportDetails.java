package com.oscar.mytrip.airport.search.mairportdetails;

import javax.websocket.server.PathParam;

import com.oscar.mytrip.airport.util.AirportSearchProperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class SearchAirportDetails {

    private static final Logger LOG = LoggerFactory.getLogger(SearchAirportDetails.class);

    @Autowired
    private AirportSearchProperties airportSearchProperties;

    @RequestMapping(path = "/")
    public String getAirportName() {
        LOG.info("Default Airport Name" + airportSearchProperties.getAirports());
        return airportSearchProperties.getAirports() != null ? "San Diego" : airportSearchProperties.getAirports().get(0);
    }

    @RequestMapping(path = "/{airportCode}", method = RequestMethod.GET)
    public String getAirportName(@PathParam(value = "airportCode") String airportCode) {
        LOG.info("AirportCode : " + airportCode);
        LOG.info("AirportName : " + airportSearchProperties.getAirportCodes().get(airportCode));
        return airportSearchProperties.getAirportCodes().getOrDefault(airportCode, "Omaha");
    }
}