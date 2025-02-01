//Mariano Perez
//Numero estudiante 306275
package Interfaz;

import dominio.Puesto;
import dominio.Sistema;
import dominio.Tema;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class VentanaRegistroPuesto extends javax.swing.JFrame implements PropertyChangeListener{
    private Sistema modelo;
    private Puesto p;
    ArrayList<Tema> temas;
    
    public VentanaRegistroPuesto(Sistema unModelo) {
        this.modelo = unModelo;
        p = new Puesto();
        temas = new ArrayList<>();
        modelo.addPropertyChangeListener(this);
        initComponents();
        objetoAPantalla();
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
        if(!modelo.getListaTemas().isEmpty()){
            for (Tema tema : modelo.getListaTemas()) {
                temasDisponibles.add(tema);
            }

            comboModel.addAll(temasDisponibles);
            cmbTemas.setModel(comboModel);
            cmbTemas.setSelectedIndex(0);
        }
    }
    public void cargarLista() {
        DefaultListModel<Tema> listModel = new DefaultListModel<>();

        for (Tema tema : temas) {
            listModel.addElement(tema);
        }

        lstTemas.setModel(listModel);
    }

    public boolean campoVacio(String txt,String campo, javax.swing.JTextField lbl){
        boolean sinVacio = true;
        if(txt.length() == 0){
            lbl.setBorder(new LineBorder(Color.red));
            lblError.setText("Error: el campo "+ campo +" no puede estar vacio.");
            sinVacio = false;
        }else{
            lbl.setBorder(new LineBorder(Color.black));
            lblError.setText("");
        }
        return sinVacio;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupTipoPuesto = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombrePuesto = new javax.swing.JTextField();
        jRadioRemoto = new javax.swing.JRadioButton();
        jRadioPresencial = new javax.swing.JRadioButton();
        jRadioMixto = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTemas = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        cmbTemas = new javax.swing.JComboBox();
        brnAgregar = new javax.swing.JButton();
        btnEliminarTema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de puesto");
        setPreferredSize(new java.awt.Dimension(530, 435));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 70, 63, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro de Puesto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 0, 221, 20);
        getContentPane().add(txtNombrePuesto);
        txtNombrePuesto.setBounds(160, 70, 290, 22);

        btnGrupTipoPuesto.add(jRadioRemoto);
        jRadioRemoto.setSelected(true);
        jRadioRemoto.setText("Remoto");
        getContentPane().add(jRadioRemoto);
        jRadioRemoto.setBounds(160, 110, 78, 20);

        btnGrupTipoPuesto.add(jRadioPresencial);
        jRadioPresencial.setText("Presencial");
        getContentPane().add(jRadioPresencial);
        jRadioPresencial.setBounds(240, 110, 87, 20);

        btnGrupTipoPuesto.add(jRadioMixto);
        jRadioMixto.setText("Mixto");
        getContentPane().add(jRadioMixto);
        jRadioMixto.setBounds(330, 110, 90, 20);

        jLabel3.setText("Tipo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 110, 37, 16);

        jLabel4.setText("Temas Requeridos:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 190, 110, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 23, 440, 10);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(30, 340, 120, 30);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(350, 340, 130, 30);

        lblError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblError);
        lblError.setBounds(160, 40, 260, 20);

        jScrollPane1.setViewportView(lstTemas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 190, 290, 130);

        jLabel5.setText("Temas:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 150, 60, 16);

        cmbTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTemasActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTemas);
        cmbTemas.setBounds(160, 150, 130, 22);

        brnAgregar.setText("Agregar Tema");
        brnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(brnAgregar);
        brnAgregar.setBounds(310, 150, 120, 22);

        btnEliminarTema.setText("Eliminar");
        btnEliminarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTemaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarTema);
        btnEliminarTema.setBounds(30, 220, 80, 22);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        String nombre = txtNombrePuesto.getText().trim();
        String tipo = "";
        if(jRadioRemoto.isSelected()){
            tipo = "Remoto";
        }else if(jRadioMixto.isSelected()){
            tipo = "Mixto";
        }else{
            tipo = "Presencial";
        }
        if (campoVacio(nombre, "nombre", txtNombrePuesto)) {
            p = new Puesto(nombre, tipo);
            for(Tema t : temas){
                p.agregarTemasRequeridos(t);
            }
        }
        if(!temas.isEmpty()){
            if(!modelo.existePuesto(p)){
                modelo.agregarPuesto(p);
                temas.clear();
                cargarLista();
                txtNombrePuesto.setText("");
                JOptionPane.showMessageDialog(this, "El puesto fue agregado correctamente","Aceptado", JOptionPane.INFORMATION_MESSAGE);
        
            }
            else{
                JOptionPane.showMessageDialog(this, "Ese nombre de Puesto ya existe","Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "El puesto tiene que tener almenos algun tema requerido","Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cmbTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTemasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTemasActionPerformed

    private void brnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnAgregarActionPerformed
          Tema t =(Tema) cmbTemas.getSelectedItem();
          if(t != null){
            if(!temas.contains(t)){
              temas.add(t);
              cargarLista();
            }else{
                JOptionPane.showMessageDialog(this, "El tema que desea agregar ya esta en el puesto","Error", JOptionPane.ERROR_MESSAGE);
            }
          }else{
              JOptionPane.showMessageDialog(this, "El campo de tema no puede estar vacio ","Error", JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_brnAgregarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         modelo.removePropertyChangeListener(this);
    }//GEN-LAST:event_formWindowClosed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTemaActionPerformed
        Tema t =(Tema)lstTemas.getSelectedValue();
        temas.remove(t);
        cargarLista();
    }//GEN-LAST:event_btnEliminarTemaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarTema;
    private javax.swing.ButtonGroup btnGrupTipoPuesto;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cmbTemas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioMixto;
    private javax.swing.JRadioButton jRadioPresencial;
    private javax.swing.JRadioButton jRadioRemoto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblError;
    private javax.swing.JList lstTemas;
    private javax.swing.JTextField txtNombrePuesto;
    // End of variables declaration//GEN-END:variables
}
