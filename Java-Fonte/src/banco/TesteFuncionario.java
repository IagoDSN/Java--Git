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
        Funcionario fun2 = new Funcionario("Jose", "1324567564", "745974", 1300.7, true);
        Funcionario fun3 = new Funcionario("asd", "1324567564", "745974", 1300.7, true);
        
        fun1.setNome("Joao Gabriel");
        fun1.setSalario(3000);
        
        fun1.setCpf("134102896-82");
        fun1.setRg("924067");
        
        fun1.mostra();
        
        fun1.aumentarSalario(300);
        System.out.println("Salario do "+fun1.getNome()+" com aumento: "+fun1.getSalario());
                
        fun1.demitir();
        System.out.println("Fucionario Demitido!");
        
        System.out.println("\nNome do funcionario 2: "+fun2.getNome());
        
        System.out.println("Total de funcionarios: "+fun1.getFuncionario());
       
        
        
    }
}
