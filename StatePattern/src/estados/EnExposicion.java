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
public class EnExposicion extends Estado {

    public EnExposicion(String nombre, String descripcion) {
        super();
        super.setNombre("En Exposicion");
    }
    
    @Override
    public void cerrarExposicion(){
        //EnColeccion
    }
    
    @Override
    public void restaurar(){
        //PendienteDeRestauracion
    }
    
    @Override
    public boolean validarEstado(){
        return false;
        //Esta en exposicion?
    }
}
