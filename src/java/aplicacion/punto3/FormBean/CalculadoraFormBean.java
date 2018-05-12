/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto3.FormBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author pc
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean {

    private double numero1;
    private double numero2;
    private String eleccion;
    private double resultado;

    public CalculadoraFormBean() {

    }
    public void calcular() {
        switch (eleccion) {
            case "sumar": {
                resultado = numero1 + numero2;
                break;
            }
            case "restar": {
                resultado = numero1 - numero2;
                break;
            }
            case "multiplicar": {
                resultado = numero1 * numero2;
                break;
            }
            case "dividir": {
                resultado = numero1 / numero2;
                break;
            }
            case "potencia": {
                resultado = Math.pow(numero1, numero2);
            }
        }
    }

    /**
     * @return the numero1
     */
    public double getNumero1() {
        return numero1;
    }

    /**
     * @param numero1 the numero1 to set
     */
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    /**
     * @return the numero2
     */
    public double getNumero2() {
        return numero2;
    }

    /**
     * @param numero2 the numero2 to set
     */
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /**
     * @return the eleccion
     */
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
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
