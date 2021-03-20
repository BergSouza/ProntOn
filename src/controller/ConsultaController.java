/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ConsultaDAO;
import java.util.List;
import util.classes.consulta.Consulta;

/**
 *
 * @author cleit
 */
public class ConsultaController {
    
    ConsultaDAO consDAO = new ConsultaDAO();
    public void addConsulta(String medNome, String pacNome, String pacRG, 
            String data, String horario, String prontuario){
        consDAO.addConsulta(medNome, pacNome, pacRG, data, horario, prontuario);
    }
    
    public void editarConsulta(String medNome, String pacNome, String pacRG, 
            String data, String horario, String prontuario, int id){
        consDAO.editarConsulta(medNome, pacNome, pacRG, data, horario, prontuario, id);
    }
    
    public void removerConsulta(int id){
        consDAO.removerConsulta(id);
    }
    
    public Consulta getConsulta(int id){
        return consDAO.getConsulta(id);
    }
    
    public List<Consulta> gerarTabela(){
        return consDAO.gerarTabela();
    }
}