/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

/**
 *
 * @author kavesa
 */
public class ModifProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModifProducto
     */
    public ModifProducto() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        pnlInformacion = new javax.swing.JTabbedPane();
        pnlDatos = new javax.swing.JPanel();
        tfNombre = new javax.swing.JTextField();
        tfReferencia = new javax.swing.JTextField();
        tfProveedor = new javax.swing.JTextField();
        txtNombre = new javax.swing.JLabel();
        txtNumeroReferencia = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JLabel();
        txtEspecificacion = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taDescripcion = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        taEspecificacion = new javax.swing.JTextArea();
        pnlImagenes = new javax.swing.JPanel();
        sliderImagenes = new javax.swing.JSlider();
        panelImagen = new javax.swing.JPanel();
        pnlCategorias = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listCategorias = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeCategoria = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        listProductos = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btCategoria = new javax.swing.JButton();
        btProducto = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btModificar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Modificar Producto");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(214, 228, 237));
        jPanel1.setBorder(null);
        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 8, 8));

        jTextField1.setEditable(false);
        jTextField1.setText("Seleccione una Categoria");
        jPanel1.add(jTextField1);

        jTextField2.setEditable(false);
        jTextField2.setText("Seleccione el Producto");
        jPanel1.add(jTextField2);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 30, 400, 50);

        jPanel4.setBackground(new java.awt.Color(214, 228, 237));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel4.setLayout(null);

        pnlInformacion.setBorder(null);

        txtNombre.setText("Nombre");

        txtNumeroReferencia.setText("Referencia");

        txtProveedor.setText("Proveedor");

        txtDescripcion.setText("Descripcion");

        txtEspecificacion.setText("Especificacion");

        taDescripcion.setColumns(20);
        taDescripcion.setLineWrap(true);
        taDescripcion.setRows(5);
        jScrollPane4.setViewportView(taDescripcion);

        taEspecificacion.setColumns(20);
        taEspecificacion.setLineWrap(true);
        taEspecificacion.setRows(5);
        jScrollPane5.setViewportView(taEspecificacion);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion)
                            .addComponent(txtProveedor)
                            .addComponent(txtNumeroReferencia)
                            .addComponent(txtNombre))
                        .addGap(29, 29, 29)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfReferencia)
                            .addComponent(tfNombre)
                            .addComponent(tfProveedor, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(txtEspecificacion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane4)
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroReferencia)
                    .addComponent(tfReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProveedor)
                    .addComponent(tfProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEspecificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlInformacion.addTab("Datos Generales", pnlDatos);

        pnlImagenes.setLayout(null);
        pnlImagenes.add(sliderImagenes);
        sliderImagenes.setBounds(18, 350, 290, 54);

        panelImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        pnlImagenes.add(panelImagen);
        panelImagen.setBounds(18, 12, 290, 340);

        pnlInformacion.addTab("Imagenes", pnlImagenes);

        jScrollPane3.setViewportView(listCategorias);

        javax.swing.GroupLayout pnlCategoriasLayout = new javax.swing.GroupLayout(pnlCategorias);
        pnlCategorias.setLayout(pnlCategoriasLayout);
        pnlCategoriasLayout.setHorizontalGroup(
            pnlCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoriasLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnlCategoriasLayout.setVerticalGroup(
            pnlCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCategoriasLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pnlInformacion.addTab("Categorias", pnlCategorias);

        jPanel4.add(pnlInformacion);
        pnlInformacion.setBounds(10, 10, 330, 450);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(440, 20, 350, 470);

        jPanel2.setBackground(new java.awt.Color(214, 228, 237));
        jPanel2.setBorder(null);
        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 8, 8));

        jScrollPane1.setBorder(null);

        treeCategoria.setBorder(null);
        jScrollPane1.setViewportView(treeCategoria);

        jPanel2.add(jScrollPane1);

        jScrollPane2.setBorder(null);

        listProductos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listProductos);

        jPanel2.add(jScrollPane2);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 90, 400, 390);

        jPanel3.setBackground(new java.awt.Color(214, 228, 237));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 20, 420, 470);

        jPanel5.setBackground(new java.awt.Color(214, 228, 237));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 8, 0));

        btCategoria.setText("Seleccionar");
        jPanel5.add(btCategoria);

        btProducto.setText("Seleccionar");
        jPanel5.add(btProducto);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 500, 420, 50);

        jPanel6.setBackground(new java.awt.Color(214, 228, 237));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(1, 3, 8, 0));

        btModificar.setText("Modificar");
        jPanel6.add(btModificar);

        btCancelar.setText("Calcelar");
        jPanel6.add(btCancelar);

        btCerrar.setText("Cerrar");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });
        jPanel6.add(btCerrar);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(440, 500, 350, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCerrarActionPerformed

    public static ModifProducto getInstancia() {
        if (MProdInstancia == null) {
            MProdInstancia = new ModifProducto();
            
        }
        return MProdInstancia;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCategoria;
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JList listCategorias;
    private javax.swing.JList listProductos;
    private javax.swing.JPanel panelImagen;
    private javax.swing.JPanel pnlCategorias;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlImagenes;
    private javax.swing.JTabbedPane pnlInformacion;
    private javax.swing.JSlider sliderImagenes;
    private javax.swing.JTextArea taDescripcion;
    private javax.swing.JTextArea taEspecificacion;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfProveedor;
    private javax.swing.JTextField tfReferencia;
    private javax.swing.JTree treeCategoria;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtEspecificacion;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNumeroReferencia;
    private javax.swing.JLabel txtProveedor;
    // End of variables declaration//GEN-END:variables
    private static ModifProducto MProdInstancia;
}
