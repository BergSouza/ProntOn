/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import util.classes.funcionarios.Medico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cleit
 */
public class MedicoDAO {
    Conexao conex = new Conexao();
    public void addMedico(String nome, String sobrenome, String endereco,
            String telefone, String cpf, String senha, String sexo, String nasc, String RG, String especialidade, String departamento){
        
         String sql = "INSERT into consulta (nome, sobrenome, endereco, telefone, cpf, senha, sexo, nasc, rg, especialidade, departamento)values("+nome+","+sobrenome+","+endereco+","+telefone+","+cpf+","+senha+","+sexo+","+nasc+","+RG+","+especialidade+","+departamento+")";
        int res = conex.executaSQL(sql);
        if(res > 0){
            System.out.println("Cadastro realizado");
        }else{
            System.out.println("Erro ao cadastrar");
        }
        
    }
    
    public Medico getMedico(String cpf){
        
        Medico med = new Medico();
        
        //preencher med com dados do BD
        return med;
    }
    public List<Medico> gerarTabela(){
        List<Medico> pacientesList = new ArrayList<>();
        //fazer a conexao no banco
        
        return pacientesList;
    }
}
