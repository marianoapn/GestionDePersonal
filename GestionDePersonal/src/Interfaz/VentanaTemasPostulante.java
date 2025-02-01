//Mariano Perez
//Numero estudiante 306275
package Interfaz;

import dominio.Postulante;
import dominio.Sistema;
import dominio.Tema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class VentanaTemasPostulante extends javax.swing.JFrame implements PropertyChangeListener{

    private Sistema modelo;
    private Postulante p;
    
    public VentanaTemasPostulante(Sistema unModelo, Postulante p1) {
        this.modelo = unModelo;
        this.p = p1;
        modelo.addPropertyChangeListener(this);
        initComponents();
        objetoAPantalla();
        snrNivelTema.setModel(new SpinnerNumberModel(1, 1, 10, 1));
        lblNombrePostulante.setText(p.toString());
    }
    public void objetoAPantalla(){
        cargarCombo();
        cargarLista();
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        objetoAPantalla();
    }
    public void cargarCombo() {
        
            DefaultComboBoxModel<Tema> comboModel = new DefaultComboBoxModel<>();
            ArrayList<Tema> temasDisponibles = new ArrayList<>();

            for (Tema tema : modelo.getListaTemas()) {
                temasDisponibles.add(tema);
            }

            comboModel.addAll(temasDisponibles);
            lstTomarTema.setModel(comboModel);
            if(temasDisponibles.size()>0){
                lstTomarTema.setSelectedIndex(0);
            }

    }
    public void cargarLista(){
        
        ArrayList<String> temasConValor = new ArrayList<>();
        
        for(Tema item : p.getTemasPostulante().keySet()){
            temasConValor.add(item + " ("+ p.getTemasPostulante().get(item)+")");
        }
        lstTemasAgregados.setListData(temasConValor.toArray());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lstTomarTema = new javax.swing.JComboBox();
        snrNivelTema = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTemasAgregados = new javax.swing.JList();
        btnCancelar2 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblNombrePostulante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Temas del Postulante");
        setPreferredSize(new java.awt.Dimension(490, 365));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        lstTomarTema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lstTomarTema);
        lstTomarTema.setBounds(140, 60, 290, 22);
        getContentPane().add(snrNivelTema);
        snrNivelTema.setBounds(140, 100, 130, 20);

        jLabel1.setText("Tema:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 60, 16);

        jLabel2.setText("Nivel:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 60, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 140, 410, 20);

        jLabel3.setText("Experiencia:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 170, 90, 16);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(30, 200, 110, 30);

        lstTemasAgregados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTemasAgregadosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstTemasAgregados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 170, 270, 90);

        btnCancelar2.setText("Cancelar");
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar2);
        btnCancelar2.setBounds(30, 280, 110, 30);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(320, 280, 110, 30);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(280, 100, 80, 22);

        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 20, 60, 16);
        getContentPane().add(lblNombrePostulante);
        lblNombrePostulante.setBounds(140, 20, 280, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        modelo.removePropertyChangeListener(this);
    }//GEN-LAST:event_formWindowClosed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Tema t1 = (Tema) lstTomarTema.getSelectedItem(); 
        Integer nivel = (int) snrNivelTema.getValue();
        if(t1 != null){
            if(!modelo.existeExpPostulante(t1,p)){
                modelo.agregarExpAPostulante(t1,p,nivel);
                JOptionPane.showMessageDialog(this, "Le tema se agrego","Error",JOptionPane.INFORMATION_MESSAGE);

            }else{    
                JOptionPane.showMessageDialog(this, "Le tema que desea agregar, ya esta en la experiencia","Error",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            String ts = lstTemasAgregados.getSelectedValue().toString();
            ts = ts.substring(0,ts.indexOf(" "));
            Tema t = modelo.darTema(ts);
            if (t != null) {
                modelo.eliminarExpPostulante(t, p);
            }
        }catch(NullPointerException e){
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void lstTemasAgregadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTemasAgregadosValueChanged

            
        
    }//GEN-LAST:event_lstTemasAgregadosValueChanged

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(!p.getTemasPostulante().isEmpty()){
            modelo.agregarPostulante(p);
            JOptionPane.showMessageDialog(this, "El potulante fue registrado correctamente","Registrado",JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "El potulante debe tener almenos un tema de experiencia ","Falta de experciencas",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombrePostulante;
    private javax.swing.JList lstTemasAgregados;
    private javax.swing.JComboBox lstTomarTema;
    private javax.swing.JSpinner snrNivelTema;
    // End of variables declaration//GEN-END:variables
    
}
