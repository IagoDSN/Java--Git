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
public class TestaContas {
     public static void main(String[] args) {
    Conta c = new ContaCorrente();
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();
    c.deposita(1000);
    cc.deposita(1000);
    cp.deposita(1000);
    c.atualiza(0.10);
    cc.atualiza(0.10);
    cp.atualiza(0.10);
    System.out.println(c.getSaldo());
    System.out.println(cc.getSaldo());
    System.out.println(cp.getSaldo());

}
}
