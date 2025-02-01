//Mariano Perez
//Numero estudiante 306275
package Interfaz;

import dominio.Postulante;
import dominio.Puesto;
import dominio.Sistema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class VentanaConsultaPuesto extends javax.swing.JFrame implements PropertyChangeListener{
    
    private Sistema modelo;
    private ArrayList<Postulante> postulantes;
    
    public VentanaConsultaPuesto(Sistema unModelo) {
        this.modelo = unModelo;
        postulantes = new ArrayList<>();
        modelo.addPropertyChangeListener(this);
        initComponents();
        objetoAPantalla();
        spnNivelFiltro.setModel(new SpinnerNumberModel(1, 1, 10, 1)); 
    }
    
    public void objetoAPantalla(){
        cargarLista();
        cargarListaPostulantes();
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        objetoAPantalla();
    }
    public void cargarLista(){    
        ArrayList<Puesto> temasConValor = new ArrayList<>();
        
        for(Puesto item : modelo.getListaPuestos()){
            temasConValor.add(item);
        }
        lstPuestos.setListData(temasConValor.toArray());    
    }
    
    public void cargarListaPostulantes(){
        
        lstPostulantes.setListData(postulantes.toArray());    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPuestos = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        spnNivelFiltro = new javax.swing.JSpinner();
        brnConsultar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPostulantes = new javax.swing.JList();
        btnExportar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta para puesto");
        setPreferredSize(new java.awt.Dimension(485, 535));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta para puesto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(121, 6, 225, 34);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(37, 46, 383, 10);

        jLabel2.setText("Puestos:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(37, 62, 47, 16);

        jScrollPane1.setViewportView(lstPuestos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(37, 84, 383, 130);

        jLabel3.setText("Nivel: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(37, 235, 54, 16);
        getContentPane().add(spnNivelFiltro);
        spnNivelFiltro.setBounds(136, 232, 124, 22);

        brnConsultar.setText("Consultar");
        brnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(brnConsultar);
        brnConsultar.setBounds(322, 232, 98, 22);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(37, 266, 383, 10);

        jLabel4.setText("Postulantes:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(37, 282, 85, 16);

        jScrollPane2.setViewportView(lstPostulantes);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(37, 304, 383, 130);

        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnExportar);
        btnExportar.setBounds(326, 446, 94, 22);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(37, 446, 94, 22);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void brnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnConsultarActionPerformed
        Puesto pues = (Puesto) lstPuestos.getSelectedValue();
        int niv = Integer.parseInt(spnNivelFiltro.getValue().toString());
        if(pues !=  null){
            postulantes = modelo.postulantesQueCumplen(pues, niv);
            cargarListaPostulantes();
        }
    }//GEN-LAST:event_brnConsultarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        Puesto pues = (Puesto) lstPuestos.getSelectedValue();
        if(pues != null && postulantes.size()>0){
            modelo.archivograbar(postulantes, pues);
            JOptionPane.showMessageDialog(this, "El los datos fueron exportados correctamente en el archivo Consulta.txt","Aceptado",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos para exportar seleccione Un puesto, y que tenga postulantes");
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnConsultar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JList lstPostulantes;
    private javax.swing.JList lstPuestos;
    private javax.swing.JSpinner spnNivelFiltro;
    // End of variables declaration//GEN-END:variables
}
