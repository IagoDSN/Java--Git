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
public class Retangulo implements AreaCalculavel {
    
private int largura;
private int altura;
public Retangulo(int largura, int altura) {
this.largura = largura;
this.altura = altura;
}
public double calculaArea() {
return this.largura * this.altura;
}
}
