/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto4.dominio;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Palabra implements Serializable {

    private String palabrita;
    private String palabritaEncriptada;
    private char letra;

    public Palabra() {
    }

    public Palabra(String palabrita) {
        this.palabrita = palabrita;
        this.palabritaEncriptada = this.palabrita;
        this.palabritaEncriptada = this.palabritaEncriptada.replaceAll("(?s).", "-");
    }

    public void revelarPalabra() {
        this.palabritaEncriptada = this.palabrita;
    }

    public int cantidadLetras() {
        return palabrita.length();
    }
     public void asignarLetra(char xLetra) {
        this.letra = xLetra;
    }

    /**
     * @return the palabrita
     */
    public String getPalabrita() {
        return palabrita;
    }

    /**
     * @param palabrita the palabrita to set
     */
    public void setPalabrita(String palabrita) {
        this.palabrita = palabrita;
    }

    /**
     * @return the palabritaEncriptada
     */
    public String getPalabritaEncriptada() {
        return palabritaEncriptada;
    }

    /**
     * @param palabritaEncriptada the palabritaEncriptada to set
     */
    public void setPalabritaEncriptada(String palabritaEncriptada) {
        this.palabritaEncriptada = palabritaEncriptada;
    }

    /**
     * @return the letra
     */
    public char getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void compararLetras() {
        for (int i = 0; i < this.cantidadLetras(); i++) {
            if (this.letra == this.palabrita.charAt(i)) {
                this.palabritaEncriptada = this.palabritaEncriptada.substring(0, i) + this.letra + this.palabritaEncriptada.substring(i + 1);
            }
        }
    }
}
