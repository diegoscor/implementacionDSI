/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Empleado;

/**
 *
 * @author Aldi Vaca
 */
public class ModelEmpleado extends Conexion{
    private String sql;

    public ArrayList<Empleado> obtenerTodos() {
        sql="SELECT * FROM Empleado";
        
        ResultSet rs = super.ejecutarConsulta(sql);
        ArrayList<Empleado> list = new ArrayList();
        Empleado e;

        try {
            while (rs.next()) {

                e = armarEmpleado(rs);
                list.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelEstilo.class.getName()).log(Level.SEVERE, null, ex);
        }

        super.cerrarCnx();
        return list;
    }

    public Empleado armarEmpleado(ResultSet rs) throws SQLException {
        Empleado e;
        String nombre, cuit, apellido, domicilio, mail, sexo;
        int dni, telefono;
        Date fechaIngreso;
        
        cuit = rs.getString(1);
        apellido=rs.getString(2);
        nombre = rs.getString(3);
        domicilio=rs.getString(4);
        mail=rs.getString(5); 
        sexo=rs.getString(6);
        dni=rs.getInt(7);
        telefono=rs.getInt(8);
        fechaIngreso=rs.getDate(9);
        
        e = new Empleado(cuit,  apellido, nombre, domicilio, mail, sexo, dni, telefono, fechaIngreso);

        return e;
    }
    
}
