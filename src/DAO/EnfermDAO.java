/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import util.classes.funcionarios.Enfermeiro;

/**
 *
 * @author cleit
 */
public class EnfermDAO {
    Conexao conex = new Conexao();
    public void addEnferm(String nome, String sobrenome, 
            String endereco, String telefone, String cpf, String senha, String sexo, String nasc, String rg){
        
        String sql = "INSERT into consulta (nome, sobrenome, endereco, telefone, cpf, senha, sexo, nasc, rg)values("+nome+","+sobrenome+","+endereco+","+telefone+","+cpf+","+senha+","+sexo+","+nasc+","+rg+")";
        int res = conex.executaSQL(sql);
        if(res > 0){
            System.out.println("Cadastro realizado");
        }else{
            System.out.println("Erro ao cadastrar");
        }      
    }
    
    public Enfermeiro getEnferm(String cpf){
        
        Enfermeiro enferm = new Enfermeiro();       
        //preencher enferm com dados do BD
        
        return enferm;
    }
}
