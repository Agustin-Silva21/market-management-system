// Gabriel Machado 318697, Agustin Silva 310087
package Interfaz;

import Dominio.Mercado;
import Dominio.Producto;
import Dominio.Mayorista;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import java.util.ArrayList;
import java.util.Comparator;


public class consultaMayoristas extends javax.swing.JFrame  implements PropertyChangeListener{
    private Mercado modelo;

    public consultaMayoristas() {
        initComponents();
    }

    public consultaMayoristas(Mercado unModelo) {
        modelo = unModelo;
        modelo.addPropertyChangeListener(this);
        initComponents();
        this.cargarTabla();
        ajustarAnchoColumnaSegunTexto(tblMayoristas);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        if (evt.getPropertyName().equals("listaMayoristas")){
            cargarTabla();
        }
    }
    
    public void cargarTabla(){
        String[][] matriz = new String[modelo.getListaMayoristas().size()][4];
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMayoristas;
    // End of variables declaration//GEN-END:variables
}
