/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 13410289682
 */
public class TestaContas {
     public static void main(String[] args) throws ValorInvalidoException {
    Conta c = new ContaCorrente();
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();
         try {
             c.deposita(1000);
         } catch (ValorInvalidoException ex) {
             Logger.getLogger(TestaContas.class.getName()).log(Level.SEVERE, null, ex);
         }
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
