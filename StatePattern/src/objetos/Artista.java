/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Diego
 */
public class Artista {
    
    private String antecedente, apellido, nombre, mail,
            pseudonimo, sexo;
    private int telefono, id;

    public Artista(String antecedente, String apellido, String nombre, String mail, String pseudonimo, String sexo, int telefono) {
        this.antecedente = antecedente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.mail = mail;
        this.pseudonimo = pseudonimo;
        this.sexo = sexo;
        this.telefono = telefono;
    }
    
    public Artista(int id,String antecedente, String apellido, String nombre, String mail, String pseudonimo, String sexo, int telefono) {
        this.id = id;
        this.antecedente = antecedente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.mail = mail;
        this.pseudonimo = pseudonimo;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getAntecedente() {
        return antecedente;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public String getSexo() {
        return sexo;
    }

    public int getTelefono() {
        return telefono;
    }
    
    
}
