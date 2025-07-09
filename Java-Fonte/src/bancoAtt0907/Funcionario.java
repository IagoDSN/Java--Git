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
public abstract class Funcionario {
   private String nome, cpf, rg;
   private int identificador;
   private static int totalFuncionario;

    public Funcionario() {
    }
   
   public Funcionario(String nome){
      this.nome = nome;
   }
   
    public Funcionario(String nome, String cpf, String rg, double salario, boolean trabalhaQui) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.trabalhaQui = trabalhaQui;
    }
   
     public int getFuncionario(){
       return this.totalFuncionario;
   }
    
     public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getRg(){
        return this.rg;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    
    private double salario;
    private boolean trabalhaQui;
    
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void aumentarSalario(double valor){
        this.salario = this.salario + valor;
    }
    public void demitir(){
        if(this.trabalhaQui != false){
        this.trabalhaQui = false;
        }
    }
    public void mostra(){
            System.out.println("Nome: "+this.getNome()+ 
                    " \ncpf: "+this.getCpf()+
                    " \nrg: "+this.getRg()+
                    " \nSalario: "+this.getSalario()+"\n");
        }
    
    public abstract double getBonificacao();
}
