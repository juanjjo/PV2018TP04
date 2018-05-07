/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto6.beans.form;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Fatima
 */
@ManagedBean
@ViewScoped
public class AutosRegistradosFormBeans {
    private String modicolor;
    private String modimodelo;
    private String modimarca;
    private String modipatente;
    private int eleccion;
   private String eleccion2; 
   private List<Atributos> auto2 = new ArrayList<>();
   private List<Atributos> auto1 = new ArrayList<>();
   public void AutosRegistrados() {
    }
   
    public void cargarauto1 (){
      auto1.add(new Atributos(1,"AD25SD","FIAT","2018","ROJO"));
        auto1.add(new Atributos(2,"AB325ASD","VMW","2018","NEGRO"));
        auto1.add(new Atributos(3,"WMS32BAS","TOYOTA","2017","GRIS"));
        auto1.add(new Atributos(4,"WR23SD","TESLA","2018","ROJO")); 
    }
    public void cargar (){
       for(int i=0; i<auto1.size();i++){
           if(eleccion==auto1.get(i).getNumero()){
               auto2.add(new Atributos(auto1.get(i).getNumero(),auto1.get(i).getPatente(),auto1.get(i).getMarca(),auto1.get(i).getModelo(),auto1.get(i).getColor()));
               i=auto1.size();
           }
       }
   }

    public void actualizar (RowEditEvent event){
        Atributos car2 = (Atributos) event.getObject();
        car2.setMarca(modimarca);
        car2.setPatente(modipatente);
        car2.setColor(modicolor);
        car2.setModelo(modimodelo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Modificacion Completa"));
    }
    public void cancelar (RowEditEvent event) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Modificacion Completa"));
    }

    public String getModicolor() {
        return modicolor;
    }

    public void setModicolor(String modicolor) {
        this.modicolor = modicolor;
    }

    public String getModimodelo() {
        return modimodelo;
    }

    public void setModimodelo(String modimodelo) {
        this.modimodelo = modimodelo;
    }

    public String getModimarca() {
        return modimarca;
    }

    public void setModimarca(String modimarca) {
        this.modimarca = modimarca;
    }

    public String getModipatente() {
        return modipatente;
    }

    public void setModipatente(String modipatente) {
        this.modipatente = modipatente;
    }
    

    public List<Atributos> getAuto1() {
        
        return auto1;
    }

    public int getEleccion() {
        return eleccion;
    }

    public void setEleccion(int eleccion) {
        this.eleccion = eleccion;
    }

    public String getEleccion2() {
        return eleccion2;
    }

    public void setEleccion2(String eleccion2) {
        this.eleccion2 = eleccion2;
    }

    public void setAuto1(List<Atributos> auto1) {
        this.auto1 = auto1;
    }
   
    public List<Atributos> getAuto2() {
        return auto2;
    }

    public void setAuto2(List<Atributos> auto2) {
        this.auto2 = auto2;
    }
   
}

