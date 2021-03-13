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
    
    public void addMedico(String identity, String nome, String sobrenome, String endereco,
            String telefone, String cpf, String senha, String sexo, String RG, String especialidade, String departamento){
        
    }
    
    public void editarMedico(String identity, String nome, String sobrenome, String endereco,
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

    public void addMedico(String text, String text0, String text1, String text2, String text3, String text4, String sexo, String text5, String text6, String text7) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
