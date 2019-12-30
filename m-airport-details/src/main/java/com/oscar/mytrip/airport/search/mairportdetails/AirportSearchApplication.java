package com.oscar.mytrip.airport.search.mairportdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.oscar.mytrip.airport"})
@EnableConfigurationProperties
@EnableDiscoveryClient
public class AirportSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportSearchApplication.class, args);
	}

}
