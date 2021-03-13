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
public class Recepcionista extends Funcionario{
    private String RG;

    public Recepcionista(String identity, String nome, String sobrenome, String endereco, 
            String telefone, String cpf, String senha, String sexo, String RG) {
        super(identity, nome, sobrenome, endereco, telefone, cpf, senha, sexo);
        this.RG = RG;
    }
    public Recepcionista(){}

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    
    
    
}
