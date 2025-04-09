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
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario();
        
        fun1.nome = "Joao Gabriel";
        fun1.salario = 3000;
        
        fun1.cpf = "134102896-82";
        fun1.rg = "924067";
        
        fun1.mostra();
        
        fun1.aumentarSalario(300);
        System.out.println("Salario do "+fun1.nome+" com aumento: "+fun1.salario);
                
        fun1.demitir();
        System.out.println("Fucionario Demitido!");
        
    }
}
