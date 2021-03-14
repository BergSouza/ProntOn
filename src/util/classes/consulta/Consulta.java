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
    
    private String medNome;
    private String pacNome;
    private String pacRG; 
    private String data;
    private String horario;
    
    public Consulta(){}

    public String getMedNome() {
        return medNome;
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
