package com.oscar.mytrip.controller;

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

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getApplicationName() {
		LOG.info("Application Name: " + mytripProperties.getName());
		return mytripProperties.getName();
	}
	

	@RequestMapping(value="/{locale}", method=RequestMethod.GET)
	public String getApplicationNameByLocale(@PathVariable String locale) {
		LOG.info("Language Code: " + locale);
		LOG.info("Value from properties : " + mytripProperties.getValues().get(locale));
		return mytripProperties.getValues().getOrDefault(locale.toUpperCase(), mytripProperties.getName());
	}
}