/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import Acciones.Acciones;
import net.proteanit.sql.DbUtils;
import Clases.DetallePedidos;
import Clases.Cliente;
import demo.DetallePedidosFrame;
import Clases.Pedido;
import Clases.Producto;
import Conexiones.Connect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;
import javax.swing.*;
import javax.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author jorci
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        Acciones.displayTable(jTable23, "select P.FECHA_PEDIDO, P.id_pedido, P.ESTADO_PEDIDO, c.nombres || ' ' || c.apeliidos nombre\n"
                + "from pedido P, CLIENTE C\n"
                + "WHERE P.ID_CLIENTE = C.ID_CLIENTE");
        setUpSportColumn(jTable23, jTable23.getColumnModel().getColumn(2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        busquedaText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable23 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        fechaFinal = new com.toedter.calendar.JDateChooser();
        fechaInicial = new com.toedter.calendar.JDateChooser();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/InterfacesRequerimientos.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 120));

        jPanel2.setBackground(new java.awt.Color(254, 114, 93));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dashboard");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/dash.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, 48));

        jPanel3.setBackground(new java.awt.Color(254, 114, 93));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reporte");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/reporte.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 180, 48));

        jPanel4.setBackground(new java.awt.Color(254, 114, 93));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/exit.jpg"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salir");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 180, 48));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 256, 720));

        jPanel5.setBackground(new java.awt.Color(250, 247, 245));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/buscarIcon.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 60, 40));

        busquedaText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(busquedaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 440, 40));

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable23.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "fecha", "id_pedido", "estado", "view"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable23.setToolTipText("");
        jTable23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable23MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable23);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 870, 510));

        jPanel7.setBackground(new java.awt.Color(250, 247, 245));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/info.png"))); // NOI18N
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 50, 50));

        jPanel8.setBackground(new java.awt.Color(250, 247, 245));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/modificar.png"))); // NOI18N
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 50, 50));

        jPanel9.setBackground(new java.awt.Color(250, 247, 245));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/Editar.png"))); // NOI18N
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 50, 50));

        fechaFinal.setDateFormatString("dd/MM/yyyy");
        jPanel5.add(fechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 120, -1));

        fechaInicial.setDateFormatString("dd/MM/yyyy");
        jPanel5.add(fechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 120, -1));

        jPanel10.setBackground(new java.awt.Color(250, 247, 245));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/fecha.png"))); // NOI18N
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 50, 50));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1023, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        DashboardFrme dashboard = new DashboardFrme();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jTable23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable23MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable23MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
//        DetallePedidosFrame detailsorder = new DetallePedidosFrame();
//        detailsorder.setVisible(true);
        generarDetallePedidoFrame();


    }//GEN-LAST:event_jPanel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        buscarPedido();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
        Acciones.displayTable(jTable23, "select P.FECHA_PEDIDO, P.id_pedido, P.ESTADO_PEDIDO, c.nombres || ' ' || c.apeliidos nombre\n"
                + "from pedido P, CLIENTE C\n"
                + "WHERE P.ID_CLIENTE = C.ID_CLIENTE");
        setUpSportColumn(jTable23, jTable23.getColumnModel().getColumn(2));

    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
        modificarPedido();
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        try {
            // TODO add your handling code here:
            filtarPorFecha();
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanel10MouseClicked

    public void setUpSportColumn(JTable table,
            TableColumn sportColumn) {
        //Set up the editor for the sport cells.
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("EN PROCESO");
        comboBox.addItem("TERMINADO");
        comboBox.addItem("EN CAMINO");
        comboBox.addItem("ENTREGADO");
        ;
        sportColumn.setCellEditor(new DefaultCellEditor(comboBox));

        //Set up tool tips for the sport cells.
        DefaultTableCellRenderer renderer
                = new DefaultTableCellRenderer();
        renderer.setToolTipText("Click for combo box");
        sportColumn.setCellRenderer(renderer);
    }

    public void buscarPedido() {

        try {
            String id = busquedaText.getText();
            Acciones.displayTable(jTable23, "select P.FECHA_PEDIDO, P.id_pedido, P.ESTADO_PEDIDO, c.nombres || ' ' || c.apeliidos nombre\n"
                    + "from pedido P, CLIENTE C\n"
                    + "WHERE P.ID_CLIENTE = C.ID_CLIENTE AND ID_PEDIDO = '" + id + "'");
            setUpSportColumn(jTable23, jTable23.getColumnModel().getColumn(2));

            int count = jTable23.getModel().getRowCount();
            if (count == 0) {
                Acciones.generarErrorFrame("El id que ingresaste no existe");
                Acciones.displayTable(jTable23, "select P.FECHA_PEDIDO, P.id_pedido, P.ESTADO_PEDIDO, c.nombres || ' ' || c.apeliidos nombre\n"
                        + "from pedido P, CLIENTE C\n"
                        + "WHERE P.ID_CLIENTE = C.ID_CLIENTE");
                setUpSportColumn(jTable23, jTable23.getColumnModel().getColumn(2));
            } else {
            }

        } catch (Exception e) {
            Acciones.generarErrorFrame("Algo salió mal");
        }

    }

    public void modificarPedido() {
        int fila = jTable23.getSelectedRow();

        int id = Integer.parseInt(this.jTable23.getValueAt(fila, 1).toString());
        String col = jTable23.getValueAt(fila, 2).toString();

        try {
            Connection conn = Connect.getConnection();
            String sql = "UPDATE PEDIDO SET ESTADO_PEDIDO ='" + col + "' WHERE ID_PEDIDO ='" + id + "'";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            Acciones.displayTable(jTable23, "select P.FECHA_PEDIDO, P.id_pedido, P.ESTADO_PEDIDO, c.nombres || ' ' || c.apeliidos nombre\n"
                    + "from pedido P, CLIENTE C\n"
                    + "WHERE P.ID_CLIENTE = C.ID_CLIENTE");
            setUpSportColumn(jTable23, jTable23.getColumnModel().getColumn(2));
            pst.executeUpdate();
            pst.close();
            conn.close();
            Acciones.generarSuccesFrame("Estado modificado con éxito");
        } catch (Exception e) {
            Acciones.generarErrorFrame("Selecciona una tabla");
        }

    }

    public void generarDetallePedidoFrame() {

        int fila = jTable23.getSelectedRow();

        int id = Integer.parseInt(this.jTable23.getValueAt(fila, 1).toString());

        try {

            DetallePedidosFrame newDetails = new DetallePedidosFrame();
            newDetails.setVisible(true);
            Acciones.displayTable(newDetails.tablaResumenPedido, "SELECT P.NOMBRE,P.COLOR,P.TALLA,D.CANTIDAD FROM PRODUCTO P,DETALLE_PEDIDOS D,PEDIDO PE\n"
                    + "WHERE  P.ID_PRODUCTO = D.ID_PRODUCTO\n"
                    + "AND PE.ID_PEDIDO = D.ID_PEDIDO\n"
                    + "AND PE.ID_PEDIDO = '" + id + "'");

        } catch (Exception e) {
            Acciones.generarErrorFrame("Selecciona una tabla");
        }

    }

    public void filtarPorFecha() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dateInicial = sdf.parse(((JTextField) fechaInicial.getDateEditor().getUiComponent()).getText());
        java.util.Date dateFinal = sdf2.parse(((JTextField) fechaFinal.getDateEditor().getUiComponent()).getText());

        java.sql.Date sqlDate = new Date(dateInicial.getTime());
        java.sql.Date sqlDate2 = new Date(dateFinal.getTime());
        Acciones.displayTable(jTable23, "select P.FECHA_PEDIDO, P.id_pedido, P.ESTADO_PEDIDO, c.nombres || ' ' || c.apeliidos nombre\n"
                + "from pedido P, CLIENTE C\n"
                + "WHERE P.ID_CLIENTE = C.ID_CLIENTE "
                + "AND fecha_PEDIDO >= TO_DATE('" + sqlDate + "', 'yyyy-MM-dd') AND fecha_PEDIDO < TO_DATE('" + sqlDate2 + "', 'yyyy-MM-dd')");
         setUpSportColumn(jTable23, jTable23.getColumnModel().getColumn(2));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busquedaText;
    private com.toedter.calendar.JDateChooser fechaFinal;
    private com.toedter.calendar.JDateChooser fechaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable23;
    // End of variables declaration//GEN-END:variables
}