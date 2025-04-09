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
public class Funcionario {
    String nome, cpf, rg;
    
    double salario;
    boolean trabalhaQui;
    
    public void aumentarSalario(double valor){
        this.salario = this.salario + valor;
    }
    public void demitir(){
        if(this.trabalhaQui != false){
        this.trabalhaQui = false;
        }
    }
    public void mostra(){
            System.out.println("Nome: "+this.nome+ 
                    " \ncpf: "+this.cpf+
                    " \nrg: "+this.rg+
                    " \nSalario: "+this.salario+"\n");
        }
}
