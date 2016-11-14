package ui;

import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import main.ObligatorioSeguridad;
import main.Rol;
import main.Usuario;
import returns.Retorno;

public class OtorgarPermisosFrame extends javax.swing.JFrame {

    String usuarioSeleccionado = "";
    
    public OtorgarPermisosFrame() {
        initComponents();    
                
        rol_txt.setVisible(false);
        rol_usuario_txt.setVisible(false);
        roles_combo.setVisible(false);
        agregarRol_btn.setVisible(false);
        modificarRol_btn.setVisible(false);
        eliminarRol_btn.setVisible(false);
        
        Usuario usuario = new Usuario();
        List<String> listaUsuarios = usuario.listarUsuarios(ObligatorioSeguridad
                .idUsuarioLogueado);
        DefaultTableModel dtm = new DefaultTableModel(0, 0);

        String header[] = new String[] {"Usuario"};
    
        dtm.setColumnIdentifiers(header);

        listaUsuarios_table.setModel(dtm);
        
        for (int i = 0; i < listaUsuarios.size(); i++) {
            dtm.addRow(new Object[] {listaUsuarios.get(i)});
        }
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
        rol_txt = new javax.swing.JLabel();
        roles_combo = new javax.swing.JComboBox<>();
        eliminarRol_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios_table = new javax.swing.JTable();
        agregarRol_btn = new javax.swing.JButton();
        eliminarUsuario_btn1 = new javax.swing.JButton();
        rol_usuario_txt = new javax.swing.JLabel();
        modificarRol_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Obligatorio Seguridad");
        setFocusTraversalPolicyProvider(true);
        setMaximumSize(new java.awt.Dimension(430, 358));
        setMinimumSize(new java.awt.Dimension(430, 358));
        setPreferredSize(new java.awt.Dimension(430, 358));
        setResizable(false);

        jLabel1.setText("Usuarios");

        rol_txt.setText("Rol");

        roles_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Administrador", "Operario" }));

        eliminarRol_btn.setText("Eliminar");
        eliminarRol_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRol_btnActionPerformed(evt);
            }
        });

        salir_btn.setText("Salir");
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        listaUsuarios_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        listaUsuarios_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaUsuarios_table.getTableHeader().setResizingAllowed(false);
        listaUsuarios_table.getTableHeader().setReorderingAllowed(false);
        listaUsuarios_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaUsuarios_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaUsuarios_table);

        agregarRol_btn.setText("Agregar");
        agregarRol_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarRol_btnActionPerformed(evt);
            }
        });

        eliminarUsuario_btn1.setText("Eliminar");
        eliminarUsuario_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuario_btn1ActionPerformed(evt);
            }
        });

        rol_usuario_txt.setText("Sin asignar");

        modificarRol_btn.setText("Modificar");
        modificarRol_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarRol_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarUsuario_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rol_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarRol_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarRol_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roles_combo, 0, 173, Short.MAX_VALUE)
                    .addComponent(rol_usuario_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarRol_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rol_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rol_usuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roles_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregarRol_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificarRol_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarRol_btn)
                .addGap(42, 42, 42)
                .addComponent(salir_btn)
                .addGap(238, 238, 238))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarUsuario_btn1)
                .addGap(353, 353, 353))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarRol_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRol_btnActionPerformed

        Retorno retorno = Usuario.eliminarRol(usuarioSeleccionado,
                ObligatorioSeguridad.idUsuarioLogueado);

        if (retorno.getCodigo() == 0) {
            rol_usuario_txt.setText("");
            rol_usuario_txt.setVisible(false);
            rol_txt.setVisible(false);
            agregarRol_btn.setVisible(true);
            modificarRol_btn.setVisible(false);
            eliminarRol_btn.setVisible(false);
        } else if (retorno.getCodigo() == -3) {
            JOptionPane.showMessageDialog(this, retorno.getDescripcion(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_eliminarRol_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_salir_btnActionPerformed

    private void listaUsuarios_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaUsuarios_tableMouseClicked
        Rol rol = new Rol();
        int row = listaUsuarios_table.rowAtPoint(evt.getPoint());
        int col = listaUsuarios_table.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
            usuarioSeleccionado = String.valueOf(listaUsuarios_table
                    .getValueAt(row, col));
            rol = Usuario.getRolUsuario(usuarioSeleccionado);
            if (rol.getIdRol() != 0) {
                modificarRol_btn.setVisible(true);
                eliminarRol_btn.setVisible(true);
                roles_combo.setVisible(true);
            } else {                            
                agregarRol_btn.setVisible(true);
                roles_combo.setVisible(true);
            }
        }
        
        this.rol_usuario_txt.setText(rol.getDescripcion());
        this.rol_usuario_txt.setVisible(true);
        this.rol_txt.setVisible(true);
    }//GEN-LAST:event_listaUsuarios_tableMouseClicked

    private void eliminarUsuario_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuario_btn1ActionPerformed
        Usuario usuario = new Usuario();
        int celda = listaUsuarios_table.getSelectedRow();
        int columna = listaUsuarios_table.getSelectedColumn();
        Retorno retorno = usuario.eliminarUsuario(String.valueOf(listaUsuarios_table
                .getValueAt(celda, columna)), ObligatorioSeguridad.idUsuarioLogueado);
        
        if (retorno.getCodigo() == -1) {
            JOptionPane.showMessageDialog(this, retorno.getDescripcion(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (retorno.getCodigo() == -2) {
            JOptionPane.showMessageDialog(this, retorno.getDescripcion(),
                "Error", JOptionPane.ERROR_MESSAGE);
        } else if (retorno.getCodigo() == -3) {
            JOptionPane.showMessageDialog(this, retorno.getDescripcion(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (retorno.getCodigo() == 0) {
            JOptionPane.showMessageDialog(this, retorno.getDescripcion(), "Éxito",
                    JOptionPane.PLAIN_MESSAGE);
            SwingUtilities.updateComponentTreeUI(this);
        }
    }//GEN-LAST:event_eliminarUsuario_btn1ActionPerformed

    private void agregarRol_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarRol_btnActionPerformed
        String rol = String.valueOf(roles_combo.getSelectedItem());
        if (rol.equals("Seleccionar...")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un rol",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Retorno retorno = Usuario.agregarRol(usuarioSeleccionado, rol, 
                    ObligatorioSeguridad.idUsuarioLogueado);
            
            if (retorno.getCodigo() == 0) {
                rol_usuario_txt.setText(rol);
                rol_usuario_txt.setVisible(true);
                rol_txt.setVisible(true);
                agregarRol_btn.setVisible(false);
                modificarRol_btn.setVisible(true);
                eliminarRol_btn.setVisible(true);
            } else if (retorno.getCodigo() == -3) {
                JOptionPane.showMessageDialog(this, retorno.getDescripcion(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_agregarRol_btnActionPerformed

    private void modificarRol_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarRol_btnActionPerformed
        String rol = String.valueOf(roles_combo.getSelectedItem());
        if (rol.equals("Seleccionar...")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un rol",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Retorno retorno = Usuario.modificarRol(usuarioSeleccionado, rol, 
                    ObligatorioSeguridad.idUsuarioLogueado);
            
            if (retorno.getCodigo() == 0) {
                rol_usuario_txt.setText(rol);
            } else if (retorno.getCodigo() == -3) {
                JOptionPane.showMessageDialog(this, retorno.getDescripcion(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_modificarRol_btnActionPerformed

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
            java.util.logging.Logger.getLogger(OtorgarPermisosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OtorgarPermisosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OtorgarPermisosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OtorgarPermisosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OtorgarPermisosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarRol_btn;
    private javax.swing.JButton eliminarRol_btn;
    private javax.swing.JButton eliminarUsuario_btn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaUsuarios_table;
    private javax.swing.JButton modificarRol_btn;
    private javax.swing.JLabel rol_txt;
    private javax.swing.JLabel rol_usuario_txt;
    private javax.swing.JComboBox<String> roles_combo;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables
}
