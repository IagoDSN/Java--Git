/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author 13410289682
 */
public class Teste {
public static void main(String[] args) {
AreaCalculavel a = new Retangulo(3,2);
System.out.println("Quadrado: "+a.calculaArea());

AreaCalculavel c = new Circulo(3);
System.out.println("Circulo: "+c.calculaArea());
}
}
