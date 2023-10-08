package com.medievalstudies.wikimedieval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class WikimedievalApplication {

	public static void main(String[] args) {
		SpringApplication.run(WikimedievalApplication.class, args);
	}

}
