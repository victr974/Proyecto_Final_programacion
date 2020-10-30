/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.mycompany.restaurat.Conexion_BD;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Cortez
 */
public class Mesa extends javax.swing.JInternalFrame {

    Conexion_BD conectar = new Conexion_BD();
    Connection conn;
    CallableStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    
    
    /**
     * Creates new form Mesa
     * @throws java.sql.SQLException
     */
    public Mesa() throws SQLException {
        initComponents(); 
        conn = conectar.getConection();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCargar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroMesa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIDCLIENTE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIDempleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIDMenu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIDCATEGORIA = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtDisponible = new javax.swing.JTextField();

        tblCargar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdMesa", "Codigo", "No.Mesa", "IdCliente", "Id Empleado", "IdMenu", "IdCategoria"
            }
        ));
        jScrollPane1.setViewportView(tblCargar);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Pedido Mesa");

        jLabel2.setText("Id:");

        txtId.setEnabled(false);

        jLabel3.setText("Codigo:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("No.Mesa:");

        txtNumeroMesa.setText(" ");

        jLabel5.setText(" IdCliente:");

        jLabel6.setText("IdEmpleado:");

        jLabel7.setText("IdMenu:");

        jLabel8.setText("IdCategoria:");

        btnGuardar.setText(" Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText(" Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        jLabel9.setText("Disponible:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumeroMesa))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIDCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIDempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnGuardar)
                                                .addGap(39, 39, 39)
                                                .addComponent(btnModificar)
                                                .addGap(71, 71, 71)
                                                .addComponent(btnEliminar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BtnLimpiar)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIDCATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnBuscar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtIDCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtIDempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtIDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtIDCATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(BtnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void LimpiarCajas(){
        txtId.setText(null);
        txtCodigo.setText(null);
        txtNumeroMesa.setText(null);
        txtIDCLIENTE.setText(null);
        txtIDempleado.setText(null);
        txtIDMenu.setText(null);
        txtIDCATEGORIA.setText(null);
    }

    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        int mesa = Integer.parseInt(txtNumeroMesa.getText());
        int id_cliente = Integer.parseInt(txtIDCLIENTE.getText());
        int id = Integer.parseInt(txtIDempleado.getText());
        int id_menu = Integer.parseInt(txtIDMenu.getText());
        int id_categoria = Integer.parseInt(txtIDCATEGORIA.getText());

        
        try {
            conn = conectar.getConection();
            ps = conn.prepareCall("call insertar_pedido(?,?,?,?,?,?,?)");
            ps.setInt(1, codigo);
            ps.setInt(2, mesa);
            ps.setInt(3, id_cliente);
            ps.setInt(4, id);
            ps.setInt(5, id_menu);
            ps.setInt(6, id_categoria);
            ps.setInt(7, 1 );
            
            
            int res = ps.executeUpdate();
            if(res >0)
            {
                JOptionPane.showMessageDialog(null," Registro Guardado" );
                LimpiarCajas();
                cargarTabla();
             
            }

            else {
                JOptionPane.showMessageDialog(null, "Error al guardar registro");
                LimpiarCajas();
            }
            conn.close();

        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        
        try {
            conn = conectar.getConection();
            ps = conn.prepareCall("call buscarPedido(?)");
            ps.setInt(1, codigo);
            
            rs = ps.executeQuery();
             
            if(rs.next())
            {
                txtId.setText(rs.getString("id_mesa"));
                txtCodigo.setText(rs.getString("codigo"));
                txtNumeroMesa.setText(rs.getString("mesa"));
                txtIDCLIENTE.setText(rs.getString("id_cliente"));
                txtIDempleado.setText(rs.getString("id"));
                txtIDMenu.setText(rs.getString("id_menu"));
                txtIDCATEGORIA.setText(rs.getString("id_categoria"));
                txtDisponible.setText(rs.getString("Disponible"));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No existe un registro con este id");
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
    
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        int id_mesa = Integer.parseInt(txtId.getText());    
        int codigo = Integer.parseInt(txtCodigo.getText());
        int mesa = Integer.parseInt(txtNumeroMesa.getText());
        int id_cliente = Integer.parseInt(txtIDCLIENTE.getText());
        int id = Integer.parseInt(txtIDempleado.getText());
        int id_menu = Integer.parseInt(txtIDMenu.getText());
        int id_categoria = Integer.parseInt(txtIDCATEGORIA.getText());
        int Disponible = Integer.parseInt(txtDisponible.getText());

        try {
            conn = conectar.getConection();
            ps = conn.prepareCall("call ModidcarPedido (?,?,?,?,?,?,?,?)");
            ps.setInt(1, codigo);
            ps.setInt(2, mesa);
            ps.setInt(3, id_cliente);
            ps.setInt(4, id);
            ps.setInt(5, id_menu);
            ps.setInt(6, id_categoria);
            ps.setInt(7, Disponible );
            ps.setInt(8, id_mesa );
            
            
            int res = ps.executeUpdate();
            if(res >0)
            {
                JOptionPane.showMessageDialog(null," Registro Guardado" );
                 LimpiarCajas();
                cargarTabla();
             
            }

            else {
                JOptionPane.showMessageDialog(null, "Error al guardar registro");
                LimpiarCajas();
            }
            conn.close();

        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         
         int id_mesa = Integer.parseInt(txtId.getText());
        
        try {
            conn = conectar.getConection();
            ps = conn.prepareCall("call eliminarPediddo(?)");
            ps.setInt(1, id_mesa);
            
            int res = ps.executeUpdate();
            if(res >0)
            {
                JOptionPane.showMessageDialog(null,"Registro eliminado" );
                 LimpiarCajas();
                cargarTabla();
            }

            else {
                JOptionPane.showMessageDialog(null, "Error al eliminar registro");
                LimpiarCajas();
                
            }
            conn.close();
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
         LimpiarCajas();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    
    private void cargarTabla(){
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCargar.getModel();
        modeloTabla.setRowCount(0);
        int[] anchos = {5,8,25,15,15,15,15};
        for (int i=0; i < tblCargar.getColumnCount(); i++ )
        tblCargar.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
             try {
             conn= conectar.getConection();
             ps= conn.prepareCall("call cargarPedido (1) ");
             
             rs = ps.executeQuery();
             rsmd = (ResultSetMetaData) rs.getMetaData();
             columnas = rsmd.getColumnCount();
             
             while(rs.next())
             {
                 Object[] fila = new Object[columnas];
                 for(int indice=0; indice<columnas; indice++){
                     fila[indice] = rs.getObject(indice + 1);
                 }
                 modeloTabla.addRow(fila);
             }
                  
        } 
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
            
    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCargar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDisponible;
    private javax.swing.JTextField txtIDCATEGORIA;
    private javax.swing.JTextField txtIDCLIENTE;
    private javax.swing.JTextField txtIDMenu;
    private javax.swing.JTextField txtIDempleado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNumeroMesa;
    // End of variables declaration//GEN-END:variables
}
