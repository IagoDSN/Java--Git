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
public class TesteHeranca {
    public static void main(String[] args) {
        
 Funcionario objFuncionario = new Gerente();
    objFuncionario.setNome("Tulio");
    objFuncionario.setSalario(10000);
 
    Gerente objGerente = new Gerente();
    objGerente.setNome("Maria");
    objGerente.setSalario(15000);
    objGerente.setSenha(123);
    objGerente.autentica(123);
    
     Supervisor objSupervisor = new Supervisor("Pedro");
    objSupervisor.setSalario(12000);
 
    objFuncionario.mostra();
    objGerente.mostra();
    objSupervisor.mostra();
    
    
        System.out.println("Bonificacao Funcionarios: "+ objFuncionario.getBonificacao());
        System.out.println("Bonificacao Gerente: "+ objGerente.getBonificacao());
        System.out.println("Bonificacao Supervisor: "+ objSupervisor.getBonificacao());
    
}
}