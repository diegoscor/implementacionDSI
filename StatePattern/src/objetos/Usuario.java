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
public class Usuario {
    
    private boolean caducidad;
    private String contraseña, nombre;

    public Usuario(boolean caducidad, String contraseña, String nombre) {
        this.caducidad = caducidad;
        this.contraseña = contraseña;
        this.nombre = nombre;
    }

    public boolean isCaducidad() {
        return caducidad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
