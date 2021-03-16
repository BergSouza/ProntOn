/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import util.classes.pessoa.Pessoa;

/**
 *
 * @author cleit
 */
public class admDAO {
    
    public List<Pessoa> gerarTabela(){
        List<Pessoa> pessoasList = new ArrayList<>();
        
        return pessoasList;
    }

    public Pessoa getPessoa(String cpf) {
        Pessoa pessoa = new Pessoa();
        
        return pessoa;
    }

    public void editarPessoa(String nome, String sobrenome, String endereco, String telefone, 
            String cpf, String senha, String sexo, String Nasc) {
        
    }

    public void removerPessoa(String cpf) {
        
    }
    
}
