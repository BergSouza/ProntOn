/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.classes.funcionarios;


import util.classes.pessoa.Pessoa;

/**
 *
 * @author cleit
 */
public class Medico extends Pessoa{
    private String especialidade;
    private String departamento;

    public Medico(String especialidade, String departamento, String nome, String sobrenome, String endereco, String telefone, String cpf, String senha, String sexo, String RG, String dataNasc) {
        super(nome, sobrenome, endereco, telefone, cpf, senha, sexo, RG, dataNasc);
        this.especialidade = especialidade;
        this.departamento = departamento;
    }
    public Medico (){}

    public String getEspecialidade() {
        return especialidade;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    

    
    
}
