//Mariano Perez
//Numero estudiante 306275
package Interfaz;

import dominio.Sistema;
import dominio.Tema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class VentanaConsultaTematica extends javax.swing.JFrame implements PropertyChangeListener {
    
    private Sistema modelo;
    
    public VentanaConsultaTematica(Sistema unModelo) {
        this.modelo = unModelo;
        this.modelo.addPropertyChangeListener(this);
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
        lstTemas.setListData(modelo.getListaTemas().toArray());    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTemas = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPostulantes = new javax.swing.JLabel();
        lblPuestos = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta por Tematica");
        setPreferredSize(new java.awt.Dimension(776, 398));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Consulta por tematica");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 0, 184, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 30, 710, 11);

        lstTemas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTemasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstTemas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 60, 280, 223);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Temas:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 60, 16);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(20, 320, 120, 22);

        jLabel5.setText("Cantidad de postulantes con mas de nivel 5:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 160, 260, 16);

        jLabel6.setText("Cantidad de puestos que requieren este tema:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 210, 270, 16);
        getContentPane().add(lblPostulantes);
        lblPostulantes.setBounds(670, 160, 40, 20);
        getContentPane().add(lblPuestos);
        lblPuestos.setBounds(670, 210, 40, 20);

        jLabel9.setText("Tema:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 110, 60, 16);
        getContentPane().add(lblTema);
        lblTema.setBounds(670, 110, 40, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void lstTemasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTemasValueChanged
        Tema t =(Tema) lstTemas.getSelectedValue();
        if(t != null){
            String postCant = ""+modelo.cantidadPostulantesQueAlcanzaNivel(t);
            String puestCant =""+modelo.cantidadPuestosConTema(t);
            lblTema.setText(t.toString());
            lblPostulantes.setText(postCant);
            lblPuestos.setText(puestCant);
        }
    }//GEN-LAST:event_lstTemasValueChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        modelo.removePropertyChangeListener(this);
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPostulantes;
    private javax.swing.JLabel lblPuestos;
    private javax.swing.JLabel lblTema;
    private javax.swing.JList lstTemas;
    // End of variables declaration//GEN-END:variables
}
