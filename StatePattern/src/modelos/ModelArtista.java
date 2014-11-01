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
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Artista;
import objetos.Tematica;

/**
 *
 * @author Diego
 */
public class ModelArtista extends Conexion {

    
    private String sql;

    public ArrayList<Artista> obtenerTodos() {
        
        ResultSet rs = super.ejecutarConsulta(sql);
        ArrayList<Artista> list = new ArrayList();
        Artista e;

        try {
            while (rs.next()) {

                e = armarArtista(rs);
                System.out.println("AGREGUE A : " + e.getNombre());
                list.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelEstilo.class.getName()).log(Level.SEVERE, null, ex);
        }

        super.cerrarCnx();
        return list;
    }

    public Artista armarArtista(ResultSet rs) throws SQLException {
        Artista e;
        String nombre,antecedente,apellido,mail,pseudonimo,sexo;
        int telefono, id;
        
        id = rs.getInt(1);
        antecedente = rs.getString(2);
        nombre = rs.getString(3);
        apellido = rs.getString(4);
        mail = rs.getString(5);
        pseudonimo = rs.getString(6);
        sexo = rs.getString(6);
        telefono = rs.getInt(7);
        
        e = new Artista(antecedente,nombre,apellido,mail,pseudonimo,sexo,telefono);

        return e;
    }
}
