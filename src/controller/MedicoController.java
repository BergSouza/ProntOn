/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.MedicoDAO;
import util.classes.funcionarios.Medico;
import java.util.List;

/**
 *
 * @author cleit
 */
public class MedicoController {
    MedicoDAO medDAO = new MedicoDAO();
    
    public void addMedico(String nome, String sobrenome, String endereco,
            String telefone, String cpf, String senha, String sexo, String RG, String especialidade, String departamento){
        medDAO.addMedico(nome, sobrenome, endereco, telefone, 
                cpf, senha, sexo, RG, especialidade, departamento);
    }
    public Medico getMedico(String cpf){
        Medico medic = new Medico();
        
        return medic;
    }   
    public List<Medico> gerarTabela(){
        return medDAO.gerarTabela();
    }
    
}
