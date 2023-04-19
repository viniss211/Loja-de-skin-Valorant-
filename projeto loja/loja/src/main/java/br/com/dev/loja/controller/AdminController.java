package br.com.dev.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AdminController {
    @GetMapping("/Admnistrativo")
    public String admnistrar() {
        return "Administrativo/Admin";
    }
}