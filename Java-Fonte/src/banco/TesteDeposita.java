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
public class TesteDeposita {

    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        try {
            try {
                cp.deposita(-100);
            } catch (ValorInvalidoException ex) {
                Logger.getLogger(TesteDeposita.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
