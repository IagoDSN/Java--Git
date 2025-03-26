/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade26_03;

/**
 *
 * @author 13410289682
 */
public class ProdutoQueRepresenteUmItemAVenda {
    String nome;
    double preco, porcentagemDesconto, valorPagar;
    
    public void exibirInformacoes(){
                System.out.println("Nome do produto: " + nome);
                System.out.println("Preço do produto: " + preco);
                System.out.println("Valor a pagar com "+porcentagemDesconto+"% : " + valorPagar);
    }
    public void calcularPrecoPromocional(){
        valorPagar = preco - (preco*(porcentagemDesconto/100));
    }
}
