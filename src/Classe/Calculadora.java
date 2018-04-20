/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

/**
 *
 * @author williank
 */
public class Calculadora {
    
    private double numero1;
    private double numero2;

    public Calculadora() {
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public int fatorial(int numero){
        if(numero == 0) return 1;
        return numero*fatorial(numero-1);
    }
    
    public double calcularFibonacci(int numero){
        if(numero == 0) return 0;
        if(numero == 1 || numero == 2) return 1;
        return calcularFibonacci(numero-1)+calcularFibonacci(numero-2);
    }
    
    public double calcularExponecial(){
        return Math.pow(this.numero1, this.numero2);
    }
    
    public double somar(){
        return this.numero1 + this.numero2;
    }
    
    public double diminuir(){
        return this.numero1 - this.numero2;
    }
    
    public double multiplicar(){
        return this.numero1*this.numero2;
    }
    
    public double dividir(){
        return this.numero1/this.numero2;
    }
}
