/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.EnfermDAO;
import java.sql.SQLException;
import util.classes.funcionarios.Enfermeiro;

/**
 *
 * @author cleit
 */
public class EnfermController {
    
    EnfermDAO enfermDAO = new EnfermDAO();
    
    
    public void addEnferm(String nome, String sobrenome, 
            String endereco, String telefone, String cpf, String senha, String sexo){
        enfermDAO.addEnferm(nome, sobrenome, endereco, 
                telefone, cpf, senha, sexo);
    }
    public Enfermeiro getEnferm(String cpf) {
       Enfermeiro enferm = new Enfermeiro();
       return enferm;
    }
}
