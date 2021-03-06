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
public class DetallePedidos {
    public int codigopedido;
    public int cantidad;
    public int codigoproducto;
    public int precio;

    public DetallePedidos(int codigopedido, int codigoproducto, int precio,int cantidad) {
        this.codigopedido = codigopedido;
        this.cantidad = cantidad;
        this.codigoproducto = codigoproducto;
        this.precio = precio;
    }

  

    public int getCodigopedido() {
        return codigopedido;
    }

    public void setCodigopedido(int codigopedido) {
        this.codigopedido = codigopedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(int codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void registrarDetallePedidos() throws Exception{
        Connection conn = Connect.getConnection();
        String sql = "INSERT INTO DETALLE_PEDIDOS VALUES(?, ?, ? ,? )";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, this.codigopedido);
        pst.setInt(2, this.codigoproducto);
        pst.setInt(3, this.precio);
        pst.setInt(4, this.cantidad);
        pst.executeUpdate();
        pst.close();
        conn.close();
    }
    
    
}
