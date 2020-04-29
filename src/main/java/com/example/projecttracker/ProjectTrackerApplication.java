package com.example.projecttracker;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Ayan Bhuin
 * @since April 28, 2020
 */
@SpringBootApplication
public class ProjectTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectTrackerApplication.class, args);
	}

}
