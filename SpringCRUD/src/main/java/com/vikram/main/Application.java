package com.vikram.main;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vikram.main.repository.BooksRepository;

@SpringBootApplication
public class Application {

	
	
	
	
	public static void main(String[] args)
	{
		
		SpringApplication.run(Application.class, args);
		System.out.println("in main class");
		
		
	}
	
	

}
