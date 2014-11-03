/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        boolean r = false;
        ResultSet rs = super.ejecutarConsulta(sql);
        try {
            while (rs.next()) {
                r = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelRegistrarObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public boolean insertarObra(Obra o) {
        long sensor = o.getSensor();
        String nombre = o.getNombre();
        int fechaCreacion = o.getFechaCreacion();
        Date fechaRegistracion = o.getFechaRegistracion();
        double alto, ancho, peso, valuacion;
        alto = o.getAlto();
        ancho = o.getAncho();
        peso = o.getPeso();
        valuacion = o.getValuacion();
        int estilo = o.getEstilo().getId();
        int tecnica = o.getTecnica().getId();
        int tematica = o.getTematica().getId();
        int artista = o.getArtista().getId();
        int tipoIngreso = o.getTipoIngreso().getId();
        String empleadoReg = o.getEmpleadoReg().getCuit();
        ArrayList<HistorialEstado> historial = o.getHistorial();
        ArrayList<String> imagenes = o.getImagenes();
        
        String e=historial.get(historial.size()-1).getEstado().getNombre();
        
        try {
            sql = "INSERT INTO Obra (sensor, nombre, fechaCreacion, fechaRegistracion, alto, ancho, peso, valuacion, idEstilo, idTecnica, idTematica, idArtista, idTipoIngreso, idEmpleado) ";
            sql += " VALUES(" + sensor + ", '" + nombre + "', " + fechaCreacion + ", " + fechaRegistracion + ", " + alto + ", " + ancho + ", " + peso + ", " + valuacion + ", " + estilo + ", " + tecnica + ", " + tematica + ", " + artista + ", " + tipoIngreso+", '"+empleadoReg+"')";
            super.hacerPersistente(sql);
            for (int i = 0; i < imagenes.size(); i++) {
                String p=imagenes.get(i);
                sql = "INSERT INTO Imagen (ruta, idObra) VALUES( '" +p+"'," + sensor + ")";
                super.hacerPersistente(sql);
            }
            sql="INSERT INTO HistorialEstado (fecha, nombreEstado, sensorObra) ";
            sql+=" VALUES('"+fechaRegistracion+"', '"+e+"', "+sensor;
            super.hacerPersistente(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModelRegistrarObra.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        
    }
}
