/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.PacienteDAO;
import Paciente.Paciente;

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
    
}
