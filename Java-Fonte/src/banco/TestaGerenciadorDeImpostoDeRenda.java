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
public class TestaGerenciadorDeImpostoDeRenda {
    public static void main(String[] args) {
GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
SeguroDeVida sv = new SeguroDeVida();
gerenciador.adiciona(sv);
ContaCorrente cc = new ContaCorrente();
cc.deposita(1000);
gerenciador.adiciona(cc);
System.out.println(gerenciador.getTotal());
System.out.printf("O saldo é: %.2f&", cc.getSaldo());
}
}
