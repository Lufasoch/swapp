/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

//import direct.market.controller.IUsuarioController;
import direct.market.datatype.DataEstadoOC;
import direct.market.datatype.DataLineaOC;
import direct.market.datatype.DataOC;
import direct.market.datatype.DataUsuario;
import direct.market.exceptions.UsuarioException;
import direct.market.factory.Factory;
import java.awt.Image;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Lufasoch
 */
public final class InfoCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form InfoCliente
     */
    public InfoCliente() {
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

    public static InfoCliente getInstancia() {
        if (ICInstancia == null) {
            ICInstancia = new InfoCliente();
        }
        return ICInstancia;
    }

    public void Actualizar() {
        limpiarCampos();
        //// Agregar imagen y cambiar tamaño de la foto del perfil ////        
        String DirI = "Recursos/Perfil.jpg";
        PerfilLabel.setIcon(RZIma(DirI, 150, 150));
        //// Se buscan los clientes
        //ABAJO//DATOS DEVUELTOS

        DefaultTableModel vacio = new DefaultTableModel(0, 0);
        String header2[] = new String[]{"No. Orden", "Estado", "Fecha"};
        vacio.setColumnIdentifiers(header2);
        OrdenesTable.setModel(vacio);

        String data[][] = {};
        String header[] = new String[]{"Nickname", "eMail"};
        DefaultTableModel DTM2 = new DefaultTableModel(data, header) {
            boolean[] canEdit = new boolean[]{false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        ClientesTable.getColumnModel().getColumn(0).setPreferredWidth(23);
        ClientesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        ClientesTable.setModel(DTM2);
        List<DataUsuario> clientes = Factory.getInstance().getUsuarioController().getClientes();
        if (clientes != null) {
            int c = clientes.size();
            for (int i = 0; i < c; i++) {
                String datos[] = {clientes.get(i).getNickname(), clientes.get(i).getEmail()};
                DTM2.addRow(datos);
            }
        }
    }

    public void limpiarCampos() {
        TTipoUC.setText("");
        TNicknameC.setText("");
        TNombreC.setText("");
        TApellidoC.setText("");
        TeMailC.setText("");
        TFechaNacC.setText("");
        // PerfilLabel.setIcon(RZIma("Recursos/Perfil.jpg",150,150));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VerOCF = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrdenInfoTable = new javax.swing.JTable();
        PTotales = new javax.swing.JPanel();
        TxtTotal = new javax.swing.JTextField();
        TxtTotalVal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Cerrar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TPanel = new javax.swing.JPanel();
        jScrollVerClientes = new javax.swing.JScrollPane();
        ClientesTable = new javax.swing.JTable();
        PPanel = new javax.swing.JPanel();
        PerfilLabel = new javax.swing.JLabel();
        InfoPanel = new javax.swing.JPanel();
        TNickname = new javax.swing.JTextField();
        TNicknameC = new javax.swing.JTextField();
        TeMail = new javax.swing.JTextField();
        TeMailC = new javax.swing.JTextField();
        TNombre = new javax.swing.JTextField();
        TNombreC = new javax.swing.JTextField();
        TApellido = new javax.swing.JTextField();
        TApellidoC = new javax.swing.JTextField();
        TFechaNac = new javax.swing.JTextField();
        TFechaNacC = new javax.swing.JTextField();
        TTipoU = new javax.swing.JTextField();
        TTipoUC = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        ActualizarButton = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrdenesTable = new javax.swing.JTable();
        BackgroundLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        getContentPane().setLayout(null);

        VerOCF.setFocusable(false);
        VerOCF.setVisible(false);
        VerOCF.getContentPane().setLayout(null);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N

        OrdenInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio unitario", "Cantidad", "Sub-Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(OrdenInfoTable);

        VerOCF.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 520, 400);

        PTotales.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        PTotales.setLayout(new java.awt.GridLayout(1, 3, 8, 0));

        TxtTotal.setEditable(false);
        TxtTotal.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        TxtTotal.setText("Total");
        TxtTotal.setFocusable(false);
        PTotales.add(TxtTotal);

        TxtTotalVal.setEditable(false);
        TxtTotalVal.setBackground(new java.awt.Color(254, 254, 254));
        TxtTotalVal.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        TxtTotalVal.setForeground(new java.awt.Color(1, 1, 1));
        TxtTotalVal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTotalVal.setText("Total");
        TxtTotalVal.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TxtTotalVal.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TxtTotalVal.setEnabled(false);
        TxtTotalVal.setFocusable(false);
        PTotales.add(TxtTotalVal);

        VerOCF.getContentPane().add(PTotales);
        PTotales.setBounds(210, 390, 310, 50);

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        Cerrar1.setText("Cerrar");
        Cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar1ActionPerformed(evt);
            }
        });
        jPanel3.add(Cerrar1);

        VerOCF.getContentPane().add(jPanel3);
        jPanel3.setBounds(340, 450, 170, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/background.jpg"))); // NOI18N
        VerOCF.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 510);

        getContentPane().add(VerOCF);
        VerOCF.setBounds(30, 0, 530, 540);

        TPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N

        jScrollVerClientes.setPreferredSize(new java.awt.Dimension(330, 410));

        ClientesTable.setAutoCreateRowSorter(true);
        ClientesTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ClientesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ClientesTable.setFillsViewportHeight(true);
        ClientesTable.setPreferredSize(new java.awt.Dimension(330, 200));
        ClientesTable.getTableHeader().setReorderingAllowed(false);
        ClientesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientesTableMouseClicked(evt);
            }
        });
        jScrollVerClientes.setViewportView(ClientesTable);
        ClientesTable.getColumnModel().getColumn(1).setHeaderValue("eMail");
        ClientesTable.getAccessibleContext().setAccessibleParent(jScrollVerClientes);

        javax.swing.GroupLayout TPanelLayout = new javax.swing.GroupLayout(TPanel);
        TPanel.setLayout(TPanelLayout);
        TPanelLayout.setHorizontalGroup(
            TPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollVerClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );
        TPanelLayout.setVerticalGroup(
            TPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollVerClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        getContentPane().add(TPanel);
        TPanel.setBounds(10, 190, 340, 360);

        PPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        PPanel.setLayout(null);

        PerfilLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/Perfil.jpg"))); // NOI18N
        PerfilLabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                SeMuestraSeActualiza(evt);
            }
        });
        PPanel.add(PerfilLabel);
        PerfilLabel.setBounds(10, 10, 150, 150);

        getContentPane().add(PPanel);
        PPanel.setBounds(100, 10, 170, 170);

        InfoPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        InfoPanel.setLayout(new java.awt.GridLayout(6, 2));

        TNickname.setEditable(false);
        TNickname.setBackground(new java.awt.Color(255, 255, 255));
        TNickname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TNickname.setText("Nickname");
        TNickname.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TNickname.setEnabled(false);
        InfoPanel.add(TNickname);

        TNicknameC.setEditable(false);
        TNicknameC.setBackground(new java.awt.Color(255, 255, 255));
        TNicknameC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TNicknameC.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TNicknameC.setEnabled(false);
        InfoPanel.add(TNicknameC);

        TeMail.setEditable(false);
        TeMail.setBackground(new java.awt.Color(255, 255, 255));
        TeMail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TeMail.setText("eMail");
        TeMail.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TeMail.setEnabled(false);
        InfoPanel.add(TeMail);

        TeMailC.setEditable(false);
        TeMailC.setBackground(new java.awt.Color(255, 255, 255));
        TeMailC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TeMailC.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TeMailC.setEnabled(false);
        InfoPanel.add(TeMailC);

        TNombre.setEditable(false);
        TNombre.setBackground(new java.awt.Color(255, 255, 255));
        TNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TNombre.setText("Nombre");
        TNombre.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TNombre.setEnabled(false);
        InfoPanel.add(TNombre);

        TNombreC.setEditable(false);
        TNombreC.setBackground(new java.awt.Color(255, 255, 255));
        TNombreC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TNombreC.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TNombreC.setEnabled(false);
        InfoPanel.add(TNombreC);

        TApellido.setEditable(false);
        TApellido.setBackground(new java.awt.Color(255, 255, 255));
        TApellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TApellido.setText("Apellido");
        TApellido.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TApellido.setEnabled(false);
        InfoPanel.add(TApellido);

        TApellidoC.setEditable(false);
        TApellidoC.setBackground(new java.awt.Color(255, 255, 255));
        TApellidoC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TApellidoC.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TApellidoC.setEnabled(false);
        InfoPanel.add(TApellidoC);

        TFechaNac.setEditable(false);
        TFechaNac.setBackground(new java.awt.Color(255, 255, 255));
        TFechaNac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TFechaNac.setText("Fecha de Nacimiento");
        TFechaNac.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TFechaNac.setEnabled(false);
        InfoPanel.add(TFechaNac);

        TFechaNacC.setEditable(false);
        TFechaNacC.setBackground(new java.awt.Color(255, 255, 255));
        TFechaNacC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TFechaNacC.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TFechaNacC.setEnabled(false);
        InfoPanel.add(TFechaNacC);

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

        getContentPane().add(InfoPanel);
        InfoPanel.setBounds(360, 10, 420, 220);

        jPanel1.setBackground(new java.awt.Color(214, 228, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 8, 0));

        ActualizarButton.setText("Actualizar Clientes");
        ActualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ActualizarButton);

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(Cerrar);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(360, 500, 420, 50);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N

        OrdenesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nro Orden", "Estado", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrdenesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrdenesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OrdenesTable);
        OrdenesTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        OrdenesTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        OrdenesTable.getColumnModel().getColumn(2).setPreferredWidth(50);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 240, 420, 250);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/background.jpg"))); // NOI18N
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 800, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desabilitar() {
        TPanel.setVisible(false);
        jScrollPane1.setVisible(false);
        PPanel.setVisible(false);
        jPanel1.setVisible(false);
        InfoPanel.setVisible(false);
    }

    private void habilitar() {
        TPanel.setVisible(true);
        jScrollPane1.setVisible(true);
        PPanel.setVisible(true);
        jPanel1.setVisible(true);
        InfoPanel.setVisible(true);
    }

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        Actualizar();
        ICInstancia = null;
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void ActualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarButtonActionPerformed
        Actualizar();
    }//GEN-LAST:event_ActualizarButtonActionPerformed

    private void SeMuestraSeActualiza(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SeMuestraSeActualiza
        Actualizar();
    }//GEN-LAST:event_SeMuestraSeActualiza

    private void Cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar1ActionPerformed
        habilitar();
        DefaultTableModel vacio = new DefaultTableModel(0, 0);
        OrdenInfoTable.setModel(vacio);
        VerOCF.setVisible(false);
    }//GEN-LAST:event_Cerrar1ActionPerformed

    private void ClientesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesTableMouseClicked

        try {
            String nicknameP = ClientesTable.getValueAt(ClientesTable.getSelectedRow(), 0).toString();
            DataUsuario du = Factory.getInstance().getUsuarioController().getDataCliente(nicknameP);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            //ABAJO//IMPRIMIR DATOS
            TNicknameC.setText(du.getNickname());
            TeMailC.setText(du.getEmail());
            TNombreC.setText(du.getNombre());
            TApellidoC.setText(du.getApellido());
            TFechaNacC.setText(sdf.format(du.getFechaNacimiento()));
            TTipoUC.setText("Cliente");
            ImageIcon imageIcon = new ImageIcon(du.getImagen());
            PerfilLabel.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(PerfilLabel.getWidth(), -1, Image.SCALE_AREA_AVERAGING)));
            PerfilLabel.repaint();
            //ABAJO//CAMBIAR MODELO DE LA TABLA
            DefaultTableModel DTM = new DefaultTableModel() {
                boolean[] canEdit = new boolean[]{false};

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            String header[] = new String[]{"No. Orden", "Estado", "Fecha"};
            DTM.setColumnIdentifiers(header);
            OrdenesTable.setModel(DTM);
            OrdenesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            //ARRIBA//CAMBIAR MODELO DE LA TABLA
            if (du != null) {
                int lc = du.getListaCompras().size();
                int leS;
                for (int i = 0; i < lc; i++) {
                    List<DataEstadoOC> dae = du.getListaCompras().get(i).getEstados();
                    leS = dae.size() - 1;
//                    Integer datos[] = {du.getListaCompras().get(i).getNumero()};
//                    DTM.addRow(datos, dae.get(leS).getEstado());
                    DTM.addRow(new Object[]{du.getListaCompras().get(i).getNumero(), dae.get(leS).getEstado(), sdf.format(dae.get(leS).getFecha().getTime())});
                }
                TableColumn column;
                for (int i = 0; i < 3; i++) {
                    column = OrdenesTable.getColumnModel().getColumn(i);
                    if (i == 1) {
                        column.setPreferredWidth(100); 
                    } else {
                        column.setPreferredWidth(50);
                    }
                }
            }

        } catch (IndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente", "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (UsuarioException ex) {
            Logger.getLogger(InfoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ClientesTableMouseClicked

    private void OrdenesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdenesTableMouseClicked

        try {
            desabilitar();
            VerOCF.setVisible(true);

            String nroCompRow = OrdenesTable.getValueAt(OrdenesTable.getSelectedRow(), 0).toString();
            DataOC doc = Factory.getInstance().getOrdenCompraController().getDataOC(nroCompRow);


            DefaultTableModel DTM2 = new DefaultTableModel() {
                boolean[] canEdit = new boolean[]{false, false, false, false};

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            String header[] = new String[]{"Nombre", "Precio U.", "Cantidad", "Sub total"};
            DTM2.setColumnIdentifiers(header);
            OrdenInfoTable.setModel(DTM2);
            OrdenInfoTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            OrdenInfoTable.getColumnModel().getColumn(1).setPreferredWidth(200);

            for (DataLineaOC dlo : doc.getLineas()) {
                DTM2.addRow(new Object[]{dlo.getProducto().getNombre(), dlo.getProducto().getDataEspecificacion().getPrecio(), dlo.getCantidad(), dlo.getTotalLinea()});
            }
            TxtTotalVal.setText(Double.valueOf(doc.getPrecio_total()).toString());
        } catch (IndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una orden de compra", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_OrdenesTableMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarButton;
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Cerrar1;
    private javax.swing.JTable ClientesTable;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JTable OrdenInfoTable;
    private javax.swing.JTable OrdenesTable;
    private javax.swing.JPanel PPanel;
    private javax.swing.JPanel PTotales;
    private javax.swing.JLabel PerfilLabel;
    private javax.swing.JTextField TApellido;
    private javax.swing.JTextField TApellidoC;
    private javax.swing.JTextField TFechaNac;
    private javax.swing.JTextField TFechaNacC;
    private javax.swing.JTextField TNickname;
    private javax.swing.JTextField TNicknameC;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTextField TNombreC;
    private javax.swing.JPanel TPanel;
    private javax.swing.JTextField TTipoU;
    private javax.swing.JTextField TTipoUC;
    private javax.swing.JTextField TeMail;
    private javax.swing.JTextField TeMailC;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JTextField TxtTotalVal;
    private javax.swing.JInternalFrame VerOCF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollVerClientes;
    // End of variables declaration//GEN-END:variables
    private static InfoCliente ICInstancia;
}
