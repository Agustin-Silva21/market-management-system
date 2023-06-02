
package Interfaz;

import Dominio.Mercado;
import javax.swing.JOptionPane;

public class registrarPuesto extends javax.swing.JFrame {
private Mercado modelo;
    /** Creates new form AltaClientes */
    public registrarPuesto() {
        initComponents();
    }
public registrarPuesto(Mercado unModelo) {
    modelo = unModelo;
    initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        cajaAñosExp = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblAñosExp = new javax.swing.JLabel();
        lblAñosExp1 = new javax.swing.JLabel();
        cajaAñosExp1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Puesto");

        lblId.setText("Identificacion");

        cajaNombre.setText(" ");
        cajaNombre.setToolTipText("Inserte nombre aqui");
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        lblEdad.setText("Dueño");

        cajaAñosExp.setToolTipText("Insertar años de experiencia del dueño");
        cajaAñosExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAñosExpActionPerformed(evt);
            }
        });

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblAñosExp.setText("Ubicacion");

        lblAñosExp1.setText("Cantidad de empleados");

        cajaAñosExp1.setToolTipText("Insertar años de experiencia del dueño");
        cajaAñosExp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAñosExp1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAñosExp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAñosExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaAñosExp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaAñosExp1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAgregar)
                .addGap(75, 75, 75)
                .addComponent(jButton1)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaAñosExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAñosExp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaAñosExp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAñosExp1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(jButton1))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(533, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        try {
            int edad = Integer.parseInt(cajaEdad.getText());
            int añosExp = Integer.parseInt(cajaAñosExp.getText());
            String nombre = cajaNombre.getText().trim();
            if (edad<18) {
                JOptionPane.showMessageDialog(null, "La edad debe ser mayor a 18 años!");
            }else if(añosExp<0){
                JOptionPane.showMessageDialog(null, "La experiencia no puede ser negativa!");
            }else if(nombre.isBlank()){
                JOptionPane.showMessageDialog(null, "Se debe colocar nombre!");
            }else{
                modelo.registrarDueño(nombre,edad,añosExp);
            }
            
            System.out.println(edad + " " + añosExp);            
        } catch (NumberFormatException ex) {
            String errorMessage;
            if (ex.getMessage().contains(cajaEdad.getText())) {
                errorMessage = "Edad debe ser un numero!";
            } else {
                errorMessage = "A debe ser un numero!";
            }
            JOptionPane.showMessageDialog(null, errorMessage);
        } finally{
            cajaNombre.setText("---");
            cajaEdad.setText("");
            cajaAñosExp.setText("");
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void cajaAñosExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAñosExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAñosExpActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaAñosExp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAñosExp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAñosExp1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarPuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JTextField cajaAñosExp;
    private javax.swing.JTextField cajaAñosExp1;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblAñosExp;
    private javax.swing.JLabel lblAñosExp1;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblId;
    // End of variables declaration//GEN-END:variables

}
