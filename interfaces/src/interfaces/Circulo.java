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
public class Circulo implements AreaCalculavel {
private int raio;
    
public Circulo(int raio) {
this.raio = raio;
}
    @Override
    public double calculaArea() {
        return Math.PI * this.raio * this.raio;
    }

}
   
