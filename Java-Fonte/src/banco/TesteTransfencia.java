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
public class TesteTransfencia {
    public static void main(String[] args) {
        Conta iagoConta = new Conta(); //obj
        Conta jorgeConta = new Conta(); //obj
    
     iagoConta.cliente = "Iago";
     jorgeConta.cliente = "Jorge";
     
    iagoConta.deposita(1000); 
    jorgeConta.deposita(400);

    iagoConta.transfere(jorgeConta, 200);
        
        System.out.println("Saldo da conta do Iago: " +iagoConta.saldo);
        System.out.println("Saldo da conta do Jorge: " +jorgeConta.saldo);
}
}
