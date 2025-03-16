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
public class VerificacaoIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        if(idade >= 18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
    }
}
