/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade19_03;

/**
 *
 * @author Iagod celsiusParaFahrenheit() e fahrenheitParaCelsius().
 */
public class ConversorTemperatura {
    public double celsiusParaFahrenheit(double cels){
       return (cels -32)*5/9;
    }
    public double fahrenheitParaCelsius(double faren){
       return (faren *9/5)+32;
    }
}
