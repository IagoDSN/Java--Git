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
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    AtualizadorDeContas(double selic){
        this.selic = selic;
    }
    
void roda(Conta c) {
    System.out.println("Saldo anterior: "+ c.getSaldo());// aqui voce imprime o saldo anterior, atualiza a conta,
    c.atualiza(this.selic);// e depois imprime o saldo final
    System.out.println("Saldo final: "+ c.getSaldo());// lembrando de somar o saldo final ao atributo saldoTotal
    this.saldoTotal += c.getSaldo();
}
    double getSaldoTotal() {
        return this.saldoTotal;
    }
}
