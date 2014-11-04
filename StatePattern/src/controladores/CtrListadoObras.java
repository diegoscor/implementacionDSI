/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import javax.swing.table.DefaultTableModel;
import modelos.ModelListadoObras;
import objetos.Obra;
import vistas.FrmListadoObras;

/**
 *
 * @author Diego
 */
public class CtrListadoObras {
    
    private FrmListadoObras frm;
    private ModelListadoObras mdlListado;
    
    public CtrListadoObras(){
        frm = new FrmListadoObras();
        mdlListado = new ModelListadoObras();
        iniciarFrame();
    }
    
    public void iniciarFrame(){
        frm.setManejador(this);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        this.cargarGrilla();
    }
    
    private void cargarGrilla(){
         DefaultTableModel mdlGrilla = mdlListado.obtenerModeloGrilla();
         frm.cargarGrilla(mdlGrilla);
     }
    
    public Obra armarObra(int id){
        Obra o = mdlListado.obtenerObra(id); 
        return o;
    }
    
}
