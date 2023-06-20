// Gabriel Machado 318697, Agustin Silva 310087
package Interfaz;

import Dominio.Mercado;
import Dominio.Persistencia;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class MenuPpal extends javax.swing.JFrame {

    private Mercado modelo;

    public MenuPpal() {
        initComponents();
    }

    public MenuPpal(Mercado unModelo) {
        modelo = unModelo;
        initComponents();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Persistencia.guardarMercado(modelo);
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblImagenPpal = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuRegistros = new javax.swing.JMenu();
        registrarProducto = new javax.swing.JMenuItem();
        registrarDueño = new javax.swing.JMenuItem();
        registrarPuesto = new javax.swing.JMenuItem();
        registrarMayorista = new javax.swing.JMenuItem();
        menuMovimientos = new javax.swing.JMenu();
        menuItemCompra = new javax.swing.JMenuItem();
        menuItemVenta = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        consultaProducto = new javax.swing.JMenuItem();
        consultaDuenios = new javax.swing.JMenuItem();
        consultaPuestos = new javax.swing.JMenuItem();
        consultaMayoristas = new javax.swing.JMenuItem();
        generarArchivoMovimientos = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Reservas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Menu Principal");

        lblImagenPpal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helpers/imgMenuPrincipal.jpg"))); // NOI18N
        lblImagenPpal.setText("jLabel1");

        menuRegistros.setText("Registros");

        registrarProducto.setText("Registrar producto");
        registrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProductoActionPerformed(evt);
            }
        });
        menuRegistros.add(registrarProducto);

        registrarDueño.setText("Registrar dueño");
        registrarDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDueñoActionPerformed(evt);
            }
        });
        menuRegistros.add(registrarDueño);

        registrarPuesto.setText("Registrar puesto");
        registrarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPuestoActionPerformed(evt);
            }
        });
        menuRegistros.add(registrarPuesto);

        registrarMayorista.setText("Registrar mayorista");
        registrarMayorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMayoristaActionPerformed(evt);
            }
        });
        menuRegistros.add(registrarMayorista);

        menuBar.add(menuRegistros);

        menuMovimientos.setText("Movimientos");

        menuItemCompra.setText("Compra de producto");
        menuItemCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCompraActionPerformed(evt);
            }
        });
        menuMovimientos.add(menuItemCompra);

        menuItemVenta.setText("Venta de producto");
        menuItemVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVentaActionPerformed(evt);
            }
        });
        menuMovimientos.add(menuItemVenta);

        menuBar.add(menuMovimientos);

        menuConsultas.setText("Consultas");

        consultaProducto.setText("Consulta producto");
        consultaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProductoActionPerformed(evt);
            }
        });
        menuConsultas.add(consultaProducto);

        consultaDuenios.setText("Consulta dueños");
        consultaDuenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaDueniosActionPerformed(evt);
            }
        });
        menuConsultas.add(consultaDuenios);

        consultaPuestos.setText("Consulta puestos");
        consultaPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaPuestosActionPerformed(evt);
            }
        });
        menuConsultas.add(consultaPuestos);

        consultaMayoristas.setText("Consulta mayoristas");
        consultaMayoristas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaMayoristasActionPerformed(evt);
            }
        });
        menuConsultas.add(consultaMayoristas);

        generarArchivoMovimientos.setText("Generar archivo detalle de movimientos");
        generarArchivoMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarArchivoMovimientosActionPerformed(evt);
            }
        });
        menuConsultas.add(generarArchivoMovimientos);

        menuBar.add(menuConsultas);

        menuSalir.setText("Cerrar sesion");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuBar.add(menuSalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblImagenPpal, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagenPpal, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        setSize(new java.awt.Dimension(841, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPuestoActionPerformed
        registrarPuesto v = new registrarPuesto(modelo);
        v.setVisible(true);       
}//GEN-LAST:event_registrarPuestoActionPerformed

    private void consultaProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        if (!modelo.getListaProductos().isEmpty()) {
            consultaPorProducto v = new consultaPorProducto(modelo);
            v.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay productos en el mercado!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void registrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProductoActionPerformed
        
        registrarProducto v = new registrarProducto(modelo);
        v.setVisible(true);
}//GEN-LAST:event_registrarProductoActionPerformed

    private void registrarDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDueñoActionPerformed
        registrarDueño v = new registrarDueño(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_registrarDueñoActionPerformed

    private void registrarMayoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMayoristaActionPerformed
        registrarMayorista v = new registrarMayorista(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_registrarMayoristaActionPerformed

    private void menuItemVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVentaActionPerformed
        VentanaVenta vent = new VentanaVenta(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_menuItemVentaActionPerformed

    private void menuItemCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCompraActionPerformed
        VentanaCompra vent = new VentanaCompra(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_menuItemCompraActionPerformed

    private void consultaDueniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaDueniosActionPerformed
        consultaDueños vent = new consultaDueños(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_consultaDueniosActionPerformed

    private void consultaPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaPuestosActionPerformed
        consultaPuestos vent = new consultaPuestos(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_consultaPuestosActionPerformed

    private void consultaMayoristasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaMayoristasActionPerformed
        consultaMayoristas vent = new consultaMayoristas(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_consultaMayoristasActionPerformed

    private void generarArchivoMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarArchivoMovimientosActionPerformed
        VentanaGenerarArchivo vent = new VentanaGenerarArchivo(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_generarArchivoMovimientosActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        Persistencia.guardarMercado(modelo);
        dispose();
    }//GEN-LAST:event_menuSalirActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consultaDuenios;
    private javax.swing.JMenuItem consultaMayoristas;
    private javax.swing.JMenuItem consultaProducto;
    private javax.swing.JMenuItem consultaPuestos;
    private javax.swing.JMenuItem generarArchivoMovimientos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagenPpal;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenuItem menuItemCompra;
    private javax.swing.JMenuItem menuItemVenta;
    private javax.swing.JMenu menuMovimientos;
    private javax.swing.JMenu menuRegistros;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenuItem registrarDueño;
    private javax.swing.JMenuItem registrarMayorista;
    private javax.swing.JMenuItem registrarProducto;
    private javax.swing.JMenuItem registrarPuesto;
    // End of variables declaration//GEN-END:variables
}
