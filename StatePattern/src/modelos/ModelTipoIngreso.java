/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.TipoIngreso;

/**
 *
 * @author Aldi Vaca
 */
public class ModelTipoIngreso extends Conexion {

    
    private String sql;

    public ArrayList<TipoIngreso> obtenerTodos() {
        sql="SELECT * FROM TipoIngreso";
        
        ResultSet rs = super.ejecutarConsulta(sql);
        ArrayList<TipoIngreso> list = new ArrayList();
        TipoIngreso e;

        try {
            while (rs.next()) {

                e = armarTipoIngreso(rs);
                list.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelTecnica.class.getName()).log(Level.SEVERE, null, ex);
        }

        super.cerrarCnx();
        return list;
    }

    public TipoIngreso armarTipoIngreso(ResultSet rs) throws SQLException {
        TipoIngreso e;
        String nombre, desc;
        int id;
        
        id = rs.getInt(1);
        nombre = rs.getString(2);
        desc = rs.getString(3);
        e = new TipoIngreso(id, nombre, desc);

        return e;
    }
}
