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
public class Computador extends Atributos implements Serializable{
      
        private String tipo;
        private String capacidad;
        private String ram;
        private String procesador;

        public Computador(String categoria, String nombre, int precio, String marca,String tipo, String capacidad, String ram, String procesador) {
        super(categoria, nombre, precio, marca);
        this.tipo= tipo;
        this.capacidad = capacidad;
        this.ram = ram;
        this.procesador = procesador;
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        
        
    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
        
    
}
