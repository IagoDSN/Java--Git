/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade26_03;

import java.util.Scanner;

/**
 *
 * @author 13410289682
 */
public class TesteProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ProdutoQueRepresenteUmItemAVenda obj = new ProdutoQueRepresenteUmItemAVenda();
        
        System.out.println("Digite o produto: ");
        obj.nome = entrada.nextLine();
        
        System.out.println("Digite o preço do produto: ");
        obj.preco = entrada.nextDouble();
        
        System.out.println("Digite o desconto do produto: ");
        obj.porcentagemDesconto = entrada.nextDouble();
        
        obj.calcularPrecoPromocional();
        obj.exibirInformacoes();
        
    }
}
