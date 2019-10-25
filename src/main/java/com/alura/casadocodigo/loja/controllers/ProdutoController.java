package com.alura.casadocodigo.loja.controllers;

import com.alura.casadocodigo.loja.models.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RespectBinding;

@Controller
@RequestMapping("produtos")
public class ProdutoController {

    @RequestMapping("/form")
    public String form() {
        return "produtos/form";
    }

    @PostMapping
    public String grava(Produto produto){
        System.out.println(produto);
        return "produtos/ok";
    }


}
