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

    private String ruta = "miDataBase.s3db";
    private Connection cnx;
    private PreparedStatement ps;

    public Conexion() {

        try {
            Class.forName("org.sqlite.JDBC");
            cnx = DriverManager.getConnection("jdbc:sqlite:" + ruta);
            cnx.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void abrirConexion() {

        try {
            if (cnx == null || cnx.isClosed()) {

                Class.forName("org.sqlite.JDBC");
                cnx = DriverManager.getConnection("jdbc:sqlite:" + ruta);
                cnx.setAutoCommit(false);

            }
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
     * Realiza la ejecución de una sentencia UPDATE, INSERT, CREATE, DROP, etc
     * pasada por parámetro en un String
     *
     * @throws SQLException
     */
    public void realizarUpdate(String sql) throws SQLException {
       
        cnx.close(); 
        abrirConexion();
        Statement stmt = cnx.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        cnx.commit();
        cnx.close();
    }

    /**
     * Realiza la ejecución de una consulta SELECT pasada por parámetro en un
     * String cuyo retorno será una salida de tipo ResultSet
     */
    public ResultSet ejecutarConsulta(String sql) {
        try {
            abrirConexion();
            if(cnx == null || cnx.isClosed()) {
                System.out.println("Conexion nula");
            }
            ps = cnx.prepareStatement(sql);
            ResultSet r = ps.executeQuery();
            return r;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
}
