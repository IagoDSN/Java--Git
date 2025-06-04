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
public class ContaCorrente extends Conta{
    
    @Override
    public void atualiza(double taxa) {
        super.atualiza(this.getSaldo() * (taxa * 2));
    }
    @Override
    public void deposita(double valor) {
      super.deposita(valor - 1);
}
}
