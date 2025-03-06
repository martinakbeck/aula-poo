/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author ADM
 */
public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        if (numero.trim().isEmpty()) {
            throw new IllegalArgumentException("O Número da conta é inválido");
        }
        
        this.numero = numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        if (titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O Número da conta é inválido");
        }
        
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor negativo");
        }
        
        this.saldo = saldo + valor;

    }

    public void sacar(double valor) {
        if (valor <= 0 || this.saldo < valor) {
            throw new IllegalArgumentException("Valor do saque ou saldo insuficiente");
        }

        this.saldo = saldo - valor;

    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}