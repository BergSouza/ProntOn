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
public class Medico extends Funcionario{
    private String RG;
    private String especialidade;
    private String departamento;

    public Medico(String identity, String nome, String sobrenome, String endereco,
            String telefone, String cpf, String senha, String sexo, String RG, String especialidade, String departamento) {
        super(identity, nome, sobrenome, endereco, telefone, cpf, senha, sexo);
        this.RG = RG;
        this.especialidade = especialidade;
        this.departamento = departamento;
    }
    public Medico(){
        super();
   }

    public String getRG() {
        return RG;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
