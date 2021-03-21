/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Conexao {
    public String url;
    public String usuario;
    public String senha;
    public Connection con;
    
    public Conexao(){
        url = "jdbc:postgresql://localhost:5432/Projeto";
        usuario = "postgres";
        senha = "soares";
        
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("connect!");
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
    
    public ResultSet executaBusca(String sql){
        try {
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            System.out.println("codiguin do disbu");
            con.close();
            return res;
        } catch (Exception e) {
            return null;
        }
    }

    
}
