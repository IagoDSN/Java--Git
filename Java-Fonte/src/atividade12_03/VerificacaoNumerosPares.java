/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade12_03;

import java.util.Scanner;

/**
 *
 * @author Iagod
 */
public class VerificacaoNumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
