/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.admDAO;
import java.util.List;
import util.classes.pessoa.Pessoa;

/**
 *
 * @author cleit
 */
public class admController {
    
    admDAO admDAO = new admDAO();
    
    public void editarPessoa(String nome, String sobrenome, 
            String endereco, String telefone, String cpf, 
            String senha, String sexo, String Nasc){
        
        admDAO.editarPessoa(nome, sobrenome, 
            endereco,telefone, cpf, 
            senha, sexo, Nasc);
    }

    public List<Pessoa> gerarTabela() {
        
        return admDAO.gerarTabela();
    }

    public void removerPessoa(String cpf) {
        admDAO.removerPessoa(cpf);
    }
    
    public Pessoa getPessoa(String cpf){
        
        return admDAO.getPessoa(cpf);
    }
}
