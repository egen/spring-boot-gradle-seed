package org.marketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
