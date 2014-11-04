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
public class EnRestauracion extends Estado {

    public EnRestauracion() {
        super();
        super.setNombre("En Restauracion");
    }
    
    @Override
    public void darBaja(){
        //Baja
         JOptionPane.showMessageDialog(null, "La obra no puedo restaurarse y será dada de baja.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void exponer(){
        //EnExposicion
         JOptionPane.showMessageDialog(null, "La obra será devuelta a su exposición, habiendo sido exitosa su restauración.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void devolverAColeccion(){
        JOptionPane.showMessageDialog(null, "La obra será devuelta a su colección, habiendo sido exitosa su restauración.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }
}
