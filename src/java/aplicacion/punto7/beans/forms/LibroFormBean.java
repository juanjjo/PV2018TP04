/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto7.beans.forms;

import aplicacion.punto7.dominio.Libro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author alumno
 */
@ManagedBean
@ViewScoped
public class LibroFormBean {
    private Libro libro;
    private List<Libro> libros;
    private String autorBuscado;
    private ArrayList<Libro> busquedaLibros;
    /**
     * Creates a new instance of LibroFormBean
     */
    public LibroFormBean() {
         libro = new Libro();
        libros = new ArrayList<>();
    }
    public void agregarLibro() {
        this.getLibros().add(getLibro());
        setLibro(new Libro());
    }
   public void buscarLibros(){
        busquedaLibros = new ArrayList<>();
        if(!libros.isEmpty()){
            for(Libro book : libros){
                if(book.getAutor().equals(autorBuscado)){
                    busquedaLibros.add(book);
                }
            }              
        }
        autorBuscado = "";
    }
     public ArrayList<String> listaAutores(){
        ArrayList<String> autores = new ArrayList<>();
        autores.add("Garcia Marquez Gabriel" );
        autores.add("Stevenson Robert");
        autores.add("Matute Ana Maria");
        autores.add("Hemingway Ernest");
        autores.add("Faulkner William");
        autores.add("Infante Guillermo");
        return autores;
    }

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * @return the libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * @return the autorBuscado
     */
    public String getAutorBuscado() {
        return autorBuscado;
    }

    /**
     * @param autorBuscado the autorBuscado to set
     */
    public void setAutorBuscado(String autorBuscado) {
        this.autorBuscado = autorBuscado;
    }

    /**
     * @return the busquedaLibros
     */
    public ArrayList<Libro> getBusquedaLibros() {
        return busquedaLibros;
    }

    /**
     * @param busquedaLibros the busquedaLibros to set
     */
    public void setBusquedaLibros(ArrayList<Libro> busquedaLibros) {
        this.busquedaLibros = busquedaLibros;
    }
    
}
