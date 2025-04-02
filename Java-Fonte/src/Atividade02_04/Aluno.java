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
public class Aluno {
     Scanner entrada = new Scanner(System.in);
     
    String nome;
    int matricula, idade;
    
    void exibirDados(){
        System.out.println("Nome do aluno: "+this.nome);
        System.out.println("Matricula do aluno: "+this.matricula);
        System.out.println("Idade do aluno: "+this.idade);
    }
    void fazerMatricula(String nome, int matricula,int idade){
        System.out.println("Fazer matricula do aluno");
        System.out.println("----------------------------------");
        
        System.out.println("Digite o nome do aluno");
        this.nome = nome;
        
        System.out.println("Digite o nome do aluno");
        this.matricula = matricula;
        
        System.out.println("Digite o nome do aluno");
        this.idade = idade;
        
        System.out.println("---------------------------------");
}
}
