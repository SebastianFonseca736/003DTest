package com.example._DTest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1")
public class ApiController {
    @GetMapping("/saludo")
    public String hola() {
        return "Hola Mundo";
    }


    @GetMapping("/despedida")
    public String chao() {
        return " chao";
    }


}
