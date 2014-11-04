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
public class EnColeccion extends Estado {

    public EnColeccion(String nombre, String descripcion) {
        super();
        super.setNombre("En Coleccion");
    }

    @Override
    public void prestar() {
        //EnPrestamo
    }

    @Override
    public void planificar() {
        //EnPlanificacion
    }

    @Override
    public void devolver() {
        //Devuelto
    }

    @Override
    public void restaurar() {
        //PendienteDeRestauracion
    }

}
