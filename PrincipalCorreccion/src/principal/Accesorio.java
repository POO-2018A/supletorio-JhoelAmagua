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
public class Accesorio extends Atributos implements Serializable{
    
    private String tipo;
    private String color;

    public Accesorio(String categoria, String nombre, int precio, String marca, String tipo, String color) {
        super(categoria, nombre, precio, marca);
        this.tipo= tipo;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
