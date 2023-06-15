package Interfaz;

import Dominio.Mercado;
import Dominio.Producto;
import Dominio.Mayorista;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author agustin973
 */
public class consultaMayoristas extends javax.swing.JFrame {
    private Mercado modelo;

    public consultaMayoristas() {
        initComponents();
    }

    public consultaMayoristas(Mercado unModelo) {
        modelo = unModelo;
        initComponents();
        this.cargarTabla();
        ajustarAnchoColumnaSegunTexto(tblMayoristas);
    }

    public void cargarTabla(){
        String matriz[][] = new String[modelo.getListaMayoristas().size()][4];
        int i = 0;
        for (Mayorista m : modelo.getListaMayoristas()) {
            matriz[i][0] = m.getRut();
            matriz[i][1] = m.getNombre();
            matriz[i][2] = m.getDireccion();
            matriz[i][3] = getListaProductosAlphabetical(m);
            i++;
        }
        tblMayoristas.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Rut", "Nombre", "Direccion", "Productos"
                }
        ));
    }

    public String getListaProductosAlphabetical(Mayorista m) {
        ArrayList<Producto> lista = m.getProducto();
        String listaEnString = "";
        lista.sort(Comparator.comparing(Producto::getNombre));
        for (Producto p : lista) {
            listaEnString += p.getNombre() + ", ";
        }
        listaEnString = listaEnString.substring(0, listaEnString.length()-2) + ".";
        return listaEnString;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMayoristas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Mayoristas");

        tblMayoristas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMayoristas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(consultaMayoristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaMayoristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaMayoristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaMayoristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultaMayoristas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMayoristas;
    // End of variables declaration//GEN-END:variables
}
