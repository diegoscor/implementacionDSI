/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Aldi Vaca
 */
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import objetos.TipoIngreso;

/**
 *
 * @author Diego
 */
public class ComboRendererTipoIngreso extends DefaultListCellRenderer{
    @Override
    public Component getListCellRendererComponent( JList list, Object value, int index, boolean isSelected, boolean cellHasFocus ) {
        Object item = value;
        
        if(item instanceof TipoIngreso){
            item = ( ( TipoIngreso ) item ).getNombre();     
        }
        
        return super.getListCellRendererComponent( list, item, index, isSelected, cellHasFocus);
    }
}