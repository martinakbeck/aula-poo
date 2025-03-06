/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

/**
 * Método para o papagaio pedir biscoito
 * @return Um texto do papagaio pedindo biscoito;
 */
public class Papagaio {
    private String nome;
    private int idade;
    
    public String pedirBiscoito(){
        return nome + " quer biscoito!";
    }
    
    /**
     * Método setter para o nome
     * @param nome nome que sera atribuido ao papagaio
     */
    
    public void setNome(String nome){
        if (nome.isEmpty() || nome.isBlank()){ //empty vazio, blank em branco
            throw new IllegalArgumentException("Nome invalido");
        }
        
        //if(nome.trim().isEmpty()){  //trim elimina os espaço ao redor
        //    throw new IllegalArgumentException("Nome invalido");
        //}
        this.nome = nome;
    }
   
    
    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(int idade){
        if (idade < 0){
            throw new IllegalArgumentException("Idade invalida!");
        }
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    
}
