/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PI3_Gerenciador_estoque.service;

import com.example.PI3_Gerenciador_estoque.model.Usuario;
import com.example.PI3_Gerenciador_estoque.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nicolas
 */
@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    
    public Usuario criarUsuario(Usuario usuario){
        usuario.setId(null);
        usuarioRepository.save(usuario);
        return usuario;
    }
    
}
