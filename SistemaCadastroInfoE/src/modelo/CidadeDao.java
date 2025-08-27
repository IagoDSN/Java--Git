/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author 13410289682
 */
public class CidadeDao {
    public List<Cidade> getLista(){
        return Dados.listCidade;
    }
    
    public boolean salvar(Cidade objCidade){
        if(objCidade.getCodigoCidade() == null){
            Integer Codigo = Dados.listCidade.size() - 1;
            objCidade.setCodigoCidade(Codigo);
            Dados.listCidade.add(objCidade);
        }
        return true;
    }
    
    public boolean remover(Cidade objCidade){
        Dados.listCidade.remove(objCidade);
        return true;
    }
}
