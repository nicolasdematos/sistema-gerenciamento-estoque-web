/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PI3_Gerenciador_estoque.controller;

import com.example.PI3_Gerenciador_estoque.model.Usuario;
import com.example.PI3_Gerenciador_estoque.repository.UsuarioRepository;
import com.example.PI3_Gerenciador_estoque.service.UsuarioService;
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
public class UsuarioControllerAPI {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public ResponseEntity<List> listar(){
        List<Usuario> filmeS = usuarioRepository.findAll();
        return new ResponseEntity<>(filmeS, HttpStatus.OK);
    }
    
    @PostMapping("/adicionar")
    public ResponseEntity<Usuario> criar(@RequestBody Usuario usuario){
        Usuario novoFilme = usuarioService.criarUsuario(usuario);
        return new ResponseEntity<>(novoFilme, HttpStatus.CREATED);
    }
}
