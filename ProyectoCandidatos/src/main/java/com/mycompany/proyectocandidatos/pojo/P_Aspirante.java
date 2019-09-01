/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocandidatos.pojo;

/**
 *
 * @author Hernan
 */
public class P_Aspirante {
    
    private Integer tarjeton;
    private String nombre;
    private String apellido;
    private Integer votos;
    private String imagen;

    public P_Aspirante() {
    }
    
    public P_Aspirante(Integer votos) {
        this.votos = 0;
    }

    public P_Aspirante(Integer tarjeton, String nombre, String apellido, Integer votos, String imagen) {
        this.tarjeton = tarjeton;
        this.nombre = nombre;
        this.apellido = apellido;
        this.votos = 0;
        this.imagen = imagen;
        
    }
    
    
    
    

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    public Integer getTarjeton() {
        return tarjeton;
    }

    public void setTarjeton(Integer tarjeton) {
        this.tarjeton = tarjeton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
}
