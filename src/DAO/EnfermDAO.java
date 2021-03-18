/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.classes.funcionarios.Enfermeiro;

/**
 *
 * @author cleit
 */
public class EnfermDAO {
    
    public void addEnferm(String nome, String sobrenome, 
            String endereco, String telefone, String cpf, String senha, String sexo){
        
        Conexao conex = new Conexao();
        String sql = "INSERT into consulta (nome, sobrenome, endereco, telefone, cpf, senha, sexo)values("+nome+","+sobrenome+","+endereco+","+telefone+","+cpf+","+senha+","+sexo+")";
        int res = conex.executaSQL(sql);
        if(res > 0){
            System.out.println("Cadastro realizado");
        }else{
            System.out.println("Erro ao cadastrar");
        }      
    }
    
    public Enfermeiro getEnferm(String cpf) {
        Enfermeiro enferm = new Enfermeiro(); 
        
        try {
            Conexao conex = new Conexao();
            Statement stm = conex.createStatement();
            String sql = "SELECT nome, sobrenome, endereco, telefone, cpf, senha, sexo FROM enfermeiro WHERE cpf ="+cpf+";";
            ResultSet rs = stm.executeQuery(sql);
             
            enferm.setNome(rs.getString("nome"));
            enferm.setSobrenome(rs.getString("sobrenome"));
            enferm.setEndereco(rs.getString("endereco"));
            enferm.setTelefone(rs.getString("telefone"));
            enferm.setCpf(rs.getNString("cpf"));
            enferm.setSenha(rs.getNString("senha"));
            enferm.setSexo(rs.getNString("sexo"));
           
            conex.close();
            return enferm;
            
        } catch (SQLException e) {
            return null;
        }    
    }
}
        
        
      
