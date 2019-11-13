package com.iodia.odiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableEurekaServer
@EnableZuulServer
public class OdiserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(OdiserverApplication.class, args);
	}
}
