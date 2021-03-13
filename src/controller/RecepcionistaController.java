/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.RecepcionistaDAO;
import funcionarios.Recepcionista;

/**
 *
 * @author cleit
 */
public class RecepcionistaController {
    RecepcionistaDAO recepDAO = new RecepcionistaDAO();
    
    public void addRecep(String nome, String cpf, String RG, 
            String telefone, String endereco, String sexo, String senha){
        
    }
    
    public void editarRecep(String nome, String cpf, String RG, 
            String telefone, String endereco, String sexo, String senha){
        
    }
    public void removerRecep(String cpf){
        
    }
    
    public Recepcionista getRecepcionista(String cpf){
        return recepDAO.getRecepcionista(cpf);
    }
}
