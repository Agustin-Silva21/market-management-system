
package Interfaz;

import Dominio.*;
import Dominio.Producto.Tipo;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.ImageIcon;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ToolTipManager;

public class VentanaVenta extends javax.swing.JFrame implements Serializable{

    public VentanaVenta(Mercado unMercado) {
        mercado = unMercado;
        initComponents();
        this.setSize(1000, 1000);
        ToolTipManager.sharedInstance().setInitialDelay(0);
        grupoFYV.add(radioFruta);
        grupoFYV.add(radioVerdura);
        grupoFYV.add(radioFYV);
        radioFYV.setSelected(true);

        productosAComprar = new HashMap<>();
        lstPuestos.setListData(mercado.getListaPuestos().toArray());

        radioFruta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtrarProductos(productosDelPuesto);
            }
        });

        radioVerdura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtrarProductos(productosDelPuesto);
            }
        });

        radioFYV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtrarProductos(productosDelPuesto);
            }
        });
    }
    
    private void filtrarProductos(Producto[] productosSinFiltrar) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        Producto[] productosFiltradosArray;
        
        if (radioFruta.isSelected()) {
            for (Producto producto : productosSinFiltrar) {
                if (producto.getTipo() == Tipo.Fruta) {
                    productosFiltrados.add(producto);
                }
            }
        }

        if (radioVerdura.isSelected()) {
            for (Producto producto : productosSinFiltrar) {
                if (producto.getTipo() == Tipo.Verdura) {
                    productosFiltrados.add(producto);
                }
            }
        }

        if (radioFYV.isSelected()) {
            productosFiltrados.addAll(Arrays.asList(productosSinFiltrar));
        }

        Collections.sort(productosFiltrados);
        productosFiltradosArray = productosFiltrados.toArray(new Producto[0]);
        cargarProductos(productosFiltradosArray);
    }
    
    private void cargarProductos(Producto[] productos) {
        
        int cantCol = 4;
        int cantFilas = (int) Math.ceil((double) productos.length / cantCol);

        JPanel panelProductos = new JPanel(new GridLayout(cantFilas, cantCol));

        for (Producto producto : productos) {
            JButton boton = crearBotonProducto(producto);
            panelProductos.add(boton);
        }

        lstProductosOfrecidos.setViewportView(panelProductos);
    }
    
    private JButton crearBotonProducto(Producto producto) {
        String path = producto.getPathImagen();

        ImageIcon icono = new ImageIcon(path);
        Image imagen = icono.getImage().getScaledInstance(60, 60, 
                Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionado = new ImageIcon(imagen);

        JButton boton = new JButton(iconoRedimensionado);
        boton.setPreferredSize(new Dimension(60, 60));
        boton.setMinimumSize(new Dimension(60, 60));
        boton.setMaximumSize(new Dimension(60, 60));
        boton.setBorderPainted(false);

        // Acción al hacer clic en el botón
        boton.addActionListener(e -> cantidadYPrecio(producto));
        
        boton.setToolTipText(producto.getNombre());

        return boton;
    }
    
    private void cantidadYPrecio(Producto producto) {
        
        JTextField cantidadField = new JTextField();
        JTextField precioUnitarioField = new JTextField();

        Object[] message = {
            "Cantidad:", cantidadField,
            "Precio Unitario:", precioUnitarioField
        };

        int option = JOptionPane.showConfirmDialog(null, message,
                "Ingrese la cantidad y el precio unitario",
                JOptionPane.OK_CANCEL_OPTION);
        
        if (option == JOptionPane.OK_OPTION) {
            try {
                float cantidad = Float.parseFloat(cantidadField.getText());
                float precioUnitario = Float.parseFloat(precioUnitarioField.getText());

                // Guardar el producto y su información en el HashMap
                productosAComprar.put(producto, new float[]{cantidad, precioUnitario});
            } catch (NumberFormatException e) {
                // Mostrar JOptionPane de error si los valores ingresados no son numéricos
                JOptionPane.showMessageDialog(null, 
                        "Por favor, ingrese valores numéricos válidos.", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                // Mostrar JOptionPane de error si alguno de los campos está vacío
                JOptionPane.showMessageDialog(null, 
                        "Por favor, complete todos los campos.", 
                        "Error", JOptionPane.ERROR_MESSAGE);
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

        grupoFYV = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPuestos = new javax.swing.JList();
        lblCompra = new javax.swing.JLabel();
        lblPuestos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPrueba = new javax.swing.JList();
        lstProductosOfrecidos = new javax.swing.JScrollPane();
        radioFruta = new javax.swing.JRadioButton();
        radioVerdura = new javax.swing.JRadioButton();
        radioFYV = new javax.swing.JRadioButton();
        btnComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lstPuestos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPuestos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPuestosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPuestos);

        lblCompra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCompra.setText("Registro de Ventas");

        lblPuestos.setText("Puestos");

        jScrollPane3.setViewportView(listaPrueba);

        grupoFYV.add(radioFruta);
        radioFruta.setText("Frutas");

        grupoFYV.add(radioVerdura);
        radioVerdura.setText("Verduras");

        grupoFYV.add(radioFYV);
        radioFYV.setText("Frutas y Verduras");

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

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
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(radioFruta)
                                    .addComponent(radioVerdura)
                                    .addComponent(radioFYV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addComponent(lstProductosOfrecidos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(radioFruta)
                                .addGap(18, 18, 18)
                                .addComponent(radioVerdura)
                                .addGap(18, 18, 18)
                                .addComponent(radioFYV)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lstProductosOfrecidos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(635, 635, 635))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void lstPuestosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPuestosValueChanged
        Puesto seleccionLista = (Puesto)lstPuestos.getSelectedValue();
        int posicion = mercado.getListaPuestos().indexOf(seleccionLista);
        puestoActual = mercado.getListaPuestos().get(posicion);
        productosDelPuesto = puestoActual.getOferta().keySet().toArray(new Producto[0]);
        
        filtrarProductos(productosDelPuesto);
        mercado.getListaPuestos().get(posicion).limpiarProducto(puestoActual);
        
    }//GEN-LAST:event_lstPuestosValueChanged

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        boolean hayTodo = true;
        boolean encontrado = false;
        String mensaje = "";
        for (int i = 0; i < productosAComprar.size() && !hayTodo; i++){
            Producto prodAC = (Producto) productosAComprar.keySet().toArray()[i];
            float cantAC = productosAComprar.get(prodAC)[0];
            for (int j = 0; j < puestoActual.getOferta().size() && !encontrado; j++){
                encontrado = false;
                Producto prodP = (Producto) puestoActual.getOferta().keySet().toArray()[j];
                float cantP = puestoActual.getOferta().get(prodP);
                if(prodAC.equals(prodP) && cantAC > cantP){
                    hayTodo = false;
                    mensaje += "\nNo tenemos suficiente: " + prodAC.getNombre();
                } else if(prodAC.equals(prodP) && cantAC <= cantP){
                    encontrado = true;
                }
                else if(j == puestoActual.getOferta().size() && !encontrado){
                    hayTodo = false;
                    mensaje += "\nNo tenemos este producto: " + prodAC.getNombre();
                }
            }
        }
        if(hayTodo){
            mercado.venderProducto(productosAComprar, puestoActual);
            productosAComprar.clear();
            filtrarProductos(productosDelPuesto);
            JOptionPane.showMessageDialog(this,"Compra realizada con éxito",
                    "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, mensaje, 
                    "No se ha podido realizar la transacción", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnComprarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.ButtonGroup grupoFYV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCompra;
    private javax.swing.JLabel lblPuestos;
    private javax.swing.JList listaPrueba;
    private javax.swing.JScrollPane lstProductosOfrecidos;
    private javax.swing.JList lstPuestos;
    private javax.swing.JRadioButton radioFYV;
    private javax.swing.JRadioButton radioFruta;
    private javax.swing.JRadioButton radioVerdura;
    // End of variables declaration//GEN-END:variables
    private Mercado mercado;
    private HashMap<Producto, float[]> productosAComprar;
    private Producto[] productosDelPuesto;
    private Puesto puestoActual;
    
}
