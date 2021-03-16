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
    
     public void addPaciente(String nome, String cpf, 
            String rg, String telefone, String endereco, String sexo, String dataNasc, String senha) {
         
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
