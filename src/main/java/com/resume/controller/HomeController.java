package com.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //com esta anotation o spring boot busca uma página com esse nome
@RequestMapping("/home")
public class HomeController{
    
    @GetMapping
    public String abrirHome(){
        return "index";
    }
    
    
}
