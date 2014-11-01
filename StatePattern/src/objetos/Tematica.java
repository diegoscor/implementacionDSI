/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Diego
 */
public class Tematica {
    
    private String nombre;
    private int id;

    public Tematica(String nombre) {
        this.nombre = nombre;
    }
    
    public Tematica(int id,String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
