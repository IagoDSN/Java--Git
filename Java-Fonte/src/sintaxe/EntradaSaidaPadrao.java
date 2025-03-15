/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

import java.util.Scanner;
import java.lang.System;

/**
 *
 * @author 13410289682
 */
public class EntradaSaidaPadrao {
    public static void main(String arg[]){
    Scanner entrada = new Scanner(System.in);
     
    System.out.println("Digite seu nome: ");
    String nome = entrada.nextLine();
        
    System.out.println("Digite sua idade: ");
    int idade = entrada.nextInt();
        
    System.out.println("Digite seu salario: ");
    double salario = entrada.nextDouble();
    
    String verdade = "iago";
        
     System.out.println("nome: " + nome);
     System.out.println("Idade: " + idade);
     System.out.println("Salario: " + salario);
     
     
    }
            
}
