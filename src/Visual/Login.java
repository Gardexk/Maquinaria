package Visual;

import Controlador.Ctrl_Usuario;
import Dashboard.Menú;
import java.awt.Color;
import javax.swing.JOptionPane;
import Modelo.Usuario;
import java.awt.event.KeyEvent;


public class Login extends javax.swing.JFrame {
    
    

    int xMouse, yMouse;
    
    public Login() {
        initComponents();
        
        txt_password.setVisible(true);
        txt_visible.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Background = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();
        iniciosesion = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        usuariolabel = new javax.swing.JLabel();
        txt_visible = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnentrar = new javax.swing.JPanel();
        entrar = new javax.swing.JLabel();
        Opciones = new javax.swing.JPanel();
        salir = new javax.swing.JPanel();
        salirtxt = new javax.swing.JLabel();
        maximizar = new javax.swing.JPanel();
        minimizar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        checkbox_pass = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(255, 255, 0));
        fondo.setForeground(new java.awt.Color(255, 255, 0));
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Fondo.jpg"))); // NOI18N
        Background.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 420, 560));

        iniciosesion.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        iniciosesion.setText("INICIAR SESION");
        Background.add(iniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 170, 50));

        contraseña.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        contraseña.setText("CONTRASEÑA");
        Background.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 133, 0));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 240, 10));

        usuariolabel.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        usuariolabel.setText("USUARIO");
        Background.add(usuariolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txt_visible.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_visible.setForeground(new java.awt.Color(204, 204, 204));
        txt_visible.setBorder(null);
        txt_visible.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_visibleFocusGained(evt);
            }
        });
        txt_visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_visibleMousePressed(evt);
            }
        });
        txt_visible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_visibleActionPerformed(evt);
            }
        });
        txt_visible.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_visibleKeyPressed(evt);
            }
        });
        Background.add(txt_visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 240, 20));

        txt_password.setForeground(new java.awt.Color(204, 204, 204));
        txt_password.setBorder(null);
        txt_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_passwordMousePressed(evt);
            }
        });
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        Background.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 240, 20));

        jSeparator2.setForeground(new java.awt.Color(255, 133, 0));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 240, 10));

        btnentrar.setBackground(new java.awt.Color(222, 137, 21));

        entrar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        entrar.setForeground(new java.awt.Color(255, 255, 255));
        entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrar.setText("ENTRAR");
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnentrarLayout = new javax.swing.GroupLayout(btnentrar);
        btnentrar.setLayout(btnentrarLayout);
        btnentrarLayout.setHorizontalGroup(
            btnentrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        btnentrarLayout.setVerticalGroup(
            btnentrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Background.add(btnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 90, 30));

        Opciones.setBackground(new java.awt.Color(255, 255, 255));
        Opciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                OpcionesMouseDragged(evt);
            }
        });
        Opciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OpcionesMousePressed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setPreferredSize(new java.awt.Dimension(30, 0));

        salirtxt.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        salirtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirtxt.setText("x");
        salirtxt.setAutoscrolls(true);
        salirtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirtxt.setInheritsPopupMenu(false);
        salirtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirtxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirtxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirtxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout salirLayout = new javax.swing.GroupLayout(salir);
        salir.setLayout(salirLayout);
        salirLayout.setHorizontalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        salirLayout.setVerticalGroup(
            salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        maximizar.setBackground(new java.awt.Color(255, 255, 255));
        maximizar.setPreferredSize(new java.awt.Dimension(30, 25));

        javax.swing.GroupLayout maximizarLayout = new javax.swing.GroupLayout(maximizar);
        maximizar.setLayout(maximizarLayout);
        maximizarLayout.setHorizontalGroup(
            maximizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        maximizarLayout.setVerticalGroup(
            maximizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        minimizar.setBackground(new java.awt.Color(255, 255, 255));
        minimizar.setPreferredSize(new java.awt.Dimension(30, 25));

        javax.swing.GroupLayout minimizarLayout = new javax.swing.GroupLayout(minimizar);
        minimizar.setLayout(minimizarLayout);
        minimizarLayout.setHorizontalGroup(
            minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        minimizarLayout.setVerticalGroup(
            minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout OpcionesLayout = new javax.swing.GroupLayout(Opciones);
        Opciones.setLayout(OpcionesLayout);
        OpcionesLayout.setHorizontalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(maximizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 664, Short.MAX_VALUE))
        );
        OpcionesLayout.setVerticalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
            .addComponent(maximizar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Background.add(Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Logo.png"))); // NOI18N
        jLabel3.setText("Slogan");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });
        Background.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 240, 20));

        checkbox_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_passActionPerformed(evt);
            }
        });
        checkbox_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                checkbox_passKeyPressed(evt);
            }
        });
        Background.add(checkbox_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void OpcionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionesMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_OpcionesMousePressed

    private void OpcionesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionesMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_OpcionesMouseDragged

    private void salirtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirtxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirtxtMouseClicked

    private void salirtxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirtxtMouseEntered
        salir.setBackground(Color.red);
        salirtxt.setForeground(Color.white);
    }//GEN-LAST:event_salirtxtMouseEntered

    private void salirtxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirtxtMouseExited
        salir.setBackground(Color.white);
        salirtxt.setForeground(Color.black);
    }//GEN-LAST:event_salirtxtMouseExited

    private void entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseEntered
        btnentrar.setBackground(new Color(240, 140, 40));
    }//GEN-LAST:event_entrarMouseEntered

    private void entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseExited
        btnentrar.setBackground(new Color(222, 137, 21));
    }//GEN-LAST:event_entrarMouseExited

    private void txt_visibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_visibleMousePressed
        
    }//GEN-LAST:event_txt_visibleMousePressed

    private void txt_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passwordMousePressed
        
    }//GEN-LAST:event_txt_passwordMousePressed

    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
        Loge();
    }//GEN-LAST:event_entrarMouseClicked

    private void txt_visibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_visibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_visibleActionPerformed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Loge();
        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void checkbox_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_passActionPerformed
        // TODO add your handling code here:

        if (checkbox_pass.isSelected() == true) {
            String pass = "";
            char[] passwordIngresado = txt_password.getPassword();
            for (int i = 0; i < passwordIngresado.length; i++) {
                pass += passwordIngresado[i];

            }
            txt_visible.setText(pass);
            txt_password.setVisible(false);
            txt_visible.setVisible(true);

        } else {
            String passIngresado = txt_visible.getText().trim();
            txt_password.setText(passIngresado);
            txt_password.setVisible(true);
            txt_visible.setVisible(false);

        }
    }//GEN-LAST:event_checkbox_passActionPerformed

    private void checkbox_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkbox_passKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Loge();
        }
    }//GEN-LAST:event_checkbox_passKeyPressed

    private void txt_visibleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_visibleKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Loge();
        }
    }//GEN-LAST:event_txt_visibleKeyPressed

    private void txt_visibleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_visibleFocusGained
        // TODO add your handling code here:
        txt_visible.setText("");
    }//GEN-LAST:event_txt_visibleFocusGained

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Loge();
        }
    }//GEN-LAST:event_txt_usuarioKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Opciones;
    private javax.swing.JPanel btnentrar;
    private javax.swing.JCheckBox checkbox_pass;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel entrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel iniciosesion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel maximizar;
    private javax.swing.JPanel minimizar;
    private javax.swing.JPanel salir;
    private javax.swing.JLabel salirtxt;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JTextField txt_visible;
    private javax.swing.JLabel usuariolabel;
    // End of variables declaration//GEN-END:variables

    private void Loge() {
        if (!txt_usuario.getText().isEmpty() && !txt_password.getText().isEmpty()) {
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            Usuario usuario = new Usuario();

            if (checkbox_pass.isSelected()) {
                String passIngresado = txt_visible.getText().trim();
                txt_password.setText(passIngresado);
                usuario.setPassword(passIngresado);
            } else {
                String passIngresado = txt_password.getText().trim();
                usuario.setPassword(passIngresado);
            }

            usuario.setUsuario(txt_usuario.getText().trim());
            usuario.setPassword(txt_password.getText().trim());

            String tipoUsuario = controlUsuario.loginUsuario(usuario);

            if (tipoUsuario != null) {
                if (tipoUsuario.equals("Administrador")) {
                    JOptionPane.showMessageDialog(null, "Entras al sistema como administrador");
                    Menú frmMenu = new Menú();
                    frmMenu.setVisible(true);
                    this.dispose();
                } else if (tipoUsuario.equals("Usuario")) {
                    JOptionPane.showMessageDialog(null, "Entras al sistema como usuario");
                    Menú frmMenu = new Menú();
                    frmMenu.Menu(); // <-- Oculta el menú Maestro
                    frmMenu.setVisible(true);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Clave Incorrectos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese sus credenciales");
        }
    }   
}