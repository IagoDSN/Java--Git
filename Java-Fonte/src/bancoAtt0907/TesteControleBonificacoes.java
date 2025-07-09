/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoAtt0907;

/**
 *
 * @author 13410289682
 */
public class TesteControleBonificacoes {
    public static void main(String[] args) {
        Gerente objGerente = new Gerente();
        objGerente.setSalario(1000);
        Supervisor objSupervisor = new Supervisor("Iago");
        objSupervisor.setSalario(1000);
        
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        controle.registra(objGerente);
        controle.registra(objSupervisor);
        
        System.out.println("Total de bonificações: "+controle.getTotalBonificacoes());
    }
}
