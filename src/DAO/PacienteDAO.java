/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Paciente.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cleit
 */
public class PacienteDAO {
    
    
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
