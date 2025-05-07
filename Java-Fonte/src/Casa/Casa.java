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
public class Casa {
        
   private String corCasa;
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();
        
        public void setCorCasa(String cor){
            this.corCasa = cor;
        }
        public String getCorCasa(){
            return this.corCasa;
        }
        
        public void quantasEstaoAbertas(){
            int quant = 0;
            if(porta1.aberta == true){
                quant += 1;
            }
            if(porta2.aberta == true){
                quant += 1;
            }
            if(porta3.aberta == true){
                quant += 1;
            }
            System.out.println("Estão abertas "+quant+" portas");
        }
        public void pintar(String s){
            this.setCorCasa(s);
            System.out.println("Agora a casa está com a cor "+this.getCorCasa());
        }
}
