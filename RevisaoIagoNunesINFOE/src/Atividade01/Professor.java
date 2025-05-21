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
public class Professor {
    private String nome, cpf;
    private double salario;

    Aluno aluno = new Aluno();    

    public Professor() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
    
    public void aplicarAvalicao(double valor){
        System.out.println("Avaliação aplicada! Com o valor de "+valor+" pontos");
    }
   public void corrigirAvaliacao(double nota){
       aluno.setNota(nota);
       System.out.println("A nota do aluno "+aluno.getNome()+" foi ajustada para: "+aluno.getNota());
   }
}
