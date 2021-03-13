/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.MedicoDAO;
import funcionarios.Medico;
import java.util.List;

/**
 *
 * @author cleit
 */
public class MedicoController {
    MedicoDAO medDAO = new MedicoDAO();
    
    public void addMedico(String nome, String sobrenome, String endereco,
            String telefone, String cpf, String senha, String sexo, String RG, String especialidade, String departamento){
        
    }
    
    public void editarMedico(String nome, String sobrenome, String endereco,
            String telefone, String cpf, String senha, String sexo, String RG, String especialidade, String departamento){
        
    }
    public void removerMedico(String cpf){
        
    }
    
    public Medico getMedico(String cpf){
        return medDAO.getMedico(cpf);
    }
    
    public List<Medico> gerarTabela(){
        return medDAO.gerarTabela();
    }
    
}
