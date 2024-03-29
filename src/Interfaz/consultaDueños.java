// Gabriel Machado 318697, Agustin Silva 310087
package Interfaz;

import Dominio.Dueño;
import Dominio.Mercado;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import java.util.ArrayList;
import java.util.Comparator;


public class consultaDueños extends javax.swing.JFrame implements PropertyChangeListener{
    private Mercado modelo;

    public consultaDueños() {
        initComponents();
    }

    public consultaDueños(Mercado unModelo) {
        modelo = unModelo;
        modelo.addPropertyChangeListener(this);
        initComponents();
        this.cargarTabla();
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        if (evt.getPropertyName().equals("listaDueños")){
            cargarTabla();
        }
    }
    
    public void cargarTabla(){
        // cargar tabla
        String[][] matriz = new String[modelo.getListaDueños().size()][3];
        int i = 0;
        for (Dueño d : getListaDueñosAlphabetical()) {
            matriz[i][0] = d.getNombre();
            matriz[i][1] = String.valueOf(d.getEdad());
            matriz[i][2] = String.valueOf(d.getAñosDeExp());
            i++;
        }
        tblDuenios.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre", "Edad", "Años de Experiencia"
                }
        ));
    }

    public ArrayList<Dueño> getListaDueñosAlphabetical(){
        ArrayList<Dueño> lista = modelo.getListaDueños();
        lista.sort(Comparator.comparing(Dueño::getNombre));
        return lista;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDuenios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Dueños");
        setAutoRequestFocus(false);

        tblDuenios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tblDuenios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void dispose() {
        modelo.removePropertyChangeListener(this);
        super.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDuenios;
    // End of variables declaration//GEN-END:variables
}
