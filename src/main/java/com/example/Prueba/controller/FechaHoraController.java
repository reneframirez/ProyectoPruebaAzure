package com.example.Prueba.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class FechaHoraController {

    @GetMapping("/fecha-hora")
    public String getFechaHora() {
        LocalDateTime fechaHora = LocalDateTime.now();
        return "La fecha y hora actual es: " + fechaHora.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(FechaHoraController.class, args);
    }
}

