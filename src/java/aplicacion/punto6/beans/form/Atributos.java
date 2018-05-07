/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto6.beans.form;

import java.io.Serializable;

/**
 *
 * @author Fatima
 */
public class Atributos implements Serializable{
    private int numero;
    private String patente;
    private String marca;
    private String modelo;
    private String color;

    public Atributos(int numero, String patente, String marca, String modelo, String color) {
        this.numero = numero;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    
}
