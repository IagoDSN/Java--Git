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
public class Diretor extends Funcionario implements Autenticavel, Estacionamento{
    
    private int senha;
    
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
        return this.getSalario() * 0.10;
    }

    @Override
    public void relatorio() {
        System.out.println("Relatório Gerente");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Outros dados..........");
    }
    
    public boolean autorizaEstacionamento(){
        System.out.println("Estacionamento autorizado para o Diretor, vaga 12");
        return true;
    }
}
