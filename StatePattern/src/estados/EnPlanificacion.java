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
public class EnPlanificacion extends Estado {

    public EnPlanificacion(String nombre, String descripcion) {
        super();
        super.setNombre("En Planificacion");
    }
    
    @Override
    public void exponer(){
        //EnExposicion
    }
}
