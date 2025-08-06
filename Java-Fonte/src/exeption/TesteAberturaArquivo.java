/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 13410289682
 */
public class TesteAberturaArquivo {

    public static void main(String[] args) {

        try {
            Scanner entrada = new Scanner(new File("c:\\arquivo\\teste.txt"));
            while (entrada.hasNextLine()) {
                System.out.println(entrada.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro de abertura de arquivo na classe TesteAberturaArquivo: "+ ex.getMessage());
        }
    }
}
