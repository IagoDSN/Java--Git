/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade19_03;

/**
 *
 * @author Iagod
 */
public class TesteAritmetica {
    public static void main(String[] args) {
      Aritmetica obj = new Aritmetica();  
      
      System.out.println("Resultado Multiplicação:"+obj.multiplicar(11, 23));
      System.out.println("Resultado Divisão:"+obj.dividir(50, 10));
      System.out.println("Resultado Soma:"+obj.somar(16,32));
      System.out.println("Resultado Subtração:"+obj.subtrair(45, 15));
      System.out.println("Resultado Resto de Divisão:"+obj.resto(20, 4));
    }
}
