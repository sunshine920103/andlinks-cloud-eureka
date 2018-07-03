package com.andlinks.cloud.andlinkscloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AndlinksCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndlinksCloudEurekaApplication.class, args);
	}
}
