//Mariano Perez
//Numero estudiante 306275
package Interfaz;

import dominio.Evaluador;
import dominio.Sistema;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class VentanaAgregarEvaluador extends javax.swing.JFrame {

    private Sistema modelo;
    
    public VentanaAgregarEvaluador(Sistema unModelo) {
        this.modelo = unModelo;
        initComponents();
        soloNumero(txtCedula);
        soloNumero(txtIngreso);
    }
    
    public void soloNumero(javax.swing.JTextField lbl){
        lbl.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {
                //requiere escribirlo
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // requiere escribirlo
            }
        });
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
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtIngreso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Evaluador");
        setPreferredSize(new java.awt.Dimension(480, 330));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 80, 66, 16);

        jLabel2.setText("Cedula:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 120, 66, 16);

        jLabel3.setText("Año ingreso:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 200, 80, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingreso de Evaluador");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(113, 6, 234, 32);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(32, 40, 386, 10);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(130, 80, 290, 22);
        getContentPane().add(txtCedula);
        txtCedula.setBounds(130, 120, 290, 22);
        getContentPane().add(txtIngreso);
        txtIngreso.setBounds(130, 200, 290, 22);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 250, 97, 22);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 250, 99, 22);

        jLabel5.setText("Direccion:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 160, 70, 16);
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(130, 160, 290, 22);

        lblError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblError);
        lblError.setBounds(130, 50, 290, 16);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = txtNombre.getText().trim();
        String cedula = txtCedula.getText().trim();
        String direccion = txtDireccion.getText().trim(); 
        String ingreso = txtIngreso.getText().trim();
        
        if(campoVacio(nombre, "nombre",txtNombre)&&campoVacio(cedula,"cedula", txtCedula)  &&campoVacio(direccion, "direccion",txtDireccion) && campoVacio(ingreso,"Año ingreso" ,txtIngreso)){
            int añoActual = Calendar.getInstance().get(Calendar.YEAR);
            int ing = Integer.parseInt(ingreso);
             if (ing <= añoActual){
                if(ing >= 1975){
                    Evaluador eva = new Evaluador(nombre, cedula, direccion, ing);
                    if(!modelo.existePersona(eva)){
                        modelo.agregarEvaluador(eva);
                        JOptionPane.showMessageDialog(this, "El evaluador fue ingresado correctamente", "Error", JOptionPane.INFORMATION_MESSAGE);
                        txtIngreso.setText("");
                        txtNombre.setText("");
                        txtCedula.setText("");
                        txtDireccion.setText("");
                    }else{
                        JOptionPane.showMessageDialog(this, "La persona con esa cedula ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "El año de ingreso debe ser mayor a 1975", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "El año de ingreso debe ser igual o menor actual", "Error", JOptionPane.ERROR_MESSAGE);
            }    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
