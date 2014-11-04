/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public abstract class Estado {
    
    private String nombre;
    private String descripcion;

    public Estado() {
    }  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    } 
    
    public void asignar(){
        //AsignadoDeposito
        JOptionPane.showMessageDialog(null, "La función escogida no se encuentra definida para"
                + "el estado en que se encuentra la Obra", "Funcionalidad no permitida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void asignarColeccion(){
        //EnCOleccion
        JOptionPane.showMessageDialog(null, "La función escogida no se encuentra definida para"
                + "el estado en que se encuentra la Obra", "Funcionalidad no permitida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void enviarRestaurar(){
        //EnRestauracion
        JOptionPane.showMessageDialog(null, "La función escogida no se encuentra definida para"
                + "el estado en que se encuentra la Obra", "Funcionalidad no permitida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void darBaja(){
        //Baja
        JOptionPane.showMessageDialog(null, "La función escogida no se encuentra definida para"
                + "el estado en que se encuentra la Obra", "Funcionalidad no permitida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean estaDadoBaja(){
        return false;
    }
    
    public void exponer(){
        //EnExposicion
        JOptionPane.showMessageDialog(null, "La función escogida no se encuentra definida para"
                + "el estado en que se encuentra la Obra", "Funcionalidad no permitida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void prestar(){
        //EnPrestamo
        JOptionPane.showMessageDialog(null, "La función escogida no se encuentra definida para"
                + "el estado en que se encuentra la Obra", "Funcionalidad no permitida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean validarEstado(){
        return false;
        //Esta en exposicion?
    }
    
    public void planificar(){
        //EnPlanificacion
        JOptionPane.showMessageDialog(null, "La función escogida no se encuentra definida para"
                + "el estado en que se encuentra la Obra", "Funcionalidad no permitida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void cerrarExposicion(){
        //EnColeccion
        JOptionPane.showMessageDialog(null, "La función escogida no se encuentra definida para"
                + "el estado en que se encuentra la Obra", "Funcionalidad no permitida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void devolver(){
        //Devuelto
        JOptionPane.showMessageDialog(null, "La función escogida no se encuentra definida para"
                + "el estado en que se encuentra la Obra", "Funcionalidad no permitida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean estaDevuleto(){
        return true;
    }
    
    public void restaurar(){
        //PendienteDeRestauracion
        JOptionPane.showMessageDialog(null, "La función escogida no se encuentra definida para"
                + "el estado en que se encuentra la Obra", "Funcionalidad no permitida", JOptionPane.INFORMATION_MESSAGE);
    }
   
}
