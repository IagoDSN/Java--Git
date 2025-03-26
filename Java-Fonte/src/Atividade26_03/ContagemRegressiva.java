/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade26_03;

import java.util.Scanner;

/**
 *
 * @author 13410289682
 */
public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num = 0;
        
        while(true){
        System.out.println("Digite um numero maior que zero: ");
        num = entrada.nextInt();
        if(num>0){
            break;
        }
            System.out.println("Indisponivel tente novamente!");
        }
        
        while(num>0){
            num-=1;
            System.out.println("Contagem: "+num);
       }
    }
}
