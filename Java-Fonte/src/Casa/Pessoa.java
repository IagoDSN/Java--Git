/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

/**
 *
 * @author 13410289682
 */
public class Pessoa {
    private String nome, data;
    private int idade;
    public void setNome(String nome){
            this.nome = nome;
        }
        public String getNome(){
            return this.nome;
        }
        public void setData(String data){
            this.data = data;
        }
        public String getData(){
            return this.data;
        }
        public void setIdade(int idade){
            this.idade = idade;
        }
        public int getIdade(){
            return this.idade;
        }
    public void fazAniversario(){
        this.idade++;
    }
}
