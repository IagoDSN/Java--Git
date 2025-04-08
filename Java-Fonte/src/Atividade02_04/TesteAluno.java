/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade02_04;
import java.util.Scanner;

/**
 *
 * @author 13410289682
 */
public class TesteAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Aluno alu1 = new Aluno();
        System.out.println("Digite o nome do primeiro aluno:");
        alu1.nome = scanner.nextLine();
        System.out.println("Digite a matrícula do primeiro aluno:");
        alu1.matricula = scanner.nextInt();
        System.out.println("Digite a idade do primeiro aluno:");
        alu1.idade = scanner.nextInt();
        scanner.nextLine();
        alu1.fazerMatricula();
        alu1.exibirDados();
        
        Aluno alu2 = new Aluno();
         System.out.println("Digite o nome do segundo aluno:");
        alu2.nome = scanner.nextLine();
        System.out.println("Digite a matrícula do segundo aluno:");
        alu2.matricula = scanner.nextInt();
        System.out.println("Digite a idade do segundp aluno:");
        alu2.idade = scanner.nextInt();
        scanner.nextLine();
        alu2.fazerMatricula();
        alu2.exibirDados();
                  
        
    }
}
    

