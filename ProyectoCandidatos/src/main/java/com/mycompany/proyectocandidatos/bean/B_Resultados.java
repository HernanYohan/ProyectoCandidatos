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
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Hernan
 */
public class B_Resultados implements Serializable  {
    
    @ManagedProperty(value = "#{b_lista}")
    private B_Lista lista;
    
    private P_Aspirante p_aspitante; 
    
      public void onRowSelect(SelectEvent event) {
        C_Index c_index = new C_Index();
        P_Aspirante h = ((P_Aspirante) event.getObject());
        try {
            String resultados = c_index.votar(h, lista.getAspirantes());
            FacesMessage msg = new FacesMessage("Aviso", resultados);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage("Aviso", "Se presento un herror al procesar tu voto");
            System.err.println(e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }

    }
    
    public B_Resultados (){
    }

    public B_Lista getLista() {
        return lista;
    }

    public void setLista(B_Lista lista) {
        this.lista = lista;
    }

    public P_Aspirante getP_aspitante() {
        return p_aspitante;
    }

    public void setP_aspitante(P_Aspirante p_aspitante) {
        this.p_aspitante = p_aspitante;
    }
    
    
    
}
