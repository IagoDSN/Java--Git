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

    private Aluno aluno;    

    public Professor() {
        System.out.println("O professor foi chamado");
    }

    public Professor(String nome, String cpf, double salario, Aluno aluno) {
        this();
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.aluno = aluno;
    }

    Professor(String dr_Silva, String matemática) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
