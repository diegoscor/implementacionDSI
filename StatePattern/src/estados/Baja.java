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
public class Baja extends Estado {

    public Baja() {
        super();
        super.setNombre("Baja");
    }

    @Override
    public boolean estaDadoBaja() {
        JOptionPane.showMessageDialog(null, "La obra está dada de baja", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
        return false;
    }
}
