/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class App {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        double altura, peso;
        String nome;
        
        Pessoa[] pessoa = new Pessoa[3];
        
        for(int i = 0; i < 3; i++){
            pessoa[i] = new Pessoa();
            
            System.out.println("Informe nome: ");
            nome = tec.nextLine();
            pessoa[i].setNome(nome);
            
            System.out.printf("Digite altura %s: ", nome);
            altura = tec.nextDouble();
            
            System.out.printf("Digite peso da pessoa %s: ", nome);
            peso = tec.nextDouble();
            
            pessoa[i].setAltura(altura);
            pessoa[i].setPeso(peso);
            
            tec.nextLine();
        }
        for(int i = 2; i >= 0; i--){
            System.out.printf("IMC do(a) %s: %.2f%n", pessoa[i].getNome(), pessoa[i].calcularImc());
        }
    }
}
