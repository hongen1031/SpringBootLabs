package com.hongen.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLabsApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBootApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLabsApplication.class, args);
		log.warn("SpringBoot启动...");
	}

}
