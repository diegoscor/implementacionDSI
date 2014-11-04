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
public class PendienteDeRestauracion extends Estado {

    public PendienteDeRestauracion() {
        super();
        super.setNombre("Pendiente De Restauracion");
    }
    
    @Override
    public void enviarRestaurar(){
        //EnRestauracion
        JOptionPane.showMessageDialog(null, "La obra será enviada a restaurar.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }
}
