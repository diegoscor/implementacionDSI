/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.HistorialEstado;
import objetos.Obra;

/**
 *
 * @author Diego
 */
public class ModelRegistrarObra extends Conexion {

    String sql;

    public boolean validarCodigoSensor(long sensor) {
        sql = "SELECT sensor FROM Obra WHERE sensor=" + sensor;

        ResultSet rs = super.ejecutarConsulta(sql);
        try {
            if (rs != null) {
                return rs.next();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelRegistrarObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean insertarObra(Obra o) {
        long sensor = o.getSensor();
        String nombre = o.getNombre();
        Date fechaRegistracion = o.getFechaRegistracion();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int tipoIngreso=o.getTipoIngreso().getId();
        String empleadoReg = o.getEmpleadoReg().getCuit();
        ArrayList<HistorialEstado> historial = o.getHistorial();
        ArrayList<String> imagenes = o.getImagenes();

        String e = historial.get(historial.size() - 1).getEstado().getNombre();

        try {
            System.out.println("Entro a escribir");
            sql = "INSERT INTO Obra (sensor, nombre, fechaRegistracion, idTipoIngreso, idEmpleado) ";
            sql += " VALUES(" + sensor + ", '" + nombre + "', '" + dateFormat.format(fechaRegistracion) +"', "+ tipoIngreso + ", '" + empleadoReg + "')";
            System.out.println("La sentencia sql es : "+ sql);
            super.hacerPersistente(sql);
            addEstilo(o);
            addTecnica(o);
            addTematica(o);
            addArtista(o);
            addAlto(o);
            addAncho(o);
            addFechaCreacion(o);
            addPeso(o);
            addValuacion(o);
            System.out.println("Escribo imagenes");
            for (int i = 0; i < imagenes.size(); i++) {
                String p = imagenes.get(i);
                sql = "INSERT INTO Imagen (ruta, idObra) VALUES( '" + p + "'," + sensor + ")";
                System.out.println("La otra sentencia sql es: " + sql);
                super.hacerPersistente(sql);
            }
            System.out.println("escribo historial");
            sql = "INSERT INTO HistorialEstado (fecha, nombreEstado, sensorObra) ";
            sql += " VALUES('" + fechaRegistracion + "', '" + e + "', " + sensor;
            System.out.println("La ultima sentencia sql es: " + sql);
            super.hacerPersistente(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelRegistrarObra.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void addEstilo(Obra o) throws SQLException {
        if (o.getEstilo() != null) {
            int estilo = o.getEstilo().getId();
            sql = "UPDATE Obra SET idEstilo=" + estilo + " WHERE sensor= " + o.getSensor();
            super.hacerPersistente(sql);
        }
    }
    
    public void addTecnica(Obra o) throws SQLException {
        if (o.getTecnica() != null) {
            int tecnica = o.getTecnica().getId();
            sql = "UPDATE Obra SET idTecnica=" + tecnica + " WHERE sensor= " + o.getSensor();
            super.hacerPersistente(sql);
        }
    }
    
    public void addTematica(Obra o) throws SQLException {
        if (o.getTematica() != null) {
            int tematica = o.getTematica().getId();
            sql = "UPDATE Obra SET idTematica=" + tematica + " WHERE sensor= " + o.getSensor();
            super.hacerPersistente(sql);
        }
    }
    
    public void addArtista(Obra o) throws SQLException {
        if (o.getArtista() != null) {
            int artista = o.getArtista().getId();
            sql = "UPDATE Obra SET idArtista=" + artista + " WHERE sensor= " + o.getSensor();
            super.hacerPersistente(sql);
        }
    }
    
    public void addAlto(Obra o) throws SQLException {
        if (o.getAlto() != 0) {
            int alto = o.getAlto();
            sql = "UPDATE Obra SET alto=" + alto + " WHERE sensor= " + o.getSensor();
            super.hacerPersistente(sql);
        }
    }
    
    public void addAncho(Obra o) throws SQLException {
        if (o.getAncho() != 0) {
            int ancho = o.getAncho();
            sql = "UPDATE Obra SET ancho=" + ancho + " WHERE sensor= " + o.getSensor();
            super.hacerPersistente(sql);
        }
    }
    
    public void addFechaCreacion(Obra o) throws SQLException {
        if (o.getFechaCreacion() != 0) {
            int fechaCreacion = o.getFechaCreacion();
            sql = "UPDATE Obra SET fechaCreacion=" + fechaCreacion + " WHERE sensor= " + o.getSensor();
            super.hacerPersistente(sql);
        }
    }
    
    public void addPeso(Obra o) throws SQLException {
        if (o.getPeso() != 0) {
            double peso = o.getPeso();
            sql = "UPDATE Obra SET peso=" + peso + " WHERE sensor= " + o.getSensor();
            super.hacerPersistente(sql);
        }
    }
    
    public void addValuacion(Obra o) throws SQLException {
        if (o.getValuacion() != 0) {
            double valor = o.getValuacion();
            sql = "UPDATE Obra SET valuacion=" + valor + " WHERE sensor= " + o.getSensor();
            super.hacerPersistente(sql);
        }
    }
}
