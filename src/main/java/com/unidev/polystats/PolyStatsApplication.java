package com.unidev.polystats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PolyStatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolyStatsApplication.class, args);
	}
}
