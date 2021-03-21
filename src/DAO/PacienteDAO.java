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
import javax.swing.JOptionPane;

import util.classes.paciente.Paciente;

/**
 *
 * @author cleit
 */
public class PacienteDAO {
     Conexao conex = new Conexao();
     public void addPaciente(String nome, String cpf, 
            String rg, String telefone, String endereco, String sexo, String dataNasc, String senha) {
            int tipo = 3;
        String sql = "INSERT into consulta (nome, cpf, rg, telefone, endereco, sexo, dataa, senha, tipo)"
                + "values('"+nome+"','"+cpf+"','"+rg+"','"+telefone+"','"+endereco+"','"+sexo+"','"+dataNasc+"','"+senha+"','"+tipo+"')";
        int res = conex.executaSQL(sql);
        if(res > 0){
            JOptionPane.showMessageDialog(null, "Cadastrou");
            System.out.println("Cadastro realizado");
        }else{
            JOptionPane.showMessageDialog(null, "Error.");
            System.out.println("Erro ao cadastrar");
        }
         
    }
     
    public Paciente getPaciente(String cpf){
        Paciente paciente = new Paciente();
        try {
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "SELECT nome, sobrenome, endereco, telefone, cpf, senha, sexo"
                    + " FROM paciente WHERE cpf = '"+cpf+"';";
            ResultSet rs = stm.executeQuery(sql);
             
            paciente.setNome(rs.getString("nome"));
            paciente.setSobrenome(rs.getString("sobrenome"));
            paciente.setEndereco(rs.getString("endereco"));
            paciente.setTelefone(rs.getString("telefone"));
            paciente.setCpf(rs.getString("cpf"));
            paciente.setSenha(rs.getString("senha"));
            paciente.setSexo(rs.getString("sexo"));
            
            conex.con.close();
            return paciente;
            
        } catch (SQLException e) {
            return null;
        }    
    }
    
    public List<Paciente> gerarTabela(){
        List<Paciente> pacientesList = new ArrayList<>();
        
        try {
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "SELECT * from medico;";
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                
                Paciente paciente = new Paciente();
                
                paciente.setNome(rs.getString("nome"));
                paciente.setSobrenome(rs.getString("sobrenome"));
                paciente.setEndereco(rs.getString("endereco"));
                paciente.setTelefone(rs.getString("telefone"));
                paciente.setCpf(rs.getNString("cpf"));
                paciente.setSenha(rs.getNString("senha"));
                paciente.setSexo(rs.getNString("sexo"));
                
                pacientesList.add(paciente);
             
            }
        conex.con.close();
        } catch (SQLException e) {
            
        }
        return pacientesList;
    } 

    public void editarPaciente(String nome, String cpf, String rg, String telefone, 
            String endereco, String sexo, String dataNasc, String senha) {
        
    }
}
