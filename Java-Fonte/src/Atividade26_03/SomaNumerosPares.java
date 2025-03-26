package Atividade26_03;

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
public class SomaNumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int n = entrada.nextInt();
        int soma = 0;
        
        for(int var=0; var<=n; var = var + 2){
            System.out.println("par: "+var);
            soma+=var;
        }
        System.out.println("Soma: "+soma);
    }
    
}
