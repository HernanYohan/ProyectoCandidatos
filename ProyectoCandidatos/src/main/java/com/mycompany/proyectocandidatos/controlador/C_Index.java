/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocandidatos.controlador;

import com.mycompany.proyectocandidatos.pojo.P_Aspirante;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Hernan
 */
public class C_Index {

    public C_Index() {
    }
    
    
    public String votar(P_Aspirante aspirante, List<P_Aspirante> aspirantes) throws Exception {
        for (P_Aspirante h : (ArrayList<P_Aspirante>) aspirantes) {
            if (h.equals(aspirante)) {
                h.setVotos(h.getVotos()+ 1);
                String msg = "Has votado por: " + h.getNombre()
                        + " " + h.getApellido() + ". Total votos: " + h.getVotos();
                return msg;
            }
        }
        return "";
    }

    public boolean agregarAspirante(P_Aspirante aspirante, List<P_Aspirante> aspirantes) throws Exception {
        for (P_Aspirante c : (ArrayList<P_Aspirante>) aspirantes) {
            if (Objects.equals(c.getTarjeton(), aspirante.getTarjeton())) {
                throw new Exception("El candidato que desea regiatrar ya existe");
            }
        }
        return true;
    }
}
    

