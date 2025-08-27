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
public class Ave extends Animal implements Voador{
    
    private String especie;

    public Ave(){
    }
    
    public Ave(String nome, int idade){
        super(nome, idade);
    }
    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    @Override
    public void EmitirSom() {
        System.out.println("Bem-Te-Vi");
    }

    @Override
    public void voar() {
       if(this.especie == "galinha"){
           System.out.println("Galinhas não conseguem voar!");
       }
       else{
           System.out.println("A ave está voando...");
       }
    }
    
}
