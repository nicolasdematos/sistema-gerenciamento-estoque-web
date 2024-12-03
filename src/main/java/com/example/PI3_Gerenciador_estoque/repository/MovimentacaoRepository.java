/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.PI3_Gerenciador_estoque.repository;

import com.example.PI3_Gerenciador_estoque.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nicolas
 */
@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

}
