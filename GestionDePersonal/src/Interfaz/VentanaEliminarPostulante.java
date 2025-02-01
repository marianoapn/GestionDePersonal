//Mariano Perez
//Numero estudiante 306275
package Interfaz;

import dominio.Postulante;
import dominio.Sistema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VentanaEliminarPostulante extends javax.swing.JFrame implements PropertyChangeListener {
    private Sistema modelo;
    public VentanaEliminarPostulante(Sistema unModelo) {
        this.modelo = unModelo;
        modelo.addPropertyChangeListener(this);
        initComponents();
        objetoAPantalla();
    }
    public void objetoAPantalla(){
        cargarLista();
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        objetoAPantalla();
    }
    public void cargarLista(){
        lstPostulantes.setListData(modelo.getListaPostulantes().toArray());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPostulantes = new javax.swing.JList();
        btnEliminarP = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Postulante");
        setPreferredSize(new java.awt.Dimension(485, 340));
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(lstPostulantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 50, 311, 182);

        btnEliminarP.setText("Eliminar");
        btnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarP);
        btnEliminarP.setBounds(330, 261, 111, 22);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(20, 261, 97, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eliminar Postulante");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 6, 245, 28);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 37, 421, 10);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
        Postulante p1 = (Postulante) lstPostulantes.getSelectedValue();
        if (p1 != null) {
            modelo.eliminarPostulante(p1);
        }else{
            JOptionPane.showMessageDialog(this, "No selecciono un postulante, para poder eliminarlo","Sin eleccion", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btnEliminarPActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList lstPostulantes;
    // End of variables declaration//GEN-END:variables
}
