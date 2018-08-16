/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author ESFOT
 */
public class Accesorio extends Atributos{
    
    private String tipo;
    private String color;

    public Accesorio(String nombre, int precio, String marca, String tipo, String color) {
        super(nombre, precio, marca);
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
