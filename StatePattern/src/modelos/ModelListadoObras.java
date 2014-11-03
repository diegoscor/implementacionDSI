/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

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
        sql = "SELECT idArtista, nombre, apellido, pseudonimo FROM obra";

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
        sql = "SELECT idArtista, nombre, apellido, pseudonimo FROM artista";

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
    
}
