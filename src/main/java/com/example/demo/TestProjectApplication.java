package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.beans.example;

@SpringBootApplication
@ComponentScan("com.example")
public class TestProjectApplication implements CommandLineRunner{
	
	@Autowired
	private example ex;

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
//		ex.add();
	}
	
	@Override
	public void run(String... args) throws Exception {
		ex.add();
	}
}
