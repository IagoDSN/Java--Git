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
 
    int numero;
    String cliente;
    double saldo, limite;
    
    public void saca(double quantidade){ //double quantidade é um parâmetro
        if(quantidade <= this.saldo){
        this.saldo = this.saldo - quantidade;
        }else{
            System.out.println("Prezado " +this.cliente+ ",,  ob Quantidade de saldo insuficiente, seu saldo é: "+this.saldo);
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
           System.out.println("Quantidade de saque insuficiente, seu saldo atual: "+this.saldo+" Quantidade transferida canceleda, quantidade: " +quantidade);  
       }
  }
}