/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        Conexao conex = new Conexao();
        int id= rand.nextInt(1000000);
        Consulta con = new Consulta();
        con.setIdConsulta(id);
        
        String sql = "INSERT into consulta (mednome, pacnome, pacrg, dataa, horario, prontuario, id)"
                + "values('"+medNome+"','"+pacNome+"','"+pacRG+"','"+data+"','"+horario+"','"+ prontuario+"','"+id+"')";
        int res = conex.executaSQL(sql);
        if(res > 0){
            System.out.println("Cadastro realizado");
        }else{
            System.out.println("Erro ao cadastrar");
        } 
    }
    public void removerConsulta(int id){
        Conexao conex = new Conexao();
        
        try {
            Statement stm = conex.con.createStatement();
            String sql = "DELETE FROM consulta WHERE id ="+id+";";
            int res = conex.executaSQL(sql);
        if(res > 0){
            System.out.println("Removido!");
            }else{
                System.out.println("Usuario n encontrado!");
            } 
        } catch (Exception e) {
        }
        
    }
    
    public Consulta getConsulta(int id){
       
        Consulta consult = new Consulta();
        try{
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "SELECT mednome, pacnome, pacrg, dataa, horario, prontuario, id"
                    + " FROM consulta WHERE id ="+id+";";
            ResultSet rs = stm.executeQuery(sql);
            
            consult.setMedNome("mednome");
            consult.setPacNome("pacnome");
            consult.setPacRG("pacrg");
            consult.setData("dataa");
            consult.setHorario("horario");
            consult.setProntuario("prontuario");
            
            conex.con.close();
            return consult;
            
        } catch (SQLException e) {
            return null;
        }    
    }
        
    
    public List<Consulta> gerarTabela() {
        List<Consulta> consultasList = new ArrayList<>();
        Conexao conex = new Conexao();
        
        try {
            Statement stm = conex.con.createStatement();
            String sql = "SELECT * FROM consulta;";
            ResultSet rs = stm.executeQuery(sql);
               while(rs.next()){
                   Consulta consult = new Consulta();
                   
                   consult.setMedNome("mednome");
                   consult.setPacNome("pacnome");
                   consult.setPacRG("pacrg");
                   consult.setData("dataa");
                   consult.setHorario("horario");
                   consult.setProntuario("prontuario");
                   consultasList.add(consult);
                   
                   
               }
         conex.con.close();      
        } catch (SQLException e) {
            return null;
        }
        
        return consultasList;
    }

    public void editarConsulta(String medNome, String pacNome, 
            String pacRG, String data, String horario, String prontuario, int id) {
        
         try {
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "UPDATE consulta"
                    + " SET medNome = '"+medNome+"', pacNome = '"+pacNome+"', pscRG = '"+pacRG+"', dataa = '"+data+"', horario = '"+horario+"', prontuario = '"+prontuario+"' WHERE ID = "+id+";";
            ResultSet rs = stm.executeQuery(sql);
            
            conex.con.close();
        } catch (Exception e) {
        }
        
    }
}
