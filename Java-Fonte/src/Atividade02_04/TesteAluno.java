/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade02_04;

import java.util.Scanner;

/**
 *
 * @author 13410289682
 */
public class TesteAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Aluno alu1 = new Aluno();
        Aluno alu2 = new Aluno();
        
                  
        alu1.fazerMatricula();                  
        alu2.fazerMatricula();
        
        alu1.exibirDados();
        alu2.exibirDados();
        
    }
}
    

