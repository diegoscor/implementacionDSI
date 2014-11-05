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
public class PendienteDeAsignacion extends Estado {

    public PendienteDeAsignacion() {
        super();
        super.setNombre("Pendiente De Asignacion");
    }
    
    @Override
    public void asignar(){
        //AsignadoDeposito
        JOptionPane.showMessageDialog(null, "La obra será asignada a un lugar en el depósito.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
