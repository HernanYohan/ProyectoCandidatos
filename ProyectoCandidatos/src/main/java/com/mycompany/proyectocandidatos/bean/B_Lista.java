/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocandidatos.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Hernan
 */
@ManagedBean
@SessionScoped
public class B_Lista implements Serializable  {
    
    private List aspirantes;

    public B_Lista() {
        aspirantes = new ArrayList<>();
    }

    public List getAspirantes() {
        return aspirantes;
    }

    public void setAspirantes(List aspirantes) {
        this.aspirantes = aspirantes;
    }
    
    
    
    
    
}
