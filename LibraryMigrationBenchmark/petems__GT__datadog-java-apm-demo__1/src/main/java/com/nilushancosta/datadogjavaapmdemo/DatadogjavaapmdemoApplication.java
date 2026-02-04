package com.nilushancosta.datadogjavaapmdemo;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@SpringBootApplication
public class DatadogjavaapmdemoApplication {

	private static final org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(DatadogjavaapmdemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DatadogjavaapmdemoApplication.class, args);
		PropertyConfigurator.configure("log4j.properties");
	}

	@GetMapping("/success")
	public String success(){
		slf4jLogger.info("Call was made to /success!");
		return "Request successful";
	}

	@GetMapping("/failure")
	public String failure(){
		slf4jLogger.info("Oh no! Call was made to /failure!");
		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
