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
import objetos.Tecnica;

/**
 *
 * @author Diego
 */
public class ModelTecnica extends Conexion {

    
    private String sql;

    public ArrayList<Tecnica> obtenerTodos() {
        
        ResultSet rs = super.ejecutarConsulta(sql);
        ArrayList<Tecnica> list = new ArrayList();
        Tecnica e;

        try {
            while (rs.next()) {

                e = armarTecnica(rs);
                System.out.println("AGREGUE A : " + e.getNombre());
                list.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelEstilo.class.getName()).log(Level.SEVERE, null, ex);
        }

        super.cerrarCnx();
        return list;
    }

    public Tecnica armarTecnica(ResultSet rs) throws SQLException {
        Tecnica e;
        String nombre, desc;
        int id;
        
        id = rs.getInt(1);
        nombre = rs.getString(2);
        desc = rs.getString(3);
        e = new Tecnica(id, nombre, desc);

        return e;
    }
}
