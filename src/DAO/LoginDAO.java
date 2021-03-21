/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author vitor
 */
public class LoginDAO {
    
    public int loginUser(String login, String senha){
        int tipoConta = 0;
        
        try {
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "SELECT tipo FROM pessoa WHERE cpf='"+login+"' AND senha = '"+senha+"';";
            ResultSet rs = stm.executeQuery(sql);
            
            tipoConta = rs.getInt("tipo");
            conex.con.close();
        } catch (Exception e) {
        }        
        
        return tipoConta;
    }
    
}
