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
public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora obj = new Calculadora();

        System.out.println("Resultado Multiplicação:"+obj.multiplicar(5, 10));
        System.out.printf("Resultado Divisão: %.2f\n",obj.dividir(100, 3));
    }
}
