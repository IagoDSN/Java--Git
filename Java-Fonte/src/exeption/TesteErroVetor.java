/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeption;

/**
 *
 * @author 13410289682
 */
public class TesteErroVetor {

    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
      //  try{
        for (int i = 0; i <= 15; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
       // }catch (ArrayIndexOutOfBoundsException ex){
       //     System.out.println("Error: " + ex.getMessage());
        //}
        System.out.println("fim do metodo2");
    }
}
 