/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto7.dominio;

/**
 *
 * @author alumno
 */
public class Libro {
    private String ISBM;
    private String Titulo;
    private String Autor;
    private double Precio;

    /**
     * @return the ISBM
     */
    public String getISBM() {
        return ISBM;
    }

    /**
     * @param ISBM the ISBM to set
     */
    public void setISBM(String ISBM) {
        this.ISBM = ISBM;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
}
