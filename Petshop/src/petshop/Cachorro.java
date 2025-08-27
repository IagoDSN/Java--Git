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
public class Cachorro extends Animal{
    
    private String raca;
    
    public Cachorro(){
        
    }
    
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public void EmitirSom() {
        System.out.println("Auau!");
    }
    
}
