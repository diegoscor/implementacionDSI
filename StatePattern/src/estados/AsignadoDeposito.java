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
public class AsignadoDeposito extends Estado {

    public AsignadoDeposito() {
        super();
        super.setNombre("Asignado a Deposito");
    }
    
    @Override
    public void asignarColeccion(){
        //EnCOleccion
        JOptionPane.showMessageDialog(null, "La obra sera asignada a una colección y guardada en depósito.", "Funcionalidad Permitida", JOptionPane.INFORMATION_MESSAGE);
    }
}
