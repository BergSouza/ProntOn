/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import controller.MedicoController;
import funcionarios.Medico;

/**
 *
 * @author cleit
 */
public class MedicoDAO {
    
    MedicoController medController = new MedicoController();
    
    public Medico getMedico(String cpf){
        
        Medico med = new Medico();
        
        //preencher med com dados do BD
        return med;
    }
}
