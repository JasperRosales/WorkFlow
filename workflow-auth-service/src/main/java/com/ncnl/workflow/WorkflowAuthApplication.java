package com.ncnl.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WorkflowAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkflowAuthApplication.class, args);
	}

}
