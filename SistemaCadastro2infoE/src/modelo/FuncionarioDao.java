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
public class FuncionarioDao {
      public List<Funcionario> getLista(){
        return Dados.listaFuncionario;
    }
    
    public boolean salvar(Funcionario objFuncionario){
        if(objFuncionario.getCodigoFucionario()==null){
            Integer codigo = Dados.listaFuncionario.size()-1;
            objFuncionario.setCodigoFucionario(codigo);
            Dados.listaFuncionario.add(objFuncionario);
        }
        return true;
    }
    
    public boolean remover(Funcionario objFuncionario){
        Dados.listaFuncionario.remove(objFuncionario);
        return true;
    }
}
