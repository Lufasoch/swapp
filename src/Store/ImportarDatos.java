/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import direct.market.datatype.DataCategoria;
import direct.market.datatype.DataEspecificacionProducto;
import direct.market.datatype.DataLineaOC;
import direct.market.datatype.DataOC;
import direct.market.datatype.DataProducto;
import direct.market.datatype.DataUsuario;
import direct.market.exceptions.CategoryException;
import direct.market.exceptions.OCException;
import direct.market.exceptions.ProductoException;
import direct.market.exceptions.UsuarioException;
import direct.market.factory.Factory;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kavesa
 */
public class ImportarDatos extends javax.swing.JInternalFrame {

    /**
     * Creates new form ImportarDatos
     */
    public ImportarDatos() {
        initComponents();
    }

    public static ImportarDatos getInstancia() {
        if (IDInstancia == null) {
            IDInstancia = new ImportarDatos();
        }
        return IDInstancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btImportar = new javax.swing.JButton();
        lblImportar = new javax.swing.JLabel();
        lblImporter = new javax.swing.JLabel();

        setClosable(true);

        btImportar.setText("Importar");
        btImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImportarActionPerformed(evt);
            }
        });

        lblImportar.setText("Importacion de datos de prueba");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblImporter, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btImportar))
                            .addComponent(lblImportar))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(lblImportar)
                .addGap(34, 34, 34)
                .addComponent(btImportar)
                .addGap(56, 56, 56)
                .addComponent(lblImporter)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImportarActionPerformed
//Alta Usuarios
//verificar el formato de las fechas
        try {
            Factory.getInstance().getUsuarioController().altaUsuario("Tim1", "Tim ", "Cook", new Date(-289267200000L), "tim.cook@apple.com", "fotos/cook_thumb20110204.jpg", "PROVEEDOR", "Apple", "www.apple.com");
            Factory.getInstance().getUsuarioController().altaUsuario("Eddy", "Eduardo", "Cue", new Date(136684800000L), "eddy.cue@samsung.com", "fotos/cue_thumb20110901.jpg", "PROVEEDOR", "Samsung", "www.samsung.com");
            Factory.getInstance().getUsuarioController().altaUsuario("CraigX", "Craig", "Federighi", new Date(10627200000L), "craig.feder@sony.com", "fotos/federighi_thumb20120727.jpg", "PROVEEDOR", "Sony", "us.playstation.com");
            Factory.getInstance().getUsuarioController().altaUsuario("Johnny", "Jonathan", "Ive", new Date(-91065600000L), "johnny.ive@outlook.com", "fotos/ive_thumb20110204.jpg", "PROVEEDOR", "Microsoft", "www.xbox.com");
            Factory.getInstance().getUsuarioController().altaUsuario("OpenPeter", "Peter", "Oppenhemier", new Date(-202262400000L), "peter.open@htc.com", "fotos/default.jpg", "PROVEEDOR", "HTC", "www.htc.com");
            Factory.getInstance().getUsuarioController().altaUsuario("Dan", "Daniel", "Riccio", new Date(-204940800000L), "dan.riccio@gmail.com", "fotos/default.jpg", "CLIENTE", null, null);
            Factory.getInstance().getUsuarioController().altaUsuario("Phil", "Philip", "Schiller", new Date(-259891200000L), "phil.schiller@gmail.com", "fotos/schiller_thumb20110204.jpg", "CLIENTE", null, null);
            Factory.getInstance().getUsuarioController().altaUsuario("BruceS", "Bruce", "Sewell", new Date(-318124800000L), "bruce.sewell@gmail.com", "fotos/default.jpg", "CLIENTE", null, null);
            Factory.getInstance().getUsuarioController().altaUsuario("JeffW", "Jeff", "Wiliams", new Date(-160790400000L), "jeff.williams@gmail.com", "fotos/default.jpg", "CLIENTE", null, null);
        } catch (UsuarioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

//Alta Categorias
//los valores TRUE o FALSE se tomaron considerando las categorías que tienen subcategorías o no. Resulta coherente también con los productos ingresados.
        try {
            Factory.getInstance().getCategoriaController().altaCategoria("Categorias", "Celulares", false);
            Factory.getInstance().getCategoriaController().altaCategoria("Celulares", "Sistemas Operativos", false);
            Factory.getInstance().getCategoriaController().altaCategoria("Sistemas Operativos", "iOS", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Sistemas Operativos", "Android", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Sistemas Operativos", "Windows Phone", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Sistemas Operativos", "Symbian", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Sistemas Operativos", "Blackberry OS", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Celulares", "Equipos", false);
            Factory.getInstance().getCategoriaController().altaCategoria("Equipos", "iPhone", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Equipos", "Nexus", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Equipos", "Samsung", false);
            Factory.getInstance().getCategoriaController().altaCategoria("Samsung", "Galaxy S3", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Samsung", "Galaxy S4", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Samsung", "Galaxy Ace", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Equipos", "Blackberry", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Equipos", "Nokia", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Celulares", "Accesorios", false);
            Factory.getInstance().getCategoriaController().altaCategoria("Accesorios", "Protectores", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Accesorios", "Baterías", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Categorias", "Apple", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Categorias", "Videojuegos", false);
            Factory.getInstance().getCategoriaController().altaCategoria("Videojuegos", "Playstation", true);
            Factory.getInstance().getCategoriaController().altaCategoria("Videojuegos", "Xbox", true);
        } catch (CategoryException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

        //Alta de Productos =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
//Producto 1 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        try {
            DataProducto dp = new DataProducto();
            dp.setNombre("iPhone 5");
            dp.setReferencia("1");
//Producto 1 Categorias
            List<DataCategoria> lDC = new ArrayList<DataCategoria>();
            DataCategoria dataCategoria;
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("iPhone");
            lDC.add(dataCategoria);
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("iOS");
            lDC.add(dataCategoria);
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Apple");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 1 Proveedor
            DataUsuario dataProv = new DataUsuario();
            dataProv.setNickname("Tim1");
            dp.setDataProveedor(dataProv);
//Producto 1 Especificacion
            DataEspecificacionProducto dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("El último celular de Apple");
            dataEsp.setEspecificacion("Capacidad: 16 GB\nPeso: 112 g\nPantalla: 4\"\nVersiones de Wifi: a/b/g/n");
            dataEsp.setPrecio(Double.parseDouble("199"));
//Producto 1 Especificacion Imagenes
            List<String> imagenes = new ArrayList<String>();
            imagenes.add("fotos/IM1-topic_iphone_5.png");
            dataEsp.setImagenes(imagenes);

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

            //Producto 2 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("iPhone 4S");
            dp.setReferencia("2");
//Producto 2 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("iPhone");
            lDC.add(dataCategoria);
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("iOS");
            lDC.add(dataCategoria);
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Apple");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 2 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("Tim1");
            dp.setDataProveedor(dataProv);
//Producto 2 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("El siguiente celular al iPhone 4");
            dataEsp.setEspecificacion("Capacidad: 16 GB\nPeso: 140 g\nPantalla: 3.5\"\nVersiones de Wifi: b/g/n");
            dataEsp.setPrecio(Double.parseDouble("99"));
//Producto 2 Especificacion Imagenes
            imagenes = new ArrayList<String>();
            imagenes.add("fotos/IM2-color_black.jpg");
            dataEsp.setImagenes(imagenes);

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

//Producto 3 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("Nexus4");
            dp.setReferencia("3");
//Producto 3 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Android");
            lDC.add(dataCategoria);
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Nexus");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 3 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("Eddy");
            dp.setDataProveedor(dataProv);
//Producto 3 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("El celular de Google");
            dataEsp.setEspecificacion("Capacidad: 8 GB\nPeso: 139 g\nPantalla: 4.7\"\nVersión de Android: 4.3");
            dataEsp.setPrecio(Double.parseDouble("299"));
//Producto 3 Especificacion Imagenes
            imagenes = new ArrayList<String>();
            imagenes.add("fotos/IM3-n4-buy-1200.jpg");
            imagenes.add("fotos/IM4-N4_Google_Maps-1200.jpg");
            dataEsp.setImagenes(imagenes);

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

//Producto 4 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("Samsung Galaxy S3");
            dp.setReferencia("4");
//Producto 4 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Android");
            lDC.add(dataCategoria);
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Galaxy S3");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 4 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("Eddy");
            dp.setDataProveedor(dataProv);
//Producto 4 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("La versión S3 de la línea Samsung Galaxy");
            dataEsp.setEspecificacion("Dimensiones: 136.6 x 70.6 x 8.6 mm\nPeso: 133 g\nPantalla: 4.8\"\nVersión de Android: 4.0.4");
            dataEsp.setPrecio(Double.parseDouble("415"));
//Producto 4 Especificacion Imagenes
//no tiene imagenes (en nuestro codigo, si no tiene imagenes, directamente no carga ese atributo al dataEspecificacion

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

//Producto 5 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("Samsung Galaxy S4");
            dp.setReferencia("5");
//Producto 5 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Android");
            lDC.add(dataCategoria);
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Galaxy S4");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 5 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("Eddy");
            dp.setDataProveedor(dataProv);
//Producto 5 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("La versión S4 de la línea Samsung Galaxy");
            dataEsp.setEspecificacion("Dimensiones: 136.6 x 69.8 x 7.9 mm\nPeso: 130 g\nPantalla: 4.99\"\nVersión de Android: 4.2.2");
            dataEsp.setPrecio(Double.parseDouble("839.99"));
//Producto 5 Especificacion Imagenes
            imagenes = new ArrayList<String>();
            imagenes.add("fotos/IM5-samsung-galaxy-s4.jpg");
            dataEsp.setImagenes(imagenes);

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

//Producto 6 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("Galaxy Ace S5830");
            dp.setReferencia("6");
//Producto 6 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Android");
            lDC.add(dataCategoria);
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Galaxy Ace");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 6 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("Eddy");
            dp.setDataProveedor(dataProv);
//Producto 6 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("La versión Ace de la línea Samsung Galaxy");
            dataEsp.setEspecificacion("Dimensiones: 112.4 x 59.9 x 11.5 mm\nPeso: 113 g\nPantalla: 3.5\"\nVersión de Android: 2.3");
            dataEsp.setPrecio(Double.parseDouble("237"));
//Producto 6 Especificacion Imagenes
            imagenes = new ArrayList<String>();
            imagenes.add("fotos/IM6-samsung-galaxy-ace-s5830.jpg");
            dataEsp.setImagenes(imagenes);

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

//Producto 7 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("Protector de cuero para Galaxy");
            dp.setReferencia("7");
//Producto 7 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Protectores");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 7 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("Eddy");
            dp.setDataProveedor(dataProv);
//Producto 7 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("Asombroso protector de cuero para Samsung Galaxy I900");
            dataEsp.setEspecificacion("Dimensiones: 12.5 cm x 6.7 cm x 2.0 cm\nPeso: 44 g");
            dataEsp.setPrecio(Double.parseDouble("3.50"));
//Producto 7 Especificacion Imagenes
//Sin imagenes

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

//Producto 8 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("Protector de aluminio para HTC");
            dp.setReferencia("8");
//Producto 8 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Protectores");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 8 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("OpenPeter");
            dp.setDataProveedor(dataProv);
//Producto 8 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("El mejor protector de aluminio para HTC Desire HD");
            dataEsp.setEspecificacion("Dimensiones: 12.4 cm x 7.0 cm x 1.3 cm\nPeso: 26 g");
            dataEsp.setPrecio(Double.parseDouble("3.40"));
//Producto 8 Especificacion Imagenes
//Sin imagenes

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

//Producto 9 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("iPad Retina Display");
            dp.setReferencia("9");
//Producto 9 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Apple");
            lDC.add(dataCategoria);
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("iOS");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 9 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("Tim1");
            dp.setDataProveedor(dataProv);
//Producto 9 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("La última tableta de Apple con pantalla Retina");
            dataEsp.setEspecificacion("Capacidad: 16 GB\nPeso: 652 g\nPantalla: 9.7\"\nProcesador: A6X");
            dataEsp.setPrecio(Double.parseDouble("499"));
//Producto 9 Especificacion Imagenes
            imagenes = new ArrayList<String>();
            imagenes.add("fotos/IM7-2012-ipadrd-step1-black.png");
            dataEsp.setImagenes(imagenes);

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

//Producto 10 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("iPad Mini");
            dp.setReferencia("10");
//Producto 10 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Apple");
            lDC.add(dataCategoria);
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("iOS");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 10 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("Tim1");
            dp.setDataProveedor(dataProv);
//Producto 10 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("La primera tableta chica de Apple");
            dataEsp.setEspecificacion("Capacidad: 16 GB\nPeso: 308 g\nPantalla: 7.9\"\nProcesador: A5");
            dataEsp.setPrecio(Double.parseDouble("329"));
//Producto 10 Especificacion Imagenes
            imagenes = new ArrayList<String>();
            imagenes.add("fotos/IM8-specs_color.jpg");
            dataEsp.setImagenes(imagenes);

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

//Producto 11 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("Receptor inalámbrico para Xbox");
            dp.setReferencia("11");
//Producto 11 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Xbox");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 11 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("Johnny");
            dp.setDataProveedor(dataProv);
//Producto 11 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("Receptor inalámbrico de color negro para controles de Xbox 360");
            dataEsp.setEspecificacion("Dimensiones: 7.5 cm x 4.2 cm x 1.8 cm\nPeso: 111 g");
            dataEsp.setPrecio(Double.parseDouble("10.99"));
//Producto 11 Especificacion Imagenes
//Sin imagenes

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

//Producto 12 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("Control inalámbrico para Xbox");
            dp.setReferencia("12");
//Producto 12 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Xbox");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 12 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("Johnny");
            dp.setDataProveedor(dataProv);
//Producto 12 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("Control inalámbrico de 2.4 GHz para Xbox 360");
            dataEsp.setEspecificacion("Garantía: 3 meses\nDimensiones: 5.91 in x 4.33 in x 1.77 in\nPeso: 7.83 oz");
            dataEsp.setPrecio(Double.parseDouble("27.27"));
//Producto 12 Especificacion Imagenes
//Sin imagenes

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

//Producto 13 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("Cable HDMI para PS3");
            dp.setReferencia("13");
//Producto 13 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Playstation");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 13 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("CraigX");
            dp.setDataProveedor(dataProv);
//Producto 13 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("Es un cable HDMI para PS3");
            dataEsp.setEspecificacion("Dimensiones: 0 in x 0 in x 0 in\nPeso: 7.83 oz");
            dataEsp.setPrecio(Double.parseDouble("7.99"));
//Producto 13 Especificacion Imagenes
//Sin imagenes

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);

//Producto 14 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            dp = new DataProducto();
            dp.setNombre("Control para PS3");
            dp.setReferencia("14");
//Producto 14 Categorias
            lDC = new ArrayList<DataCategoria>();
            dataCategoria = Factory.getInstance().getCategoriaController().getCategoriaPorNombre("Playstation");
            lDC.add(dataCategoria);
            dp.setDataCategorias(lDC);
//Producto 14 Proveedor
            dataProv = new DataUsuario();
            dataProv.setNickname("CraigX");
            dp.setDataProveedor(dataProv);
//Producto 14 Especificacion
            dataEsp = new DataEspecificacionProducto();
            dataEsp.setDescripcion("Control inalámbrico Dualshock 3 de color azul para Playstation 3");
            dataEsp.setEspecificacion("Dimensiones: 16.0 cm x 9.5 cm x 5.0 cm\nPeso: 184 g");
            dataEsp.setPrecio(Double.parseDouble("30.80"));
//Producto 14 Especificacion Imagenes
//Sin imagenes

            dp.setDataEspecificacion(dataEsp);
            Factory.getInstance().getProductoController().altaProducto(dp);


//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=
//Alta OC =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=

//OC 1 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-
            DataOC doc = new DataOC(1, new Date(1376265600000L), Double.parseDouble("1855"));
            List<DataLineaOC> lineas = new ArrayList<DataLineaOC>();
            DataLineaOC dl = new DataLineaOC(1, Factory.getInstance().getProductoController().buscarProductoPorName("iPhone 5"));
            lineas.add(dl);
            dl = new DataLineaOC(2, Factory.getInstance().getProductoController().buscarProductoPorName("iPad Retina Display"));
            lineas.add(dl);
            dl = new DataLineaOC(2, Factory.getInstance().getProductoController().buscarProductoPorName("iPad Mini"));
            lineas.add(dl);
            doc.setLineas(lineas);

            int numOC = Factory.getInstance().getOrdenCompraController().altaOrdenCompra(doc);

            DataOC dataOrdenCompra = Factory.getInstance().getOrdenCompraController().getDataOC(Integer.valueOf(numOC).toString());
            DataUsuario dataUsuario = Factory.getInstance().getUsuarioController().getDataCliente("Dan");
            dataUsuario.addDataOrdenCompra(dataOrdenCompra);
            Factory.getInstance().getUsuarioController().modificarCliente(dataUsuario, numOC);

//OC 2 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-
            doc = new DataOC(2, new Date(1376870400000L), Double.parseDouble("897"));
            lineas = new ArrayList<DataLineaOC>();
            dl = new DataLineaOC(3, Factory.getInstance().getProductoController().buscarProductoPorName("Nexus4"));
            lineas.add(dl);
            doc.setLineas(lineas);

            numOC = Factory.getInstance().getOrdenCompraController().altaOrdenCompra(doc);

            dataOrdenCompra = Factory.getInstance().getOrdenCompraController().getDataOC(Integer.valueOf(numOC).toString());
            dataUsuario = Factory.getInstance().getUsuarioController().getDataCliente("Dan");
            dataUsuario.addDataOrdenCompra(dataOrdenCompra);
            Factory.getInstance().getUsuarioController().modificarCliente(dataUsuario, numOC);

//OC 3 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-
            doc = new DataOC(3, new Date(1376870400000L), Double.parseDouble("108.38"));
            lineas = new ArrayList<DataLineaOC>();
            dl = new DataLineaOC(2, Factory.getInstance().getProductoController().buscarProductoPorName("Cable HDMI para PS3"));
            lineas.add(dl);
            dl = new DataLineaOC(3, Factory.getInstance().getProductoController().buscarProductoPorName("Control para PS3"));
            lineas.add(dl);
            doc.setLineas(lineas);

            numOC = Factory.getInstance().getOrdenCompraController().altaOrdenCompra(doc);

            dataOrdenCompra = Factory.getInstance().getOrdenCompraController().getDataOC(Integer.valueOf(numOC).toString());
            dataUsuario = Factory.getInstance().getUsuarioController().getDataCliente("Phil");
            dataUsuario.addDataOrdenCompra(dataOrdenCompra);
            Factory.getInstance().getUsuarioController().modificarCliente(dataUsuario, numOC);

//OC 4 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-
            doc = new DataOC(4, new Date(1377129600000L), Double.parseDouble("109.08"));
            lineas = new ArrayList<DataLineaOC>();
            dl = new DataLineaOC(4, Factory.getInstance().getProductoController().buscarProductoPorName("Control inalámbrico para Xbox"));
            lineas.add(dl);
            doc.setLineas(lineas);

            numOC = Factory.getInstance().getOrdenCompraController().altaOrdenCompra(doc);

            dataOrdenCompra = Factory.getInstance().getOrdenCompraController().getDataOC(Integer.valueOf(numOC).toString());
            dataUsuario = Factory.getInstance().getUsuarioController().getDataCliente("BruceS");
            dataUsuario.addDataOrdenCompra(dataOrdenCompra);
            Factory.getInstance().getUsuarioController().modificarCliente(dataUsuario, numOC);

//OC 5 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-
            doc = new DataOC(5, new Date(1377388800000L), Double.parseDouble("3.0"));
            lineas = new ArrayList<DataLineaOC>();
            dl = new DataLineaOC(1, Factory.getInstance().getProductoController().buscarProductoPorName("Protector de cuero para Galaxy"));
            lineas.add(dl);
            doc.setLineas(lineas);

            numOC = Factory.getInstance().getOrdenCompraController().altaOrdenCompra(doc);

            dataOrdenCompra = Factory.getInstance().getOrdenCompraController().getDataOC(Integer.valueOf(numOC).toString());
            dataUsuario = Factory.getInstance().getUsuarioController().getDataCliente("JeffW");
            dataUsuario.addDataOrdenCompra(dataOrdenCompra);
            Factory.getInstance().getUsuarioController().modificarCliente(dataUsuario, numOC);

        
            lblImporter.setText("Importacion terminada");
        
        } catch (ProductoException ex) {
            Logger.getLogger(ImportarDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CategoryException ex) {
            Logger.getLogger(ImportarDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (OCException ex) {
            Logger.getLogger(ImportarDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UsuarioException ex) {
            Logger.getLogger(ImportarDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ImportarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btImportarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btImportar;
    private javax.swing.JLabel lblImportar;
    private javax.swing.JLabel lblImporter;
    // End of variables declaration//GEN-END:variables
    private static ImportarDatos IDInstancia;
}
