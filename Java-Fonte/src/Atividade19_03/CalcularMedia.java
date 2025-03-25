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
public class CalcularMedia {
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
    public static void main(String[] args) {
        double media = calcularMedia(8.5, 7.0, 9.5);
        System.out.println("A média é: " + media);
    }
}
