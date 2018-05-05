/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto1.beans.forms;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author pc
 */
@ManagedBean
@ViewScoped
public class OpcionTemperaturaFormBean {

    private String eleccion;
    private double ingreso;
    private double equivalencia;

    public OpcionTemperaturaFormBean() {
    }

    public void tranformar() {
        if (eleccion.equals("FAR")) {
            equivalencia = 1.8 * ingreso;
        } else if (eleccion.equals("CEL")) {
            equivalencia = (ingreso - 32) / 1.8;
        }
    }

    public String getEleccion() {
        return eleccion;
    }

    /**
     * @param eleccion the eleccion to set
     */
    public void setEleccion(String eleccion) {
        this.eleccion = eleccion;
    }

    /**
     * @return the ingreso
     */
    public double getIngreso() {
        return ingreso;
    }

    /**
     * @param ingreso the ingreso to set
     */
    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    /**
     * @return the equivalencia
     */
    public double getEquivalencia() {
        return equivalencia;
    }

    /**
     * @param equivalencia the equivalencia to set
     */
    public void setEquivalencia(double equivalencia) {
        this.equivalencia = equivalencia;
    }

}
