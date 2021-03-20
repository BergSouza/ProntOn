/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.classes.pessoa.Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author cleit
 */
public class admDAO {
    Conexao con = new Conexao();
    
    public List<Pessoa> gerarTabela(){
        List<Pessoa> pessoasList = new ArrayList<>();
        try {
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "SELECT * from pessoa;";
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                
                Pessoa pes = new Pessoa();
                
                pes.setNome(rs.getString("nome"));
                pes.setSobrenome(rs.getString("sobrenome"));
                pes.setEndereco(rs.getString("endereco"));
                pes.setTelefone(rs.getString("telefone"));
                pes.setCpf(rs.getString("cpf"));
                pes.setSenha(rs.getString("senha"));
                pes.setSexo(rs.getString("sexo"));
                
                pessoasList.add(pes);
                conex.con.close();
            } 
        } catch (SQLException e) { 
        }
        
        return pessoasList;
    }

    public Pessoa getPessoa(String cpf) {
        Pessoa pessoa = new Pessoa();
        try {
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "SELECT nome, sobrenome, endereco, telefone, cpf, senha, sexo FROM enfermeiro WHERE cpf ="+cpf+";";
            ResultSet rs = stm.executeQuery(sql);
             
            pessoa.setNome(rs.getString("nome"));
            pessoa.setSobrenome(rs.getString("sobrenome"));
            pessoa.setEndereco(rs.getString("endereco"));
            pessoa.setTelefone(rs.getString("telefone"));
            pessoa.setCpf(rs.getNString("cpf"));
            pessoa.setSenha(rs.getNString("senha"));
            pessoa.setSexo(rs.getNString("sexo"));
            
            conex.con.close();
            
        } catch (SQLException e) {
            
        }
        return pessoa;
    }

    public void editarPessoa(String nome, String sobrenome, String endereco, String telefone, 
            String cpf, String senha, String sexo, String Nasc) {
        
        try {
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "UPDATE pessoa (nome, sobrenome, endereco, telefone, cpf, senha, sexo) set("+nome+","+sobrenome+","+endereco+","+telefone+","+cpf+","+senha+","+sexo+")";
            ResultSet rs = stm.executeQuery(sql);
            conex.con.close();
            
        } catch (SQLException e) {
          
        }  
    }

    public void removerPessoa(String cpf) {
        
        try {
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "DELETE FROM pessoa WHERE cpf ="+cpf+";";
            ResultSet rs = stm.executeQuery(sql);
            conex.con.close();
            
        } catch (SQLException e) {  
        }
    }      
}
