/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Conexion {
    
    private String ruta = "miDiccionario.s3db", nomArch;
    private Connection cnx;
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
  

    public Conexion() {
        
        try {
            Class.forName("org.sqlite.JDBC");
            cnx = DriverManager.getConnection("jdbc:sqlite:" + ruta);
            cnx.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Cierra la conexión establecida con la DB liberando los recursos.
     */
    public void cerrarCnx() {
        try {
            cnx.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Verifica que exista una base de datos sobre la cual trabajar, y en caso contrario la crea.
     */
    public void crearDB() {
        try {
            File dicc = new File(ruta);
            if (!dicc.exists() || dicc.length() < 1) {
                StringBuilder query = new StringBuilder("");
                query.append("CREATE TABLE palabra (idPalabra  VARCHAR  PRIMARY KEY  NOT NULL,");
                query.append(" frecuencia  INTEGER  NOT NULL  DEFAULT ( 0 ));");
                hacerPersistente(query.toString());
                query = new StringBuilder("");
                query.append(" CREATE TABLE archivo (id  INTEGER  PRIMARY KEY  ASC  AUTOINCREMENT  NOT NULL,");
                query.append(" nombre  TEXT  NOT NULL );");
                hacerPersistente(query.toString());
                query = new StringBuilder("");
                query.append(" CREATE TABLE aparicion (idPalabra  VARCHAR  NOT NULL  REFERENCES palabra ( idPalabra ) ON DELETE CASCADE  ON UPDATE CASCADE,");
                query.append(" idArchivo INTEGER  NOT NULL  REFERENCES archivo ( id ) ON DELETE CASCADE  ON UPDATE CASCADE,");
                query.append(" PRIMARY KEY ( idPalabra ASC, idArchivo ASC ));");
                hacerPersistente(query.toString());
                cnx.commit();
                System.out.println("Tablas creadas exitosamente");
            } else {
                System.out.println("Usando DB existente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            try {
                cnx.rollback();
                System.out.println("Rollback realizado.");
                System.exit(0);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
    }
    
    /**
     *Realiza la ejecución de una sentencia UPDATE, INSERT, CREATE, DROP, etc pasada por parámetro en un String
     * @throws SQLException
     */
    public void hacerPersistente(String sql) throws SQLException {
        ps = cnx.prepareStatement(sql);
        ps.executeUpdate();

    }

    /**
     * Realiza la ejecución de una consulta SELECT pasada por parámetro en un String cuyo retorno será una 
     * salida de tipo ResultSet
     */
    public ResultSet ejecutarConsulta(String sql) {
        try {
            ps = cnx.prepareStatement(sql);
            ResultSet r = ps.executeQuery();
            return r;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
