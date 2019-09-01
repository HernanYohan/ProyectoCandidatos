/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocandidatos.bean;

import com.mycompany.proyectocandidatos.controlador.C_Index;
import com.mycompany.proyectocandidatos.pojo.P_Aspirante;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

/**
 *
 * @author Hernan
 */
public class B_Index implements Serializable{
    
   private P_Aspirante p_aspirante;
   
   @ManagedProperty("#{b_lista}")
    private B_Lista lista;

    public B_Index() {
       p_aspirante = new P_Aspirante();
    }
   
        public void agregarCandidato() {
        C_Index c_index = new C_Index();
        try {
            if (c_index.agregarAspirante(p_aspirante, lista.getAspirantes())) {
                lista.getAspirantes().add(p_aspirante);
                System.out.println(lista.getAspirantes());
                FacesMessage msg = new FacesMessage("Aviso", "Candidato Agregado!!");
                FacesContext.getCurrentInstance().addMessage(null, msg);
            }
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage("Aviso", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
        
        
    }

    public P_Aspirante getP_aspirante() {
        return p_aspirante;
    }

    public void setP_aspirante(P_Aspirante p_aspirante) {
        this.p_aspirante = p_aspirante;
    }

    public B_Lista getLista() {
        return lista;
    }

    public void setLista(B_Lista lista) {
        this.lista = lista;
    }
        
        
        
   
   
   
}
