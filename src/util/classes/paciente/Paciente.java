/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.classes.paciente;

import util.classes.pessoa.Pessoa;

/**
 *
 * @author cleit
 */
public class Paciente extends Pessoa{

    public Paciente(String nome, String sobrenome, String endereco, String telefone, String cpf, String senha, String sexo, String RG, String dataNasc) {
        super(nome, sobrenome, endereco, telefone, cpf, senha, sexo, RG, dataNasc);
    }
    public Paciente (){}
}
