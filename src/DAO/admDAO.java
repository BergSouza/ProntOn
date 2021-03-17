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
/**
 *
 * @author cleit
 */
public class admDAO {
    Conexao con = new Conexao();
    
    public List<Pessoa> gerarTabela(){
        List<Pessoa> pessoasList = new ArrayList<>();
        
        return pessoasList;
    }

    public Pessoa getPessoa(String cpf) {
        Pessoa pessoa = new Pessoa();
        
        return pessoa;
    }

    public void editarPessoa(String nome, String sobrenome, String endereco, String telefone, 
            String cpf, String senha, String sexo, String Nasc) {
        
    }

    public void removerPessoa(String cpf) {
        
    }
    public ResultSet verificaAdm(String sql){
         try {
            
            Statement stm = con.createStatement();
               ResultSet res = stm.executeQuery(sql);
               con.close();
               return res;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    //Coloca isso na view de cadastrar pra poder pegar o cpf e a senha pra poder verificar
    
    
   /* Conexao conex = new Conexao();
    String sql = "SELECT * from adm";
    ResultSet rs = conex.verificaAdm(sql);
    
    try{
        while(rs.next()){
            String cpf = rs.getString("cpf");
            String senha = rs.getString("senha");
        }
    }catch(Exception e){
    
}
 */
    
    
    
}
