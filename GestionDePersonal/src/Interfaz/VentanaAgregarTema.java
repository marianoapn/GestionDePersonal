//Mariano Perez
//Numero estudiante 306275
package Interfaz;

import dominio.Sistema;
import dominio.Tema;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class VentanaAgregarTema extends javax.swing.JFrame {

    private Sistema modelo;
    
    public VentanaAgregarTema(Sistema unModelo) {
        this.modelo = unModelo;
        initComponents();
    }
    public boolean campoVacio(String txt, String campo, javax.swing.JTextArea lbl){
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Tematica");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Registro Tematica"); // NOI18N
        setPreferredSize(new java.awt.Dimension(528, 299));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Tematica");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(119, 0, 241, 30);

        jLabel2.setText("Nombre: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 70, 90, 16);

        jLabel3.setText("Descripcion:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 110, 90, 16);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(150, 70, 300, 22);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(340, 220, 111, 22);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(40, 220, 101, 22);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 110, 300, 86);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(40, 33, 410, 3);

        lblError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblError);
        lblError.setBounds(150, 50, 300, 16);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtNombre.getText().trim();
        String descripcion = txtDescripcion.getText().trim();
              
        if(campoVacio(nombre, "nombre", txtNombre) && campoVacio(descripcion, "descripcion", txtDescripcion)){
            Tema t1 = new Tema(nombre, descripcion);            
            if(this.modelo.existeTema(t1)){
                JOptionPane.showMessageDialog(this, "El Tema ya existe, no se pudo agregar","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                this.modelo.agregarTema(t1);
                txtNombre.setText("");
                txtDescripcion.setText("");
                JOptionPane.showMessageDialog(this, "El Tema fue agregado correctamente","Confirmacion alta",JOptionPane.INFORMATION_MESSAGE);
            }
        }
            
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
