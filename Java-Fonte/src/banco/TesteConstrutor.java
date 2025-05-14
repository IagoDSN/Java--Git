/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author 13410289682
 */
public class TesteConstrutor {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in, "ISO_8859_1");
       
       System.out.println("Digite seu nome: ");
       String nome = entrada.nextLine();
       System.out.println("Nome: "+nome);
       
        Conta x = new Conta();
        x.deposita(2000);
        
        Conta y = new Conta(10000);
        
        Conta z = new Conta(15000.50, 20000, 0322025);
        z.deposita(5000);
        
        Cliente objClienteMaria = new Cliente();
        Conta w = new Conta(323, objClienteMaria, 10000, 0);
        
        System.out.println("Saldo da conta x: "+x.getSaldo());
        System.out.println("Saldo da conta y: "+y.getSaldo());
        System.out.println("Saldo da conta z: "+z.getSaldo());
        System.out.println("Saldo da conta z: "+w.getSaldo());
        
        System.out.println("\nTotal de contas: "+Conta.getTotalDeContas());
        System.out.println("Total de contas: "+x.getTotalDeContas());
        System.out.println("Total de contas: "+y.getTotalDeContas());
        System.out.println("Total de contas: "+z.getTotalDeContas());
        System.out.println("Total de contas: "+w.getTotalDeContas());
    }
}
