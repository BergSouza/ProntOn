/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

/**
 *
 * @author cleit
 */
public class Enfermeiro extends Funcionario{

    public Enfermeiro(String identity, String nome, String sobrenome, String endereco, String telefone, String cpf, String senha, String sexo) {
        super(identity, nome, sobrenome, endereco, telefone, cpf, senha, sexo);
    }
    
    public Enfermeiro(){
        super();
    }
    
}
