/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayl_eventos_reservas;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author agust
 */
public class agregarCliente extends javax.swing.JFrame {
    GestorBD gestor = new GestorBD();
    /**
     * Creates new form agregarEvento
     */
    public agregarCliente() {
        initComponents();
        setearTabla();
        
        Font subtitulo = new Font("Roboto Medium", Font.PLAIN, 20);
        Font texto = new Font("Roboto", Font.PLAIN, 14);
        Color c1 = new Color(255,255,255);
        
        this.labelCliente.setFont(new Font("Roboto Medium", Font.BOLD, 26));
        this.labelCliente.setForeground(c1);
        this.labelNuevoCliente.setFont(subtitulo);
        this.labelNuevoCliente.setForeground(c1);
        this.labelSeleccionar.setFont(subtitulo);
        this.labelSeleccionar.setForeground(c1);
        
        this.labelCorreo.setFont(texto);
        this.labelCorreo.setForeground(c1);
        this.labelNombre.setFont(texto);
        this.labelNombre.setForeground(c1);
        this.labelNumero.setFont(texto);
        this.labelNumero.setForeground(c1);
        
        personalizarTabla(tablaClientes);
        
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
        labelCliente = new javax.swing.JLabel();
        labelNuevoCliente = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        labelSeleccionar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        botonRecargar = new javax.swing.JButton();
        panelSeleccionar = new javax.swing.JPanel();
        botonSeleccionar = new javax.swing.JLabel();
        panelCrear = new javax.swing.JPanel();
        botonCrear = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(154, 12, 26));

        labelCliente.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        labelCliente.setText("Cliente");

        labelNuevoCliente.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelNuevoCliente.setText("Nuevo cliente");

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        labelNombre.setText("Nombre");

        labelCorreo.setText("Correo Electrónico");

        labelNumero.setText("Número Telefónico");

        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtMail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        labelSeleccionar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelSeleccionar.setText("Seleccionar Cliente");

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaClientes);

        botonRecargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recargar.png"))); // NOI18N
        botonRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargarActionPerformed(evt);
            }
        });

        panelSeleccionar.setBackground(new java.awt.Color(48, 48, 186));

        botonSeleccionar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        botonSeleccionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSeleccionar.setText("Seleccionar");
        botonSeleccionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(58, 71, 212), new java.awt.Color(52, 65, 210), new java.awt.Color(4, 2, 136), new java.awt.Color(4, 2, 136)));
        botonSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSeleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeleccionarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSeleccionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeleccionarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSeleccionarLayout = new javax.swing.GroupLayout(panelSeleccionar);
        panelSeleccionar.setLayout(panelSeleccionarLayout);
        panelSeleccionarLayout.setHorizontalGroup(
            panelSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionarLayout.createSequentialGroup()
                .addComponent(botonSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelSeleccionarLayout.setVerticalGroup(
            panelSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        panelCrear.setBackground(new java.awt.Color(48, 48, 186));

        botonCrear.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        botonCrear.setForeground(new java.awt.Color(255, 255, 255));
        botonCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonCrear.setText("Crear");
        botonCrear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(58, 71, 212), new java.awt.Color(52, 65, 210), new java.awt.Color(4, 2, 136), new java.awt.Color(4, 2, 136)));
        botonCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(labelCliente)
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelSeleccionar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelNuevoCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelNombre)
                                            .addComponent(labelCorreo)
                                            .addComponent(labelNumero)
                                            .addComponent(txtNombre)
                                            .addComponent(txtMail)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(panelSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNuevoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(labelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(panelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSeleccionar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botonRecargar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 614));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personalizarTabla(JTable table){
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setForeground(new Color(20,20,20)); 
        table.setRowHeight(26);
        table.setFont(new Font("Roboto",Font.PLAIN,14));
        
        table.getColumnModel().getColumn(0).setPreferredWidth(1);
        table.getColumnModel().getColumn(1).setPreferredWidth(50);
        table.getColumnModel().getColumn(2).setPreferredWidth(170);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
    }
    
    private void setearTabla(){        
        Vector<Vector<String>> VectorClientes = gestor.dameLosClientes();
        Object[][] objetos = gestor.vectorObjetoConvertir(VectorClientes);

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            objetos,
            new String [] {
                "Id", "Nombre","Mail","Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }
    
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void botonRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargarActionPerformed
        setearTabla();
        personalizarTabla(tablaClientes);
    }//GEN-LAST:event_botonRecargarActionPerformed
    
        
    agregarEvento aa;
    private void botonSeleccionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeleccionarMouseClicked
        int filaSeleccionada = this.tablaClientes.getSelectedRow();
        if (filaSeleccionada != -1){
            int id = Integer.valueOf((String)this.tablaClientes.getValueAt(filaSeleccionada, 0));
        
            aa=new agregarEvento(id);
            aa.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún cliente.\nSeleccione un cliente para continuar.");
        }
    }//GEN-LAST:event_botonSeleccionarMouseClicked

    private void botonSeleccionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeleccionarMouseEntered
        botonSeleccionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(100, 100, 240), new java.awt.Color(100, 120, 240), new java.awt.Color(25, 33, 136), new java.awt.Color(25, 33, 136)));
    }//GEN-LAST:event_botonSeleccionarMouseEntered

    private void botonSeleccionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeleccionarMouseExited
        botonSeleccionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(58, 71, 212), new java.awt.Color(52, 65, 210), new java.awt.Color(4, 2, 136), new java.awt.Color(4, 2, 136)));
    }//GEN-LAST:event_botonSeleccionarMouseExited

    private void botonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearMouseClicked
        if("".equals(this.txtNombre.getText())){
            JOptionPane.showMessageDialog(null, "Complete los campos", "Completar", JOptionPane.WARNING_MESSAGE);
        }else{
            String nombre = txtNombre.getText();
            String mail = txtMail.getText();
            String tel = txtTelefono.getText();
            if(gestor.registrarCliente(nombre, mail, tel)){
                JOptionPane.showMessageDialog(null, "El cliente se ha creado exitosamente");
                txtNombre.setText("");
                txtMail.setText("");
                txtTelefono.setText("");
                setearTabla();
            }else{
                JOptionPane.showMessageDialog(null, "Hubo un error al crear el cliente.\nPor favor intente nuevamente.", "Error", 0);
            }
        }
    }//GEN-LAST:event_botonCrearMouseClicked

    private void botonCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearMouseEntered
        botonCrear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(100, 100, 240), new java.awt.Color(100, 120, 240), new java.awt.Color(25, 33, 136), new java.awt.Color(25, 33, 136)));
    }//GEN-LAST:event_botonCrearMouseEntered

    private void botonCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearMouseExited
        botonCrear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(58, 71, 212), new java.awt.Color(52, 65, 210), new java.awt.Color(4, 2, 136), new java.awt.Color(4, 2, 136)));
    }//GEN-LAST:event_botonCrearMouseExited

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
            java.util.logging.Logger.getLogger(agregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonCrear;
    private javax.swing.JButton botonRecargar;
    private javax.swing.JLabel botonSeleccionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNuevoCliente;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelSeleccionar;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JPanel panelSeleccionar;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}