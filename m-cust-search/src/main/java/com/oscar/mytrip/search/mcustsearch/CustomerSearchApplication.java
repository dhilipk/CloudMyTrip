package com.oscar.mytrip.search.mcustsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.oscar.mytrip.search")
public class CustomerSearchApplication {

	public static void main(final String[] args) {
		SpringApplication.run(CustomerSearchApplication.class, args);
	}

}
