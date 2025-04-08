/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade02_04;

/**
 *
 * @author 13410289682
 */
public class Aluno {
     
    String nome;
    int matricula, idade;
    

    public void fazerMatricula(){
        System.out.println("----------------------------------");
        System.out.println(nome + " foi matriculado com sucesso!");
        System.out.println("----------------------------------");
    }
    public void exibirDados() {       
        System.out.println("Nome do aluno: "+this.nome);
        System.out.println("Matricula do aluno: "+this.matricula);
        System.out.println("Idade do aluno: "+this.idade);
    }
}
