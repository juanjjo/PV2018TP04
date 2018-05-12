/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto4.form.beans;

import aplicacion.punto4.dominio.Palabra;
import java.util.Random;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author alumno
 */
@ManagedBean
@ViewScoped
public class PalabraFormBean {

    private Palabra palabra;
    private int vida;
    private char letraIngresada;

    public PalabraFormBean() {
        String arrayPalabras[] = new String[8];
        arrayPalabras[0] = "smart";
        arrayPalabras[1] = "mesa";
        arrayPalabras[2] = "cpu";
        arrayPalabras[3] = "jajaja";
        arrayPalabras[4] = "visual";
        arrayPalabras[5] = "abandonar";
        arrayPalabras[6] = "agentina";
        arrayPalabras[7] = "buscar";

        Random rnd = new Random();
        int alea = rnd.nextInt(8);

        this.palabra = new Palabra(arrayPalabras[alea]);
        this.vida = 4;
    }

    public void menosVida() {
        String aux = getPalabra().getPalabritaEncriptada();
        this.setLetraIngresada(Character.toLowerCase(this.getLetraIngresada()));
        getPalabra().asignarLetra(this.getLetraIngresada());
        getPalabra().compararLetras();

        if (this.getVida() != 0) {
            if (aux.compareToIgnoreCase(getPalabra().getPalabritaEncriptada()) == 0) {
                this.setVida(this.getVida() - 1);
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Correcto!!"));
            this.getPalabra().revelarPalabra();
        }
    }

    public String obtenerPalabraEncriptada() {
        return this.palabra.getPalabritaEncriptada();
    }

    /**
     * @return the palabra
     */
    public Palabra getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(Palabra palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the letraIngresada
     */
    public char getLetraIngresada() {
        return letraIngresada;
    }

    /**
     * @param letraIngresada the letraIngresada to set
     */
    public void setLetraIngresada(char letraIngresada) {
        this.letraIngresada = letraIngresada;
    }
}
