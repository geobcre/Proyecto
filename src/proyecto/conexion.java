/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yxres
 */
public class conexion {
    Connection conectar=null;
    
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/cafeteria","root","");
        }catch (ClassNotFoundException |SQLException e){
            System.out.print(e.getMessage());
        }
        return conectar;
    }
}
