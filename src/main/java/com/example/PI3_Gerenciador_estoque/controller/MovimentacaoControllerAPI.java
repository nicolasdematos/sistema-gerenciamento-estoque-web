/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PI3_Gerenciador_estoque.controller;

import com.example.PI3_Gerenciador_estoque.model.Movimentacao;
import com.example.PI3_Gerenciador_estoque.model.Produto;
import com.example.PI3_Gerenciador_estoque.repository.MovimentacaoRepository;
import com.example.PI3_Gerenciador_estoque.repository.ProdutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nicolas
 */
@RestController
public class MovimentacaoControllerAPI {
    
    @Autowired
    private MovimentacaoRepository movimentacaoRepository;
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    
    @PostMapping("/adicionar-movimentacao")
    public ResponseEntity<Movimentacao> criar(@RequestBody Movimentacao movimentacao){
        movimentacao.setId(null);
        if (produtoRepository.existsById(movimentacao.getProduto_id())){
            movimentacaoRepository.save(movimentacao);
            
            Produto produtoAchado = produtoRepository.findById(movimentacao.getProduto_id()).orElseThrow();
            System.out.println(movimentacao.getTipo());
            if (movimentacao.getTipo().equalsIgnoreCase("entrada")){
                produtoAchado.setQuantidade(produtoAchado.getQuantidade() + movimentacao.getQuantidade());
            }
            else{
                produtoAchado.setQuantidade(produtoAchado.getQuantidade() - movimentacao.getQuantidade());
            }           
            produtoRepository.save(produtoAchado);
            
            return new ResponseEntity<>(movimentacao, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>( HttpStatus.NOT_ACCEPTABLE);
        }
    }
    
    
    
    @GetMapping("/exibir-movimentacoes")
    public ResponseEntity<List> listar(){
        List<Movimentacao> filmeS = movimentacaoRepository.findAll();
        return new ResponseEntity<>(filmeS, HttpStatus.OK);
    }
}
