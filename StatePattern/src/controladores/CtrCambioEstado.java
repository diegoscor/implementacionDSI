/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import modelos.ModelCambioEstado;
import vistas.FrmFuncionesEstado;

/**
 *
 * @author Diego
 */
public class CtrCambioEstado {
    
    private FrmFuncionesEstado frm;
    private ModelCambioEstado mdlEstado;
    
    public CtrCambioEstado(){
        frm = new FrmFuncionesEstado();
        mdlEstado = new ModelCambioEstado();
        iniciarFrame();
    }
    
    public void iniciarFrame(){
        frm.setManejador(this);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
    }
    
}
