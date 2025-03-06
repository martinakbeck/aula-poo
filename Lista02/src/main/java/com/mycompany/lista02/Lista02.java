/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista02;

/**
 *
 * @author ADM
 */
public class Lista02 {

    public static void main(String[] args) {
        Papagaio papagaio = new Papagaio();
        papagaio.setNome("");
        papagaio.setIdade(20);
        
        System.out.println("Nome " + papagaio.getNome());
        System.out.println("Idade " + papagaio.getIdade());
        System.out.println(papagaio.pedirBiscoito());
    }
}
