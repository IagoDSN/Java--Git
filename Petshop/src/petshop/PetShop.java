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
public class PetShop {

    Animal ave = new Ave();
    Animal cachorro = new Cachorro();
    Animal gato = new Gato();

    boolean[] quartos = new boolean[5];

    public PetShop() {
        for (int i = 0; i < 5; i++) {
            this.quartos[i] = false;
        }
    }

    public void VizualizarQuartosDisponiveis() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Quarto número " + (i + 1) + " está disponivel? " + this.quartos[i]);
        }
    }

    public void acomodarAnimal() {
        if (this.quartos[0] == false) {
            System.out.println("O animal foi acomodado no quarto 1");
            this.quartos[0] = true;
        } else {
            if (this.quartos[1] == false) {
                System.out.println("O animal foi acomodado no quarto 2");
                this.quartos[1] = true;
            } else {
                if (this.quartos[2] == false) {
                    System.out.println("O animal foi acomodado no quarto 3");
                    this.quartos[2] = true;
                } else {
                    if (this.quartos[3] == false) {
                        System.out.println("O animal foi acomodado no quarto 4");
                        this.quartos[3] = true;
                    } else {
                        if (this.quartos[4] == false) {
                            System.out.println("O animal foi acomodado no quarto 5");
                            this.quartos[4] = true;
                        } else {
                            System.out.println("Todos os quartos estão ocupados, não foi possivel acomodar o animal!");
                        }
                    }
                }
            }
        }
    }

    public void devolverAnimal(int quarto) {
        try {
            if (this.quartos[quarto] == false) {
                System.out.println("O quarto está vazio!");
            } else {
                System.out.println("Animal devolvido ao dono!");
                this.quartos[quarto] = true;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: número de quarto inválido.");
        }
    }
}
