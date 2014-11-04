/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estados;

import javax.swing.JOptionPane;
import objetos.Estado;

/**
 *
 * @author Diego
 */
public class EnColeccion extends Estado {

    public EnColeccion() {
        super();
        super.setNombre("En Coleccion");
    }

    @Override
    public void prestar() {
        //EnPrestamo
        JOptionPane.showMessageDialog(null, "La obra saldrá en préstamo.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void planificar() {
        //EnPlanificacion
        JOptionPane.showMessageDialog(null, "La obra se asignará a una planificación.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void devolver() {
        //Devuelto
        JOptionPane.showMessageDialog(null, "La obra será devuelta.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void restaurar() {
        //PendienteDeRestauracion
        JOptionPane.showMessageDialog(null, "La obra se enviará a pendiente de restauración.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }

}
