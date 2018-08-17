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
public class Atributos implements Serializable{
    private String categoria;
    private String nombre;
    private int precio;
    private String marca;

    public Atributos(String categoria, String nombre, int precio, String marca) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    public Atributos() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
