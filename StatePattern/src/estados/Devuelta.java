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
public class Devuelta extends Estado {

    public Devuelta() {
        super();
        super.setNombre("Devuelta");
    }
    
    @Override
    public boolean estaDevuleto(){
        JOptionPane.showMessageDialog(null, "La obra se ecuentra devuelta.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }
}
