/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.PacienteDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.classes.paciente.Paciente;
import java.util.List;

/**
 *
 * @author cleit
 */
public class PacienteController {
    
    PacienteDAO pacDAO = new PacienteDAO();
    
    public void addPaciente(String nome, String cpf, 
            String rg, String telefone, String endereco, String sexo, String dataNasc, String senha){
        pacDAO.addPaciente(nome, cpf, rg, telefone, endereco, sexo, dataNasc, senha);
    }

    public Paciente getPaciente(String cpf) {
        Paciente paciente = new Paciente();
        return paciente;
    }
    
    public List<Paciente> gerarTabela(){
        return pacDAO.gerarTabela();
    }
    
    public void editarPaciente(String nome, String cpf, 
            String rg, String telefone, String endereco, String sexo, String dataNasc, String senha){
        pacDAO.editarPaciente(nome, cpf, rg, telefone, endereco, sexo, dataNasc, senha);
    }
    
}
