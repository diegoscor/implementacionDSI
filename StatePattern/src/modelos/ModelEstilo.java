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
import objetos.Estilo;

/**
 *
 * @author Diego
 */
public class ModelEstilo extends Conexion {

    
    private String sql;

    public ArrayList<Estilo> obtenerTodos() {
        
        ResultSet rs = super.ejecutarConsulta(sql);
        ArrayList<Estilo> list = new ArrayList();
        Estilo e;

        try {
            while (rs.next()) {

                e = armarEstilo(rs);
                System.out.println("AGREGUE A : " + e.getNombre());
                list.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelEstilo.class.getName()).log(Level.SEVERE, null, ex);
        }

        super.cerrarCnx();
        return list;
    }

    public Estilo armarEstilo(ResultSet rs) throws SQLException {
        Estilo e;
        String nombre, desc;
        int id;
        
        id = rs.getInt(1);
        nombre = rs.getString(2);
        desc = rs.getString(3);
        e = new Estilo(id, nombre, desc);

        return e;
    }
}
