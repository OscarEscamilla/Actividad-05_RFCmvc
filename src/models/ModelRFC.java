/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author oscar
 */
public class ModelRFC {
    
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String resultado;
    private String mes;
    private String dia;
    private String anio;

    public String getMes() {
        return mes;
    }

    public void setMes(String indexmes) {
        this.mes = indexmes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getAnio() {
        String subanio;
        return subanio = anio.substring(2, 4);
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    
    //inicia los primeros setters
    
    
    public String getNombre() {
        String subnombre;
        return subnombre = nombre.substring(0, 1);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_paterno() {
        String subpaterno;
        return subpaterno = ap_paterno.substring(0, 2);
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        String submaterno;
        return submaterno = ap_materno.substring(0, 1);
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
  
    
    
    
    
    
}
