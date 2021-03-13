/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.PacienteDAO;
import Paciente.Paciente;
import java.util.List;

/**
 *
 * @author cleit
 */
public class PacienteController {
    
    PacienteDAO pacDAO = new PacienteDAO();
    
    public void addPaciente(String identity, String nome, String cpf, 
            String rg, String telefone, String endereco, String sexo, String dataNasc, String senha){
        
    }
    public void editarPaciente(String identity, String nome, String cpf, 
            String rg, String telefone, String endereco, String sexo, String dataNasc, String senha){
        
    }
    
    public Paciente getPaciente(String cpf){
        return pacDAO.getPaciente(cpf);
    }
    
    public List<Paciente> gerarTabela(){
        return pacDAO.gerarTabela();
    }

    public void addPaciente(String text, String text0, String text1, String text2, String text3, String sexo, String dataNasc, String text4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
