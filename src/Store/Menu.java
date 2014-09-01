/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lufasoch
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        ArchivoMenu = new javax.swing.JMenu();
        AltaCategoria = new javax.swing.JMenuItem();
        RegistrarProducto = new javax.swing.JMenuItem();
        RegistrarUsuario = new javax.swing.JMenuItem();
        CrearOrden = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        EditarMenu = new javax.swing.JMenu();
        menuModificarProducto = new javax.swing.JMenuItem();
        ConsultarMenu = new javax.swing.JMenu();
        VerInfoCliente = new javax.swing.JMenuItem();
        VerInfoProveedor = new javax.swing.JMenuItem();
        VerInfoProducto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Market Place");
        setMinimumSize(new java.awt.Dimension(600, 400));

        ArchivoMenu.setText("Archivo");

        AltaCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        AltaCategoria.setText("Alta Categoria");
        AltaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaCategoriaActionPerformed(evt);
            }
        });
        ArchivoMenu.add(AltaCategoria);

        RegistrarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        RegistrarProducto.setText("Registrar Producto");
        RegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarProductoActionPerformed(evt);
            }
        });
        ArchivoMenu.add(RegistrarProducto);

        RegistrarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        RegistrarUsuario.setText("Registrar Usuario Nuevo");
        RegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarUsuarioActionPerformed(evt);
            }
        });
        ArchivoMenu.add(RegistrarUsuario);

        CrearOrden.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        CrearOrden.setText("Crear orden de compra");
        CrearOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearOrdenActionPerformed(evt);
            }
        });
        ArchivoMenu.add(CrearOrden);

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        ArchivoMenu.add(Salir);

        jMenuBar1.add(ArchivoMenu);

        EditarMenu.setText("Editar");

        menuModificarProducto.setText("Modificar Producto");
        menuModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificarProductoActionPerformed(evt);
            }
        });
        EditarMenu.add(menuModificarProducto);

        jMenuBar1.add(EditarMenu);

        ConsultarMenu.setText("Ver");

        VerInfoCliente.setText("Informacion de Cliente");
        VerInfoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInfoClienteActionPerformed(evt);
            }
        });
        ConsultarMenu.add(VerInfoCliente);

        VerInfoProveedor.setText("Informacion de Proveedor");
        VerInfoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInfoProveedorActionPerformed(evt);
            }
        });
        ConsultarMenu.add(VerInfoProveedor);

        VerInfoProducto.setText("Informacion de Producto");
        VerInfoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInfoProductoActionPerformed(evt);
            }
        });
        ConsultarMenu.add(VerInfoProducto);

        jMenuItem1.setText("Informacion de Orden de Compra");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ConsultarMenu.add(jMenuItem1);

        jMenuBar1.add(ConsultarMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarUsuarioActionPerformed
        RegistroUsuario RUs = RegistroUsuario.getInstancia();
        if (RUs.isVisible()) {
            try {
                RUs.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.Escritorio.add(RUs);
            RUs.setVisible(true);
        }
    }//GEN-LAST:event_RegistrarUsuarioActionPerformed

    private void VerInfoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInfoClienteActionPerformed
        InfoCliente ICli = InfoCliente.getInstancia();
        if (ICli.isVisible()) {
            try {
                ICli.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.Escritorio.add(ICli);
            ICli.setVisible(true);
        }
    }//GEN-LAST:event_VerInfoClienteActionPerformed

    private void VerInfoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInfoProveedorActionPerformed
        InfoProveedor IPro = InfoProveedor.getInstancia();
        if (IPro.isVisible()) {
            try {
                IPro.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.Escritorio.add(IPro);
            IPro.setVisible(true);
        }
    }//GEN-LAST:event_VerInfoProveedorActionPerformed

    private void CrearOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearOrdenActionPerformed
        GenerarOC GOC = GenerarOC.getInstancia();
        if (GOC.isVisible()) {
            try {
                GOC.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.Escritorio.add(GOC);
            GOC.setVisible(true);
        }
    }//GEN-LAST:event_CrearOrdenActionPerformed

    private void VerInfoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInfoProductoActionPerformed
        InfoProducto IProd = InfoProducto.getInstancia();
        if (IProd.isVisible()) {
            try {
                IProd.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.Escritorio.add(IProd);
            IProd.setVisible(true);
        }
    }//GEN-LAST:event_VerInfoProductoActionPerformed

    private void menuModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificarProductoActionPerformed
        ModificarProducto MProd = ModificarProducto.getInstancia();
        if (MProd.isVisible()) {
            try {
                MProd.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.Escritorio.add(MProd);
            MProd.setVisible(true);
        }

    }//GEN-LAST:event_menuModificarProductoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        InfoOC OCI = InfoOC.getInstancia();
        if (OCI.isVisible()) {
            try {
                OCI.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.Escritorio.add(OCI);
            OCI.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void AltaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaCategoriaActionPerformed
        AltaCat ACat = AltaCat.getInstancia();
        if (ACat.isVisible()) {
            try {
                ACat.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.Escritorio.add(ACat);
            ACat.setVisible(true);
        }
    }//GEN-LAST:event_AltaCategoriaActionPerformed

    private void RegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarProductoActionPerformed
        ProdGroup API = ProdGroup.getInstancia();
        if (API.isVisible()) {
            try {
                API.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.Escritorio.add(API);
            API.setVisible(true);
        }
    }//GEN-LAST:event_RegistrarProductoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AltaCategoria;
    private javax.swing.JMenu ArchivoMenu;
    private javax.swing.JMenu ConsultarMenu;
    private javax.swing.JMenuItem CrearOrden;
    private javax.swing.JMenu EditarMenu;
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem RegistrarProducto;
    private javax.swing.JMenuItem RegistrarUsuario;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem VerInfoCliente;
    private javax.swing.JMenuItem VerInfoProducto;
    private javax.swing.JMenuItem VerInfoProveedor;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuModificarProducto;
    // End of variables declaration//GEN-END:variables
}
