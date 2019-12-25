package com.oscar.mytrip.web.mweb;

import com.oscar.mytrip.util.MytripProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@EnableDiscoveryClient
@EnableConfigurationProperties(MytripProperties.class)
@SpringBootApplication
@ComponentScan(basePackages = {"com.oscar.mytrip"})
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
