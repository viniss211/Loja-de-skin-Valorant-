package br.com.dev.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DescriProduController {
    @GetMapping("/Produto")
    public String produto() {
        return "Produto/descricao_produ";
    }
}
