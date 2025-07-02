/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 13410289682
 */
public class Gerente extends Funcionario{
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
    
}
