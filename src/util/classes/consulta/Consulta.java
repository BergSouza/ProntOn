/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.classes.consulta;

/**
 *
 * @author cleit
 */
public class Consulta {
    
    private int idConsulta;
    private String medNome;
    private String pacNome;
    private String pacRG; 
    private String data;
    private String horario;
    private String prontuario;

    public Consulta(){}
    public Consulta(Consulta con){
        this.medNome = con.getMedNome();
        this.pacNome = con.getPacNome();
        this.pacRG = con.getPacRG();
        this.data = con.getData();
        this.horario = con.getHorario();
        this.prontuario = con.getProntuario();
    }
    
    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
    
    public String getMedNome() {
        return medNome;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public String getPacNome() {
        return pacNome;
    }

    public String getPacRG() {
        return pacRG;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public void setMedNome(String medNome) {
        this.medNome = medNome;
    }

    public void setPacNome(String pacNome) {
        this.pacNome = pacNome;
    }

    public void setPacRG(String pacRG) {
        this.pacRG = pacRG;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
