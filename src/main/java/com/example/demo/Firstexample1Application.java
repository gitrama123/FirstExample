package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.help.Animal;

@SpringBootApplication
public class Firstexample1Application {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.give();
		SpringApplication.run(Firstexample1Application.class, args);
	}

}
