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
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import objetos.Artista;

/**
 *
 * @author Diego
 */
public class ModelArtista extends Conexion {

    
    private String sql;

    public DefaultTableModel obtenerModeloGrilla() {
        DefaultTableModel modeloArtista = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {

            Vector data = this.obtenerDataArtista();
            Vector columnas = this.obtenerColumnasArtista();

            modeloArtista.setDataVector(data, columnas);

        } catch (SQLException ex) {
            Logger.getLogger(ModelRegistrarObra.class.getName()).log(Level.SEVERE, null, ex);
        }

        return modeloArtista;
    }

    public Vector obtenerColumnasArtista() throws SQLException {
        sql = "SELECT idArtista, nombre, apellido, pseudonimo FROM artista";

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

    public Vector obtenerDataArtista() throws SQLException {
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
    
    public Artista obtenerArtista(int idArtista) {
        sql="SLECT * FROM Artista WHERE idArtista="+idArtista;
        ResultSet rs = super.ejecutarConsulta(sql);
        Artista e=null;

        try {
            while (rs.next()) {

                e = armarArtista(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelArtista.class.getName()).log(Level.SEVERE, null, ex);
        }

        super.cerrarCnx();
        return e;
    }

    public Artista armarArtista(ResultSet rs) throws SQLException {
        Artista e;
        String nombre,antecedente,apellido,mail,pseudonimo,sexo;
        int telefono, id;
        
        id = rs.getInt(1);
        nombre = rs.getString(2);
        apellido = rs.getString(3);
        mail = rs.getString(4);
        pseudonimo = rs.getString(5);
        antecedente = rs.getString(6);
        sexo = rs.getString(7);
        telefono = rs.getInt(8);
        
        e = new Artista(antecedente,nombre,apellido,mail,pseudonimo,sexo,telefono);

        return e;
    }
}
