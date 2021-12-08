/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexiones.Connect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author jorci
 */
public class Pedido {
    
    
    private int codigo;

    private String estado;
    private java.sql.Date registro;
    private int codigocliente;

    public Pedido(int codigo,int codigocliente, java.sql.Date registro, String estado) {
        this.codigo = codigo;
        this.estado = estado;
        this.codigocliente = codigocliente;
        this.registro = registro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    }

   
    
    
    public void registrarPedido() throws Exception{
        Connection conn = Connect.getConnection();
        String sql = "INSERT INTO PEDIDO VALUES(?, ?, ?, ? )";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, this.codigo);
        pst.setInt(2,this.codigocliente);
        pst.setDate(3, this.registro);
        pst.setString(4, this.estado);
        pst.executeUpdate();
        pst.close();
        conn.close();
    }
    
}
