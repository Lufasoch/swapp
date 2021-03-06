/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import direct.market.datatype.DataEstadoOC;
import direct.market.datatype.DataLineaOC;
import direct.market.datatype.DataOC;
import direct.market.factory.Factory;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ubuntu
 */
public class InfoOC extends javax.swing.JInternalFrame {

    /**
     * Creates new form InfoOC
     */
    public InfoOC() {
        initComponents();
        this.validate();
        Actualizar();
    }

    public static InfoOC getInstancia() {
        if (IOCInstancia == null) {
            IOCInstancia = new InfoOC();
        }
        return IOCInstancia;
    }
    
    public void Actualizar()
    {
//        int[] NOrdenes = {458, 5366, 7552};
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date[] fechaOC = {new Date(99,7,14), new Date(106,11,8), new Date(112,3,21),};
        List<DataOC> ordenesCompraList= Factory.getInstance().getOrdenCompraController().getOrdenesCompra();
        DefaultTableModel DTM = new DefaultTableModel()
            {
                boolean[] canEdit = new boolean[]{false};

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            String header[] = new String[] { "Nro Orden"};
            DTM.setColumnIdentifiers(header);
            OrdenesTable.setModel(DTM);
            OrdenesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            
                //ARRIBA//CAMBIAR MODELO DE LA TABLA
            int c = ordenesCompraList.size();
        for (int i = 0; i < c; i++) {
            String datos[] = {Integer.valueOf(ordenesCompraList.get(i).getNumero()).toString()};
            DTM.addRow(datos);
        }
    }    
    
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
        jScrollPane3 = new javax.swing.JScrollPane();
        EstadosTable = new javax.swing.JTable();
        BackgroundLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        TPanel.setBackground(new java.awt.Color(214, 228, 237));
        TPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        TPanel.setLayout(new java.awt.GridLayout(1, 0));

        OrdenesTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        OrdenesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Nro Orden"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
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
        OrdenesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrdenesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OrdenesTable);

        TPanel.add(jScrollPane1);

        getContentPane().add(TPanel);
        TPanel.setBounds(10, 20, 110, 400);

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
        jPanel3.setBounds(570, 500, 190, 50);

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
        OrdenInfoTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        OrdenInfoTable.getColumnModel().getColumn(1).setHeaderValue("Precio unitario");
        OrdenInfoTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        OrdenInfoTable.getColumnModel().getColumn(3).setHeaderValue("Sub-Total");

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(130, 20, 400, 400);

        PTotales.setBackground(new java.awt.Color(214, 228, 237));
        PTotales.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        PTotales.setLayout(new java.awt.GridLayout(1, 2, 8, 8));

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
        PTotales.setBounds(450, 430, 310, 50);

        jPanel1.setBackground(new java.awt.Color(214, 228, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(1, 1, 8, 8));

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(Actualizar);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 430, 170, 50);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N

        EstadosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Estado", "Fecha"
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
        jScrollPane3.setViewportView(EstadosTable);
        EstadosTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        EstadosTable.getColumnModel().getColumn(1).setPreferredWidth(80);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(540, 20, 240, 400);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/background.jpg"))); // NOI18N
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 800, 570);

        setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        Actualizar();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        DefaultTableModel vacio = new DefaultTableModel(0,0);
        OrdenInfoTable.setModel(vacio);
        IOCInstancia=null;
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void OrdenesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdenesTableMouseClicked
        
        try
        {
            String nroCompRow = OrdenesTable.getValueAt(OrdenesTable.getSelectedRow(), 0).toString();
            DataOC doc=Factory.getInstance().getOrdenCompraController().getDataOC(nroCompRow);
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            DefaultTableModel DTM2 = new DefaultTableModel()
                {
                    boolean[] canEdit = new boolean[]{ false, false, false, false};

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };
                String header[] = new String[] { "Nombre", "Precio U.", "Cantidad", "Sub total" };
                DTM2.setColumnIdentifiers(header);
                OrdenInfoTable.setModel(DTM2);
                OrdenInfoTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                OrdenInfoTable.getColumnModel().getColumn(0).setPreferredWidth(180);

                for(DataLineaOC dlo: doc.getLineas()){
                       DTM2.addRow(new Object[] { dlo.getProducto().getNombre(), dlo.getProducto().getDataEspecificacion().getPrecio(), dlo.getCantidad(), dlo.getTotalLinea() }); 
                }
                TxtTotalVal.setText(Double.valueOf(doc.getPrecio_total()).toString());
                
                DefaultTableModel DTM3 = new DefaultTableModel()
                {
                    boolean[] canEdit = new boolean[]{ false, false };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };
                String header3[] = new String[] { "Estado", "Fecha" };
                DTM3.setColumnIdentifiers(header3);
                EstadosTable.setModel(DTM3);
                EstadosTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                EstadosTable.getColumnModel().getColumn(0).setPreferredWidth(100);
                EstadosTable.getColumnModel().getColumn(1).setPreferredWidth(70);
                
                List<DataEstadoOC> deol = doc.getEstados();
                for(DataEstadoOC deo : deol){
                    DTM3.addRow(new Object[] { deo.getEstado(), sdf.format(deo.getFecha().getTime())});
                }
            } 
        catch (IndexOutOfBoundsException ex)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_OrdenesTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JButton Cerrar;
    private javax.swing.JTable EstadosTable;
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
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
private static InfoOC IOCInstancia;
}
