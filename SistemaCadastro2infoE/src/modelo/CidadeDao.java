/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Tulio Dias
 */
public class CidadeDao { //DAO-> Data Acess Object
    
    public List<Cidade> getLista(){
        return Dados.listaCidade;
    }
    
    public boolean salvar(Cidade objCidade){
        if(objCidade.getCodigoCidade()==null){
            Integer codigo = Dados.listaCidade.size()+1;
            objCidade.setCodigoCidade(codigo);
            Dados.listaCidade.add(objCidade);
        }
        return true;
    }
    
    public boolean remover(Cidade objCidade){
        Dados.listaCidade.remove(objCidade);
        return true;
    }
    
}
