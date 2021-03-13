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
public class Funcionario {
    
    private String identity;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String senha;
    private String sexo;

    public Funcionario(String identity, String nome, String sobrenome, String endereco, String telefone, String cpf, String senha, String sexo) {
        this.identity = identity;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.senha = senha;
        this.sexo = sexo;
    }
    public Funcionario(){}

    public String getIdentity() {
        return identity;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
