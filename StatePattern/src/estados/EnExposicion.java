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
public class EnExposicion extends Estado {

    public EnExposicion() {
        super();
        super.setNombre("En Exposicion");
    }

    @Override
    public void cerrarExposicion() {
        //EnColeccion
        JOptionPane.showMessageDialog(null, "La obra será devuelta a depósito.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void restaurar() {
        //PendienteDeRestauracion
        JOptionPane.showMessageDialog(null, "La obra se asignará a pendiente de restauración.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public boolean enExposicion() {

        //Esta en exposicion?
        JOptionPane.showMessageDialog(null, "La obra se encuentra asignada a una exposición.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
        return false;
    }
}
