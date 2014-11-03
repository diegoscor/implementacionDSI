/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Date;

/**
 *
 * @author Diego
 */
public class Sesion {
    
    private int id;
    private Date fechaFin, fechaInicio;
    private Usuario usuario;

    public Sesion(Date fechaFin, Date fechaInicio) {
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
    }
    
    public Sesion(int id, Date fechaFin, Date fechaInicio) {
        this.id = id;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    
}
