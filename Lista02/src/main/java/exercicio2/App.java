/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class App {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String titular, numero;

        ContaBancaria contaOrigem = new ContaBancaria();
        ContaBancaria contaDestino = new ContaBancaria();

        System.out.println("Informe nome do titular da conta de origem: ");
        titular = tec.nextLine();
        contaOrigem.setTitular(titular);

        System.out.println("Informe número da conta de origem: ");
        numero = tec.nextLine();
        contaOrigem.setNumero(numero);

        System.out.println("Informe nome do titular da conta de destino: ");
        titular = tec.nextLine();
        contaDestino.setTitular(titular);

        System.out.println("Informe número da conta de destino: ");
        numero = tec.nextLine();
        contaDestino.setNumero(numero);

        contaOrigem.depositar(1000);
        contaOrigem.depositar(700);

        contaDestino.depositar(5000);

        contaDestino.sacar(3000);

        contaDestino.transferir(contaOrigem, 1800);

        System.out.println("Titular conta origem: " + contaOrigem.getTitular());
        System.out.println("Saldo conta origem: R$ " + contaOrigem.getSaldo());

        System.out.println("Titular conta destino: " + contaDestino.getTitular());
        System.out.println("Saldo conta destino: R$ " + contaDestino.getSaldo());
    }
}