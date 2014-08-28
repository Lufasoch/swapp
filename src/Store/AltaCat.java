/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

/**
 *
 * @author ubuntu
 */
public class AltaCat extends javax.swing.JInternalFrame {

    /**
     * Creates new form AltaCat
     */
    
    public static AltaCat getInstancia() {
        if (ACatInstancia == null) {
            ACatInstancia = new AltaCat();
            
        }
        return ACatInstancia;
    }
    
    public AltaCat() {
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

        jPanel5 = new javax.swing.JPanel();
        ElegirPadre = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        PadreCat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeCategoria = new javax.swing.JTree();
        jPanel4 = new javax.swing.JPanel();
        Cancelar = new javax.swing.JButton();
        Crear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        ProductosCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        NombreCat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(214, 228, 237));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel5.setLayout(new java.awt.GridLayout());

        ElegirPadre.setText("Elegir categoria padre");
        ElegirPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirPadreActionPerformed(evt);
            }
        });
        jPanel5.add(ElegirPadre);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(20, 490, 290, 50);

        jPanel1.setBackground(new java.awt.Color(214, 228, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 8, 0));

        jTextField1.setEditable(false);
        jTextField1.setText("Categoria padre:");
        jPanel1.add(jTextField1);

        PadreCat.setEditable(false);
        PadreCat.setText("Por defecto");
        jPanel1.add(PadreCat);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(330, 80, 440, 60);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N

        treeCategoria.setBorder(null);
        jScrollPane1.setViewportView(treeCategoria);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 290, 450);

        jPanel4.setBackground(new java.awt.Color(214, 228, 237));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(1, 2, 8, 0));

        Cancelar.setText("Cancelar");
        jPanel4.add(Cancelar);

        Crear.setText("Crear");
        jPanel4.add(Crear);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(330, 490, 440, 50);

        jPanel3.setBackground(new java.awt.Color(214, 228, 237));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(2, 1, 8, 8));

        jTextField5.setEditable(false);
        jTextField5.setText("La categoria contendra productos?");
        jPanel3.add(jTextField5);

        ProductosCheckBox.setBackground(new java.awt.Color(254, 254, 254));
        ProductosCheckBox.setText("La carpeta a creear solo contendra productos");
        jPanel3.add(ProductosCheckBox);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(330, 240, 440, 110);

        jPanel2.setBackground(new java.awt.Color(214, 228, 237));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 8, 0));

        jTextField3.setEditable(false);
        jTextField3.setText("Nombre de la Categoria:");
        jPanel2.add(jTextField3);
        jPanel2.add(NombreCat);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(330, 160, 440, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ElegirPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirPadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElegirPadreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Crear;
    private javax.swing.JButton ElegirPadre;
    private javax.swing.JTextField NombreCat;
    private javax.swing.JTextField PadreCat;
    private javax.swing.JCheckBox ProductosCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTree treeCategoria;
    // End of variables declaration//GEN-END:variables
    private static AltaCat ACatInstancia;
}
