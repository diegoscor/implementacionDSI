/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import modelos.ModelEmpleado;
import objetos.Empleado;
import vistas.FrmMenu;

/**
 *
 * @author Diego
 */
public class CtrMenu {
    
    private FrmMenu frm;
    private ModelEmpleado mdlEmpleado;
    
    public CtrMenu(){
        frm = new FrmMenu();
        mdlEmpleado = new ModelEmpleado();
        iniciarFrame();
    }
    
    public void iniciarFrame(){
        frm.setManejador(this);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        this.cargarEmpleado();
    }
    
    private void cargarEmpleado(){
         ArrayList<Empleado> list = mdlEmpleado.obtenerTodos();
         frm.cargarEmpleado(list);
     }
}
