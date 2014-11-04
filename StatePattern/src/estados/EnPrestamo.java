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
public class EnPrestamo extends Estado {

    public EnPrestamo() {
        super();
        super.setNombre("En Prestamo");
    }
    
    @Override
    public void registrarDevolucion(){
         JOptionPane.showMessageDialog(null, "La obra se registrará como devuelta.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }
}
