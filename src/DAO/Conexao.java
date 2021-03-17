/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Conexao {
    private String url;
    private String usuario;
    private String senha;
    private Connection con;
    
    Conexao(){
        url = "jdbc:postgresql://localhost543/postgres";
        usuario = "postgres";
        senha = "postgres";
        
        try {
            Class.forName("postgresql-42.2.5.jar");
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("conequitousi!");
                      
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public int executaSQL(String sql){
        try {
            Statement stm = con.createStatement();
               int res = stm.executeUpdate(sql);
               con.close();
               return res;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
