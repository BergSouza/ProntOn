/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.EnfermDAO;
import funcionarios.Enfermeiro;

/**
 *
 * @author cleit
 */
public class EnfermController {
    
    EnfermDAO enfermDAO = new EnfermDAO();
    
    
    public void addEnferm(String identity, String nome, String sobrenome, 
            String endereco, String telefone, String cpf, String senha, String sexo){
           
    }
    
    public void editarEnferm(String identity, String nome, String sobrenome, 
            String endereco, String telefone, String cpf, String senha, String sexo){
           
    }
    public void removerEnferm(String cpf){
        
    }
    
    public Enfermeiro getEnferm(String cpf){
        return enfermDAO.getEnferm(cpf);
    }

    public void addEnferm(String text, String text0, String text1, String text2, String text3, String text4, String sexo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
