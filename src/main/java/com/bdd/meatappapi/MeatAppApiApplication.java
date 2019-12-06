package com.bdd.meatappapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.bdd.meatappapi.config.property.MeatAppApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(MeatAppApiProperty.class)
public class MeatAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeatAppApiApplication.class, args);
	}

}
