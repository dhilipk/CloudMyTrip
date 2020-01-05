package com.oscar.mytrip.zipkinserver.zipkinappserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ZipkinAppServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinAppServerApplication.class, args);
	}

}
