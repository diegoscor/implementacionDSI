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
    
    private long sensor;
    private String nombre;
    private int fechaCreacion;
    private Date fechaRegistracion;
    private double alto, ancho, peso, valuacion;
    private Estilo estilo;
    private Tecnica tecnica;
    private Tematica tematica;
    private Artista artista;
    private TipoIngreso tipoIngreso;
    private Empleado empleadoReg;
    private ArrayList<HistorialEstado> historial;
    private ArrayList<String> imagenes;
    
    public Obra(long sensor, String nombre, int fechaCreacion, Date fechaRegistracion, double alto, double ancho, double peso, double valuacion, Estilo estilo, Tecnica tecnica, Tematica tematica, Artista artista, TipoIngreso tipoIngreso, Empleado empleadoReg, ArrayList<HistorialEstado> historial, ArrayList<String> img) {
        this.sensor = sensor;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaRegistracion = fechaRegistracion;
        this.alto = alto;
        this.ancho = ancho;
        this.peso = peso;
        this.valuacion = valuacion;
        this.estilo = estilo;
        this.tecnica = tecnica;
        this.tematica = tematica;
        this.artista=artista;
        this.tipoIngreso=tipoIngreso;
        this.empleadoReg=empleadoReg;
        this.historial = historial;
        this.imagenes=img;
    }

    public Obra(long sensor, String nombre, Date fechaRegistracion, TipoIngreso tipoIngreso, Empleado empleadoReg){
        this.sensor = sensor;
        this.nombre = nombre;
        this.fechaRegistracion = fechaRegistracion;
        this.tipoIngreso=tipoIngreso;
        this.empleadoReg=empleadoReg;
    }

    public long getSensor() {
        return sensor;
    }

    public void setSensor(long sensor) {
        this.sensor = sensor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(int fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaRegistracion() {
        return fechaRegistracion;
    }

    public void setFechaRegistracion(Date fechaRegistracion) {
        this.fechaRegistracion = fechaRegistracion;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValuacion() {
        return valuacion;
    }

    public void setValuacion(double valuacion) {
        this.valuacion = valuacion;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public Tecnica getTecnica() {
        return tecnica;
    }

    public void setTecnica(Tecnica tecnica) {
        this.tecnica = tecnica;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public TipoIngreso getTipoIngreso() {
        return tipoIngreso;
    }

    public void setTipoIngreso(TipoIngreso tipoIngreso) {
        this.tipoIngreso = tipoIngreso;
    }

    public Empleado getEmpleadoReg() {
        return empleadoReg;
    }

    public void setEmpleadoReg(Empleado empleadoReg) {
        this.empleadoReg = empleadoReg;
    }

    public ArrayList<HistorialEstado> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<HistorialEstado> historial) {
        this.historial = historial;
    }

    public ArrayList<String> getImagenes() {
        return imagenes;
    }

    public void setImagenes(ArrayList<String> imagenes) {
        this.imagenes = imagenes;
    }

    public void modificarEstado(HistorialEstado e){
        historial.add(e);
    }
    
    
}
