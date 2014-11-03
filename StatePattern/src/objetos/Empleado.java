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
public class Empleado {
    
    private String apellido, cuit, domicilio, mail,
            nombre, sexo;
    private int dni, telefono;
    private Date fechaIngreso, fechaEgreso;

    public Empleado(String cuit, String apellido, String nombre, String domicilio, String mail, String sexo, int dni, int telefono, Date fechaIngreso) {
        this.cuit = cuit;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.mail = mail;
        this.sexo = sexo;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCuit() {
        return cuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }
    
    
    
    
}
