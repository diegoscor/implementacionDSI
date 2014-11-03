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
public class PendienteDeRestauracion extends Estado {

    public PendienteDeRestauracion(String nombre, String descripcion) {
        super(nombre, descripcion);
    }
    
    @Override
    public void enviarRestaurar(){
        //EnRestauracion
    }
}
