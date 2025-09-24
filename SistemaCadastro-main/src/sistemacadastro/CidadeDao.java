/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacadastro;

import dal.ModuloConexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sistemacadastro.Cidade;
import sistemacadastro.Cidade;
import sistemacadastro.Dados;

/**
 *
 * @author 02338079698
 */
public class CidadeDao {

    public List<Cidade> getLista() {
        String mysql = "select * from cidade";
        List<Cidade> listaCidade = new ArrayList<>();
        try {
            PreparedStatement pst = ModuloConexao.getPreparableStatement(mysql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Cidade objCidade = new Cidade();
                objCidade.setCod(rs.getInt("codCidade"));
                objCidade.setNome(rs.getString("nomeCidade"));
                objCidade.setUf(rs.getString("ufCidade"));
                listaCidade.add(objCidade);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL " + ex.getMessage());
        }

        return listaCidade;
    }

    public boolean inserir(Cidade objCidade) {
        String sql = "Insert into cidade(nomeCidade, ufCidade) values(?,?)";
        try {
            PreparedStatement pst = ModuloConexao.getPreparableStatement(sql);
            pst.setString(1, objCidade.getNome());
            pst.setString(2, objCidade.getUf());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade cadastrada com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não cadastrada!");
                return false;
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
            return false;
        }
    }
    public boolean alterar(Cidade objCidade) {
        String sql = "update cidade SET nomeCidade=?, UfCidade=? WHERE codCidade=?";
        try {
            PreparedStatement pst = ModuloConexao.getPreparableStatement(sql);
            pst.setString(1, objCidade.getNome());
            pst.setString(2, objCidade.getUf());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade alterada com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não alterada!");
                return false;
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
            return false;
        }
    }

    public boolean salvar(Cidade objCidade) {
        if (objCidade.getCod() == null) {
            Integer codigo = Dados.listaCidade.size() + 1;
            objCidade.setCod(codigo);
            Dados.listaCidade.add(objCidade);
            inserir(objCidade);
        }
        return true;

    }

    public boolean remover(Cidade objCidade) {
        String sql = "Delete from Cidade where codCidade = ?";
        try {
            PreparedStatement pst = ModuloConexao.getPreparableStatement(sql);
            pst.setString(1, objCidade.getNome());
            pst.setString(2, objCidade.getUf());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade alterada com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não alterada!");
                return false;
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
            return false;
        }
    }
}
