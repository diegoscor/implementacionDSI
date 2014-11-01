/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.ModelArtista;
import modelos.ModelEstilo;
import modelos.ModelRegistrarObra;
import modelos.ModelTecnica;
import modelos.ModelTematica;
import objetos.Estilo;
import objetos.Obra;
import objetos.Tecnica;
import objetos.Tematica;
import vistas.FrmRegistrarObra;

/**
 *
 * @author Diego
 */
public class CtrRegistrarObra {
    
    private FrmRegistrarObra frm;
    private Obra obra;
    private ModelTecnica mdlTecnica;
    private ModelTematica mdlTematica;
    private ModelEstilo mdlEstilo;
    private ModelArtista mdlArtista;
    private ModelRegistrarObra mdlRegistrarObra;
    
    public CtrRegistrarObra(){
        mdlTecnica = new ModelTecnica();
        mdlTematica = new ModelTematica();
        mdlEstilo = new ModelEstilo();
        mdlArtista = new ModelArtista();
        mdlRegistrarObra = new ModelRegistrarObra();
        frm = new FrmRegistrarObra();
        iniciarFrame();
    }
    
    public void setObra(Obra o){
        obra = o;
    }
    
    public Obra getObra(){
        return obra;
    }
    
    public void iniciarFrame(){
       
        frm.setManejador(this);
        this.cargarComboEstilo();
        this.cargarComboTecnica();
        this.cargarComboTematica();
        this.cargarGrilla();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
    }
    
     private void cargarComboEstilo(){
        ArrayList<Estilo> list = mdlEstilo.obtenerTodos();
        frm.cargarComboBoxEtilo(list);
    }
     
     private void cargarComboTecnica(){
        ArrayList<Tecnica> list = mdlTecnica.obtenerTodos();
        frm.cargarComboBoxTecnica(list);
    }
     
     private void cargarComboTematica(){
        ArrayList<Tematica> list = mdlTematica.obtenerTodos();
        frm.cargarComboBoxTematica(list);
    }
     
     private void cargarGrilla(){
         DefaultTableModel mdlGrilla = mdlRegistrarObra.obtenerModeloGrilla();
         frm.cargarGrilla(mdlGrilla);
     }
     
     
}
