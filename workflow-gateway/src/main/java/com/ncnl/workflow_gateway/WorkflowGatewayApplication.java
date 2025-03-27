package com.ncnl.workflow_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WorkflowGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkflowGatewayApplication.class, args);
	}

}
