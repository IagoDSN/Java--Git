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
public class ExemploMetodo2 {
    public static int somar(){
        int a=20, b=30;
        return a+b;
    }
    public static void main(String[] args) {
    int soma = somar();
    soma+=10;
        System.out.println("Resultado = " + soma);
        System.out.println("Resultado = " + somar());
    }
}
