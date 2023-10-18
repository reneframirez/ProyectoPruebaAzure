package com.example.Prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.Prueba") // Agrega esta línea

public class PruebaApplication {

	public static void main(String[] args) {

		SpringApplication.run(PruebaApplication.class, args);

	}

}
