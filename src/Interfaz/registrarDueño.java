
package Interfaz;

import Dominio.Mercado;
import javax.swing.JOptionPane;

public class registrarDueño extends javax.swing.JFrame {
private Mercado modelo;
    /** Creates new form AltaClientes */
    public registrarDueño() {
        initComponents();
    }
public registrarDueño(Mercado unModelo) {
    modelo = unModelo;
    initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        cajaAñosExp = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblAñosExp = new javax.swing.JLabel();
        cajaEdad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de Camionetas");

        lblNombre.setText("Nombre");

        cajaNombre.setText(" ");
        cajaNombre.setToolTipText("Inserte nombre aqui");
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        lblEdad.setText("Edad");

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

        lblAñosExp.setText("Años de experiencia");

        cajaEdad.setToolTipText("Insertar edad mayor a 18!");
        cajaEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdad)
                            .addComponent(lblNombre))
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAñosExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaAñosExp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAgregar)
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdad)
                            .addComponent(cajaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaAñosExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAñosExp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(jButton1))
                .addGap(34, 34, 34))
        );

        setSize(new java.awt.Dimension(423, 297));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas irte?\nLos datos sin guardar seran borrados", "Confirmacion", JOptionPane.YES_NO_OPTION);
        if (confirmar == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        try {
            int edad = Integer.parseInt(cajaEdad.getText());
            int añosExp = Integer.parseInt(cajaAñosExp.getText());
            String nombre = cajaNombre.getText().trim();
            if (edad<18) {
                JOptionPane.showMessageDialog(null, "La edad debe ser mayor a 18 años!","Error",JOptionPane.ERROR_MESSAGE);
            }else if(añosExp<0){
                JOptionPane.showMessageDialog(null, "Los años no pueden ser numeros negativos!","Error",JOptionPane.ERROR_MESSAGE);
            }else if(nombre.isBlank()){
                JOptionPane.showMessageDialog(null, "Se debe colocar nombre!","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                if (modelo.registrarDueño(nombre, edad, añosExp)) {
                    JOptionPane.showMessageDialog(null, "Dueño creado con exito","Confirmacion",JOptionPane.INFORMATION_MESSAGE);                    
                }else{                   
                    JOptionPane.showMessageDialog(null, "El nombre no debe repetirse!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException ex) {
            String errorMessage;
            if (ex.getMessage().contains(cajaEdad.getText())) {
                errorMessage = "La edad debe ser un numero!";
            } else {
                errorMessage = "Los años deben ser un numero!";
            }
            JOptionPane.showMessageDialog(null, errorMessage,"Error",JOptionPane.ERROR_MESSAGE);
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

    private void cajaEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaEdadActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarDueño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JTextField cajaAñosExp;
    private javax.swing.JTextField cajaEdad;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAñosExp;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables

}
