package com.farhan.decider;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class DeciderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeciderApplication.class, args);
	}

}
