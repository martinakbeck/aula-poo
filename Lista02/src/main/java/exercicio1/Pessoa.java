/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author ADM
 */
public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setPeso(double peso){
        if (peso <= 0){
            throw new IllegalArgumentException("Peso inválido");
        }
        
        this.peso = peso;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public void setAltura(double altura){
        if (altura <= 0 ){
            throw new IllegalArgumentException("Peso inválido");
        }
        
        this.altura = altura;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    
    public double calcularImc(){
        return peso / (altura * altura);
    }
}
