/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.classes.pessoa;

/**
 *
 * @author cleit
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String senha;
    private String sexo;
    private String RG;
    private String dataNasc;
    
    public Pessoa (Pessoa p){
        this.nome = p.getNome();
        this.sobrenome = p.getSobrenome();
        this.endereco = p.getEndereco();
        this.telefone = p.getTelefone();
        this.cpf = p.getCpf();
        this.sexo = p.getSexo();
        this.RG = p.getRG();
        this.dataNasc = p.getDataNasc();
    }

    public Pessoa(String nome, String sobrenome, String endereco, String telefone, String cpf, String senha, String sexo, String RG, String dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.senha = senha;
        this.sexo = sexo;
        this.RG = RG;
        this.dataNasc = dataNasc;
    }
   
    public Pessoa(){}

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

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
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

    public String getRG() {
        return RG;
    }

    public String getDataNasc() {
        return dataNasc;
    }
    
   
}