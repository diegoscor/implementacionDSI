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
public class HistorialEstado {
    
    private Date fecha;
    private Date hora;
    private Estado estado;

    public HistorialEstado(Date fecha, Date hora, Estado estado) {
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getHora() {
        return hora;
    }

    public Estado getEstado() {
        return estado;
    }
    
    
    
}
