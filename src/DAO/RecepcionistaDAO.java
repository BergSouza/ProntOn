/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.classes.funcionarios.Recepcionista;

/**
 *
 * @author cleit
 */
public class RecepcionistaDAO {
    
    public void addRecepcionista(String nome, String cpf, String RG, 
            String telefone, String endereco, String sexo, String senha){
           
        Conexao conex = new Conexao();
        String sql = "INSERT into recpcionista (nome, cpf, rg, telefone, endereco, sexo, senha)values("+nome+","+cpf+","+RG+","+telefone+","+endereco+","+sexo+","+senha+")";
        int res = conex.executaSQL(sql);
        if(res > 0){
            System.out.println("Cadastro realizado");
        }else{
            System.out.println("Erro ao cadastrar");
        }
        
    }
    
    public Recepcionista getRecepcionista(String cpf){
        
        Recepcionista recep = new Recepcionista();
        try{
            Conexao conex = new Conexao();
            Statement stm = conex.createStatement();
            String sql = "SELECT nome, sobrenome, endereco, telefone, cpf, senha, sexo, nasc, rg FROM enfermeiro WHERE cpf ="+cpf+";";
            ResultSet rs = stm.executeQuery(sql);
             
            recep.setNome(rs.getString("nome"));
            recep.setSobrenome(rs.getString("sobrenome"));
            recep.setEndereco(rs.getString("endereco"));
            recep.setTelefone(rs.getString("telefone"));
            recep.setCpf(rs.getNString("cpf"));
            recep.setSenha(rs.getNString("senha"));
            recep.setSexo(rs.getNString("sexo"));
            recep.setDataNasc(rs.getString("nasc"));
            recep.setRG(rs.getString("rg"));
            
            conex.close();
            return recep;
            
        } catch (SQLException e) {
            return null;
        }    
    }

    public void editarRecepcionista(String nome, String cpf, String RG, 
            String telefone, String endereco, String sexo, String senha) {
        
    }
}
