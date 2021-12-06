/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones;

import demo.errorMessageFrame;
import demo.SuccesFrame;
import demo.DetallePedidosFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import demo.MainFrame;
import demo.DashboardFrme;
import Conexiones.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jorci
 */
public class Acciones {

    //muestra el contenido de una consulta sql en una tabla 
    public static void displayTable(JTable tabla, String consulta) {
        try {
            Connection conn = Connect.getConnection();
            String sql = consulta;
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            tabla.repaint();
            tabla.setModel(DbUtils.resultSetToTableModel(rs));
            pst.executeUpdate();
            pst.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("la consulta " + consulta + "presente errores");
        }

    }

    //limpia una tabla
    public static void limpiarTabla(JTable tabla) {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            int filas = tabla.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }

    public static void eliminarFila(JTable tabla) {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            int fila = tabla.getSelectedRow();
            modelo.removeRow(fila);

        } catch (Exception e) {
            Acciones.generarErrorFrame("Seleccione una fila");
        }
    }

    public static void delete(JTable tabla, String delete, String select) {
        int fila = tabla.getSelectedRow();
        String valor = tabla.getValueAt(fila, 0).toString();

        try {
            Connection conn = Connect.getConnection();
            String sql = delete + valor + "'";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            Acciones.displayTable(tabla, select);
            pst.executeUpdate();
            pst.close();
            conn.close();
            Acciones.generarSuccesFrame("Registro eliminado con éxito");
        } catch (Exception e) {
            Acciones.generarErrorFrame("No se pudo eliminar el registro :c");
        }
    }

    public static void generarErrorFrame(String message) {
        errorMessageFrame errorMensaje = new errorMessageFrame();
        errorMensaje.setVisible(true);
        errorMensaje.mensajeErrorVariable.setText(message);

    }

    public static void generarSuccesFrame(String message) {
        SuccesFrame listoMensaje = new SuccesFrame();
        listoMensaje.setVisible(true);
        listoMensaje.listoMensajeVariable.setText(message);
    }

}
