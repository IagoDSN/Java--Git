package sintaxe;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iagod
 */
public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    int valor = 1;
        
        System.out.println("Digite a quantidade de alunos: ");
        int x = entrada.nextInt();
        
        int[] vetor = new int[x];
       
    for(int j=0; j<x; j++){
        System.out.println("Digite a nota " + valor + ": ");
        int nota = entrada.nextInt(); 
        vetor[j] = nota;
        valor++;
     }
        double soma = vetor[0] + vetor[1] + vetor[2];
         System.out.println("Média: " + soma/x);
         valor++;
    }
}
