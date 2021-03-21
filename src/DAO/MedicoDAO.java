/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.classes.funcionarios.Medico;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author cleit
 */
public class MedicoDAO {
    Conexao conex = new Conexao();
    public void addMedico(String nome, String sobrenome, String endereco,
            String telefone, String cpf, String senha, String sexo, String RG, String especialidade, String departamento){
        int tipo = 1;

        String sql = "INSERT into medico (nome, sobrenome, endereco, telefone, cpf, senha, rg, especialidade, departamento, tipo)"
                + "values('"+nome+"','"+sobrenome+"','"+endereco+"','"+telefone+"','"+cpf+"','"+senha+"','"+RG+"','"+especialidade+"','"+departamento+"','"+tipo+"');";

        int res = conex.executaSQL(sql);
        if(res > 0){

            JOptionPane.showMessageDialog(null, "Cadastrou!");

            System.out.println("Cadastro realizado");
        }else{
            JOptionPane.showMessageDialog(null, "Error.");
            System.out.println("Erro ao cadastrar");
        }
        
    }
    
    public Medico getMedico(String cpf){
        
        try {
            Medico med = new Medico();
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "SELECT nome, sobrenome, endereco, telefone, cpf, senha, sexo, nasc, rg, especialidade, departamento "
                    + "FROM medico WHERE cpf = '"+cpf+"';";
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                med.setNome(rs.getString("nome"));
                med.setSobrenome(rs.getString("sobrenome"));
                med.setEndereco(rs.getString("endereco"));
                med.setTelefone(rs.getString("telefone"));
                med.setCpf(rs.getNString("cpf"));
                med.setSenha(rs.getNString("senha"));
                med.setSexo(rs.getNString("sexo"));
                med.setDataNasc(rs.getNString("nasc"));
                med.setRG(rs.getNString("rg"));
                med.setEspecialidade(rs.getNString("especialidade"));
                med.setDepartamento(rs.getNString("departamento"));
                System.out.println(med.getNome());   
            }
            conex.con.close();
            return med;
            
        } catch (SQLException e) {
            return null;
    }    
}
    public List<Medico> gerarTabela(){
        List<Medico> medicList = new ArrayList<>();
        
        try {
            
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "SELECT * from medico;";
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                
                Medico med = new Medico();
                
                med.setNome(rs.getString("nome"));
                med.setSobrenome(rs.getString("sobrenome"));
                med.setEndereco(rs.getString("endereco"));
                med.setTelefone(rs.getString("telefone"));
                med.setCpf(rs.getNString("cpf"));
                med.setSenha(rs.getNString("senha"));
                med.setSexo(rs.getNString("sexo"));
                med.setDataNasc(rs.getNString("nasc"));
                med.setRG(rs.getNString("rg"));
                med.setEspecialidade(rs.getNString("especialidade"));
                med.setDepartamento(rs.getNString("departamento"));
                
                System.out.println(med.getNome());
                System.out.println("23232");
                medicList.add(med);
                conex.con.close();
            } 
        
        } catch (SQLException e) {
        }
        
    return medicList;
    }

    public void editarMedico(String nome, String sobrenome, String endereco, String telefone, String cpf, 
            String senha, String sexo, String RG, String especialidade, String departamento) {
        
    }
}
