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
import objetos.Estado;
import objetos.Estilo;

/**
 *
 * @author Diego
 */
public class ModelCambioEstado extends Conexion{
    
    private String sql;

    public ArrayList<String> obtenerTodos() {
        sql="SELECT * FROM Estado";
        
        ResultSet rs = super.ejecutarConsulta(sql);
        ArrayList<String> list = new ArrayList();
        String e;

        try {
            while (rs.next()) {

                e = rs.getString(1);
                list.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelEstilo.class.getName()).log(Level.SEVERE, null, ex);
        }

        super.cerrarCnx();
        return list;
    }
    
}
