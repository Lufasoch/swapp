/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import Icon.MyIcon;
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
public class EstadoOC extends javax.swing.JInternalFrame {

    /**
     * Creates new form InfoOC
     */
    public EstadoOC() {
        initComponents();
        this.validate();
        Actualizar();
    }

    public static EstadoOC getInstancia() {
        if (EOCInstancia == null) {
            EOCInstancia = new EstadoOC();
        }
        return EOCInstancia;
    }

    public void Actualizar() {
//        int[] NOrdenes = {458, 5366, 7552};
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date[] fechaOC = {new Date(99,7,14), new Date(106,11,8), new Date(112,3,21),};
        List<DataOC> ordenesCompraList = Factory.getInstance().getOrdenCompraController().getOrdenesCompra();
        DefaultTableModel DTM = new DefaultTableModel() {
            boolean[] canEdit = new boolean[]{false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        String header[] = new String[]{"Nro Orden", "Fecha", "Estado"};
        DTM.setColumnIdentifiers(header);
        OrdenesTable.setModel(DTM);
        OrdenesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //ARRIBA//CAMBIAR MODELO DE LA TABLA
        int c = ordenesCompraList.size();
        int e;
        for (int i = 0; i < c; i++) {
            List<DataEstadoOC> estOCList = ordenesCompraList.get(i).getEstados();
            e = estOCList.size()-1;
            
                if(estOCList.get(e).getEstado().equals("Orden Recibida")){
                String datos[] = {Integer.valueOf(ordenesCompraList.get(i).getNumero()).toString(), sdf.format(ordenesCompraList.get(i).getFecha()), estOCList.get(e).getEstado()};
                DTM.addRow(datos);
                }
            
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
        PTotales1 = new javax.swing.JPanel();
        CancelarOC = new javax.swing.JButton();
        AceptarOC = new javax.swing.JButton();
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
                {null, null, null}
            },
            new String [] {
                "Nro Orden", "Fecha", "Estado"
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
        TPanel.setBounds(20, 20, 240, 400);

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
        jPanel3.setBounds(620, 430, 150, 50);

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

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(270, 20, 500, 350);

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
        PTotales.setBounds(530, 380, 240, 40);

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
        jPanel1.setBounds(20, 430, 240, 50);

        PTotales1.setBackground(new java.awt.Color(214, 228, 237));
        PTotales1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        PTotales1.setLayout(new java.awt.GridLayout(1, 2, 8, 8));

        CancelarOC.setBackground(new java.awt.Color(255, 0, 0));
        CancelarOC.setForeground(new java.awt.Color(0, 0, 0));
        CancelarOC.setText("Cancelar Orden");
        CancelarOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarOCActionPerformed(evt);
            }
        });
        PTotales1.add(CancelarOC);

        AceptarOC.setBackground(new java.awt.Color(102, 255, 102));
        AceptarOC.setForeground(new java.awt.Color(0, 0, 0));
        AceptarOC.setText("Orden Preparada");
        PTotales1.add(AceptarOC);

        getContentPane().add(PTotales1);
        PTotales1.setBounds(270, 430, 340, 50);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/background.jpg"))); // NOI18N
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 800, 570);

        setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        Actualizar();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        DefaultTableModel vacio = new DefaultTableModel(0, 0);
        OrdenInfoTable.setModel(vacio);
        EOCInstancia = null;
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void OrdenesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdenesTableMouseClicked

        try {
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
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_OrdenesTableMouseClicked

    private void CancelarOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarOCActionPerformed
        String nroCompRow = OrdenesTable.getValueAt(OrdenesTable.getSelectedRow(), 0).toString();
        Factory.getInstance().getOrdenCompraController().cancelarOC(Integer.parseInt(nroCompRow));
        MyIcon icon = new MyIcon();
        JOptionPane.showMessageDialog(this, "Orden cancelada correctamente", "Correcto", JOptionPane.DEFAULT_OPTION, icon);
        Actualizar();
    }//GEN-LAST:event_CancelarOCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarOC;
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JButton CancelarOC;
    private javax.swing.JButton Cerrar;
    private javax.swing.JTable OrdenInfoTable;
    private javax.swing.JTable OrdenesTable;
    private javax.swing.JPanel PTotales;
    private javax.swing.JPanel PTotales1;
    private javax.swing.JPanel TPanel;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JTextField TxtTotalVal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    private static EstadoOC EOCInstancia;
}
