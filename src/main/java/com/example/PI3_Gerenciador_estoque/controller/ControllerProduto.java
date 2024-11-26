/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PI3_Gerenciador_estoque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Nicolas
 */
@Controller
public class ControllerProduto {
    
    @GetMapping("/")
    public String mostraLogin(){
        return "login";
    }
    
    @GetMapping("/menu")
    public String mostraMenu(){
        return "menu";
    }
    
    @GetMapping("/registro-movimentacao")
    public String mostraRegistroDeMovimentacao(){
        return "registro-movimentacao";
    }
    
    @GetMapping("/listar-movimentacao")
    public String mostraListrarMovimentacao(){
        return "listar-movimentacao";
    }
    
    @GetMapping("/cadastro-produtos")
    public String mostracadastroProdutos(){
        return "cadastro-produtos";
    }
}
