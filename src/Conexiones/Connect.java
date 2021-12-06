/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;


/**
 *
 * @author JC
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
    //Para conexiones locales el URL no deberia cambiar.
    //Observen que el ultimo nombre que utilizan es el SID que configuran en SQL Developer
    //(podria ser tambien xe para una instalacion local)
    
    public static String url = "jdbc:oracle:thin:@localhost:1521:orclcdb";
    
    //Nombre de usuario para la conexion
    public static String user = "system";
    //Contrasenia para conectarse
    public static String password = "oracle";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);
    }
    
   
}