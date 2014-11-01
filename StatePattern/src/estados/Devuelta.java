/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estados;

import objetos.Estado;

/**
 *
 * @author Diego
 */
public class Devuelta extends Estado {

    public Devuelta(String nombre, String descripcion) {
        super(nombre, descripcion);
    }
    
    public boolean estaDevuleto(){
        return true;
    }
}
