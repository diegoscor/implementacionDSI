/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Diego
 */
public class Obra {
    
    private String nombre;
    private Date fechaCreacion, fechaRegistracion;
    private int alto, ancho;
    private double peso, valuacion;
    private long sensor;
    private Estilo estilo;
    private Tecnica tecnica;
    private Tematica tematica;
    private ArrayList<HistorialEstado> historial;

    public Obra(String nombre, Date fechaCreacion, Date fechaRegistracion, int alto, int ancho, double peso, double valuacion, long sensor, Estilo estilo, Tecnica tecnica, Tematica tematica, ArrayList<HistorialEstado> historial) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaRegistracion = fechaRegistracion;
        this.alto = alto;
        this.ancho = ancho;
        this.peso = peso;
        this.valuacion = valuacion;
        this.sensor = sensor;
        this.estilo = estilo;
        this.tecnica = tecnica;
        this.tematica = tematica;
        this.historial = historial;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaRegistracion() {
        return fechaRegistracion;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public double getPeso() {
        return peso;
    }

    public double getValuacion() {
        return valuacion;
    }

    public long getSensor() {
        return sensor;
    }
    
    public void modificarEstado(HistorialEstado e){
        historial.add(e);
    }
    
    
}
