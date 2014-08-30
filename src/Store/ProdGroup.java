/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import direct.market.datatype.DataCategoria;
import direct.market.datatype.DataUsuario;
import direct.market.factory.Factory;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


///



///
/**
 *
 * @author ubuntu
 */
public class ProdGroup extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProdGroup
     */
    public ProdGroup() {
        initComponents();
        this.validate();
        String DirI = "Recursos/x.jpg";
        LImagen.setIcon(RZIma(DirI, LImagen.getWidth(), LImagen.getHeight()));
        ActualizarProv();
        cargarCategorias();
    }

    public static ProdGroup getInstancia() {
        if (PGInstancia == null) {
            PGInstancia = new ProdGroup();
        }
        return PGInstancia;
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
    
    private void cargarCategorias() {
        try {

            List<DataCategoria> categorias = Factory.getInstance().getCategoriaController().getCategorias();

            DefaultTreeModel modelo = (DefaultTreeModel) treeCategoria.getModel();
            DefaultMutableTreeNode root = (DefaultMutableTreeNode) modelo.getRoot();
            DefaultMutableTreeNode nuevo;
            DefaultMutableTreeNode padre;

            for (DataCategoria dc : categorias) {
                if (dc.getParent().equals("Categorias")) {
                    nuevo = new DefaultMutableTreeNode(dc.getNombre());
                    root.add(nuevo);
                } else {
                    nuevo = new DefaultMutableTreeNode(dc.getNombre());
                    padre = searchNode(dc.getParent());
                    modelo.insertNodeInto(nuevo, padre, padre.getChildCount());
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(InfoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ActualizarProv() {
        String data[][] = {};
        String header[] = new String[]{"Nickname", "eMail"};
        DefaultTableModel DTM2 = new DefaultTableModel(data, header)
        {
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
        int p = proveedores.size();
        for (int i = 0; i < p; i++) {
            String datos[] = {proveedores.get(i).getNickname(), proveedores.get(i).getEmail()};
            DTM2.addRow(datos);
        }
    }
    
    public ImageIcon RZIma(String DirRelativa, int Ancho, int Alto) {
        ImageIcon IcoIco = new ImageIcon(getClass().getResource(DirRelativa));
        Image img = IcoIco.getImage();
        Image newimg = img.getScaledInstance(Ancho, Alto, java.awt.Image.SCALE_SMOOTH);
        IcoIco = new ImageIcon(newimg);
        return IcoIco;
    }
    
    public void DeshabilitarTodo()
    {
        RegProdIF.setFocusable(false);
        
        
        this.TCategorias.setFocusable(false);
        this.TCategoriasC.setFocusable(false);
        this.TDescripcion.setFocusable(false);
        this.TDescripcionC.setFocusable(false);
        this.TEspec.setFocusable(false);
        this.TEspecC.setFocusable(false);
        this.TNoRef.setFocusable(false);
        this.TNoRefC.setFocusable(false);
        this.TPrecio.setFocusable(false);
        this.TPrecioC.setFocusable(false);
        this.TProveedor.setFocusable(false);
        this.TProveedorC.setFocusable(false);
        this.TTitulo.setFocusable(false);
        this.TTituloC.setFocusable(false);
        
        
        this.ImaList.setFocusable(false);
        
        
        this.ElegirProvButton.setFocusable(false);        
        this.ElegirImaButton.setFocusable(false);
        this.ElegirCatButton.setFocusable(false);
        this.CancelarTodo.setFocusable(false);
        this.RegistrarTodo.setFocusable(false);
        this.LimpiarTodo.setFocusable(false);
    }
    
    public void HabilitarTodo()
    {
        RegProdIF.setFocusable(true);
        
        
        this.TCategorias.setFocusable(true);
        this.TCategoriasC.setFocusable(true);
        this.TDescripcion.setFocusable(true);
        this.TDescripcionC.setFocusable(true);
        this.TEspec.setFocusable(true);
        this.TEspecC.setFocusable(true);
        this.TNoRef.setFocusable(true);
        this.TNoRefC.setFocusable(true);
        this.TPrecio.setFocusable(true);
        this.TPrecioC.setFocusable(true);
        this.TProveedor.setFocusable(true);
        this.TProveedorC.setFocusable(true);
        this.TTitulo.setFocusable(true);
        this.TTituloC.setFocusable(true);
        
        
        this.ImaList.setFocusable(true);
        
        
        this.ElegirProvButton.setFocusable(true);
        this.ElegirImaButton.setFocusable(true);
        this.ElegirCatButton.setFocusable(true);
        this.CancelarTodo.setFocusable(true);
        this.RegistrarTodo.setFocusable(true);
        this.LimpiarTodo.setFocusable(true);
    }
    
    public void LimpiarIma()
    {
        txtFotoPath.setText("");
        String DirI = "Recursos/x.jpg";
        LImagen.setIcon(RZIma(DirI, LImagen.getWidth(), LImagen.getHeight()));
    }
    
    public void LimpiarTodo()
    {        
        this.TCategoriasC.setText("");
        this.TDescripcionC.setText("");
        this.TEspecC.setText("");
        this.TNoRefC.setText("");
        this.TPrecioC.setText("");
        this.TProveedorC.setText("");
        this.TTituloC.setText("");
        
        
        DefaultListModel listaModel_limpio = new DefaultListModel();
        ImaList.setModel(listaModel_limpio);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelectProv = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProveedorTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        CerrarButton = new javax.swing.JButton();
        ActializarButton = new javax.swing.JButton();
        Seleccionar = new javax.swing.JButton();
        SelectIma = new javax.swing.JInternalFrame();
        jPanel10 = new javax.swing.JPanel();
        txtFotoPath = new javax.swing.JTextField();
        LImagen = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        CerrarImaButton = new javax.swing.JButton();
        AgregarImaButton = new javax.swing.JButton();
        SelectCat = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        CerrarCat = new javax.swing.JButton();
        ActualizarCat = new javax.swing.JButton();
        SeleccionarCat = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        treeCategoria = new javax.swing.JTree();
        RegProdIF = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        TTitulo = new javax.swing.JTextField();
        TNoRef = new javax.swing.JTextField();
        TDescripcion = new javax.swing.JTextField();
        TEspec = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        TTituloC = new javax.swing.JTextField();
        TNoRefC = new javax.swing.JTextField();
        TDescripcionC = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TEspecC = new javax.swing.JTextArea();
        TPrecioC = new javax.swing.JTextField();
        TProveedor = new javax.swing.JTextField();
        TPrecio = new javax.swing.JTextField();
        ElegirProvButton = new javax.swing.JButton();
        TProveedorC = new javax.swing.JTextField();
        TCategorias = new javax.swing.JTextField();
        ElegirCatButton = new javax.swing.JButton();
        TCategoriasC = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        ElegirImaButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ImaList = new javax.swing.JList();
        jPanel9 = new javax.swing.JPanel();
        CancelarTodo = new javax.swing.JButton();
        LimpiarTodo = new javax.swing.JButton();
        RegistrarTodo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        SelectProv.setVisible(false);

        jPanel5.setBackground(new java.awt.Color(214, 228, 237));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel5.setLayout(null);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Seleccione al preveedor del producto");
        jPanel5.add(jTextField2);
        jTextField2.setBounds(10, 10, 350, 41);

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
        jScrollPane2.setViewportView(ProveedorTable);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(10, 60, 350, 380);

        jPanel7.setBackground(new java.awt.Color(214, 228, 237));
        jPanel7.setLayout(new java.awt.GridLayout(1, 3, 8, 8));

        CerrarButton.setText("Cerrar");
        CerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarButtonActionPerformed(evt);
            }
        });
        jPanel7.add(CerrarButton);

        ActializarButton.setText("Actualizar");
        ActializarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActializarButtonActionPerformed(evt);
            }
        });
        jPanel7.add(ActializarButton);

        Seleccionar.setText("Seleccionar");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        jPanel7.add(Seleccionar);

        jPanel5.add(jPanel7);
        jPanel7.setBounds(10, 450, 350, 40);

        javax.swing.GroupLayout SelectProvLayout = new javax.swing.GroupLayout(SelectProv.getContentPane());
        SelectProv.getContentPane().setLayout(SelectProvLayout);
        SelectProvLayout.setHorizontalGroup(
            SelectProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );
        SelectProvLayout.setVerticalGroup(
            SelectProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(SelectProv);
        SelectProv.setBounds(30, 10, 370, 530);

        SelectIma.setVisible(false);
        SelectIma.getContentPane().setLayout(null);

        jPanel10.setBackground(new java.awt.Color(214, 228, 237));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel10.setLayout(null);

        txtFotoPath.setEditable(false);
        txtFotoPath.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        txtFotoPath.setEnabled(false);
        jPanel10.add(txtFotoPath);
        txtFotoPath.setBounds(10, 320, 300, 46);

        LImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddImaEve(evt);
            }
        });
        jPanel10.add(LImagen);
        LImagen.setBounds(10, 10, 300, 300);

        jPanel11.setBackground(new java.awt.Color(214, 228, 237));
        jPanel11.setLayout(new java.awt.GridLayout(1, 2, 8, 8));

        CerrarImaButton.setText("Cerrar");
        CerrarImaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarImaButtonActionPerformed(evt);
            }
        });
        jPanel11.add(CerrarImaButton);

        AgregarImaButton.setText("Agregar");
        AgregarImaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarImaButtonActionPerformed(evt);
            }
        });
        jPanel11.add(AgregarImaButton);

        jPanel10.add(jPanel11);
        jPanel11.setBounds(10, 380, 300, 40);

        SelectIma.getContentPane().add(jPanel10);
        jPanel10.setBounds(0, 0, 320, 430);

        getContentPane().add(SelectIma);
        SelectIma.setBounds(30, 10, 330, 460);

        SelectCat.setVisible(false);
        SelectCat.getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(214, 228, 237));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel6.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(214, 228, 237));
        jPanel8.setLayout(new java.awt.GridLayout(1, 3, 8, 8));

        CerrarCat.setText("Cerrar");
        CerrarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarCatActionPerformed(evt);
            }
        });
        jPanel8.add(CerrarCat);

        ActualizarCat.setText("Actualizar");
        ActualizarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarCatActionPerformed(evt);
            }
        });
        jPanel8.add(ActualizarCat);

        SeleccionarCat.setText("Seleccionar");
        SeleccionarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarCatActionPerformed(evt);
            }
        });
        jPanel8.add(SeleccionarCat);

        jPanel6.add(jPanel8);
        jPanel8.setBounds(10, 430, 350, 60);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Categorias");
        treeCategoria.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(treeCategoria);

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 350, 410);

        SelectCat.getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 370, 500);

        getContentPane().add(SelectCat);
        SelectCat.setBounds(30, 10, 370, 530);

        RegProdIF.setVisible(true);
        RegProdIF.getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(214, 228, 237));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel3.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(214, 228, 237));
        jPanel1.setBorder(null);
        jPanel1.setLayout(new java.awt.GridLayout(4, 1, 0, 8));

        TTitulo.setEditable(false);
        TTitulo.setText("Nombre del producto:");
        jPanel1.add(TTitulo);

        TNoRef.setEditable(false);
        TNoRef.setText("Numero de referencia:");
        jPanel1.add(TNoRef);

        TDescripcion.setEditable(false);
        TDescripcion.setText("Descripcion:");
        jPanel1.add(TDescripcion);

        TEspec.setText("Especificaciones:");
        jPanel1.add(TEspec);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(10, 10, 180, 132);

        jPanel2.setBackground(new java.awt.Color(214, 228, 237));
        jPanel2.setLayout(new java.awt.GridLayout(3, 1, 8, 8));
        jPanel2.add(TTituloC);
        jPanel2.add(TNoRefC);
        jPanel2.add(TDescripcionC);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(200, 10, 560, 100);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        TEspecC.setColumns(20);
        TEspecC.setRows(5);
        TEspecC.setWrapStyleWord(true);
        jScrollPane1.setViewportView(TEspecC);

        jPanel4.add(jScrollPane1);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(200, 120, 560, 130);
        jPanel3.add(TPrecioC);
        TPrecioC.setBounds(200, 260, 560, 27);

        TProveedor.setText("Proveedor:");
        jPanel3.add(TProveedor);
        TProveedor.setBounds(10, 300, 180, 27);

        TPrecio.setText("Precio:");
        jPanel3.add(TPrecio);
        TPrecio.setBounds(10, 260, 180, 27);

        ElegirProvButton.setText("Elegir");
        ElegirProvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirProvButtonActionPerformed(evt);
            }
        });
        jPanel3.add(ElegirProvButton);
        ElegirProvButton.setBounds(200, 300, 70, 29);
        jPanel3.add(TProveedorC);
        TProveedorC.setBounds(280, 300, 480, 27);

        TCategorias.setText("Categorias:");
        jPanel3.add(TCategorias);
        TCategorias.setBounds(10, 340, 180, 27);

        ElegirCatButton.setText("Elegir");
        ElegirCatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirCatButtonActionPerformed(evt);
            }
        });
        jPanel3.add(ElegirCatButton);
        ElegirCatButton.setBounds(200, 340, 70, 30);
        jPanel3.add(TCategoriasC);
        TCategoriasC.setBounds(280, 340, 480, 27);

        jTextField1.setText("Imágenes:");
        jPanel3.add(jTextField1);
        jTextField1.setBounds(10, 380, 180, 27);

        ElegirImaButton.setText("Elegir");
        ElegirImaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirImaButtonActionPerformed(evt);
            }
        });
        jPanel3.add(ElegirImaButton);
        ElegirImaButton.setBounds(200, 380, 70, 30);

        ImaList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(ImaList);

        jPanel3.add(jScrollPane4);
        jScrollPane4.setBounds(280, 380, 480, 100);

        RegProdIF.getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 10, 770, 490);

        jPanel9.setBackground(new java.awt.Color(214, 228, 237));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel9.setLayout(new java.awt.GridLayout(1, 3, 8, 8));

        CancelarTodo.setText("Cancelar");
        CancelarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarTodoActionPerformed(evt);
            }
        });
        jPanel9.add(CancelarTodo);

        LimpiarTodo.setText("Limpiar");
        LimpiarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarTodoActionPerformed(evt);
            }
        });
        jPanel9.add(LimpiarTodo);

        RegistrarTodo.setText("Registrar");
        RegistrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarTodoActionPerformed(evt);
            }
        });
        jPanel9.add(RegistrarTodo);

        RegProdIF.getContentPane().add(jPanel9);
        jPanel9.setBounds(370, 514, 410, 45);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/background.jpg"))); // NOI18N
        RegProdIF.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 798, 570);

        getContentPane().add(RegProdIF);
        RegProdIF.setBounds(0, -30, 800, 600);

        setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void ElegirProvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirProvButtonActionPerformed
        DeshabilitarTodo();
        ActualizarProv();
        SelectProv.setVisible(true);
    }//GEN-LAST:event_ElegirProvButtonActionPerformed

    private void ElegirCatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirCatButtonActionPerformed
        DeshabilitarTodo();
        //cargarCategorias();
        SelectCat.setVisible(true);
    }//GEN-LAST:event_ElegirCatButtonActionPerformed

    private void CerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarButtonActionPerformed
        HabilitarTodo();
        SelectProv.setVisible(false);
    }//GEN-LAST:event_CerrarButtonActionPerformed

    private void ActializarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActializarButtonActionPerformed
        ActualizarProv();
    }//GEN-LAST:event_ActializarButtonActionPerformed

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        try
        {
            this.TProveedorC.setText(ProveedorTable.getValueAt(ProveedorTable.getSelectedRow(), 0).toString());
            HabilitarTodo();
            SelectProv.setVisible(false);
        }
        catch (IndexOutOfBoundsException ex)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Proveedor de la lista", "Warning", JOptionPane.WARNING_MESSAGE);
        }        
    }//GEN-LAST:event_SeleccionarActionPerformed

    //private int contCat = 0;
    //String CatE[];
    
    private void CerrarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarCatActionPerformed
        HabilitarTodo();
        SelectCat.setVisible(false);
    }//GEN-LAST:event_CerrarCatActionPerformed

    private void ActualizarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarCatActionPerformed
        //cargarCategorias();
    }//GEN-LAST:event_ActualizarCatActionPerformed

    private void SeleccionarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarCatActionPerformed
        DefaultMutableTreeNode seleccionado = (DefaultMutableTreeNode) treeCategoria.getLastSelectedPathComponent();
        if (seleccionado != null) {
            if (seleccionado.isLeaf()) {//no solo siendo leaf significa que tiene productos
                if(TCategoriasC.getText().equals(""))
                {
                    //CatE[contCat] = seleccionado.toString();
                    TCategoriasC.setText(seleccionado.toString());
                }
                else
                {
                    //CatE[contCat] = seleccionado.toString();
                    TCategoriasC.setText(TCategoriasC.getText() + ", " + seleccionado.toString());
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una categoria que contenga productos", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una categoria", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        //contCat++;
        HabilitarTodo();
        SelectCat.setVisible(false);
    }//GEN-LAST:event_SeleccionarCatActionPerformed

    private int NoImaCont = 0;
    private String ImaI[] = new String[10];
    
    private void CancelarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarTodoActionPerformed
        NoImaCont = 0;
        this.dispose();
    }//GEN-LAST:event_CancelarTodoActionPerformed

    private void LimpiarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarTodoActionPerformed
        NoImaCont = 0;
        LimpiarTodo();
    }//GEN-LAST:event_LimpiarTodoActionPerformed

    private void RegistrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarTodoActionPerformed
        //TCategoriasC.getText() tiene todas las categorias separadas por ", "
        //ImaI[de 0 hasta NoImaCont-1] tiene todas las rutas absolutas de las imagenes
        //en InfoCliente y Info proveedor se ve como mostrarlas en el icono de una label
        NoImaCont = 0;//vuelvo el contador de imagenes a cero para la proxima vez que use ProdGroup (Registrar Producto)
    }//GEN-LAST:event_RegistrarTodoActionPerformed

    private void ElegirImaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirImaButtonActionPerformed
        DeshabilitarTodo();
        SelectIma.setVisible(true);
    }//GEN-LAST:event_ElegirImaButtonActionPerformed

    private File fileImagen = null;
    
    private void AddImaEve(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddImaEve
        JFileChooser buscarImagen = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imágenes (bmp, jpg, png)", new String[]{"bmp", "jpg", "png"});
        buscarImagen.setAcceptAllFileFilterUsed(false);
        buscarImagen.setFileFilter(filtro);

        int result = buscarImagen.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            fileImagen = buscarImagen.getSelectedFile();
            txtFotoPath.setText(fileImagen.getPath());
            ImageIcon imageIcon = new ImageIcon(fileImagen.getPath());
            LImagen.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(LImagen.getWidth(), -1, Image.SCALE_AREA_AVERAGING)));
            LImagen.repaint();
            
            String name = fileImagen.getName();
            int pos = name.lastIndexOf('.');
            String ext = name.substring(pos + 1);

            File directorio = new File("src/Store/Recursos/Usuarios/TempPic/");
            directorio.mkdir();

            File destino = new File("src/Store/Recursos/Usuarios/TempPic/tmp" + "." + ext);
            try {
                InputStream in = new FileInputStream(fileImagen);
                OutputStream out = new FileOutputStream(destino);

                byte[] buffer = new byte[1024];
                int tamanoRes;


                while ((tamanoRes = in.read(buffer)) > 0) {
                    out.write(buffer, 0, tamanoRes);
                }
                in.close();
                out.close();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "No se puede seleccionar archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_AddImaEve

    private DefaultListModel listaModel = new DefaultListModel();
    
    private void AgregarImaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarImaButtonActionPerformed
        if(txtFotoPath.getText() != null)
        {
            if(NoImaCont == 0)
                listaModel = new DefaultListModel();            
            //DefaultListModel listaModel = new DefaultListModel();
            ImaList.setModel(listaModel);
            listaModel.addElement(fileImagen.getAbsolutePath());
            ImaI[NoImaCont] = fileImagen.getAbsolutePath();
            txtFotoPath.setText(fileImagen.getAbsolutePath());
            NoImaCont++;
            LimpiarIma();
            SelectIma.setVisible(false);
            HabilitarTodo();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Antes debe seleccionar una Imágen", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_AgregarImaButtonActionPerformed

    private void CerrarImaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarImaButtonActionPerformed
        LimpiarIma();
        SelectIma.setVisible(false);
        HabilitarTodo();
    }//GEN-LAST:event_CerrarImaButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActializarButton;
    private javax.swing.JButton ActualizarCat;
    private javax.swing.JButton AgregarImaButton;
    private javax.swing.JButton CancelarTodo;
    private javax.swing.JButton CerrarButton;
    private javax.swing.JButton CerrarCat;
    private javax.swing.JButton CerrarImaButton;
    private javax.swing.JButton ElegirCatButton;
    private javax.swing.JButton ElegirImaButton;
    private javax.swing.JButton ElegirProvButton;
    private javax.swing.JList ImaList;
    private javax.swing.JLabel LImagen;
    private javax.swing.JButton LimpiarTodo;
    private javax.swing.JTable ProveedorTable;
    private javax.swing.JInternalFrame RegProdIF;
    private javax.swing.JButton RegistrarTodo;
    private javax.swing.JButton Seleccionar;
    private javax.swing.JButton SeleccionarCat;
    private javax.swing.JInternalFrame SelectCat;
    private javax.swing.JInternalFrame SelectIma;
    private javax.swing.JInternalFrame SelectProv;
    private javax.swing.JTextField TCategorias;
    private javax.swing.JTextField TCategoriasC;
    private javax.swing.JTextField TDescripcion;
    private javax.swing.JTextField TDescripcionC;
    private javax.swing.JTextField TEspec;
    private javax.swing.JTextArea TEspecC;
    private javax.swing.JTextField TNoRef;
    private javax.swing.JTextField TNoRefC;
    private javax.swing.JTextField TPrecio;
    private javax.swing.JTextField TPrecioC;
    private javax.swing.JTextField TProveedor;
    private javax.swing.JTextField TProveedorC;
    private javax.swing.JTextField TTitulo;
    private javax.swing.JTextField TTituloC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTree treeCategoria;
    private javax.swing.JTextField txtFotoPath;
    // End of variables declaration//GEN-END:variables
    static private ProdGroup PGInstancia;
}
