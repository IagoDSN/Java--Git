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
public class Programa {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(); //obj
        Conta outraConta = new Conta(); //obj
        //Cliente objClienteIago = new Cliente();
        
        //minhaConta.objCliente = objClienteIago;
    
     minhaConta.objCliente.nome = "Iago";
    
    minhaConta.deposita(10000); 
    outraConta.deposita(20000);

    minhaConta.saca(50000);
    minhaConta.transfere(outraConta, 200);
    
        System.out.println("Saldo da minha conta: " +minhaConta.saldo);
        System.out.println("Saldo da outra conta: " +outraConta.saldo);
        
        System.out.println("Endereço da minha conta: " +minhaConta);
        System.out.println("Endereço da outra conta: " +outraConta);
    }
}
