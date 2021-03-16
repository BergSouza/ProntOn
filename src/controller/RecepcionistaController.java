/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.RecepcionistaDAO;
import util.classes.funcionarios.Recepcionista;

/**
 *
 * @author cleit
 */
public class RecepcionistaController {
    RecepcionistaDAO recepDAO = new RecepcionistaDAO();
    
    public void addRecep(String nome, String cpf, String RG, 
            String telefone, String endereco, String sexo, String senha){
        recepDAO.addRecepcionista(nome, cpf, RG, telefone, endereco, sexo, senha);
    }
    public Recepcionista getRecepcionista(String cpf){
        return recepDAO.getRecepcionista(cpf);
    }
    
}
