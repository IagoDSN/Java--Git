/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 02338079698
 */
public class ModuloConexao {
    //a linha abaixo chama o driver de conexao

    private static final String banco = "jdbc:mysql://localhost:3307/bd2infoe";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String usuario = "root";
    private static final String senha = "1234";
    private static Connection con = null;

    public ModuloConexao() {

    }

    public static Connection conector() {
        //Connection e um framework 
        if (con == null) {
            try { //tentar conecao
                Class.forName(driver);
                con = DriverManager.getConnection(banco, usuario, senha);
               
            } catch (ClassNotFoundException ex) {
                System.out.println("Não encontrou o driver: "+ex);
                
            } catch(SQLException ex){
                System.out.println("Erro na Conexão: "+ex.getMessage());
            }
        }
        
        return con;
        //informacoes do banco de dados
        //estabelecendo conexao
    }
    
    public static PreparedStatement getPreparableStatement(String comandoSql){
        if(con == null){
            con = conector();
        }
        try{
            return con.prepareStatement(comandoSql);
        } catch(SQLException ex){
            System.out.println("Erro do Sql:"+ex.getMessage());
        }
        return null;
    }
}
