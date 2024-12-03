/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PI3_Gerenciador_estoque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Nicolas
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movimentacao")
public class Movimentacao {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private int produto_id;
    private String tipo;
    private int quantidade;
}
