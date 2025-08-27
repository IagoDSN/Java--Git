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
public class FuncionarioDao {
        public List<Funcionario> getLista(){
        return Dados.listFuncionario;
    }
    
    public boolean salvar(Funcionario objFuncionario){
        if(objFuncionario.getCodigoFuncionario() == null){
            Integer Codigo = Dados.listCidade.size() - 1;
            objFuncionario.setCodigoFuncionario(Codigo);
            Dados.listFuncionario.add(objFuncionario);
        }
        return true;
    }
    
    public boolean remover(Funcionario objFuncionario){
        Dados.listCidade.remove(objFuncionario);
        return true;
    }
}
