/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.Serializable;

/**
 *
 * @author ESFOT
 */
public class Componente extends Atributos implements Serializable{
    private String tipo;
    private int capacidad;
    private int velocidad;

    
    public Componente(String categoria, String nombre, int precio, String marca, String tipo, int capacidad, int velocidad) {
        super( categoria ,nombre, precio, marca);
        this.tipo= tipo;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
        
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
