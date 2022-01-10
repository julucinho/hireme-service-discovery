package com.capitolio.hiremediscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HiremeDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiremeDiscoveryServerApplication.class, args);
	}

}
