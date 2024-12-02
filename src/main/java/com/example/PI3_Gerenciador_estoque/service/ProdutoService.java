/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PI3_Gerenciador_estoque.service;

import com.example.PI3_Gerenciador_estoque.model.Produto;
import com.example.PI3_Gerenciador_estoque.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nicolas
 */
@Service
public class ProdutoService {
    
    @Autowired
    ProdutoRepository produtoRepository;
    
    
    public Produto criarUsuario(Produto produto){
        produto.setId(null);
        produtoRepository.save(produto);
        return produto;
    }
    
}
