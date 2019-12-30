package com.oscar.mytrip.search.mcustsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.oscar.mytrip.search"})
public class CustomerSearchApplication {

	public static void main(final String[] args) {
		SpringApplication.run(CustomerSearchApplication.class, args);
	}

}
