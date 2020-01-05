package com.oscar.mytrip.controller;

import com.oscar.mytrip.service.AirportSearchService;
import com.oscar.mytrip.service.CustomerSearchService;
import com.oscar.mytrip.util.MytripProperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MytripController {

	private static final Logger LOG = LoggerFactory.getLogger(MytripController.class.getName());

    @Autowired
	private MytripProperties mytripProperties;
	
	@Autowired
	private CustomerSearchService customerSearchService;

	@Autowired
	private AirportSearchService airportSearchService;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getApplicationName() {
		LOG.info("Application Name: " + mytripProperties.getName());
		StringBuilder welcomeMsg = new StringBuilder(mytripProperties.getName() + " welcomes you " );
		welcomeMsg.append(customerSearchService.getCustomerName() + ", enjoy travelling to " +airportSearchService.getAirportName());
		return welcomeMsg.toString();
	}
	

	@RequestMapping(value="/{locale}", method=RequestMethod.GET)
	public String getApplicationNameByLocale(@PathVariable String locale) {
		LOG.info("Language Code: " + locale);
		LOG.info("Value from properties : " + mytripProperties.getValues().get(locale));
		return mytripProperties.getValues().getOrDefault(locale.toUpperCase(), mytripProperties.getName());
	}
}