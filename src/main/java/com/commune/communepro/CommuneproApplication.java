package com.commune.communepro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@SpringBootConfiguration
@ComponentScan
public class CommuneproApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommuneproApplication.class, args);
	}
}
