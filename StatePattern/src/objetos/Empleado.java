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

    public Empleado(String apellido, String cuit, String domicilio, String mail, String nombre, String sexo, int dni, int telefono, Date fechaIngreso) {
        this.apellido = apellido;
        this.cuit = cuit;
        this.domicilio = domicilio;
        this.mail = mail;
        this.nombre = nombre;
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
