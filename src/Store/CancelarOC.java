/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import direct.market.exceptions.OCException;
import direct.market.factory.Factory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ubuntu
 */
public class CancelarOC extends javax.swing.JInternalFrame {

    /**
     * Creates new form InfoOC
     */
    public CancelarOC() {
        initComponents();
        this.validate();
        Actualizar();
    }

    public static CancelarOC getInstancia() {
        if (IOCInstancia == null) {
            IOCInstancia = new CancelarOC();
        }
        return IOCInstancia;
    }
    
    public void Actualizar()
    {
        int[] NOrdenes = {458, 5366, 7552};
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date[] fechaOC = {new Date(99,7,14), new Date(106,11,8), new Date(112,3,21),};
        DefaultTableModel DTM = new DefaultTableModel()
            {
                boolean[] canEdit = new boolean[]{false, false};

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            String header[] = new String[] { "Nro Orden", "Fecha" };
            DTM.setColumnIdentifiers(header);
            OrdenesTable.setModel(DTM);
            OrdenesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                //ARRIBA//CAMBIAR MODELO DE LA TABLA

            int cont = 0;//MIENTRAS NO TENGO UNA LISTA DE CLIENTES USO UN CONTADOR        
            while(cont < 3)
            {
                //DTM.addRow(new Object[] { DATA_ORDEN_DE_COMPRA_ITEM.getNroOrden(), sdf.format(DATA_ORDEN_DE_COMPRA_ITEM.getFecha()) });
                DTM.addRow(new Object[] { NOrdenes[cont], sdf.format(fechaOC[cont]) }); 
                cont++;
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

        TPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrdenesTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrdenInfoTable = new javax.swing.JTable();
        PTotales = new javax.swing.JPanel();
        TxtTotal = new javax.swing.JTextField();
        TxtTotalVal = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Actualizar = new javax.swing.JButton();
        DetallesOC = new javax.swing.JButton();
        CancelarOC = new javax.swing.JButton();
        BackgroundLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        TPanel.setBackground(new java.awt.Color(214, 228, 237));
        TPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        TPanel.setLayout(null);

        OrdenesTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        OrdenesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nro Orden", "Fecha"
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
        OrdenesTable.setFillsViewportHeight(true);
        OrdenesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(OrdenesTable);

        TPanel.add(jScrollPane1);
        jScrollPane1.setBounds(8, 8, 174, 380);

        getContentPane().add(TPanel);
        TPanel.setBounds(40, 30, 190, 400);

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel3.add(Cerrar);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(570, 490, 190, 50);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N

        OrdenInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio unitario", "Cantidad", "Sub total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(OrdenInfoTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(240, 30, 520, 400);

        PTotales.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        PTotales.setLayout(new java.awt.GridLayout(1, 2));

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

        getContentPane().add(PTotales);
        PTotales.setBounds(450, 420, 310, 50);

        jPanel1.setBackground(new java.awt.Color(214, 228, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(Actualizar, java.awt.BorderLayout.PAGE_START);

        DetallesOC.setText("Ver Orden");
        DetallesOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetallesOCActionPerformed(evt);
            }
        });
        jPanel1.add(DetallesOC, java.awt.BorderLayout.CENTER);

        CancelarOC.setText("Cancelar Orden");
        CancelarOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarOCActionPerformed(evt);
            }
        });
        jPanel1.add(CancelarOC, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 440, 190, 110);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/background.jpg"))); // NOI18N
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 800, 570);

        setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        Actualizar();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void DetallesOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetallesOCActionPerformed
        try
        {
            String nicknameP = OrdenesTable.getValueAt(OrdenesTable.getSelectedRow(), 0).toString();
        
            int[] CodP = { 1 , 2563, 179 };
            String[] NomP = { "Radeon R9 280x", "AMD Phenom II X6 1100t", "Kingstom 4Gb 1333Mhz" };
            double[] PreUniP = { 329.99, 165.99, 53.00 };
            int[] CantP = { 2, 1, 4 };

            DefaultTableModel DTM2 = new DefaultTableModel()
                {
                    boolean[] canEdit = new boolean[]{false, false, false, false, false};

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };
                String header[] = new String[] { "Codigo", "Nombre", "Precio U.", "Cantidad", "Sub total" };
                DTM2.setColumnIdentifiers(header);
                OrdenInfoTable.setModel(DTM2);
                OrdenInfoTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                OrdenInfoTable.getColumnModel().getColumn(1).setPreferredWidth(200);
                    //ARRIBA//CAMBIAR MODELO DE LA TABLA
                double total = 0;
                int cont = 0;//MIENTRAS NO TENGO UNA LISTA DE CLIENTES USO UN CONTADOR        
                while(cont < 3)
                {
                    //DTM.addRow(new Object[] { DATA_ORDEN_DE_COMPRA_ITEM.getNroOrden(), sdf.format(DATA_ORDEN_DE_COMPRA_ITEM.getFecha()) });
                    DTM2.addRow(new Object[] { CodP[cont], NomP[cont], PreUniP[cont], CantP[cont], PreUniP[cont]*CantP[cont] }); 
                    total = total + PreUniP[cont]*CantP[cont];
                    cont++;
                }
                String total2 = String.valueOf(total);
                TxtTotalVal.setText(total2);
            } 
        catch (IndexOutOfBoundsException ex)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_DetallesOCActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        DefaultTableModel vacio = new DefaultTableModel(0,0);
        OrdenInfoTable.setModel(vacio);
        CancelarOC=null;
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void CancelarOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarOCActionPerformed
        // TODO add your handling code here:
        try{
            DefaultTableModel m = (DefaultTableModel) OrdenInfoTable.getModel();
            int numOC = (Integer) m.getValueAt(OrdenInfoTable.getSelectedRow(),0);
            Factory.getInstance().getOrdenCompraController().cancelarOrdenCompra(numOC);
        }
        catch (IndexOutOfBoundsException ex)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente", "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (OCException ex) {
            Logger.getLogger(CancelarOC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_CancelarOCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JButton CancelarOC;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton DetallesOC;
    private javax.swing.JTable OrdenInfoTable;
    private javax.swing.JTable OrdenesTable;
    private javax.swing.JPanel PTotales;
    private javax.swing.JPanel TPanel;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JTextField TxtTotalVal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private static CancelarOC IOCInstancia;
}
