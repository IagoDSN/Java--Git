/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade01;

import java.util.Scanner;

/**
 *
 * @author 13410289682
 */
public class Teste {
    public static void main(String[] args) {
       Secretaria secretaria = new Secretaria();
        Scanner scanner = new Scanner(System.in);

        Professor professor = new Professor("Dr. Silva", "Matemática");
        Curso curso = new Curso("Cálculo I", professor);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Digite o nome do aluno " + i + ":");
            String nomeAluno = scanner.nextLine();
            
            System.out.println("Digite a idade do aluno " + i + ":");
            int idadeAluno = scanner.nextInt();
            scanner.nextLine();

            Aluno aluno = new Aluno(nomeAluno, idadeAluno);
            secretaria.matricularAluno(curso, aluno);
        }

        curso.listarAlunos();

        System.out.println("Emitindo certificados...");
        System.out.println("Digite o nome de um aluno para emitir certificado:");
        String nomeCertificado = scanner.nextLine();
        
        Aluno alunoCertificado = new Aluno(nomeCertificado, 0);
        secretaria.emitirCertificado(alunoCertificado, curso);

    }
    }
