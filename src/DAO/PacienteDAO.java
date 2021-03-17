/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.util.ArrayList;
import java.util.List;

import util.classes.paciente.Paciente;

/**
 *
 * @author cleit
 */
public class PacienteDAO {
     Conexao conex = new Conexao();
     public void addPaciente(String nome, String sobrenome, String cpf, 
            String rg, String telefone, String endereco, String sexo, String dataNasc, String senha) {
         
        String sql = "INSERT into consulta (nome, sobrenome, cpf, rg, telefone, endereco, sexo, dataa, senha)values("+nome+","+sobrenome+","+cpf+","+rg+","+telefone+","+endereco+","+sexo+","+dataNasc+","+senha+")";
        int res = conex.executaSQL(sql);
        if(res > 0){
            System.out.println("Cadastro realizado");
        }else{
            System.out.println("Erro ao cadastrar");
        }
         
    }
     
    public Paciente getPaciente(String cpf){
        Paciente paciente = new Paciente();
        
        //preencher paciente com dados do DB
        
        return paciente;
    }
    
    public List<Paciente> gerarTabela(){
        List<Paciente> pacientesList = new ArrayList<>();
        //fazer a conexao no banco
        
        return pacientesList;
    }

   
}
