/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author Iagod
 */
public class Main {
    public static void main(String[] args) {
        
        PetShop yoyoAnimais = new PetShop();
        
        for(int i = 0; i<5; i++){
        yoyoAnimais.quartos[i] = true;
        }
        for(int i = 0; i<5; i++){
        System.out.println(yoyoAnimais.quartos[i]);
        }
    }
    
}
