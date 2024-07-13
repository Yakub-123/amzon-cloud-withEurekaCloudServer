package com.samba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmzonCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmzonCloudApplication.class, args);
	}

}
