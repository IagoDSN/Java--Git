/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dal.ModuloConexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cidade;
/**
 *
 * @author 02338079698
 */
public class CidadeDao {
    
    public List<Cidade> getLista(){
        String mysql = "select * from cidade";
        List<Cidade> listaCidade = new ArrayList<>();
        try{
            PreparedStatement pst = ModuloConexao.getPreparableStatement(mysql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Cidade objCidade = new Cidade();
                objCidade.setCod(rs.getInt("codCidade"));
                objCidade.setNome(rs.getString("nomeCidade"));
                objCidade.setUf(rs.getString("ufcidade"));
                listaCidade.add(objCidade);
            }
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de SQL "+ex.getMessage());
        }
        
        return listaCidade;
    }
    
    
    public boolean salvar(Cidade objCidade){
        if(objCidade.getCod() == null){
            Integer codigo = Dados.listaCidade.size() + 1;
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
