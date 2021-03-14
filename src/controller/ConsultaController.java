/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ConsultaDAO;

/**
 *
 * @author cleit
 */
public class ConsultaController {
    
    ConsultaDAO consDAO = new ConsultaDAO();
    public void addConsulta(String medNome, String pacNome, String pacRG, 
            String data, String horario){
        consDAO.addConsulta(medNome, pacNome, pacRG, data, horario);
    }
}
