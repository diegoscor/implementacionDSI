/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import objetos.Estilo;

/**
 *
 * @author Diego
 */
public class ComboRendererEstilo extends DefaultListCellRenderer{
    @Override
    public Component getListCellRendererComponent( JList list, Object value, int index, boolean isSelected, boolean cellHasFocus ) {
        Object item = value;
        
        if(item instanceof Estilo){
            item = ( ( Estilo ) item ).getNombre();     
        }
        
        return super.getListCellRendererComponent( list, item, index, isSelected, cellHasFocus);
    }
}
