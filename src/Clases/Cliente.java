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
public class Cliente {
    private int codigo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private int dni;
    private String status;

    public Cliente(int codigo, String nombre, String apellido, String direccion, String email, int dni,String status) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.dni = dni;
        this.status = status;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public String toString(){
        return nombre + " " + apellido;
    }
    
    //INSERT
    public void registrarCliente() throws Exception{
        Connection conn = Connect.getConnection();
        String sql = "INSERT INTO CLIENTE VALUES(?, ?, ?, ?, ? ,?, ? )";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, this.codigo);
        pst.setString(2, this.nombre);
        pst.setString(3, this.apellido);
        pst.setString(4, this.direccion);
        pst.setString(5, this.email);
        pst.setInt(6, this.dni);
        pst.setString(7, this.status);
        pst.executeUpdate();
        pst.close();
        conn.close();
    }
    
    //SELECT 
    
}
