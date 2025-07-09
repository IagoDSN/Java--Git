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
public class ControleDeBonificacoes {
    private double totalBonificacoes = 0;
    
    public void registra(Funcionario f1){
        this.totalBonificacoes += f1.getBonificacao();
    }
    
    public double getTotalBonificacoes(){
        return this.totalBonificacoes;
    }
}
