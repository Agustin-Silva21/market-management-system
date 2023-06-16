package Interfaz;

import Dominio.Mercado;
import Dominio.Producto.FormaVenta;
import Dominio.Producto.Tipo;
import java.awt.Image;
import java.io.File;
import java.io.Serializable;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class registrarProducto extends javax.swing.JFrame implements Serializable{

    private Mercado modelo;

    public registrarProducto() {
        initComponents();
    }

    public registrarProducto(Mercado unModelo) {
        modelo = unModelo;
        initComponents();
        ComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(modelo.getListaFormaVentaProducto());
        cajaVenta.setModel(comboBoxModel);
        comboBoxModel = new DefaultComboBoxModel<>(modelo.getListaTipoProducto());
        cajaTipo.setModel(comboBoxModel);        
        String pathDirectorio = System.getProperty("user.dir") + "/src/Helpers";
        System.out.println(pathDirectorio);
        selectorArchivo.setCurrentDirectory(new java.io.File(pathDirectorio + "/imagenesProductos"));
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        selectorArchivo.addChoosableFileFilter(filtro);
        ImageIcon imagenicon = new ImageIcon(pathDirectorio + "/No-Image-Placeholder.jpg");
        Image imagen = imagenicon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        lblImagen.setIcon(new ImageIcon(imagen));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaDescripcion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        lblVentaPor = new javax.swing.JLabel();
        selectorArchivo = new javax.swing.JFileChooser();
        cajaTipo = new javax.swing.JComboBox<>();
        cajaVenta = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Producto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblNombre.setText("Nombre:");

        lblDescripcion.setText("Descripción:");

        cajaNombre.setText("-------");
        cajaNombre.setToolTipText("Nombre del producto a agregar");
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        cajaDescripcion.setToolTipText("Descripcion del producto a agregar");
        cajaDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDescripcionActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo:");

        lblVentaPor.setText("Venta por:");

        selectorArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorArchivoActionPerformed(evt);
            }
        });

        cajaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cajaTipo.setToolTipText("Indicar el tipo de producto a agregar");
        cajaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTipoActionPerformed(evt);
            }
        });

        cajaVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cajaVenta.setToolTipText("Indicar como se cuantifica el producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblVentaPor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(selectorArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(selectorArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescripcion)
                            .addComponent(cajaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(cajaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVentaPor)
                            .addComponent(cajaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(863, 525));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int eleccion = JOptionPane.showConfirmDialog(null,
             "¿Estas seguro que desea salir?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (eleccion == JOptionPane.YES_OPTION) {
            dispose();            
        }        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String descripcion = cajaDescripcion.getText().trim();
        String nombre = cajaNombre.getText().trim();
        String tipoString = (String) cajaTipo.getSelectedItem();
        String formaVentaString = (String) cajaVenta.getSelectedItem();
        ImageIcon imagen = (ImageIcon) lblImagen.getIcon();
        if (!nombre.isEmpty() && !descripcion.isEmpty()) {
            String mensaje = "Nombre: " + nombre + "\nDescripcion: " + descripcion + "\nTipo: " + tipoString + "\nForma de Venta: " + formaVentaString;
            
            Tipo tipo = Tipo.valueOf(tipoString);
            FormaVenta formaVenta = FormaVenta.valueOf(formaVentaString);
            int opcion = JOptionPane.showOptionDialog(null,mensaje,"Titulo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,imagen,new String[]{"Guardar","Cancelar"},"Guardar");
            
            if (opcion == JOptionPane.YES_OPTION) {
                System.out.println("guardar");
                if (modelo.registrarProducto(nombre, descripcion, tipo, formaVenta)) {
                    JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente.", "Guardar Producto", JOptionPane.INFORMATION_MESSAGE);
                }

            }else if(opcion == JOptionPane.NO_OPTION) {
                System.out.println("borrartodo");
            }
            //modelo.registrarProducto();
        }
        //cajaNombre        
        //cajaCarga.setText("---");
        //cajaChapa.setText("---");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cajaDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaDescripcionActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void selectorArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorArchivoActionPerformed
        // TODO add your handling code here:
        //evt.getActionCommand().equals(ABORT)
        //int showOpenDialogue = selectorArchivo.showOpenDialog(null);
        String accion = evt.getActionCommand();
        System.out.println(accion);
        if (accion.equalsIgnoreCase("ApproveSelection")) {
            File imagenSeleccionada = selectorArchivo.getSelectedFile();
            String pathImagenSeleccionada = imagenSeleccionada.getPath();  
            ImageIcon imagenicon = new ImageIcon(pathImagenSeleccionada);
            Image imagen = imagenicon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            lblImagen.setIcon(new ImageIcon(imagen));
            String seleccion = (String) cajaTipo.getSelectedItem();
            System.out.println(seleccion);
            
        }else if(accion.equalsIgnoreCase("CancelSelection")){
            String pathDirectorio = System.getProperty("user.dir") + "/src/Helpers";
            ImageIcon imagenicon = new ImageIcon(pathDirectorio + "/No-Image-Placeholder.jpg");
            Image imagen = imagenicon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            lblImagen.setIcon(new ImageIcon(imagen));
        }
        /*if (showOpenDialogue == APPROVE_OPTION) {
            File imagenSeleccionada = selectorArchivo.getSelectedFile();
            String pathImagenSeleccionada = imagenSeleccionada.getPath();
            JOptionPane.showConfirmDialog(null, pathImagenSeleccionada);
            ImageIcon imagenicon = new ImageIcon(pathImagenSeleccionada);
            Image imagen = imagenicon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            lblImagen.setIcon(new ImageIcon(imagen));
        }
        */
        
    }//GEN-LAST:event_selectorArchivoActionPerformed

    private void cajaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTipoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField cajaDescripcion;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<String> cajaTipo;
    private javax.swing.JComboBox<String> cajaVenta;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblVentaPor;
    private javax.swing.JFileChooser selectorArchivo;
    // End of variables declaration//GEN-END:variables

}
