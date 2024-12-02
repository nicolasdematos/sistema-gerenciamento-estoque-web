/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PI3_Gerenciador_estoque.controller;

import com.example.PI3_Gerenciador_estoque.model.Produto;
import com.example.PI3_Gerenciador_estoque.repository.ProdutoRepository;
import com.example.PI3_Gerenciador_estoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nicolas
 */
@RestController
public class ProdutoControllerAPI {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    @Autowired
    private ProdutoService produtoService;
    
    @PostMapping("/adicionar-produto")
    public ResponseEntity<Produto> criar(@RequestBody Produto produto){
        produto.setId(null);
        produtoRepository.save(produto);
        return new ResponseEntity<>(produto, HttpStatus.CREATED);
    }
    
}
