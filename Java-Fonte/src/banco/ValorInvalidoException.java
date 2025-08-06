/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 13410289682
 */
public class ValorInvalidoException extends Exception {
    
    public ValorInvalidoException(double valor){
        super("Valor invalido: " + valor);
        }
    }
