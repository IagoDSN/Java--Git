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
public class TesteCasa {
    public static void main(String[] args) {
        
        Porta port = new Porta();
        Pessoa pes = new Pessoa();
        Casa casinha = new Casa();
        
     //Pessoa
     pes.setNome("Iago");
     pes.setIdade(16);
     pes.fazAniversario();
     
     System.out.println("Pessoa: "+pes.getNome()+"\nIdade: "+pes.getIdade()+"\n");
     
     //Porta
        System.out.println("A porta está "+port.abrida());
        port.pintar("rosa");
        port.abrir();
        System.out.println("A porta está aberta? "+ port.abrida());
        port.fechar();
        System.out.println("A porta está aberta? "+port.abrida()+"\n");
        
    //Casa
    casinha.porta1.abrir();
    casinha.porta2.fechar();
    casinha.porta3.fechar();
    casinha.quantasEstaoAbertas();
    
    casinha.pintar("verde");
    
    }
}
