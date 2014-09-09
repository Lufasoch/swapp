package Store;

import direct.market.datatype.DataUsuario;
import direct.market.factory.Factory;
import java.awt.Image;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lufasoch
 */
public final class InfoProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form InfoProveedor
     */
    public InfoProveedor() {
        initComponents();
        this.validate();
        String DirI = "Recursos/Perfil.jpg";
        PerfilLabel.setIcon(RZIma(DirI, 150, 150));
        Actualizar();
    }

    public ImageIcon RZIma(String DirRelativa, int Ancho, int Alto) {
        ImageIcon IcoIco = new ImageIcon(getClass().getResource(DirRelativa));
        Image img = IcoIco.getImage();
        Image newimg = img.getScaledInstance(Ancho, Alto, java.awt.Image.SCALE_SMOOTH);
        IcoIco = new ImageIcon(newimg);
        return IcoIco;
    }

    public void Actualizar() {
        limpiarCampos();
        //// Agregar imagen y cambiar tamaño de la foto del perfil ////        
        String DirI = "Recursos/Perfil.jpg";
        PerfilLabel.setIcon(RZIma(DirI, 150, 150));
        //// Se buscan los clientes
        //ABAJO//DATOS DEVUELTOS
        String data[][] = {};
        String header[] = new String[]{"Nickname", "eMail"};
        DefaultTableModel DTM2 = new DefaultTableModel(data, header) {
            boolean[] canEdit = new boolean[]{false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        ProveedorTable.getColumnModel().getColumn(0).setPreferredWidth(23);
        ProveedorTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        ProveedorTable.setModel(DTM2);
        List<DataUsuario> proveedores = Factory.getInstance().getUsuarioController().getProveedores();
        if (proveedores != null) {
            int p = proveedores.size();
            for (int i = 0; i < p; i++) {
                String datos[] = {proveedores.get(i).getNickname(), proveedores.get(i).getEmail()};
                DTM2.addRow(datos);
            }
        }
    }

    public void limpiarCampos() {
        TTipoUC.setText("");
        TNicknameP.setText("");
        TNombreP.setText("");
        TApellidoP.setText("");
        TeMailP.setText("");
        TFechaNacP.setText("");
        TCompaniaC.setText("");
        TPaginaWebC.setText("");
    }

    public static InfoProveedor getInstancia() {
        if (IPInstancia == null) {
            IPInstancia = new InfoProveedor();
        }
        return IPInstancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PPanel = new javax.swing.JPanel();
        PerfilLabel = new javax.swing.JLabel();
        InfoPanel = new javax.swing.JPanel();
        TNickname = new javax.swing.JTextField();
        TNicknameP = new javax.swing.JTextField();
        TeMail = new javax.swing.JTextField();
        TeMailP = new javax.swing.JTextField();
        TNombre = new javax.swing.JTextField();
        TNombreP = new javax.swing.JTextField();
        TApellido = new javax.swing.JTextField();
        TApellidoP = new javax.swing.JTextField();
        TFechaNac = new javax.swing.JTextField();
        TFechaNacP = new javax.swing.JTextField();
        TTipoU = new javax.swing.JTextField();
        TTipoUC = new javax.swing.JTextField();
        TCompania = new javax.swing.JTextField();
        TCompaniaC = new javax.swing.JTextField();
        TPaginaWeb = new javax.swing.JTextField();
        TPaginaWebC = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Actualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProveedorTable = new javax.swing.JTable();
        BackgroundLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                SeMuestraSeActualiza(evt);
            }
        });
        getContentPane().setLayout(null);

        PPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        PPanel.setLayout(null);

        PerfilLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/Perfil.jpg"))); // NOI18N
        PPanel.add(PerfilLabel);
        PerfilLabel.setBounds(10, 10, 150, 150);

        getContentPane().add(PPanel);
        PPanel.setBounds(580, 50, 170, 170);

        InfoPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        InfoPanel.setLayout(new java.awt.GridLayout(8, 2));

        TNickname.setEditable(false);
        TNickname.setBackground(new java.awt.Color(255, 255, 255));
        TNickname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TNickname.setText("Nickname");
        TNickname.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TNickname.setEnabled(false);
        InfoPanel.add(TNickname);

        TNicknameP.setEditable(false);
        TNicknameP.setBackground(new java.awt.Color(255, 255, 255));
        TNicknameP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TNicknameP.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TNicknameP.setEnabled(false);
        InfoPanel.add(TNicknameP);

        TeMail.setEditable(false);
        TeMail.setBackground(new java.awt.Color(255, 255, 255));
        TeMail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TeMail.setText("eMail");
        TeMail.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TeMail.setEnabled(false);
        InfoPanel.add(TeMail);

        TeMailP.setEditable(false);
        TeMailP.setBackground(new java.awt.Color(255, 255, 255));
        TeMailP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TeMailP.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TeMailP.setEnabled(false);
        InfoPanel.add(TeMailP);

        TNombre.setEditable(false);
        TNombre.setBackground(new java.awt.Color(255, 255, 255));
        TNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TNombre.setText("Nombre");
        TNombre.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TNombre.setEnabled(false);
        InfoPanel.add(TNombre);

        TNombreP.setEditable(false);
        TNombreP.setBackground(new java.awt.Color(255, 255, 255));
        TNombreP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TNombreP.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TNombreP.setEnabled(false);
        InfoPanel.add(TNombreP);

        TApellido.setEditable(false);
        TApellido.setBackground(new java.awt.Color(255, 255, 255));
        TApellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TApellido.setText("Apellido");
        TApellido.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TApellido.setEnabled(false);
        InfoPanel.add(TApellido);

        TApellidoP.setEditable(false);
        TApellidoP.setBackground(new java.awt.Color(255, 255, 255));
        TApellidoP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TApellidoP.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TApellidoP.setEnabled(false);
        InfoPanel.add(TApellidoP);

        TFechaNac.setEditable(false);
        TFechaNac.setBackground(new java.awt.Color(255, 255, 255));
        TFechaNac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TFechaNac.setText("Fecha de Nacimiento");
        TFechaNac.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TFechaNac.setEnabled(false);
        InfoPanel.add(TFechaNac);

        TFechaNacP.setEditable(false);
        TFechaNacP.setBackground(new java.awt.Color(255, 255, 255));
        TFechaNacP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TFechaNacP.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TFechaNacP.setEnabled(false);
        InfoPanel.add(TFechaNacP);

        TTipoU.setEditable(false);
        TTipoU.setBackground(new java.awt.Color(255, 255, 255));
        TTipoU.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TTipoU.setText("Tipo de Usuario");
        TTipoU.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TTipoU.setEnabled(false);
        InfoPanel.add(TTipoU);

        TTipoUC.setEditable(false);
        TTipoUC.setBackground(new java.awt.Color(255, 255, 255));
        TTipoUC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TTipoUC.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TTipoUC.setEnabled(false);
        InfoPanel.add(TTipoUC);

        TCompania.setEditable(false);
        TCompania.setBackground(new java.awt.Color(255, 255, 255));
        TCompania.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TCompania.setText("Compañía");
        TCompania.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TCompania.setEnabled(false);
        InfoPanel.add(TCompania);

        TCompaniaC.setEditable(false);
        TCompaniaC.setBackground(new java.awt.Color(255, 255, 255));
        TCompaniaC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TCompaniaC.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TCompaniaC.setEnabled(false);
        InfoPanel.add(TCompaniaC);

        TPaginaWeb.setEditable(false);
        TPaginaWeb.setBackground(new java.awt.Color(255, 255, 255));
        TPaginaWeb.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TPaginaWeb.setText("Pagina Web");
        TPaginaWeb.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TPaginaWeb.setEnabled(false);
        InfoPanel.add(TPaginaWeb);

        TPaginaWebC.setEditable(false);
        TPaginaWebC.setBackground(new java.awt.Color(255, 255, 255));
        TPaginaWebC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TPaginaWebC.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TPaginaWebC.setEnabled(false);
        InfoPanel.add(TPaginaWebC);

        getContentPane().add(InfoPanel);
        InfoPanel.setBounds(390, 240, 360, 280);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(Actualizar);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 470, 310, 50);

        jPanel2.setBackground(new java.awt.Color(214, 228, 237));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 0, 8));

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel2.add(Cerrar);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(390, 170, 180, 50);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(485, 500));

        ProveedorTable.setAutoCreateRowSorter(true);
        ProveedorTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ProveedorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nickname", "eMail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProveedorTable.setFillsViewportHeight(true);
        ProveedorTable.setPreferredSize(new java.awt.Dimension(330, 200));
        ProveedorTable.getTableHeader().setReorderingAllowed(false);
        ProveedorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProveedorTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 40, 310, 420);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/background.jpg"))); // NOI18N
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 800, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        Actualizar();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        Actualizar();
        IPInstancia = null;
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void SeMuestraSeActualiza(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SeMuestraSeActualiza
        Actualizar();
    }//GEN-LAST:event_SeMuestraSeActualiza

    private void ProveedorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveedorTableMouseClicked
        
        try {
            String nicknameP = ProveedorTable.getValueAt(ProveedorTable.getSelectedRow(), 0).toString();//NICKNAME PARA BUSCAR AL USUARIO
            DataUsuario du = Factory.getInstance().getUsuarioController().getDataProveedor(nicknameP);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            //ARRIBA//DATOS DEVUELTOS
            //ABAJO//IMPRIMIR DATOS
            TNicknameP.setText(du.getNickname());
            TeMailP.setText(du.getEmail());
            TNombreP.setText(du.getNombre());
            TApellidoP.setText(du.getApellido());
            TFechaNacP.setText(sdf.format(du.getFechaNacimiento()));
            TTipoUC.setText("Proveedor");
            TCompaniaC.setText(du.getCompania());
            TPaginaWebC.setText(du.getWebLink());
            //PerfilLabel.setIcon(RZIma(du.getImagen(), 150, 150));
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(du.getImagen()));
            PerfilLabel.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(PerfilLabel.getWidth(), -1, Image.SCALE_AREA_AVERAGING)));
            PerfilLabel.repaint();
            //ARRIBA//IMPRIMIR DATOS
        } catch (IndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Proveedor de la lista", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_ProveedorTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JButton Cerrar;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JPanel PPanel;
    private javax.swing.JLabel PerfilLabel;
    private javax.swing.JTable ProveedorTable;
    private javax.swing.JTextField TApellido;
    private javax.swing.JTextField TApellidoP;
    private javax.swing.JTextField TCompania;
    private javax.swing.JTextField TCompaniaC;
    private javax.swing.JTextField TFechaNac;
    private javax.swing.JTextField TFechaNacP;
    private javax.swing.JTextField TNickname;
    private javax.swing.JTextField TNicknameP;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTextField TNombreP;
    private javax.swing.JTextField TPaginaWeb;
    private javax.swing.JTextField TPaginaWebC;
    private javax.swing.JTextField TTipoU;
    private javax.swing.JTextField TTipoUC;
    private javax.swing.JTextField TeMail;
    private javax.swing.JTextField TeMailP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private static InfoProveedor IPInstancia;
}
