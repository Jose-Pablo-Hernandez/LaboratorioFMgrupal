/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Film_Magic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Langas
 */
public class Renta extends javax.swing.JInternalFrame {

    /**
     * Creates new form Renta_3
     */
    public Renta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Codigo_Cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Codigo_Renta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Codigo_Producto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Fecha_Renta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Fecha_Vencimiento = new javax.swing.JTextField();
        jButton_Registrar = new javax.swing.JButton();
        jButton_Modificar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Buscar = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setVisible(true);

        jLabel1.setText("Codigo Renta");

        jLabel2.setText("Codigo Cliente");

        jLabel3.setText("Codigo Producto");

        jLabel4.setText("Fecha Renta");

        jLabel5.setText("Fecha Vencimiento");

        jButton_Registrar.setText("Registrar");
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });

        jButton_Modificar.setText("Modificar");
        jButton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarActionPerformed(evt);
            }
        });

        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });

        jLabel7.setText("Ingrese Codigo de Renta");

        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_Codigo_Renta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_Fecha_Renta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_Fecha_Vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_Codigo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Registrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Modificar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Eliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(125, 125, 125)
                                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton_Buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Codigo_Producto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Codigo_Renta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Registrar)
                            .addComponent(jButton_Modificar)
                            .addComponent(jButton_Eliminar)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Fecha_Renta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_Fecha_Vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Codigo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(txt_Codigo_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Buscar))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        // TODO add your handling code here:
        
        try        
        {
<<<<<<< HEAD
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic","root","admin");
=======
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic","root","jorgito5828H");
>>>>>>> RamaProcesos
            PreparedStatement pst = cn.prepareStatement("insert into Renta values(?,?,?,?,?)");
            
            pst.setString(1, txt_Codigo_Renta.getText().trim());
            pst.setString(2, txt_Fecha_Renta.getText().trim());
            pst.setString(3, txt_Fecha_Vencimiento.getText().trim());
            pst.setString(4, txt_Codigo_Cliente.getText().trim());
            pst.setString(5, txt_Codigo_Producto.getText().trim());
            pst.executeUpdate();
            
            txt_Codigo_Renta.setText("");
            txt_Fecha_Renta.setText("");
            txt_Fecha_Vencimiento.setText("");
            txt_Codigo_Cliente.setText("");
            txt_Codigo_Producto.setText("");
            label_status.setText("Registrado.");
            
        }catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    private void jButton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarActionPerformed
        // TODO add your handling code here:
        
    try {
            String ID = txt_Buscar.getText().trim();
            
<<<<<<< HEAD
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic", "root", "admin");
=======
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic", "root", "jorgito5828H");
>>>>>>> RamaProcesos
            PreparedStatement pst = cn.prepareStatement("update Renta set Codigo_Renta = ?,Fecha_Renta = ?, Fecha_Vencimiento = ?,Codigo_Cliente = ?,Codigo_Producto = ? where Codigo_Renta = " + ID);
            
            pst.setString(1, txt_Codigo_Renta.getText().trim());
            pst.setString(2, txt_Fecha_Renta.getText().trim());
            pst.setString(3, txt_Fecha_Vencimiento.getText().trim());
            pst.setString(4, txt_Codigo_Cliente.getText().trim());
            pst.setString(5, txt_Codigo_Producto.getText().trim());
            pst.executeUpdate();
            
            label_status.setText("Modificación exitosa.");
            
        } catch (Exception e) 
        {
            
        }
    }//GEN-LAST:event_jButton_ModificarActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        // TODO add your handling code here:
        
                try{
<<<<<<< HEAD
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic", "root", "admin");
=======
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic", "root", "jorgito5828H");
>>>>>>> RamaProcesos
            PreparedStatement pst = cn.prepareStatement("select * from Renta where Codigo_Renta = ?");
            pst.setString(1, txt_Buscar.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next())
            {
                txt_Codigo_Renta.setText(rs.getString("Codigo_Renta"));
                txt_Fecha_Renta.setText(rs.getString("Fecha_Renta"));
                txt_Fecha_Vencimiento.setText(rs.getString("Fecha_Vencimiento"));
                txt_Codigo_Cliente.setText(rs.getString("Codigo_Cliente"));
                txt_Codigo_Producto.setText(rs.getString("Codigo_Producto"));
            } else 
            {
                JOptionPane.showMessageDialog(null, "Renta no registrado.");
            }
            
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        // TODO add your handling code here:
        
        try 
        {
<<<<<<< HEAD
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic", "root", "admin");
=======
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/FilmMagic", "root", "jorgito5828H");
>>>>>>> RamaProcesos
            PreparedStatement pst = cn.prepareStatement("delete from Renta where Codigo_Renta = ?");
            
            pst.setString(1, txt_Buscar.getText().trim());
            pst.executeUpdate();
            
            txt_Codigo_Renta.setText("");
            txt_Fecha_Renta.setText("");
            txt_Fecha_Vencimiento.setText("");
            txt_Codigo_Cliente.setText("");
            txt_Codigo_Producto.setText("");
            
            label_status.setText("Registro eliminado.");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Modificar;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_Codigo_Cliente;
    private javax.swing.JTextField txt_Codigo_Producto;
    private javax.swing.JTextField txt_Codigo_Renta;
    private javax.swing.JTextField txt_Fecha_Renta;
    private javax.swing.JTextField txt_Fecha_Vencimiento;
    // End of variables declaration//GEN-END:variables
}
