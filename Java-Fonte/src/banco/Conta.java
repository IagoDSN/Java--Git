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
public class Conta {
 
   private int numero;
    
    Cliente objCliente = new Cliente();
    Cliente ibjClienteContaConjunto;
    private double saldo, limite;
    private String cliente;
    
    public double getSaldo(){
        return this.saldo + this.limite;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNunmero(int numero){
        this.numero = numero;
    }
    public void setNome(String nome){
        this.cliente = nome;
    }
    
    public void saca(double quantidade){ //double quantidade é um parâmetro
        if(quantidade <= this.saldo){
        this.saldo = this.saldo - quantidade;
        }else{
            System.out.println("Prezado " +this.objCliente.getNome()+ ", Quantidade de saldo insuficiente, seu saldo é: "+this.saldo);
        }
}
  public void deposita(double quantidade){
        this.saldo = this.saldo + quantidade;
  }
   public void transfere(Conta destino, double quantidade){
       if(this.saldo >= quantidade){
        this.saca(quantidade);
        destino.deposita(quantidade);
       }else{
           System.out.println("Quantidade de saque insuficiente, seu saldo atual: "+this.getSaldo()+" Quantidade transferida canceleda, quantidade: " +quantidade);  
       }
  }
}