/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.ModelArtista;
import modelos.ModelEmpleado;
import modelos.ModelEstilo;
import modelos.ModelRegistrarObra;
import modelos.ModelTecnica;
import modelos.ModelTematica;
import modelos.ModelTipoIngreso;
import objetos.Artista;
import objetos.Empleado;
import objetos.Estilo;
import objetos.Obra;
import objetos.Tecnica;
import objetos.Tematica;
import objetos.TipoIngreso;
import vistas.FrmRegistrarObra;

/**
 *
 * @author Diego
 */
public class CtrRegistrarObra {

    private FrmRegistrarObra frm;
    private Empleado empleado;
    private ModelTecnica mdlTecnica;
    private ModelTematica mdlTematica;
    private ModelEstilo mdlEstilo;
    private ModelTipoIngreso mdlTipoIngreso;
    private ModelRegistrarObra mdlRegistrarObra;
    private ModelEmpleado mdlEmpleado;
    private ModelArtista mdlArtista;

    public CtrRegistrarObra(Empleado e) {
        mdlTecnica = new ModelTecnica();
        mdlTematica = new ModelTematica();
        mdlEstilo = new ModelEstilo();
        mdlArtista = new ModelArtista();
        mdlRegistrarObra = new ModelRegistrarObra();
        mdlTipoIngreso = new ModelTipoIngreso();
        mdlEmpleado = new ModelEmpleado();
        frm = new FrmRegistrarObra();
        empleado = e;
        iniciarFrame();
    }

    public void iniciarFrame() {

        frm.setManejador(this);
        this.cargarEmpleado();
        this.cargarComboEstilo();
        this.cargarComboTecnica();
        this.cargarComboTematica();
        this.cargarComboTipoIngreso();
        this.cargarGrilla();
        this.cargarEmpleado();
        frm.setearTextos();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);

    }

    private void cargarComboEstilo() {
        ArrayList<Estilo> list = mdlEstilo.obtenerTodos();
        frm.cargarComboBoxEstilo(list);
    }

    private void cargarComboTecnica() {
        ArrayList<Tecnica> list = mdlTecnica.obtenerTodos();
        frm.cargarComboBoxTecnica(list);
    }

    private void cargarComboTematica() {
        ArrayList<Tematica> list = mdlTematica.obtenerTodos();
        frm.cargarComboBoxTematica(list);
    }

    private void cargarComboTipoIngreso() {
        ArrayList<TipoIngreso> list = mdlTipoIngreso.obtenerTodos();
        frm.cargarComboBoxTipoIngreso(list);
    }

    private void cargarEmpleado() {
        frm.cargarEmpleado(empleado);
    }

    private void cargarGrilla() {
        DefaultTableModel mdlGrilla = mdlArtista.obtenerModeloGrilla();
        frm.cargarGrilla(mdlGrilla);
    }

    public boolean validarSensor(long sensor) {
        boolean r = mdlRegistrarObra.validarCodigoSensor(sensor);
        return r;
    }

    public Artista armarArtista(int idArtista) {
        Artista a = mdlArtista.obtenerArtista(idArtista);
        return a;
    }

    public boolean insertarObra(Obra o) {
        return mdlRegistrarObra.insertarObra(o);
    }

    public void cerrarCnx() {
        mdlRegistrarObra.cerrarCnx();
    }
}
