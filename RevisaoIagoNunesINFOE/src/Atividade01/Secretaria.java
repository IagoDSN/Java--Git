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
public class Secretaria {
    public void matricularAluno(Curso curso, Aluno aluno) {
        curso.adicionarAluno(aluno);
        System.out.println("Aluno " + aluno.getNome() + " matriculado no curso " + curso.getNome());
    }

    public void emitirCertificado(Aluno aluno, Curso curso) {
        System.out.println("Certificado emitido para " + aluno.getNome() + " no curso " + curso.getNome());
    }
}
