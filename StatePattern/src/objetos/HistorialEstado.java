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
    
    private Date fechaHora;
    private Estado estado;

    public HistorialEstado(Date fecha, Estado estado) {
        this.fechaHora = fecha;
        this.estado = estado;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public Estado getEstado() {
        return estado;
    }
    
    
    
}
