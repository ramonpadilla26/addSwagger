package com.uabc.edu.practica1.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//elevarcuadrado y porcentaje
@RestController
public class CalculadoraController {
    @GetMapping("/suma")
    public double suma(@RequestParam (value = "numA") double a,
                       @RequestParam (value = "numB") double b){
        return a+b;
    }

    @GetMapping("/resta")
    public double resta(@RequestParam (value = "numA") double a,
                       @RequestParam (value = "numB") double b){
        return a-b;
    }

    @GetMapping("/multiplicacion")
    public double multiplicacion(@RequestParam (value = "numA") double a,
                       @RequestParam (value = "numB") double b){
        return a*b;
    }

    @GetMapping("/division")
    public double division(@RequestParam (value = "numA") double a,
                       @RequestParam (value = "numB") double b){
        return a/b;
    }
    @GetMapping("/cuadrado")
    public double cuadrado(@RequestParam (value = "numA") double a){
        return a*a;

    }
    @GetMapping("/porcentaje")
    public double porcentaje(@RequestParam (value = "numA") double a,
                             @RequestParam (value = "numB") double p){
        return a*p/100;

    }
}
