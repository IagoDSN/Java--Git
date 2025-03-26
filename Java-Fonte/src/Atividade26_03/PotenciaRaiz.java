/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade26_03;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author 13410289682
 */
public class PotenciaRaiz {
    public static double calcularPotencia(int numero, double expo){
        return Math.pow(numero,expo);
    }
    public static double calcularRaizQuadrada(int numero){
        return Math.sqrt(numero);
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número para o potenciador: ");
        int potencia = entrada.nextInt();
        
        System.out.println("Digite um número para o expoente: ");
        int expoente = entrada.nextInt();
        
        System.out.println("Digite um número para tirar a raiz: ");
        int raiz = entrada.nextInt();
        
        System.out.println("Raiz quadrada de" + raiz + ":" + calcularRaizQuadrada(raiz));
        System.out.println("Potencia de" + potencia + "ao expoente" + expoente + ":" + calcularPotencia(potencia, expoente));
        
    }
}
