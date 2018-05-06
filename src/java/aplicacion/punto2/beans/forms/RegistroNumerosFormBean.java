/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto2.beans.forms;

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
public class RegistroNumerosFormBean {

    private double numero;
    private double menor;
    private double mayor;
    private double promedio;
    private List<Double> ingresos;

    public RegistroNumerosFormBean() {
        ingresos = new ArrayList<>();
    }

    public void cargando() {
        ingresos.add(numero);
        numero = 0.0;
    }

    public void generarcalculos() {
        generarmenor();
        generarmayor();
        generarpromedio();
    }

    public void generarmenor() {
        if (!ingresos.isEmpty()) {
            menor = ingresos.get(0);
            for (double num : ingresos) {
                if (num < menor) {
                    menor = num;
                }
            }
        }
    }

    public void generarmayor() {
        mayor = ingresos.get(0);
        for (double num : ingresos) {
            if (num > mayor) {
                mayor = num;
            }
        }
    }
    public void generarpromedio(){
        promedio=0.0;
        double suma=0.0;
        for(double num:ingresos){
        suma=suma+num;
       }
        promedio=suma/ingresos.size();
    }
    
    public double getMayor() {
        return mayor;
    }

    public void setMayor(double mayor) {
        this.mayor = mayor;
    }

    public double getMenor() {
        return menor;
    }

    public List<Double> getIngresos() {
        return ingresos;
    }

    public void setIngresos(List<Double> ingresos) {
        this.ingresos = ingresos;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    /**
     * @param menor the menor to set
     */
    public void setMenor(double menor) {
        this.menor = menor;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

}
