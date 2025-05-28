/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade01;

/**
 *
 * @author 13410289682
 */
public class Curso {
     private String nome;
    private Professor professor;
    private Aluno aluno1;
    private Aluno aluno2;

    public Curso(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.aluno1 = null;
        this.aluno2 = null;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAluno(Aluno aluno) {
        if (aluno1 == null) {
            aluno1 = aluno;
        } else if (aluno2 == null) {
            aluno2 = aluno;
        } else {
            System.out.println("O curso já tem dois alunos, não é possível adicionar mais.");
        }
    }

    public void listarAlunos() {
        System.out.println("Alunos no curso " + nome + ":");
        if (aluno1 != null) {
            System.out.println("- " + aluno1.getNome());
        }
        if (aluno2 != null) {
            System.out.println("- " + aluno2.getNome());
        }
    }
}
