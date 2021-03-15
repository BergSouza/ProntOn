/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import util.classes.consulta.Consulta;

/**
 *
 * @author cleit
 */
public class ConsultaDAO {
    
    Random rand = new Random();
       
    public void addConsulta(String medNome, String pacNome, String pacRG, 
        String data, String horario, String prontuario){
        int id= rand.nextInt(1000000);
        Consulta con = new Consulta();
        con.setIdConsulta(id);
        
    }
    
    public Consulta getConsulta(int id){
         Consulta con = new Consulta();
        //preencher infos com dados do BD
        return con;
    }
    
    public List<Consulta> gerarTabela(){
        List<Consulta> consultasList = new ArrayList<>();
        
        return consultasList;
    }
}
