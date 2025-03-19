/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author 13410289682
 */
public class ExemploMetodo3 {
    public static void exibirNome(String nome, String sobrenome, double sal){
        System.out.println("------");
        System.out.println("Nome: "+nome);
        System.out.println("Sobrenome: "+sobrenome);
        System.out.printf("Salarios: %.2f\n",sal);
        System.out.println("------");
    }
public static void main(String[] args) {
    exibirNome("Iago", "Nunes", 90000);
    exibirNome("Igor", "Sepini", 1000);
    }

 }

