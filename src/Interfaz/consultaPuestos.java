/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Dominio.Mercado;
import Dominio.Producto;
import Dominio.Puesto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 *
 * @author agustin973
 */
public class consultaPuestos extends javax.swing.JFrame {
    private Mercado modelo;

    public consultaPuestos() {
        initComponents();
    }

    public consultaPuestos(Mercado unModelo) {
        modelo = unModelo;
        initComponents();
        this.cargarTabla();
        ajustarAnchoColumnaSegunTexto(tblPuestos);
    }

    public void cargarTabla(){
        String matriz[][] = new String[modelo.getListaPuestos().size()][5];
        int i = 0;
        for (Puesto p : getListaPuestosAlphabetical()) {
            matriz[i][0] = p.getId();
            matriz[i][1] = String.valueOf(p.getDueño().getNombre());
            matriz[i][2] = String.valueOf(p.getUbicacion());
            matriz[i][3] = String.valueOf(p.getCantEmpleados());
            matriz[i][4] = hashMaptoString(p.getOferta());
            i++;
        }
        tblPuestos.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre", "Dueño", "Ubicacion", "Cant empleados", "Ofertas"
                }
        ));
    }

    public void ajustarAnchoColumnaSegunTexto(javax.swing.JTable table) {
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 50;
            for (int row = 0; row < table.getRowCount(); row++) {
                javax.swing.table.TableCellRenderer renderer = table.getCellRenderer(row, column);
                java.awt.Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width +1 , width);
            }
            if(width > 300)
                width=300;
            table.getColumnModel().getColumn(column).setPreferredWidth(width);
        }
    }

    public String hashMaptoString(HashMap<Producto, Float> hashMap){
        String string = "";
        for (Producto key : hashMap.keySet()) {
            string += key.getNombre() + ": " + hashMap.get(key) + "\n";
        }
        System.out.println(string);
        return string;
    }

    public ArrayList<Puesto> getListaPuestosAlphabetical(){
        ArrayList<Puesto> lista = modelo.getListaPuestos();
        lista.sort(Comparator.comparing(Puesto::getId));
        return lista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPuestos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de puestos");

        tblPuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblPuestos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(consultaPuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaPuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaPuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaPuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultaPuestos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPuestos;
    // End of variables declaration//GEN-END:variables
}
