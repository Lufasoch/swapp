/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import direct.market.enums.UsuarioType;
import direct.market.exceptions.UsuarioException;
import java.awt.Image;
//import java.io.File;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import direct.market.factory.Factory;
//import direct.market.controller.UsuarioControllerImpl;

class CustomFilter extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File file) {
        return (file.isDirectory()
                || file.getAbsolutePath().endsWith(".jpg")
                || file.getAbsolutePath().endsWith(".jpeg")
                || file.getAbsolutePath().endsWith(".png"));
    }

    @Override
    public String getDescription() {
        return "Archivos de imagen (*.jpg, *.jpeg, *.png)";
    }
}

/**
 *
 * @author Lufasoch
 */
public class RegistroUsuario extends javax.swing.JInternalFrame {

    private File fileImagen = null;

    public RegistroUsuario() {
        initComponents();
        this.validate();
        PanelProveedor01.setVisible(false);
        PanelProveedor02.setVisible(false);
        PanelProveedor03.setVisible(false);
        PanelProveedor04.setVisible(false);
        //// Agregar imagen y cambiar tamaño de la foto del perfil ////        
        String DirI = "Recursos/Usuarios/Perfil.jpg";
        PerfilLabel.setIcon(RZIma(DirI, 150, 150));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fotoChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        TipoU = new javax.swing.JTextField();
        TipoUC = new javax.swing.JComboBox();
        Nickname = new javax.swing.JTextField();
        NicknameC = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        NombreC = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        ApellidoC = new javax.swing.JTextField();
        eMail = new javax.swing.JTextField();
        eMailC = new javax.swing.JTextField();
        FechaNac = new javax.swing.JTextField();
        FechaNacC = new com.toedter.calendar.JDateChooser();
        PanelProveedor01 = new javax.swing.JPanel();
        Empresa = new javax.swing.JTextField();
        PanelProveedor02 = new javax.swing.JPanel();
        EmpresaC = new javax.swing.JTextField();
        PanelProveedor03 = new javax.swing.JPanel();
        SitioWeb = new javax.swing.JTextField();
        PanelProveedor04 = new javax.swing.JPanel();
        SitioWebC = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        AceptarButton = new javax.swing.JButton();
        LimpiarButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        PPanel = new javax.swing.JPanel();
        PerfilLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Foto = new javax.swing.JTextField();
        txtFotoPath = new javax.swing.JTextField();
        btnExaminarFoto = new javax.swing.JButton();
        BackgroundLabel = new javax.swing.JLabel();

        fotoChooser.setDialogTitle("Seleccione Imagen");
        fotoChooser.setFileFilter(new CustomFilter());

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(214, 228, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(8, 2, 4, 4));

        TipoU.setEditable(false);
        TipoU.setText("Tipo de Usuario");
        TipoU.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        TipoU.setEnabled(false);
        jPanel1.add(TipoU);

        TipoUC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cliente", "Proveedor" }));
        TipoUC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TipoUCItemStateChanged(evt);
            }
        });
        jPanel1.add(TipoUC);

        Nickname.setEditable(false);
        Nickname.setText("Nickname");
        Nickname.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        Nickname.setEnabled(false);
        jPanel1.add(Nickname);
        jPanel1.add(NicknameC);

        Nombre.setEditable(false);
        Nombre.setText("Nombre");
        Nombre.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        Nombre.setEnabled(false);
        jPanel1.add(Nombre);
        jPanel1.add(NombreC);

        Apellido.setEditable(false);
        Apellido.setText("Apellido");
        Apellido.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        Apellido.setEnabled(false);
        jPanel1.add(Apellido);
        jPanel1.add(ApellidoC);

        eMail.setEditable(false);
        eMail.setText("eMail");
        eMail.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        eMail.setEnabled(false);
        jPanel1.add(eMail);
        jPanel1.add(eMailC);

        FechaNac.setEditable(false);
        FechaNac.setText("Fecha de Nacimiento");
        FechaNac.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        FechaNac.setEnabled(false);
        jPanel1.add(FechaNac);
        jPanel1.add(FechaNacC);

        PanelProveedor01.setLayout(new java.awt.GridLayout(1, 0));

        Empresa.setEditable(false);
        Empresa.setText("Empresa");
        Empresa.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        Empresa.setEnabled(false);
        PanelProveedor01.add(Empresa);

        jPanel1.add(PanelProveedor01);

        PanelProveedor02.setLayout(new java.awt.GridLayout(1, 0));
        PanelProveedor02.add(EmpresaC);

        jPanel1.add(PanelProveedor02);

        PanelProveedor03.setLayout(new java.awt.GridLayout(1, 0));

        SitioWeb.setEditable(false);
        SitioWeb.setText("Sitio Web");
        SitioWeb.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        SitioWeb.setEnabled(false);
        PanelProveedor03.add(SitioWeb);

        jPanel1.add(PanelProveedor03);

        PanelProveedor04.setLayout(new java.awt.GridLayout(1, 0));
        PanelProveedor04.add(SitioWebC);

        jPanel1.add(PanelProveedor04);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 240, 750, 290);

        jPanel6.setBackground(new java.awt.Color(214, 228, 237));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(3, 1, 0, 8));

        AceptarButton.setText("Aceptar");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });
        jPanel6.add(AceptarButton);

        LimpiarButton.setText("Limpiar");
        LimpiarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarButtonActionPerformed(evt);
            }
        });
        jPanel6.add(LimpiarButton);

        CancelarButton.setText("Cerrar/Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });
        jPanel6.add(CancelarButton);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(580, 40, 190, 170);

        PPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        PPanel.setLayout(null);

        PerfilLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/Perfil.jpg"))); // NOI18N
        PPanel.add(PerfilLabel);
        PerfilLabel.setBounds(10, 10, 150, 150);

        getContentPane().add(PPanel);
        PPanel.setBounds(370, 40, 170, 170);

        jPanel7.setBackground(new java.awt.Color(214, 228, 237));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/backgroundP2.jpg")))); // NOI18N
        jPanel7.setLayout(new java.awt.GridLayout(3, 3, 0, 8));

        Foto.setEditable(false);
        Foto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Foto.setText("Foto de Perfil");
        Foto.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        Foto.setEnabled(false);
        jPanel7.add(Foto);

        txtFotoPath.setEditable(false);
        txtFotoPath.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        txtFotoPath.setEnabled(false);
        jPanel7.add(txtFotoPath);

        btnExaminarFoto.setText("Examinar");
        btnExaminarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarFotoActionPerformed(evt);
            }
        });
        jPanel7.add(btnExaminarFoto);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(20, 40, 310, 170);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Store/Recursos/background.jpg"))); // NOI18N
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 790, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoUCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TipoUCItemStateChanged
        if (TipoUC.getSelectedItem().toString().equals("Proveedor")) {
            PanelProveedor01.setVisible(true);
            PanelProveedor02.setVisible(true);
            PanelProveedor03.setVisible(true);
            PanelProveedor04.setVisible(true);
        } else {
            PanelProveedor01.setVisible(false);
            PanelProveedor02.setVisible(false);
            PanelProveedor03.setVisible(false);
            PanelProveedor04.setVisible(false);
        }
    }//GEN-LAST:event_TipoUCItemStateChanged

    private void btnExaminarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarFotoActionPerformed
        JFileChooser buscarImagen = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imágenes (bmp, jpg, png)", new String[]{"bmp", "jpg", "png"});
        buscarImagen.setAcceptAllFileFilterUsed(false);
        buscarImagen.setFileFilter(filtro);

        int result = buscarImagen.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            fileImagen = buscarImagen.getSelectedFile();
            txtFotoPath.setText(fileImagen.getPath());
            ImageIcon imageIcon = new ImageIcon(fileImagen.getPath());
            PerfilLabel.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(PerfilLabel.getWidth(), -1, Image.SCALE_AREA_AVERAGING)));
            PerfilLabel.repaint();

            //******************** GUARDAR IMGENES EN CARPETA ********************

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
     /*  
        int returnVal = fotoChooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            File fotoCliente = fotoChooser.getSelectedFile();
            try{
                String fotoClientePath = fotoCliente.getCanonicalPath();
                txtFotoPath.setText(fotoClientePath);
                //PerfilLabel.setIcon(RZIma(fotoClientePath,150,150));
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "No se puede seleccionar archivo",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }*/
    }//GEN-LAST:event_btnExaminarFotoActionPerformed

    //Solo direcciones desde "Store/"
    public ImageIcon RZIma(String DirRelativa, int Ancho, int Alto) {
        ImageIcon IcoIco = new ImageIcon(getClass().getResource(DirRelativa));
        Image img = IcoIco.getImage();
        Image newimg = img.getScaledInstance(Ancho, Alto, java.awt.Image.SCALE_SMOOTH);
        IcoIco = new ImageIcon(newimg);
        return IcoIco;
    }

    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
//        if (txtFotoPath.getText().isEmpty() || NicknameC.getText().isEmpty() || NombreC.getText().isEmpty() || ApellidoC.getText().isEmpty() || eMailC.getText().isEmpty() || FechaNacC.getDate() == null) {
//            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
//        } else if (TipoUC.getSelectedItem().toString().equals("Proveedor") && (EmpresaC.getText().isEmpty() || SitioWeb.getText().isEmpty())) {
//            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
//        } else {
        try {
            String path="";
            if (fileImagen != null) {
                path = fileImagen.getAbsolutePath();
//                String name = fileImagen.getName();
//                int pos = name.lastIndexOf('.');
//                String ext = name.substring(pos + 1);
//                path= "Recursos/Usuarios/"+NicknameC.getText()+"."+ext;
//
//                File directorio = new File("src/Store/Recursos/Usuarios/");
//                directorio.mkdir();
//
//                File destino = new File("src/Store/Recursos/Usuarios/" + NicknameC.getText() + "." + ext);
//
//                InputStream in = new FileInputStream(fileImagen);
//                OutputStream out = new FileOutputStream(destino);
//
//                byte[] buffer = new byte[1024];
//                int tamanoRes;
//
//
//                while ((tamanoRes = in.read(buffer)) > 0) {
//                    out.write(buffer, 0, tamanoRes);
//                }
//                in.close();
//                out.close();
            }
            else{
                path="Recursos/Usuarios/Perfil.jpg";
            }
            String tipo;
            if(TipoUC.getSelectedItem().toString().equals("Cliente")){
                tipo = UsuarioType.CLIENTE.name();
            }else{
                tipo = UsuarioType.PROVEEDOR.name();
            }
            Factory.getInstance().getUsuarioController().altaUsuario(NicknameC.getText(), NombreC.getText(), ApellidoC.getText(), FechaNacC.getDate(), eMailC.getText(), path, tipo, EmpresaC.getText(), SitioWebC.getText());
           // Factory.getUsuarioController().altaUsuario(NicknameC.getText(), NombreC.getText(), ApellidoC.getText(), FechaNacC.getDate(), eMailC.getText(), "", tipo, EmpresaC.getText(), SitioWebC.getText());

        
            limpiarCampos();
            this.dispose();
        } /*catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se puede seleccionar archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }*/ catch (UsuarioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());//, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AceptarButtonActionPerformed
    private void LimpiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarButtonActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_LimpiarButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        limpiarCampos();

        this.dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    public void limpiarCampos() {
        txtFotoPath.setText("");
        TipoUC.setSelectedIndex(0);
        NicknameC.setText("");
        NombreC.setText("");
        ApellidoC.setText("");
        eMailC.setText("");
        FechaNacC.setDate(null);
        EmpresaC.setText("");
        SitioWeb.setText("");
        String DirI = "Recursos/Perfil.jpg";
        PerfilLabel.setIcon(RZIma(DirI, 150, 150));
        PanelProveedor01.setVisible(false);
        PanelProveedor02.setVisible(false);
        PanelProveedor03.setVisible(false);
        PanelProveedor04.setVisible(false);
    }

    public static RegistroUsuario getInstancia() {
        if (RUInstancia == null) {
            RUInstancia = new RegistroUsuario();
        }
        return RUInstancia;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField ApellidoC;
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JTextField Empresa;
    private javax.swing.JTextField EmpresaC;
    private javax.swing.JTextField FechaNac;
    private com.toedter.calendar.JDateChooser FechaNacC;
    private javax.swing.JTextField Foto;
    private javax.swing.JButton LimpiarButton;
    private javax.swing.JTextField Nickname;
    private javax.swing.JTextField NicknameC;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreC;
    private javax.swing.JPanel PPanel;
    private javax.swing.JPanel PanelProveedor01;
    private javax.swing.JPanel PanelProveedor02;
    private javax.swing.JPanel PanelProveedor03;
    private javax.swing.JPanel PanelProveedor04;
    private javax.swing.JLabel PerfilLabel;
    private javax.swing.JTextField SitioWeb;
    private javax.swing.JTextField SitioWebC;
    private javax.swing.JTextField TipoU;
    private javax.swing.JComboBox TipoUC;
    private javax.swing.JButton btnExaminarFoto;
    private javax.swing.JTextField eMail;
    private javax.swing.JTextField eMailC;
    private javax.swing.JFileChooser fotoChooser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtFotoPath;
    // End of variables declaration//GEN-END:variables
    private static RegistroUsuario RUInstancia;
}
