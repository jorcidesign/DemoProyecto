/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexiones.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author jorci
 */
public class Producto {

    private int codigo;
    private String color;
    private String talla;
    private int precio;
    private String nombre;

    public Producto(int codigo, String color, String talla, int precio, String nombre) {
        this.codigo = codigo;
        this.color = color;
        this.talla = talla;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString(){
        return nombre;
    }
    
    //INSERT
    public void registrarProducto() throws Exception{
        Connection conn = Connect.getConnection();
        String sql = "INSERT INTO PRODUCTO VALUES(?, ?, ?, ?, ? )";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, this.codigo);
        pst.setString(2, this.color);
        pst.setString(3, this.talla);
        pst.setInt(4, this.precio);
        pst.setString(5, this.nombre);
        pst.executeUpdate();
        pst.close();
        conn.close();
    }
    
    
    
    
    
    
    
    
    
    
}
