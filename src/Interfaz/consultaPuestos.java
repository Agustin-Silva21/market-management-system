// Gabriel Machado 318697, Agustin Silva 310087
package Interfaz;

import Dominio.Mercado;
import Dominio.Producto;
import Dominio.Puesto;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;


public class consultaPuestos extends javax.swing.JFrame  implements PropertyChangeListener {
    private Mercado modelo;

    public consultaPuestos() {
        initComponents();
    }

    public consultaPuestos(Mercado unModelo) {
        modelo = unModelo;
        modelo.addPropertyChangeListener(this);
        initComponents();
        this.cargarTabla();
        ajustarAnchoColumnaSegunTexto(tblPuestos);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        if (evt.getPropertyName().equals("listaPuestos")){
            cargarTabla();
        }
    }
    
    public void cargarTabla(){
        String[][] matriz = new String[modelo.getListaPuestos().size()][5];
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
    
    @Override
    public void dispose() {
        modelo.removePropertyChangeListener(this);
        super.dispose();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPuestos;
    // End of variables declaration//GEN-END:variables
}
