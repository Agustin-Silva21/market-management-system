package Interfaz;

import Dominio.Mercado;
public class MenuPpal extends javax.swing.JFrame {

    private Mercado modelo;

    public MenuPpal() {
        initComponents();
    }

    public MenuPpal(Mercado unModelo) {
        modelo = unModelo;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        registrarProducto = new javax.swing.JMenuItem();
        registrarDueño = new javax.swing.JMenuItem();
        registrarPuesto = new javax.swing.JMenuItem();
        registrarMayorista = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        agregarReserva = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Reservas");

        fileMenu.setText("Registros");

        registrarProducto.setText("Registrar producto");
        registrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProductoActionPerformed(evt);
            }
        });
        fileMenu.add(registrarProducto);

        registrarDueño.setText("Registrar dueño");
        registrarDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDueñoActionPerformed(evt);
            }
        });
        fileMenu.add(registrarDueño);

        registrarPuesto.setText("Registrar puesto");
        registrarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPuestoActionPerformed(evt);
            }
        });
        fileMenu.add(registrarPuesto);

        registrarMayorista.setText("Registrar mayorista");
        registrarMayorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMayoristaActionPerformed(evt);
            }
        });
        fileMenu.add(registrarMayorista);

        menuBar.add(fileMenu);

        editMenu.setText("Movimientos");

        agregarReserva.setText("Compra de producto");
        agregarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarReservaActionPerformed(evt);
            }
        });
        editMenu.add(agregarReserva);

        jMenuItem1.setText("Venta de producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);

        menuBar.add(editMenu);

        helpMenu.setText("Consultas");

        jMenuItem2.setText("Consulta dueños");
        helpMenu.add(jMenuItem2);

        aboutMenuItem.setText("Consulta producto");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        jMenuItem3.setText("Consulta puestos");
        helpMenu.add(jMenuItem3);

        jMenuItem4.setText("Consulta mayoristas");
        helpMenu.add(jMenuItem4);

        jMenuItem5.setText("Generar archivo detalle de movimientos");
        helpMenu.add(jMenuItem5);

        menuBar.add(helpMenu);

        jMenu1.setText("Cerrar sesion");
        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(408, 334));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPuestoActionPerformed
        
        
}//GEN-LAST:event_registrarPuestoActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        
        
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void registrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProductoActionPerformed
        // TODO add your handling code here:
        registrarProducto v = new registrarProducto(modelo);
        v.setVisible(true);
}//GEN-LAST:event_registrarProductoActionPerformed

    private void registrarDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDueñoActionPerformed
        registrarDueño v = new registrarDueño(modelo);
        v.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_registrarDueñoActionPerformed

    private void registrarMayoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMayoristaActionPerformed
        

    // TODO add your handling code here:
    }//GEN-LAST:event_registrarMayoristaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void agregarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarReservaActionPerformed
      
    }//GEN-LAST:event_agregarReservaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MenuPpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem agregarReserva;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem registrarDueño;
    private javax.swing.JMenuItem registrarMayorista;
    private javax.swing.JMenuItem registrarProducto;
    private javax.swing.JMenuItem registrarPuesto;
    // End of variables declaration//GEN-END:variables
}
