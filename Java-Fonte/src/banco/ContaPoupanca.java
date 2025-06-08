package banco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 13410289682
 */
public class ContaPoupanca extends Conta{
    @Override
    void atualiza(double taxa) {
        super.atualiza(taxa * 3);
    }
        @Override
    public void deposita(double valor) {
      super.deposita(valor - 1);
}
}
