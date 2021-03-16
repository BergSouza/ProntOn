/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import util.classes.funcionarios.Recepcionista;

/**
 *
 * @author cleit
 */
public class RecepcionistaDAO {
    
    public void addRecepcionista(String nome, String cpf, String RG, 
            String telefone, String endereco, String sexo, String senha){
        
    }
    
    public Recepcionista getRecepcionista(String cpf){
        Recepcionista recep = new Recepcionista();
        //preencher recep com dados do BD
        return recep;
    }
}
