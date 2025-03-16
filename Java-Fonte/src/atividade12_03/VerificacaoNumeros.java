package atividade12_03;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 13410289682
 */
public class VerificacaoNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite primeiro número inteiro");
        int num1 = entrada.nextInt();
                
        System.out.println("Digite o secundo número inteiro");
        int num2 = entrada.nextInt();
               
        System.out.println("Digite terceiro número inteiro");
        int num3 = entrada.nextInt();
        
        int maior = num1;
        if(num2 > maior){
           maior = num2;
        }
        if(num3 > maior){
            maior = num3;
        }
        
        System.out.println("Maior número: " + maior);
        
        verificaNumero(num1);
        verificaNumero(num2);
        verificaNumero(num3);
    }

    public static void verificaNumero(int num) {
        if (num > 0) {
            System.out.println(num + " é positivo.");
        } 
        else if (num < 0) {
            System.out.println(num + " é negativo.");
        } 
        else {
            System.out.println(num + " é igual a zero.");
        }
    }
}
