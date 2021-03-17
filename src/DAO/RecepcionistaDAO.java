/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import util.classes.funcionarios.Recepcionista;

/**
 *
 * @author cleit
 */
public class RecepcionistaDAO {
    
    public void addRecepcionista(String nome, String sobrenome, String cpf, String RG, 
            String telefone, String endereco, String sexo, String dataNasc, String senha){
           
        Conexao conex = new Conexao();
        String sql = "INSERT into consulta (nome, sobrenome, cpf, rg, telefone, endereco, sexo, dataa, senha)values("+nome+","+sobrenome+","+cpf+","+RG+","+telefone+","+endereco+","+sexo+","+dataNasc+","+senha+")";
        int res = conex.executaSQL(sql);
        if(res > 0){
            System.out.println("Cadastro realizado");
        }else{
            System.out.println("Erro ao cadastrar");
        }
        
    }
    
    public Recepcionista getRecepcionista(String cpf){
        Recepcionista recep = new Recepcionista();
        //preencher recep com dados do BD
        return recep;
    }
}
