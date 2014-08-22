/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lufasoch
 */
public class InfoProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form InfoProveedor
     */
    public InfoProveedor() {
        initComponents();
        this.validate();
        //// Agregar imagen y cambiar tamaño de la foto del perfil ////        
        String DirI = "Recursos\\Perfil.jpg";
        PerfilLabel.setIcon(RZIma(DirI,150,150));
        //// Se buscan los clientes
        //ABAJO//DATOS DEVUELTOS
        String[] Nicknames = { "Light" };
        String[] eMails = { "TwilightSparkle@gmail.com" };
        //ABAJO//CAMBIAR MODELO DE LA TABLA
        DefaultTableModel DTM2 = new DefaultTableModel(0, 0);
        String header[] = new String[] { "Nickname", "eMail" };
        DTM2.setColumnIdentifiers(header);
        ClientesTable.setModel(DTM2);
        ClientesTable.getColumnModel().getColumn(0).setPreferredWidth(23);
        //ARRIBA//CAMBIAR MODELO DE LA TABLA
        
        int cont = 0;//MIENTRAS NO TENGO UNA LISTA DE CLIENTES USO UN CONTADOR        
        while(cont < 1)
        {
            DTM2.addRow(new Object[] { Nicknames[cont], eMails[cont] }); 
            cont++;
        }
    }

    public ImageIcon RZIma(String DirRelativa, int Ancho, int Alto)
    {
        ImageIcon IcoIco = new ImageIcon(getClass().getResource(DirRelativa));
        Image img = IcoIco.getImage();  
        Image newimg = img.getScaledInstance(Ancho, Alto,  java.awt.Image.SCALE_SMOOTH);          
        IcoIco = new ImageIcon(newimg); 
        return IcoIco;
    }
    
    public static InfoProveedor getInstancia() {
        if (IPInstancia == null) {
            IPInstancia = new InfoProveedor();
        }
        return IPInstancia;
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
        TCompania = new javax.swing.JTextField();
        TCompaniaC = new javax.swing.JTextField();
        TPaginaWeb = new javax.swing.JTextField();
        TPaginaWebC = new javax.swing.JTextField();
        VerInfoButton = new javax.swing.JButton();
        BackgroundLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        TPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N

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
        ClientesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ClientesTable);

        javax.swing.GroupLayout TPanelLayout = new javax.swing.GroupLayout(TPanel);
        TPanel.setLayout(TPanelLayout);
        TPanelLayout.setHorizontalGroup(
            TPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );
        TPanelLayout.setVerticalGroup(
            TPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        getContentPane().add(TPanel);
        TPanel.setBounds(40, 50, 310, 410);

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
        InfoPanel.add(TNickname);

        TNicknameC.setEditable(false);
        TNicknameC.setBackground(new java.awt.Color(255, 255, 255));
        TNicknameC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        InfoPanel.add(TNicknameC);

        TeMail.setEditable(false);
        TeMail.setBackground(new java.awt.Color(255, 255, 255));
        TeMail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TeMail.setText("eMail");
        InfoPanel.add(TeMail);

        TeMailC.setEditable(false);
        TeMailC.setBackground(new java.awt.Color(255, 255, 255));
        TeMailC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        InfoPanel.add(TeMailC);

        TNombre.setEditable(false);
        TNombre.setBackground(new java.awt.Color(255, 255, 255));
        TNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TNombre.setText("Nombre");
        InfoPanel.add(TNombre);

        TNombreC.setEditable(false);
        TNombreC.setBackground(new java.awt.Color(255, 255, 255));
        TNombreC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        InfoPanel.add(TNombreC);

        TApellido.setEditable(false);
        TApellido.setBackground(new java.awt.Color(255, 255, 255));
        TApellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TApellido.setText("Apellido");
        InfoPanel.add(TApellido);

        TApellidoC.setEditable(false);
        TApellidoC.setBackground(new java.awt.Color(255, 255, 255));
        TApellidoC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        InfoPanel.add(TApellidoC);

        TFechaNac.setEditable(false);
        TFechaNac.setBackground(new java.awt.Color(255, 255, 255));
        TFechaNac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TFechaNac.setText("Fecha de Nacimiento");
        InfoPanel.add(TFechaNac);

        TFechaNacC.setEditable(false);
        TFechaNacC.setBackground(new java.awt.Color(255, 255, 255));
        TFechaNacC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        InfoPanel.add(TFechaNacC);

        TTipoU.setEditable(false);
        TTipoU.setBackground(new java.awt.Color(255, 255, 255));
        TTipoU.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TTipoU.setText("Tipo de Usuario");
        InfoPanel.add(TTipoU);

        TTipoUC.setEditable(false);
        TTipoUC.setBackground(new java.awt.Color(255, 255, 255));
        TTipoUC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        InfoPanel.add(TTipoUC);

        TCompania.setEditable(false);
        TCompania.setBackground(new java.awt.Color(255, 255, 255));
        TCompania.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TCompania.setText("Compañía");
        InfoPanel.add(TCompania);

        TCompaniaC.setEditable(false);
        TCompaniaC.setBackground(new java.awt.Color(255, 255, 255));
        TCompaniaC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        InfoPanel.add(TCompaniaC);

        TPaginaWeb.setEditable(false);
        TPaginaWeb.setBackground(new java.awt.Color(255, 255, 255));
        TPaginaWeb.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TPaginaWeb.setText("Pagina Web");
        InfoPanel.add(TPaginaWeb);

        TPaginaWebC.setEditable(false);
        TPaginaWebC.setBackground(new java.awt.Color(255, 255, 255));
        TPaginaWebC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        InfoPanel.add(TPaginaWebC);

        getContentPane().add(InfoPanel);
        InfoPanel.setBounds(390, 240, 360, 280);

        VerInfoButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        VerInfoButton.setText("Ver Informacion del Proveedor");
        VerInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInfoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VerInfoButton);
        VerInfoButton.setBounds(40, 470, 310, 50);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/background.jpg"))); // NOI18N
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 790, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInfoButtonActionPerformed
        String nicknameP = ClientesTable.getValueAt(ClientesTable.getSelectedRow(), 0).toString();//NICKNAME PARA BUSCAR AL USUARIO
        //BUSCAR INFORMACION DE USUARIO
        //ABAJO//DATOS DEVUELTOS
        String[] DatosU = {"Light", "TwilightSparkle@gmail.com", "Twilight", "Sparkle", "Proveedor", "Rainbow INC", "www.RainbowINC.com", "Recursos\\U.jpg"};        
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        java.util.Date FechaU = new Date(95,8,17);
        //ARRIBA//DATOS DEVUELTOS
        //ABAJO//IMPRIMIR DATOS
        TNicknameC.setText(DatosU[0]);
        TeMailC.setText(DatosU[1]);
        TNombreC.setText(DatosU[2]);
        TApellidoC.setText(DatosU[3]);
        TFechaNacC.setText(sdf.format(FechaU.getTime()));
        TTipoUC.setText(DatosU[4]);
        TCompaniaC.setText(DatosU[5]);
        TPaginaWebC.setText(DatosU[6]);
        PerfilLabel.setIcon(RZIma(DatosU[7],150,150));        
        //ARRIBA//IMPRIMIR DATOS
    }//GEN-LAST:event_VerInfoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JTable ClientesTable;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JPanel PPanel;
    private javax.swing.JLabel PerfilLabel;
    private javax.swing.JTextField TApellido;
    private javax.swing.JTextField TApellidoC;
    private javax.swing.JTextField TCompania;
    private javax.swing.JTextField TCompaniaC;
    private javax.swing.JTextField TFechaNac;
    private javax.swing.JTextField TFechaNacC;
    private javax.swing.JTextField TNickname;
    private javax.swing.JTextField TNicknameC;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTextField TNombreC;
    private javax.swing.JTextField TPaginaWeb;
    private javax.swing.JTextField TPaginaWebC;
    private javax.swing.JPanel TPanel;
    private javax.swing.JTextField TTipoU;
    private javax.swing.JTextField TTipoUC;
    private javax.swing.JTextField TeMail;
    private javax.swing.JTextField TeMailC;
    private javax.swing.JButton VerInfoButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private static InfoProveedor IPInstancia;
}
