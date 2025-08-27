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
public class Programa {
    public static void main(String[] args) {
        Conta minhaConta = new ContaCorrente(); //obj
        Conta outraConta = new ContaCorrente(); //obj
        //Cliente objClienteIago = new Cliente();
        
        //minhaConta.objCliente = objClienteIago;
        
        minhaConta.setNunmero(20250013);
    
     minhaConta.setNome("Iago");
     outraConta.setNome("Jorge");
        try { 
            minhaConta.deposita(10000);
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            outraConta.deposita(20000);
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }

    minhaConta.saca(50000);
        try {
            minhaConta.transfere(outraConta, 200);
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        System.out.println("Saldo da minha conta: " +minhaConta.getSaldo());
        System.out.println("Saldo da outra conta: " +outraConta.getSaldo());
        
        System.out.println("Endereço da minha conta: " +minhaConta);
        System.out.println("Endereço da outra conta: " +outraConta);
        
        System.out.println("Número da conta: "+minhaConta.getNumero());
    }
}
