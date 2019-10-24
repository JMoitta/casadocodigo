package com.alura.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("casa")
    public String index(){
        System.out.println("Entrando na Home da CDC!");
        return "home";
    }
}
