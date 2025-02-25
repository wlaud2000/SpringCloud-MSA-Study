package com.project.loadbalancingtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // Eureka Client의 역할 수행 명시
public class LoadBalancingTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancingTestApplication.class, args);
	}

}
