/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import Icon.MyIcon;
import direct.market.datatype.DataCategoria;
import direct.market.datatype.DataLineaOC;
import direct.market.datatype.DataOC;
import direct.market.datatype.DataProducto;
import direct.market.datatype.DataUsuario;
import javax.swing.table.DefaultTableModel;
import direct.market.exceptions.CategoryException;
import direct.market.exceptions.OCException;
import direct.market.exceptions.ProductoException;
import direct.market.exceptions.UsuarioException;
import direct.market.factory.Factory;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author jpmc21891
 */
public class GenerarOC extends javax.swing.JInternalFrame {

    public int cont = 0;
    Date fechaOC = new Date();
    DefaultTableModel vacio = new DefaultTableModel(0, 0);
    double totalOC;

    /**
     * Creates new form GenerarOC
     */
    public static GenerarOC getInstancia() {
        if (IGenerarOC == null) {
            IGenerarOC = new GenerarOC();
        }
        return IGenerarOC;
    }

    public DefaultMutableTreeNode searchNode(String nodeStr) {
        DefaultTreeModel modelito = (DefaultTreeModel) treeCategoria.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelito.getRoot();

        DefaultMutableTreeNode node = null;
        Enumeration e = raiz.breadthFirstEnumeration();
        while (e.hasMoreElements()) {
            node = (DefaultMutableTreeNode) e.nextElement();
            if (nodeStr.equals(node.getUserObject().toString())) {
                return node;
            }
        }
        return null;
    }

    public GenerarOC() {
        initComponents();
        this.validate();
        DefaultTableModel modelo = new DefaultTableModel() {
            boolean[] canEdit = new boolean[]{false, false, true, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };


        String header[] = new String[]{"Código", "Nombre", "Cantidad", "Precio Unitario", "Total Linea"};
        modelo.setColumnIdentifiers(header);
        TArticulos.setModel(modelo);
        SelCliente.setVisible(false);
        SelArticulo.setVisible(false);
        Actualizar();
        cargarCategorias();
        GenOC.setVisible(true);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtFecha.setText(sdf.format(fechaOC));



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelCliente = new javax.swing.JInternalFrame();
        SelCliTPanel = new javax.swing.JPanel();
        jScrollVerClientes = new javax.swing.JScrollPane();
        TCliente = new javax.swing.JTable();
        SelCliBtnPanel = new javax.swing.JPanel();
        BtnSelCli_Seleccionar = new javax.swing.JButton();
        BtnSelCli_Actualizar = new javax.swing.JButton();
        BtnSelCli_Cancelar = new javax.swing.JButton();
        SelArticulo = new javax.swing.JInternalFrame();
        panelCategoria = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeCategoria = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        btnSelArt_Seleccionar = new javax.swing.JButton();
        lblcantidad = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        btnSelArt_Cancelar = new javax.swing.JButton();
        GenOC = new javax.swing.JInternalFrame();
        PCabezal = new javax.swing.JPanel();
        TxtCliente = new javax.swing.JTextField();
        btn_selCli = new javax.swing.JButton();
        txtemaildsp = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtnickname = new javax.swing.JTextField();
        txtNomAp = new javax.swing.JTextField();
        txtnicknamedsp = new javax.swing.JTextField();
        SPArticulos = new javax.swing.JScrollPane();
        TArticulos = new javax.swing.JTable();
        PBotones1 = new javax.swing.JPanel();
        Btn_Aceptar1 = new javax.swing.JButton();
        Btn_Cancelar1 = new javax.swing.JButton();
        PAddProducto = new javax.swing.JPanel();
        Btn_AddProd = new javax.swing.JButton();
        PFecha = new javax.swing.JPanel();
        lblFecha = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        PTotales = new javax.swing.JPanel();
        TxtTotal = new javax.swing.JTextField();
        TxtTotalVal = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        NroOCtext = new javax.swing.JTextField();
        BackgroundLabel = new javax.swing.JLabel();

        setTitle("Orden de Compra");
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        SelCliente.setTitle("Seleccionar Cliente");
        SelCliente.setVisible(true);

        SelCliTPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N

        jScrollVerClientes.setPreferredSize(new java.awt.Dimension(330, 410));

        TCliente.setAutoCreateRowSorter(true);
        TCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        TCliente.setFillsViewportHeight(true);
        TCliente.setPreferredSize(new java.awt.Dimension(330, 200));
        TCliente.getTableHeader().setReorderingAllowed(false);
        jScrollVerClientes.setViewportView(TCliente);

        javax.swing.GroupLayout SelCliTPanelLayout = new javax.swing.GroupLayout(SelCliTPanel);
        SelCliTPanel.setLayout(SelCliTPanelLayout);
        SelCliTPanelLayout.setHorizontalGroup(
            SelCliTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollVerClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        SelCliTPanelLayout.setVerticalGroup(
            SelCliTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollVerClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        SelCliente.getContentPane().add(SelCliTPanel, java.awt.BorderLayout.PAGE_START);

        SelCliBtnPanel.setBackground(new java.awt.Color(214, 228, 237));
        SelCliBtnPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        SelCliBtnPanel.setLayout(new java.awt.GridLayout(1, 4, 8, 0));

        BtnSelCli_Seleccionar.setText("Seleccionar");
        BtnSelCli_Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelCli_SeleccionarActionPerformed(evt);
            }
        });
        SelCliBtnPanel.add(BtnSelCli_Seleccionar);

        BtnSelCli_Actualizar.setText("Actualizar");
        BtnSelCli_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelCli_ActualizarActionPerformed(evt);
            }
        });
        SelCliBtnPanel.add(BtnSelCli_Actualizar);

        BtnSelCli_Cancelar.setText("Cerrar");
        BtnSelCli_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelCli_CancelarActionPerformed(evt);
            }
        });
        SelCliBtnPanel.add(BtnSelCli_Cancelar);

        SelCliente.getContentPane().add(SelCliBtnPanel, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(SelCliente);
        SelCliente.setBounds(0, -20, 329, 564);

        SelArticulo.setTitle("Seleccionar Artículo");
        SelArticulo.setPreferredSize(new java.awt.Dimension(324, 470));
        SelArticulo.setVisible(true);

        panelCategoria.setBackground(new java.awt.Color(214, 228, 237));
        panelCategoria.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Categorias");
        treeCategoria.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(treeCategoria);

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );

        SelArticulo.getContentPane().add(panelCategoria, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(214, 228, 237));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 8, 0));

        btnSelArt_Seleccionar.setText("Seleccionar");
        btnSelArt_Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelArt_SeleccionarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSelArt_Seleccionar);

        lblcantidad.setEditable(false);
        lblcantidad.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblcantidad.setText("Cantidad");
        lblcantidad.setEnabled(false);
        lblcantidad.setFocusable(false);
        jPanel2.add(lblcantidad);
        jPanel2.add(txtcantidad);

        btnSelArt_Cancelar.setText("Cancelar");
        btnSelArt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelArt_CancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSelArt_Cancelar);

        SelArticulo.getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(SelArticulo);
        SelArticulo.setBounds(0, 0, 510, 470);

        GenOC.setEnabled(false);
        GenOC.setMinimumSize(new java.awt.Dimension(800, 600));
        GenOC.setPreferredSize(new java.awt.Dimension(800, 600));
        GenOC.setVisible(true);
        GenOC.getContentPane().setLayout(null);

        PCabezal.setBackground(new java.awt.Color(214, 228, 237));
        PCabezal.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        PCabezal.setLayout(null);

        TxtCliente.setEditable(false);
        TxtCliente.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        TxtCliente.setText("Cliente");
        TxtCliente.setEnabled(false);
        TxtCliente.setFocusable(false);
        PCabezal.add(TxtCliente);
        TxtCliente.setBounds(10, 10, 90, 30);

        btn_selCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/Botones/image15.png"))); // NOI18N
        btn_selCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selCliActionPerformed(evt);
            }
        });
        PCabezal.add(btn_selCli);
        btn_selCli.setBounds(100, 10, 27, 26);

        txtemaildsp.setEditable(false);
        txtemaildsp.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtemaildsp.setForeground(new java.awt.Color(1, 1, 1));
        txtemaildsp.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtemaildsp.setFocusable(false);
        PCabezal.add(txtemaildsp);
        txtemaildsp.setBounds(420, 40, 330, 30);

        txtemail.setEditable(false);
        txtemail.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtemail.setText("Email");
        txtemail.setEnabled(false);
        txtemail.setFocusable(false);
        PCabezal.add(txtemail);
        txtemail.setBounds(370, 40, 50, 30);

        txtnickname.setEditable(false);
        txtnickname.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtnickname.setText("NickName");
        txtnickname.setEnabled(false);
        txtnickname.setFocusable(false);
        PCabezal.add(txtnickname);
        txtnickname.setBounds(10, 40, 90, 30);

        txtNomAp.setEditable(false);
        txtNomAp.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtNomAp.setForeground(new java.awt.Color(1, 1, 1));
        txtNomAp.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtNomAp.setFocusable(false);
        PCabezal.add(txtNomAp);
        txtNomAp.setBounds(130, 10, 620, 30);

        txtnicknamedsp.setEditable(false);
        txtnicknamedsp.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtnicknamedsp.setForeground(new java.awt.Color(1, 1, 1));
        txtnicknamedsp.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtnicknamedsp.setFocusable(false);
        PCabezal.add(txtnicknamedsp);
        txtnicknamedsp.setBounds(100, 40, 270, 30);

        GenOC.getContentPane().add(PCabezal);
        PCabezal.setBounds(10, 70, 760, 80);

        SPArticulos.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N

        TArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        SPArticulos.setViewportView(TArticulos);

        GenOC.getContentPane().add(SPArticulos);
        SPArticulos.setBounds(10, 160, 760, 240);

        PBotones1.setBackground(new java.awt.Color(214, 228, 237));
        PBotones1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        PBotones1.setLayout(new java.awt.GridLayout(1, 2, 8, 8));

        Btn_Aceptar1.setText("Aceptar");
        Btn_Aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Aceptar1ActionPerformed(evt);
            }
        });
        PBotones1.add(Btn_Aceptar1);

        Btn_Cancelar1.setText("Cancelar");
        Btn_Cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Cancelar1ActionPerformed(evt);
            }
        });
        PBotones1.add(Btn_Cancelar1);

        GenOC.getContentPane().add(PBotones1);
        PBotones1.setBounds(390, 500, 380, 50);

        PAddProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        PAddProducto.setLayout(new java.awt.GridLayout(1, 2));

        Btn_AddProd.setText("Añadir Producto");
        Btn_AddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AddProdActionPerformed(evt);
            }
        });
        PAddProducto.add(Btn_AddProd);

        GenOC.getContentPane().add(PAddProducto);
        PAddProducto.setBounds(10, 410, 160, 50);

        PFecha.setBackground(new java.awt.Color(214, 228, 237));
        PFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        PFecha.setLayout(null);

        lblFecha.setEditable(false);
        lblFecha.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblFecha.setText("Fecha");
        lblFecha.setEnabled(false);
        lblFecha.setFocusable(false);
        PFecha.add(lblFecha);
        lblFecha.setBounds(8, 8, 90, 34);

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(1, 1, 1));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtFecha.setFocusable(false);
        PFecha.add(txtFecha);
        txtFecha.setBounds(112, 8, 170, 34);

        GenOC.getContentPane().add(PFecha);
        PFecha.setBounds(480, 10, 290, 50);

        PTotales.setBackground(new java.awt.Color(214, 228, 237));
        PTotales.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        PTotales.setLayout(new java.awt.GridLayout(1, 2, 8, 8));

        TxtTotal.setEditable(false);
        TxtTotal.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        TxtTotal.setText("Total");
        TxtTotal.setEnabled(false);
        TxtTotal.setFocusable(false);
        PTotales.add(TxtTotal);

        TxtTotalVal.setEditable(false);
        TxtTotalVal.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        TxtTotalVal.setForeground(new java.awt.Color(1, 1, 1));
        TxtTotalVal.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TxtTotalVal.setFocusable(false);
        PTotales.add(TxtTotalVal);

        GenOC.getContentPane().add(PTotales);
        PTotales.setBounds(430, 410, 340, 50);

        jPanel1.setBackground(new java.awt.Color(214, 228, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel1.setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Nro. Orden");
        jTextField1.setEnabled(false);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(8, 8, 110, 34);

        NroOCtext.setEditable(false);
        NroOCtext.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        NroOCtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(NroOCtext);
        NroOCtext.setBounds(132, 8, 140, 34);

        GenOC.getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 280, 50);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/background.jpg"))); // NOI18N
        GenOC.getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 800, 570);

        getContentPane().add(GenOC);
        GenOC.setBounds(0, -20, 790, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AddProdActionPerformed
        // TODO add your handling code here:

        SelArticulo.setVisible(true);
        Btn_AddProd.setVisible(false);
        HabilitarGenOC(false);

    }//GEN-LAST:event_Btn_AddProdActionPerformed

    private void Btn_Cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Cancelar1ActionPerformed
        // TODO add your handling code here:

        TArticulos.setModel(vacio);
        txtemaildsp.setText("");
        txtnicknamedsp.setText("");
        txtNomAp.setText("");
        TxtTotalVal.setText("");
        txtFecha.setText("");
        HabilitarGenOC(true);
        Btn_Cancelar1.setText("Cancelar");
        IGenerarOC = null;
        this.dispose();
    }//GEN-LAST:event_Btn_Cancelar1ActionPerformed

    private void btn_selCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selCliActionPerformed
        // TODO add your handling code here:
        SelCliente.setVisible(true);
        SelCliente.toFront();
        btn_selCli.setVisible(false);
        HabilitarGenOC(false);

    }//GEN-LAST:event_btn_selCliActionPerformed

    private void BtnSelCli_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelCli_ActualizarActionPerformed
        Actualizar();
    }//GEN-LAST:event_BtnSelCli_ActualizarActionPerformed

    private void BtnSelCli_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelCli_CancelarActionPerformed

        SelCliente.setVisible(false);
        btn_selCli.setVisible(true);
        HabilitarGenOC(true);
    }//GEN-LAST:event_BtnSelCli_CancelarActionPerformed

    private void btnSelArt_SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelArt_SeleccionarActionPerformed

        try {
            DefaultTreeModel tc = (DefaultTreeModel) treeCategoria.getModel();
            DefaultMutableTreeNode seleccionado = (DefaultMutableTreeNode) treeCategoria.getLastSelectedPathComponent();
            if (seleccionado != null) {
                if ((seleccionado.isLeaf() && (!"Vacía".equals(seleccionado.getUserObject().toString())))) {
                    DataProducto dp = Factory.getInstance().getProductoController().buscarProductoPorName(seleccionado.getUserObject().toString());
                    DefaultTableModel ta = (DefaultTableModel) TArticulos.getModel();
                    if (txtcantidad.getText().isEmpty()) {
                        throw new OCException("El campo cantidad no puede ser vacio");
                    }
                    if (!isNumeric(txtcantidad.getText())) {
                        throw new OCException("El campo cantidad debe ser numerico.");
                    }
                    int cantidad = Integer.parseInt(txtcantidad.getText());
                    if (cantidad == 0) {
                        throw new OCException("La cantidad debe ser mayor a 0.");
                    }
                    double preciounitario = dp.getDataEspecificacion().getPrecio();
                    double totallinea = cantidad * preciounitario;
                    Object linea[] = {dp.getReferencia(), dp.getNombre(), cantidad, preciounitario, totallinea};
                    totalOC = totalOC + totallinea;
                    Redondear(totalOC);
                    TxtTotalVal.setText(Double.valueOf(totalOC).toString());

                    ta.addRow(linea);
                    TArticulos.setModel(ta);
                    SelArticulo.setVisible(false);
                    Btn_AddProd.setVisible(true);
                    HabilitarGenOC(true);
                } else {
                    throw new CategoryException("No ha seleccionado ningún producto.");
                }
            } else {
                throw new CategoryException("No ha seleccionado ningún producto.");
            }
        } catch (CategoryException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (ProductoException ex) {
            Logger.getLogger(GenerarOC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (OCException oc) {
            JOptionPane.showMessageDialog(this, oc.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }



    }//GEN-LAST:event_btnSelArt_SeleccionarActionPerformed

    private void btnSelArt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelArt_CancelarActionPerformed
        SelArticulo.setVisible(false);
        Btn_AddProd.setVisible(true);
        HabilitarGenOC(true);
    }//GEN-LAST:event_btnSelArt_CancelarActionPerformed

    private void Btn_Aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Aceptar1ActionPerformed
        // TODO add your handling code here:
        try {
            if (txtNomAp.getText().isEmpty()) {
                throw new OCException("Debe seleccionar un cliente.");
            }
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy '-' HH:mm");
            int numOC = 0;
            DataOC doc = new DataOC(numOC, fechaOC, Redondear(totalOC));
            DefaultTableModel ta = (DefaultTableModel) TArticulos.getModel();
            List<DataLineaOC> lineas = new ArrayList<DataLineaOC>();
            int max = ta.getRowCount();
            if (max <= 0) {
                throw new OCException("No existen articulos en la Orden de Compra");
            }

            for (int i = 0; i < max; i++) {
                int cantidad = (Integer) ta.getValueAt(i, 2);
                DataLineaOC dl = new DataLineaOC(cantidad, Factory.getInstance().getProductoController().buscarProductoPorName(ta.getValueAt(i, 1).toString()));
                lineas.add(dl);
            }
            doc.setLineas(lineas);
            numOC = Factory.getInstance().getOrdenCompraController().altaOrdenCompra(doc);
            String msg = "OC Número " + numOC + " creada correctamente";
            MyIcon icon = new MyIcon();
            JOptionPane.showMessageDialog(this, msg, "Correcto", JOptionPane.DEFAULT_OPTION, icon);
            //JOptionPane.showMessageDialog(this, msg, "Correcto", JOptionPane.INFORMATION_MESSAGE);
            HabilitarGenOC(false);
            NroOCtext.setText(Integer.valueOf(numOC).toString());
            txtFecha.setText(sdf1.format(fechaOC));
            Btn_Cancelar1.setText("Cerrar");
            Btn_Cancelar1.setEnabled(true);
            //DataOC dataOrdenCompra = Factory.getInstance().getOrdenCompraController().getDataOC(Integer.valueOf(numOC).toString());
            DataUsuario dataUsuario = Factory.getInstance().getUsuarioController().getDataCliente((String) TCliente.getValueAt(TCliente.getSelectedRow(), 0));
            //dataUsuario.addDataOrdenCompra(dataOrdenCompra);
            Factory.getInstance().getUsuarioController().modificarCliente(dataUsuario, numOC);

        } catch (OCException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atencion", JOptionPane.WARNING_MESSAGE);
        } catch (ProductoException ex) {
            Logger.getLogger(GenerarOC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UsuarioException exu) {
            Logger.getLogger(GenerarOC.class.getName()).log(Level.SEVERE, null, exu);
        }




    }//GEN-LAST:event_Btn_Aceptar1ActionPerformed

    private void BtnSelCli_SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelCli_SeleccionarActionPerformed
        
        try {
            String nick = (String) TCliente.getValueAt(TCliente.getSelectedRow(), 0);
            DataUsuario dc = Factory.getInstance().getUsuarioController().getDataCliente(nick);
            txtNomAp.setText((dc.getApellido() + ", " + dc.getNombre()));
            txtnicknamedsp.setText(dc.getNickname());
            txtemaildsp.setText(dc.getEmail());
//            TCliente.setModel(vacio);
            SelCliente.setVisible(false);
            HabilitarGenOC(true);
        } catch (IndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una orden de compra", "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (UsuarioException ex) {
            Logger.getLogger(GenerarOC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BtnSelCli_SeleccionarActionPerformed
//    public static boolean isNumeric(String str) {
//        return str.matches("-?\\d+(\\.\\d+)?");
//    }

    private boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private void Actualizar() {

        String data[][] = {};
        String header[] = new String[]{"Nickname", "eMail"};
        DefaultTableModel DTM2 = new DefaultTableModel(data, header) {
            boolean[] canEdit = new boolean[]{false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        TCliente.getColumnModel().getColumn(0).setPreferredWidth(23);
        TCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        TCliente.setModel(DTM2);
        List<DataUsuario> clientes = Factory.getInstance().getUsuarioController().getClientes();

        int c = clientes.size();
        for (int i = 0; i < c; i++) {
            String datos[] = {clientes.get(i).getNickname(), clientes.get(i).getEmail()};
            DTM2.addRow(datos);
        }
    }

    private void cargarCategorias() {
        try {

            List<DataCategoria> categorias = Factory.getInstance().getCategoriaController().getCategorias();

            DefaultTreeModel modelo = (DefaultTreeModel) treeCategoria.getModel();
            DefaultMutableTreeNode root = (DefaultMutableTreeNode) modelo.getRoot();
            DefaultMutableTreeNode nuevo;
            DefaultMutableTreeNode padre;
            DefaultMutableTreeNode nuevoprod;

            for (DataCategoria dc : categorias) {
                if (dc.getParent().equals("Categorias")) {
                    nuevo = new DefaultMutableTreeNode(dc.getNombre());
                    root.add(nuevo);
                    if (dc.isContieneProductos()) {
//                        List<DataProducto> productos = Factory.getInstance().getCategoriaController().getProductosPorNombreCategoria(dc.getNombre());
                        List<DataProducto> productos = dc.getDataProductos();
                        if (!productos.isEmpty()){
                            for (DataProducto dp : dc.getDataProductos()) {
                            nuevoprod = new DefaultMutableTreeNode(dp.getNombre());
                            nuevo.add(nuevoprod);
                            }
                        }else{
                            nuevoprod = new DefaultMutableTreeNode("Vacía");
                            nuevo.add(nuevoprod);                            
                        }
                        
                    }
                } else {
                    nuevo = new DefaultMutableTreeNode(dc.getNombre());
                    padre = searchNode(dc.getParent());
                    modelo.insertNodeInto(nuevo, padre, padre.getChildCount());
                    if (dc.isContieneProductos()) {
                        List<DataProducto> productos = Factory.getInstance().getCategoriaController().getProductosPorNombreCategoria(dc.getNombre());
                        if (!productos.isEmpty()){
                            for (DataProducto dp : dc.getDataProductos()) {
                            nuevoprod = new DefaultMutableTreeNode(dp.getNombre());
                            nuevo.add(nuevoprod);
                            }
                        }else{
                            nuevoprod = new DefaultMutableTreeNode("Vacía");
                            nuevo.add(nuevoprod);                            
                        }                        
                    } 
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(InfoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public double Redondear(double numero) {
        return Math.rint(numero * 100) / 100;
    }

    private void HabilitarGenOC(boolean flg) {
        GenOC.setFocusable(flg);
//        GenOC.setEnabled(flg);
        Btn_Aceptar1.setEnabled(flg);
        Btn_AddProd.setEnabled(flg);
        Btn_Cancelar1.setEnabled(flg);
        btn_selCli.setEnabled(flg);
        Btn_AddProd.setEnabled(flg);
        TArticulos.setEnabled(flg);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JButton BtnSelCli_Actualizar;
    private javax.swing.JButton BtnSelCli_Cancelar;
    private javax.swing.JButton BtnSelCli_Seleccionar;
    private javax.swing.JButton Btn_Aceptar1;
    private javax.swing.JButton Btn_AddProd;
    private javax.swing.JButton Btn_Cancelar1;
    private javax.swing.JInternalFrame GenOC;
    private javax.swing.JTextField NroOCtext;
    private javax.swing.JPanel PAddProducto;
    private javax.swing.JPanel PBotones1;
    private javax.swing.JPanel PCabezal;
    private javax.swing.JPanel PFecha;
    private javax.swing.JPanel PTotales;
    private javax.swing.JScrollPane SPArticulos;
    private javax.swing.JInternalFrame SelArticulo;
    private javax.swing.JPanel SelCliBtnPanel;
    private javax.swing.JPanel SelCliTPanel;
    private javax.swing.JInternalFrame SelCliente;
    private javax.swing.JTable TArticulos;
    private javax.swing.JTable TCliente;
    private javax.swing.JTextField TxtCliente;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JTextField TxtTotalVal;
    private javax.swing.JButton btnSelArt_Cancelar;
    private javax.swing.JButton btnSelArt_Seleccionar;
    private javax.swing.JButton btn_selCli;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollVerClientes;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lblFecha;
    private javax.swing.JTextField lblcantidad;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JTree treeCategoria;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNomAp;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtemaildsp;
    private javax.swing.JTextField txtnickname;
    private javax.swing.JTextField txtnicknamedsp;
    // End of variables declaration//GEN-END:variables
    private static GenerarOC IGenerarOC;
}
