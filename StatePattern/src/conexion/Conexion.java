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

    private String ruta = "miDataBase.s3db", nomArch;
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
     * Verifica que exista una base de datos sobre la cual trabajar, y en caso
     * contrario la crea.
     */
    public void crearDB() {
        try {
            File dicc = new File(ruta);
            if (!dicc.exists() || dicc.length() < 1) {
                StringBuilder query = new StringBuilder("");
                query.append("CREATE TABLE Empleado (cuit VARCHAR PRIMARY KEY  NOT NULL, apellido VARCHAR NOT NULL, nombre VARCHAR NOT NULL, ");
                query.append("domicilio VARCHAR, mail  VARCHAR, sexo  VARCHAR, dni INTEGER, telefono INTEGER, fechaIngreso DATE, fechaEgreso  DATE);");
                hacerPersistente(query.toString());
                query = new StringBuilder("CREATE TABLE Usuario ( nombre VARCHAR NOT NULL, contraseña   VARCHAR NOT NULL, ");
                query.append(" caducidad BOOLEAN, cuitEmpleado VARCHAR REFERENCES Empleado ( cuit ) ON DELETE CASCADE  ON UPDATE CASCADE,");
                query.append(" PRIMARY KEY ( nombre, contraseña ));");
                hacerPersistente(query.toString());
                query = new StringBuilder("CREATE TABLE Sesion( fechaInicio DATE NOT NULL, fechaFin DATE  NOT NULL, nombreUsuario VARCHAR NOT NULL, ");
                query.append(" contraseñaUsuario VARCHAR NOT NULL, PRIMARY KEY(fechaInicio, fechaFin, nombreUsuario, contraseñaUsuario), FOREIGN KEY ( nombreUsuario");
                query.append(" , contraseñaUsuario ) REFERENCES Usuario ( nombre, contraseña ) ON DELETE CASCADE ON UPDATE CASCADE);");
                hacerPersistente(query.toString());
                query = new StringBuilder("CREATE TABLE Estado(nombre VARCHAR PRIMARY KEY NOT NULL, descripcion VARCHAR);");
                hacerPersistente(query.toString());
                query = new StringBuilder("CREATE TABLE Tecnica ( id INTEGER PRIMARY KEY ASC AUTOINCREMENT NOT NULL, nombre  VARCHAR NOT NULL, ");
                query.append("descripcion VARCHAR);");
                hacerPersistente(query.toString());
                query = new StringBuilder("CREATE TABLE Estilo ( id INTEGER PRIMARY KEY ASC AUTOINCREMENT  NOT NULL, ");
                query.append("nombre  VARCHAR NOT NULL, descripcion VARCHAR);");
                hacerPersistente(query.toString());
                query = new StringBuilder("CREATE TABLE Artista ( idArtista INTEGER PRIMARY KEY ASC AUTOINCREMENT NOT NULL, ");
                query.append("nombre  VARCHAR NOT NULL, apellido VARCHAR NOT NULL, mail VARCHAR, pseudonimo VARCHAR, ");
                query.append("antecedente VARCHAR, sexo VARCHAR, telefono    INTEGER);");
                hacerPersistente(query.toString());
                query = new StringBuilder("CREATE TABLE TipoIngreso ( id INTEGER PRIMARY KEY ASC AUTOINCREMENT NOT NULL, ");
                query.append(" nombre  VARCHAR NOT NULL, descripcion VARCHAR);");
                hacerPersistente(query.toString());
                query = new StringBuilder("CREATE TABLE Tematica ( idTematica INTEGER PRIMARY KEY ASC AUTOINCREMENT NOT NULL, ");
                query.append(" nombre VARCHAR);");
                hacerPersistente(query.toString());
                query = new StringBuilder("CREATE TABLE Obra ( sensor INTEGER PRIMARY KEY ASC AUTOINCREMENT NOT NULL, ");
                query.append(" nombre VARCHAR NOT NULL, fechaCreacion DATE, fechaRegistracion DATE, alto INTEGER, ");
                query.append(" ancho  INTEGER, peso REAL, valuacion  REAL, idEstilo INTEGER REFERENCES Estilo ( id ) ON DELETE SET NULL  ON UPDATE CASCADE ");
                query.append(", idTecnica INTEGER REFERENCES Tecnica ( id ) ON DELETE SET NULL  ON UPDATE CASCADE, ");
                query.append("idTematica INTEGER REFERENCES Tematica ( idTematica ) ON DELETE SET NULL  ON UPDATE CASCADE);");
                hacerPersistente(query.toString());
                query = new StringBuilder("CREATE TABLE HistorialEstado ( fecha DATETIME NOT NULL, ");
                query.append(" nombreEstado VARCHAR NOT NULL REFERENCES Estado(nombre) ON DELETE CASCADE ON UPDATE CASCADE,");
                query.append(" sensorObra   INTEGER REFERENCES Obra(sensor) ON DELETE CASCADE ON UPDATE CASCADE,");
                query.append(" PRIMARY KEY(fecha, nombreEstado, sensorObra));");
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
     * Realiza la ejecución de una sentencia UPDATE, INSERT, CREATE, DROP, etc
     * pasada por parámetro en un String
     *
     * @throws SQLException
     */
    public void hacerPersistente(String sql) throws SQLException {
        ps = cnx.prepareStatement(sql);
        ps.executeUpdate();

    }

    /**
     * Realiza la ejecución de una consulta SELECT pasada por parámetro en un
     * String cuyo retorno será una salida de tipo ResultSet
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
