/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import conexion.Conexion;
import estados.AsignadoDeposito;
import estados.Baja;
import estados.Devuelta;
import estados.EnColeccion;
import estados.EnExposicion;
import estados.EnPlanificacion;
import estados.EnPrestamo;
import estados.EnRestauracion;
import estados.PendienteDeAsignacion;
import estados.PendienteDeRestauracion;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import objetos.Estado;
import objetos.HistorialEstado;
import objetos.Obra;

/**
 *
 * @author Diego
 */
public class ModelListadoObras extends Conexion {

    private String sql;

    public DefaultTableModel obtenerModeloGrilla() {
        DefaultTableModel modeloObra = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {

            Vector data = this.obtenerDataObra();
            Vector columnas = this.obtenerColumnasObra();

            modeloObra.setDataVector(data, columnas);

        } catch (SQLException ex) {
            Logger.getLogger(ModelRegistrarObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.cerrarCnx();
        return modeloObra;
    }

    public Vector obtenerColumnasObra() throws SQLException {
        sql = "SELECT o.sensor, o.nombre, o.fechaRegistracion, MAX(h.fecha) as 'fecha estado', h.nombreEstado as estado"
                + " FROM obra o JOIN HistorialEstado h ON o.sensor = h.sensorObra GROUP BY o.sensor";

        ResultSet rs = super.ejecutarConsulta(sql);

        ResultSetMetaData metaData = rs.getMetaData();

        // Names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            columnNames.add(metaData.getColumnName(i));
        }
        return columnNames;
    }

    public Vector obtenerDataObra() throws SQLException {
        sql = "SELECT o.sensor, o.nombre, o.fechaRegistracion, MAX(h.fecha) as 'fecha estado', h.nombreEstado as estado"
                + " FROM obra o JOIN HistorialEstado h ON o.sensor = h.sensorObra GROUP BY o.sensor";

        ResultSet rs = super.ejecutarConsulta(sql);

        ResultSetMetaData metaData = rs.getMetaData();

        int columnCount = metaData.getColumnCount();

        // Data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int i = 1; i <= columnCount; i++) {
                vector.add(rs.getObject(i));
            }
            data.add(vector);
        }
        return data;
    }

    public Obra obtenerObra(int id) {
        Obra obra = null;
        String estado = "";
        sql = "SELECT h.nombreEstado FROM obra o JOIN historialEstado h ON o.sensor = h.sensorObra WHERE o.sensor=" + id;
        ResultSet rs = super.ejecutarConsulta(sql);

        try {
            while (rs.next()) {
                estado = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelArtista.class.getName()).log(Level.SEVERE, null, ex);
        }

        Estado e = obtenerEstado(estado);
        System.out.println("se creo el estado");
        ArrayList<HistorialEstado> h = new ArrayList();
        Date date = new Date();
        HistorialEstado he = new HistorialEstado(date, e);
        h.add(he);
        obra = new Obra(h);
        super.cerrarCnx();

        return obra;
    }

    public Estado obtenerEstado(String nom) {
        Estado e = null;
        if (nom.equals("Asignado a Deposito")) {
            e = new AsignadoDeposito();
        }
        if (nom.equals("Baja")) {
            e = new Baja();
        }
        if (nom.equals("Devuelta")) {
            e = new Devuelta();
        }
        if (nom.equals("Pendiente de Restauracion")) {
            e = new PendienteDeRestauracion();
        }
        if (nom.equals("En Restauracion")) {
            e = new EnRestauracion();
        }
        if (nom.equals("En Coleccion")) {
            e = new EnColeccion();
        }
        if (nom.equals("En Exposicion")) {
            e = new EnExposicion();
        }
        if (nom.equals("En Prestamo")) {
            e = new EnPrestamo();
        }
        if (nom.equals("En Planificacion")) {
            e = new EnPlanificacion();
        }
        if (nom.equals("Pendiente De Asignacion")) {
            e = new PendienteDeAsignacion();
        }
        return e;
    }
}
