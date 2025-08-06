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
public class TestaAtualizadorDeContas {
public static void main(String[] args) {
Conta c = new ContaCorrente();
Conta cc = new ContaCorrente();
Conta cp = new ContaPoupanca();
    try {
        c.deposita(1000);
    } catch (ValorInvalidoException ex) {
        Logger.getLogger(TestaAtualizadorDeContas.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        cc.deposita(1000);
    } catch (ValorInvalidoException ex) {
        Logger.getLogger(TestaAtualizadorDeContas.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        cp.deposita(1000);
    } catch (ValorInvalidoException ex) {
        Logger.getLogger(TestaAtualizadorDeContas.class.getName()).log(Level.SEVERE, null, ex);
    }
AtualizadorDeContas adc = new AtualizadorDeContas(0.10);
adc.roda(c);
adc.roda(cc);
adc.roda(cp);
System.out.println("Saldo Total: " + adc.getSaldoTotal());
}
}

