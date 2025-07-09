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
public class ContaCorrente extends Conta implements Tributavel{
     void atualiza (double taxa){
        super.deposita(this.getSaldo() * (taxa * 2));
    }
        @Override
    public void deposita(double valor){
        super.deposita(valor - 1);
    }
    public double calculaTributos() {
    return this.getSaldo() * 0.01;
    }
}
