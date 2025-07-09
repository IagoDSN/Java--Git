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
public class TesteTransfencia {
    public static void main(String[] args) {
        Conta iagoConta = new ContaCorrente(); //obj
        Conta jorgeConta = new ContaCorrente(); //obj
    
     iagoConta.setNome("iago");
     jorgeConta.setNome("Jorge");
     
    iagoConta.deposita(1000); 
    jorgeConta.deposita(400);

    iagoConta.transfere(jorgeConta, 200);
        
        System.out.println("Saldo da conta do Iago: " +iagoConta.getSaldo());
        System.out.println("Saldo da conta do Jorge: " +jorgeConta.getSaldo());
}
}
