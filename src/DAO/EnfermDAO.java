/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import util.classes.funcionarios.Enfermeiro;

/**
 *
 * @author cleit
 */
public class EnfermDAO {
    
    public void addEnferm(String nome, String sobrenome, 
        String endereco, String telefone, String cpf, String senha, String sexo){
        int tipo = 2;
        Conexao conex = new Conexao();
        String sql = "INSERT into enfermeiro (nome, sobrenome, endereco, telefone, cpf, senha, sexo, tipo)"
                + "values('"+nome+"','"+sobrenome+"','"+endereco+"','"+telefone+"','"+cpf+"','"+senha+"','"+sexo+"','"+tipo+"')";
        int res = conex.executaSQL(sql);
        if(res > 0){
            JOptionPane.showMessageDialog(null, "Cadastrou");
            System.out.println("Cadastro realizado");
        }else{
            JOptionPane.showMessageDialog(null, "Error.");
            System.out.println("Erro ao cadastrar");
        }     
    }
    
    public Enfermeiro getEnferm(String cpf) {
        Enfermeiro enferm = new Enfermeiro(); 
        
        try {
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "SELECT nome, sobrenome, endereco, telefone, cpf, senha, sexo "
                    + "FROM enfermeiro WHERE cpf = '"+cpf+"';";
            ResultSet rs = stm.executeQuery(sql);
             
            enferm.setNome(rs.getString("nome"));
            enferm.setSobrenome(rs.getString("sobrenome"));
            enferm.setEndereco(rs.getString("endereco"));
            enferm.setTelefone(rs.getString("telefone"));
            enferm.setCpf(rs.getString("cpf"));
            enferm.setSenha(rs.getString("senha"));
            enferm.setSexo(rs.getString("sexo"));
           
            conex.con.close();
            return enferm;
            
        } catch (SQLException e) {
            return null;
        }    
    }

    public void editarEnferm(String nome, String sobrenome, String endereco, 
            String telefone, String cpf, String senha, String sexo) {
        
    }
}
        
        
      
