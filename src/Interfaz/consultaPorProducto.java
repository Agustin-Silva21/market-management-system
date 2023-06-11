/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Dominio.Mercado;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class consultaPorProducto extends javax.swing.JFrame implements PropertyChangeListener {

    private Mercado modelo;
    private PropertyChangeSupport soporteDeCambio;
    private int indice = 0;

    public consultaPorProducto() {
        initComponents();

    }
    public consultaPorProducto(Mercado unMercado) {
        soporteDeCambio = new PropertyChangeSupport(this);
        soporteDeCambio.addPropertyChangeListener(this);
        this.modelo = unMercado;
        initComponents();
        setTextFieldsAsNotEditable();
        if (!unMercado.getListaProductos().isEmpty()) {
            showProductData(indice);
        } else {
            JOptionPane.showMessageDialog(this, "No hay productos en el mercado!");
            this.dispose();
        }
    }

    public void showProductData(int indice){
        lblImagenProducto.setIcon(modelo.getListaProductos().get(indice).getImagenAsIcon());
        txtNombre.setText(modelo.getListaProductos().get(indice).getNombre());
        txtDescripcion.setText(modelo.getListaProductos().get(indice).getDescripcion());
        txtFormaventa.setText(modelo.getListaProductos().get(indice).getFormaVenta().toString());
        txtTipoProducto.setText(modelo.getListaProductos().get(indice).getTipo().toString());
    }

    public void changeIndexValue(int value){
        int viejo = this.indice;
        if (indice + value < 0) this.indice = modelo.getListaProductos().size() - 1;
        else if (indice + value > modelo.getListaProductos().size() - 1) this.indice = 0;
        else this.indice += value;
        soporteDeCambio.firePropertyChange("indice",viejo,this.indice);
    }

    public void addPropertyChangeListener(java.beans.PropertyChangeListener listener) {
        soporteDeCambio.addPropertyChangeListener(listener);
    }

    public void setTextFieldsAsNotEditable(){
        txtNombre.setEditable(false);
        txtDescripcion.setEditable(false);
        txtFormaventa.setEditable(false);
        txtTipoProducto.setEditable(false);
        txtPrecioMaxVendido.setEditable(false);
        txtPrecioMinVendido.setEditable(false);
        txtTotalCompradoPuestos.setEditable(false);
        txtTotalVendidoPuestos.setEditable(false);
        txtCantCompradaPuestos.setEditable(false);
        txtCantVendidaPuestos.setEditable(false);
    }

    @Override
    public void propertyChange(java.beans.PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("indice")) {
            showProductData(indice);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblPrecioMaximoVendido = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblImagenProducto = new javax.swing.JLabel();
        btnDerecha = new javax.swing.JButton();
        btnIzq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPuestosPrecioVentaMax = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPuestosPrecioVentaMin = new javax.swing.JList<>();
        txtDescripcion = new javax.swing.JTextField();
        txtTotalVendidoPuestos = new javax.swing.JTextField();
        txtFormaventa = new javax.swing.JTextField();
        txtTipoProducto = new javax.swing.JTextField();
        txtPrecioMaxVendido = new javax.swing.JTextField();
        txtTotalCompradoPuestos = new javax.swing.JTextField();
        txtCantVendidaPuestos = new javax.swing.JTextField();
        txtCantCompradaPuestos = new javax.swing.JTextField();
        txtPrecioMinVendido = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblNombre.setText("Nombre");

        jLabel2.setText("Precio minimo vendido:");

        jLabel3.setText("Informacion del producto:");

        jLabel4.setText("Descripcion");

        jLabel5.setText("Cantidad total comprada entre todos los puestos (unidad/kilo)");

        jLabel6.setText("Cantidad total vendida entre todos los puestos (unidad/kilo)");

        jLabel7.setText("Total $ comprado entre todos los puestos:");

        jLabel8.setText("Total $ vendido entre todos los puestos:");

        jLabel9.setText("Tipo:");

        jLabel10.setText("Venta por:");

        lblPrecioMaximoVendido.setText("Precio maximo vendido:");

        jLabel12.setText("Puestos con el precio de venta minimo:");

        jLabel13.setText("Puestos con el precio de venta maximo:");

        btnDerecha.setText(">");
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });

        btnIzq.setText("<");
        btnIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzqActionPerformed(evt);
            }
        });

        lstPuestosPrecioVentaMax.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstPuestosPrecioVentaMax);

        lstPuestosPrecioVentaMin.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstPuestosPrecioVentaMin);

        txtTotalVendidoPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVendidoPuestosActionPerformed(evt);
            }
        });

        txtTipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoProductoActionPerformed(evt);
            }
        });

        txtPrecioMaxVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioMaxVendidoActionPerformed(evt);
            }
        });

        txtTotalCompradoPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCompradoPuestosActionPerformed(evt);
            }
        });

        txtCantVendidaPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantVendidaPuestosActionPerformed(evt);
            }
        });

        txtCantCompradaPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantCompradaPuestosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(61, 61, 61)
                                .addComponent(txtTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(txtFormaventa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(lblNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPrecioMaximoVendido)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtPrecioMaxVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotalVendidoPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalCompradoPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPrecioMinVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantCompradaPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantVendidaPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(jLabel3)
                            .addComponent(lblNombre1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(txtTotalVendidoPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFormaventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(txtTotalCompradoPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtCantVendidaPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtCantCompradaPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPrecioMinVendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecioMaximoVendido)
                                    .addComponent(txtPrecioMaxVendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jLabel14)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqActionPerformed
        changeIndexValue(-1);
    }//GEN-LAST:event_btnIzqActionPerformed

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        changeIndexValue(1);
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void txtTipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoProductoActionPerformed

    private void txtPrecioMaxVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioMaxVendidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioMaxVendidoActionPerformed

    private void txtCantVendidaPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantVendidaPuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantVendidaPuestosActionPerformed

    private void txtTotalVendidoPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVendidoPuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVendidoPuestosActionPerformed

    private void txtTotalCompradoPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCompradoPuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCompradoPuestosActionPerformed

    private void txtCantCompradaPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantCompradaPuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantCompradaPuestosActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnIzq;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagenProducto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPrecioMaximoVendido;
    private javax.swing.JList<String> lstPuestosPrecioVentaMax;
    private javax.swing.JList<String> lstPuestosPrecioVentaMin;
    private javax.swing.JTextField txtCantCompradaPuestos;
    private javax.swing.JTextField txtCantVendidaPuestos;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFormaventa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioMaxVendido;
    private javax.swing.JTextField txtPrecioMinVendido;
    private javax.swing.JTextField txtTipoProducto;
    private javax.swing.JTextField txtTotalCompradoPuestos;
    private javax.swing.JTextField txtTotalVendidoPuestos;
    // End of variables declaration//GEN-END:variables
}
