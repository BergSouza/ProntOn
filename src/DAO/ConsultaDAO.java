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
    Conexao conex = new Conexao();
    
    public void addConsulta(String medNome, String pacNome, String pacRG, 
        String data, String horario, String prontuario){
        int id= rand.nextInt(1000000);
        Consulta con = new Consulta();
        con.setIdConsulta(id);
        
        String sql = "INSERT into consulta (mednome, pacnome, pacrg, dataa, horario, prontuario)values("+medNome+","+pacNome+","+pacRG+","+data+","+horario+","+ prontuario+")";
        int res = conex.executaSQL(sql);
        if(res > 0){
            System.out.println("Cadastro realizado");
        }else{
            System.out.println("Erro ao cadastrar");
        } 
    }
    public void removerConsulta(int id){
        
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
