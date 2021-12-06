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
public class Pedido {
    private int codigo;
    private java.sql.Date fecha;
    private String estado;
    private int codigocliente;

    public Pedido(int codigo, java.sql.Date fecha, String estado, int codigocliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.estado = estado;
        this.codigocliente = codigocliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public java.sql.Date getFecha() {
        return fecha;
    }

    public void setFecha(java.sql.Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(int codigocliente) {
        this.codigocliente = codigocliente;
    }

   
    
    
    public void registrarPedido() throws Exception{
        Connection conn = Connect.getConnection();
        String sql = "INSERT INTO PEDIDO VALUES(?, ?, ?, ? )";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, this.codigo);
        pst.setDate(2, this.fecha);
        pst.setString(3, this.estado);
        pst.setInt(4, this.codigocliente);
        pst.executeUpdate();
        pst.close();
        conn.close();
    }
    
}
