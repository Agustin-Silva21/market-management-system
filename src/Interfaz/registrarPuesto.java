package Interfaz;

import Dominio.Dueño;
import Dominio.Mercado;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class registrarPuesto extends javax.swing.JFrame {

    private Mercado modelo;

    public registrarPuesto() {
        initComponents();
    }

    public registrarPuesto(Mercado unModelo) {        
        modelo = unModelo;
        initComponents();
        UIManager.put("OptionPane.yesButtonText", "Si");
        UIManager.put("OptionPane.noButtonText", "No");
        //http://www.orbital-computer.de/JComboBox/
        ComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(modelo.getListaDueños().stream().map(Dueño::getNombre).toArray(String[]::new));
        cmbDuenio.setModel(comboBoxModel);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblAñosExp = new javax.swing.JLabel();
        lblAñosExp1 = new javax.swing.JLabel();
        txtCantEmpleados = new javax.swing.JTextField();
        cmbDuenio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Puesto");

        lblId.setText("Identificacion");

        txtIdentificacion.setText(" ");
        txtIdentificacion.setToolTipText("Inserte identificacion aqui");
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        lblEdad.setText("Dueño");

        txtUbicacion.setToolTipText("Insertar ubicacion aqui");
        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
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

        lblAñosExp.setText("Ubicacion");

        lblAñosExp1.setText("Cantidad de empleados");

        txtCantEmpleados.setToolTipText("Insertar cantidad de empleados aqui");
        txtCantEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantEmpleadosActionPerformed(evt);
            }
        });

        cmbDuenio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDuenioActionPerformed(evt);
            }
        });

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
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(75, 75, 75)
                .addComponent(btnSalir)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAñosExp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAñosExp1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnSalir))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(533, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int eleccion = JOptionPane.showConfirmDialog(null, "¿Estas seguro que desea salir?\nLos cambios no guardados seran eliminados", "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (eleccion == JOptionPane.YES_OPTION) {
            dispose();            
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
            String identificacion = txtIdentificacion.getText().trim();
            String ubicacion = txtUbicacion.getText().trim();
        try {
            int cantEmpleados = Integer.parseInt(txtCantEmpleados.getText());
            String DuenioString = (String) cmbDuenio.getSelectedItem();
            String mensaje = "";
            
            mensaje = identificacion.isEmpty() ? "La identificacion no puede estar vacia!\n" : mensaje;
            mensaje += ubicacion.isEmpty() ? "La ubicacion no puede estar vacia!\n" : mensaje;
            mensaje += cantEmpleados<0 ? "La cantidad de empleados no puede ser negativa!\n" : mensaje;
            
            if (mensaje.isEmpty()) {
                mensaje = "Identificacion: " + identificacion + "\nUbicacion: " + ubicacion + "\nCantidad de empleados: " + cantEmpleados + "\nDueño: " + DuenioString;
                int indiceDuenio = cmbDuenio.getSelectedIndex();
                int opcion = JOptionPane.showOptionDialog(null, mensaje, "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Guardar", "Cancelar"}, "Guardar");
                modelo.registrarPuesto(identificacion, modelo.getDueñoPorIndice(indiceDuenio), ubicacion, cantEmpleados);
                if (opcion == JOptionPane.YES_OPTION) {
                    if (modelo.registrarPuesto(identificacion, modelo.getDueñoPorIndice(indiceDuenio), ubicacion, cantEmpleados)) {
                        JOptionPane.showMessageDialog(null, "El puesto ha sido guardado exitosamente.", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "El puesto debe tener un nombre unico", "Puesto no guardado", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, mensaje, "Error al registrar puesto", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException | IndexOutOfBoundsException ex) {
            System.out.println(ex);
            String errorMessage = "";
            if (ex instanceof NumberFormatException) {
                if (ex.getMessage().contains(txtCantEmpleados.getText())) {
                    errorMessage += "Cantidad de empleados debe ser un número!";
                }
            } else if (ex instanceof IndexOutOfBoundsException) {
                errorMessage += "Se debe registrar un Dueño para registrar un puesto";
            }
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            txtIdentificacion.setText("---");
            txtCantEmpleados.setText("");
            txtUbicacion.setText("");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void txtCantEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantEmpleadosActionPerformed

    private void cmbDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDuenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDuenioActionPerformed

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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbDuenio;
    private javax.swing.JLabel lblAñosExp;
    private javax.swing.JLabel lblAñosExp1;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtCantEmpleados;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables

}
