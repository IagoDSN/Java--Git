/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoAtt0907;

/**
 *
 * @author 13410289682
 */
public class Gerente extends Funcionario implements Autenticavel{
    //String nome;
    //String cpf;
    //double salario;
    
    private int senha;
    private int numeroDeFuncionariosGerenciados;

     public Gerente(String nome) {
        super(nome);
    }

    public Gerente() {
        super();
    }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    @Override
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        }
        else{
            System.out.println("Acesso negado!");
            return false;
        }
    }
    
    
    @Override
    public double getBonificacao(){
        return this.getSalario() * 0.15;
    }

    @Override
    public void relatorio() {
        System.out.println("Relatório Gerente");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Outros dados..........");
    }
    
}
