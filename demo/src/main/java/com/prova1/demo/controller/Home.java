package com.prova1.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("questao1")
    public String questao1(){
        return "ex1";
    }

    @GetMapping("questao2")
    public String questao2(){
        return "ex2";
    }

    @GetMapping("questao3")
    public String questao3(){
        return "ex3";
    }
    
}
