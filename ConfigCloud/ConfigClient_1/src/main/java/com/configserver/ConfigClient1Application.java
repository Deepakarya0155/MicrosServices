package com.configserver;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClient1Application implements CommandLineRunner{
	
	@Value("${name}")
	String name;
	
	@Value("${age}")
	String age;

	public static void main(String[] args) {
		SpringApplication.run(ConfigClient1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(name);
		System.out.println(age);
		
	}

}
