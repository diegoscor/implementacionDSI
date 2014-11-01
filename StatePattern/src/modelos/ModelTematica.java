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
import objetos.Tecnica;
import objetos.Tematica;

/**
 *
 * @author Diego
 */
public class ModelTematica extends Conexion {

    
    private String sql;

    public ArrayList<Tematica> obtenerTodos() {
        
        ResultSet rs = super.ejecutarConsulta(sql);
        ArrayList<Tematica> list = new ArrayList();
        Tematica e;

        try {
            while (rs.next()) {

                e = armarTematica(rs);
                System.out.println("AGREGUE A : " + e.getNombre());
                list.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelEstilo.class.getName()).log(Level.SEVERE, null, ex);
        }

        super.cerrarCnx();
        return list;
    }

    public Tematica armarTematica(ResultSet rs) throws SQLException {
        Tematica e;
        String nombre;
        int id;
        
        id = rs.getInt(1);
        nombre = rs.getString(2);        
        
        e = new Tematica(id,nombre);

        return e;
    }
}