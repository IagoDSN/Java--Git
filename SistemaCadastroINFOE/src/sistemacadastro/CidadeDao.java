/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import modelo.Cidade;
/**
 *
 * @author 02338079698
 */
public class CidadeDao {
    
    public List<Cidade> getLista(){
        return Dados.listaCidade;
    }
    
    
    public boolean salvar(Cidade objCidade){
        if(objCidade.getCod() == null){
            Integer codigo = Dados.listaCidade.size() - 1;
            objCidade.setCod(codigo);
            Dados.listaCidade.add(objCidade);
            
        }
        return true;
        
    }
    
    public boolean remover(Cidade objCidade){
        Dados.listaCidade.remove(objCidade);
        return true;
    }
}
