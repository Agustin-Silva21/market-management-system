// Gabriel Machado 318697, Agustin Silva 310087
package Interfaz;

import Dominio.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class VentanaCompra extends javax.swing.JFrame implements PropertyChangeListener{

    public VentanaCompra(Mercado unMercado) {
        mercado = unMercado;
        mercado.addPropertyChangeListener(this);
        initComponents();
        this.setSize(1000,1000);
        productosAComprar = new HashMap<>();
        cantidadYPrecioParaMostrar = new ArrayList<>();
        lstPuestos.setListData(mercado.getListaPuestos().toArray());
        lstMayoristas.setListData(mercado.getListaMayoristas().toArray());
        txtCantidad.setText("0");
        txtPrecioUnitario.setText("0");
        txtCantidad.getDocument().addDocumentListener(new MyDocumentListener());
        txtPrecioUnitario.getDocument().addDocumentListener(new MyDocumentListener());
        banderaCambioMayorista = false;
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        if (evt.getPropertyName().equals("listaPuestos") || 
                evt.getPropertyName().equals("listaMayoristas")){
            reCargar();
        }
    }
    
    private class MyDocumentListener implements DocumentListener{
        @Override
        public void insertUpdate(DocumentEvent e) {
            actualizarPrecioTotal();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            actualizarPrecioTotal();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            actualizarPrecioTotal();
        }
        private void actualizarPrecioTotal() {
            try {
                
                String auxCant= txtCantidad.getText().replace(",", 
                        ".");
                String auxPrec= txtPrecioUnitario.getText().replace(",", 
                        ".");
                
                float cant = Float.parseFloat(auxCant);
                float precio = Float.parseFloat(auxPrec);
                float precioTotal = cant * precio;
                txtPrecioTotal.setText(String.valueOf(precioTotal));
            } catch (NumberFormatException ex) {
                txtPrecioTotal.setText("0");
            }
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPuestos = new javax.swing.JList();
        lblCompra = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMayoristas = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProductosOfrecidos = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstProductosAComprar = new javax.swing.JList();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioUnitario = new javax.swing.JTextField();
        txtPrecioTotal = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();
        btnQuitarProducto = new javax.swing.JButton();
        lblPuestos = new javax.swing.JLabel();
        lblMayoristas = new javax.swing.JLabel();
        lblOfertaProductos = new javax.swing.JLabel();
        lblProductosSeleccionados = new javax.swing.JLabel();
        lblCantComprar = new javax.swing.JLabel();
        lblPrecioUnitario = new javax.swing.JLabel();
        lblPrecioTotal = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstProductosAComprarDatos = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lstPuestos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstPuestos);

        lblCompra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCompra.setText("Registro de Compras");

        lstMayoristas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstMayoristas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMayoristasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstMayoristas);

        lstProductosOfrecidos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstProductosOfrecidos);

        lstProductosAComprar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstProductosAComprar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProductosAComprarValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstProductosAComprar);

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnAgregarProducto.setText("->");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnQuitarProducto.setText("<-");
        btnQuitarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarProductoActionPerformed(evt);
            }
        });

        lblPuestos.setText("Puestos");

        lblMayoristas.setText("Mayoristas");

        lblOfertaProductos.setText("Oferta");

        lblProductosSeleccionados.setText("A Comprar");

        lblCantComprar.setText("Seleccione la cantidad a comprar:");

        lblPrecioUnitario.setText("Seleccione el precio unitario:");

        lblPrecioTotal.setText("Precio Total");

        lstProductosAComprarDatos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstProductosAComprarDatos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProductosAComprarDatosValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(lstProductosAComprarDatos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(lblCompra))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblMayoristas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblOfertaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPrecioUnitario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCantComprar)
                                        .addGap(52, 52, 52)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecioTotal)
                            .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuitarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                            .addComponent(lblProductosSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMayoristas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOfertaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductosSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(btnAgregarProducto)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnQuitarProducto)))
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCantComprar)
                                    .addComponent(lblPrecioTotal)
                                    .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPrecioUnitario)
                                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(254, 254, 254))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if(!lstPuestos.isSelectionEmpty() && !lstMayoristas.isSelectionEmpty() 
                && !productosAComprar.isEmpty()){
        
            Puesto unPuesto = (Puesto)lstPuestos.getSelectedValue();
            Mayorista unMayorista = (Mayorista)lstMayoristas.getSelectedValue();
            
            mercado.comprarProducto(productosAComprar, unPuesto, 
                    unMayorista);
            JOptionPane.showMessageDialog(this, "Se registro el "
                    + "movimiento numero: " + mercado.getListaMovimientos().
                    get(mercado.getListaMovimientos().size() - 1).getId(),
                    "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
            this.cantidadYPrecioParaMostrar.clear();
            this.productosAComprar.clear();
            this.lstProductosAComprar.setListData(productosAComprar.
                    keySet().toArray());
            this.lstProductosAComprarDatos.setListData(
                    cantidadYPrecioParaMostrar.toArray());
            
        } else{
            String mensajeError = "";
            if(lstPuestos.isSelectionEmpty()){
                mensajeError += "Seleccione un Puesto.\n";
            }
            if(lstMayoristas.isSelectionEmpty()){
                mensajeError += "Seleccione un Mayorista.\n";
            }
            if(productosAComprar.isEmpty()){
                mensajeError += "No tienes productos en el carrito.\n";
            }
            JOptionPane.showMessageDialog(this, 
                    mensajeError, "Faltan algunos Datos",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void lstMayoristasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMayoristasValueChanged
        if(!banderaCambioMayorista){        
            if(lstMayoristas.isSelectionEmpty() || productosAComprar.isEmpty()){

                // CUIDADO!! mayoristaAnterior y posicion son el mismo valor por ahora. Si luego ordeno los mayoristas a mostrar serian valores diferentes.
                mayoristaAnterior = lstMayoristas.getSelectedIndex();
                Mayorista mayoristaSeleccionado = (Mayorista) lstMayoristas.
                        getSelectedValue();
                int posicion = mercado.getListaMayoristas().indexOf(
                        mayoristaSeleccionado);
                lstProductosOfrecidos.setListData(mercado.getListaMayoristas()
                        .get(posicion).getProducto().toArray());
            } else {
                int opcion = JOptionPane.showConfirmDialog(this, 
                        "Esta seguro que desea cambiar el Mayorista?\n"
                        + "Su carrito se vaciara en caso de aceptar!", 
                        "Confirmacion", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION){

                    mayoristaAnterior = lstMayoristas.getSelectedIndex();
                    Mayorista mayoristaSeleccionado = (Mayorista) lstMayoristas.
                            getSelectedValue();
                    int posicion = mercado.getListaMayoristas().indexOf(
                            mayoristaSeleccionado);
                    lstProductosOfrecidos.setListData(mercado.getListaMayoristas()
                            .get(posicion).getProducto().toArray());

                    productosAComprar.clear();
                    cantidadYPrecioParaMostrar.clear();

                    lstProductosAComprar.setListData(productosAComprar.
                            keySet().toArray());
                    lstProductosAComprarDatos.setListData(
                            cantidadYPrecioParaMostrar.toArray());            
                } else {
                    banderaCambioMayorista = true;
                    lstMayoristas.setSelectedIndex(mayoristaAnterior);
                }
            }
        } else{
            banderaCambioMayorista = false;
        }
    }//GEN-LAST:event_lstMayoristasValueChanged

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        String mensajeError = "";
        boolean hayCantidad = true;
        boolean hayPrecio = true;
        
        // Control de diferente a 0 y formato numerico (por ahora acepta . y ,
        if(txtCantidad.getText().equals("0")){
            mensajeError += "Seleccione una cantidad\n";
            hayCantidad = false;
        }else if(!txtCantidad.getText().matches("\\d+[.,]?\\d*")){
            mensajeError += "Seleccione una cantidad en formato numerico\n";
        }
        if(txtPrecioUnitario.getText().equals("0")){
            mensajeError += "Seleccione un precio por unidad\n";
            hayPrecio = false;
        }else if(!txtPrecioUnitario.getText().matches("\\d+[.,]?\\d*")){
            mensajeError += "Seleccione una cantidad en formato numerico\n";
            hayPrecio = false;
        }
        
        
        if(!lstProductosOfrecidos.isSelectionEmpty() && hayCantidad && hayPrecio){
            // Cambio "," por "."
            if (txtCantidad.getText().contains(",")){
                String aux= txtCantidad.getText().replace(",", ".");
                txtCantidad.setText(aux);
            }
            if (txtPrecioUnitario.getText().contains(",")){
                String aux= txtPrecioUnitario.getText().replace(",", ".");
                txtPrecioUnitario.setText(aux);
            }
            
            //Guardo los datos de cantidad y precio y limpio los campos
            float[] cantYPrecio = {Float.parseFloat(txtCantidad.getText()),
                Float.parseFloat(txtPrecioUnitario.getText())};
            txtCantidad.setText("0");
            txtPrecioUnitario.setText("0");
            
            int indiceAux = -1;
            if(productosAComprar.containsKey((Producto)lstProductosOfrecidos.
                    getSelectedValue())){
                Object[] listaAux = productosAComprar.keySet().toArray();
                for( int i = 0; i < productosAComprar.size(); i++){
                    Producto pAux = (Producto)listaAux[i];
                    if (pAux.equals(lstProductosOfrecidos.getSelectedValue())){
                        indiceAux = i;
                        cantidadYPrecioParaMostrar.remove(indiceAux);
                    }
                }
            }
            
            if (indiceAux == -1){
                cantidadYPrecioParaMostrar.add("$" + cantYPrecio[0] + "; x" + 
                        cantYPrecio[1] + " = " + (cantYPrecio[0] * cantYPrecio[1]));
            } else{
                cantidadYPrecioParaMostrar.add(indiceAux,"$" + cantYPrecio[0] 
                + "; x" + cantYPrecio[1] + " = " + (cantYPrecio[0] * cantYPrecio[1]));
            }
            lstProductosAComprarDatos.setListData(cantidadYPrecioParaMostrar
                    .toArray());            
            
            productosAComprar.put((Producto)lstProductosOfrecidos.getSelectedValue(),
                    cantYPrecio);
            lstProductosAComprar.setListData(productosAComprar.keySet().
                    toArray());
            
        } else{
            mensajeError += "Seleccione un producto\n";
            JOptionPane.showMessageDialog(this, mensajeError, 
                    "Faltan algunos Datos", JOptionPane.
                            INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void lstProductosAComprarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstProductosAComprarValueChanged
        if (!evt.getValueIsAdjusting()) {
            int posicionSeleccionada = lstProductosAComprar.getSelectedIndex();
            lstProductosAComprarDatos.setSelectedIndex(posicionSeleccionada);
        }
    }//GEN-LAST:event_lstProductosAComprarValueChanged

    private void lstProductosAComprarDatosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstProductosAComprarDatosValueChanged
        if (!evt.getValueIsAdjusting()) {
            int posicionSeleccionada = lstProductosAComprarDatos.getSelectedIndex();
            lstProductosAComprar.setSelectedIndex(posicionSeleccionada);
        }
    }//GEN-LAST:event_lstProductosAComprarDatosValueChanged

    private void btnQuitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarProductoActionPerformed
        String mensajeError = "";
        if(!lstProductosAComprar.isSelectionEmpty()){
            int posicionSeleccionada = lstProductosAComprar.getSelectedIndex();
            productosAComprar.remove((Producto)lstProductosAComprar.getSelectedValue());
            cantidadYPrecioParaMostrar.remove(posicionSeleccionada);
            lstProductosAComprar.setListData(productosAComprar.keySet().
                    toArray());
            lstProductosAComprarDatos.setListData(cantidadYPrecioParaMostrar
                    .toArray());
            
        } else{
            JOptionPane.showMessageDialog(this, mensajeError,
                    "Por favor, seleccione un producto de su carrito", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnQuitarProductoActionPerformed

    private void reCargar(){
        this.lstPuestos.setListData(mercado.getListaPuestos().toArray());
        this.lstMayoristas.setListData(mercado.getListaMayoristas().toArray());
    }
    
    @Override
    public void dispose() {
        mercado.removePropertyChangeListener(this);
        super.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnQuitarProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCantComprar;
    private javax.swing.JLabel lblCompra;
    private javax.swing.JLabel lblMayoristas;
    private javax.swing.JLabel lblOfertaProductos;
    private javax.swing.JLabel lblPrecioTotal;
    private javax.swing.JLabel lblPrecioUnitario;
    private javax.swing.JLabel lblProductosSeleccionados;
    private javax.swing.JLabel lblPuestos;
    private javax.swing.JList lstMayoristas;
    private javax.swing.JList lstProductosAComprar;
    private javax.swing.JList lstProductosAComprarDatos;
    private javax.swing.JList lstProductosOfrecidos;
    private javax.swing.JList lstPuestos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecioTotal;
    private javax.swing.JTextField txtPrecioUnitario;
    // End of variables declaration//GEN-END:variables
    private final Mercado mercado;
    private final HashMap<Producto, float[]> productosAComprar;
    private final ArrayList<String> cantidadYPrecioParaMostrar;
    private int mayoristaAnterior;
    private boolean banderaCambioMayorista;
}
