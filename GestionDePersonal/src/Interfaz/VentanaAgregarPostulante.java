//Mariano Perez
//Numero estudiante 306275
package Interfaz;

import dominio.Postulante;
import dominio.Sistema;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;


public class VentanaAgregarPostulante extends javax.swing.JFrame {
    
    private Sistema modelo;
    
    public VentanaAgregarPostulante(Sistema unModelo) {
        this.modelo = unModelo;
        initComponents();
        soloNumero(txtCedula);
        soloNumero(txtTelefono);
    }
    
    // metodo permite solo ingresar numeros
    public void soloNumero(javax.swing.JTextField lbl){
        lbl.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Consume el evento si no es un dígito
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

        grupoTipoFormato = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtLinkedin = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        rBtnPresencial = new javax.swing.JRadioButton();
        rBtnMxito = new javax.swing.JRadioButton();
        rBtnRemoto = new javax.swing.JRadioButton();
        txtCedula = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Postulante");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(450, 440));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alta postulante");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 180, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Cedula:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 120, 50, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Direccion:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 160, 60, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Mail:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 240, 37, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 80, 70, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Linkedin:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 280, 80, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Formato:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 320, 60, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Telefono:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 200, 60, 16);

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente);
        btnSiguiente.setBounds(300, 360, 100, 22);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(20, 360, 100, 22);
        getContentPane().add(txtLinkedin);
        txtLinkedin.setBounds(90, 280, 320, 22);
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(90, 160, 320, 22);
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(90, 200, 320, 22);
        getContentPane().add(txtMail);
        txtMail.setBounds(90, 240, 320, 22);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(90, 80, 320, 22);

        grupoTipoFormato.add(rBtnPresencial);
        rBtnPresencial.setText("Presencial");
        getContentPane().add(rBtnPresencial);
        rBtnPresencial.setBounds(180, 320, 98, 20);

        grupoTipoFormato.add(rBtnMxito);
        rBtnMxito.setText("Mixto");
        getContentPane().add(rBtnMxito);
        rBtnMxito.setBounds(280, 320, 98, 20);

        grupoTipoFormato.add(rBtnRemoto);
        rBtnRemoto.setSelected(true);
        rBtnRemoto.setText("Remoto");
        getContentPane().add(rBtnRemoto);
        rBtnRemoto.setBounds(90, 320, 98, 20);

        txtCedula.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtCedulaInputMethodTextChanged(evt);
            }
        });
        getContentPane().add(txtCedula);
        txtCedula.setBounds(90, 120, 320, 22);

        lblError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblError.setForeground(Color.RED);
        getContentPane().add(lblError);
        lblError.setBounds(90, 50, 320, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 43, 390, 10);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String nombre = txtNombre.getText().trim();
        String cedula = txtCedula.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String mail = txtMail.getText().trim();
        String linkedin = txtLinkedin.getText().trim();
        String tipo = "";
        if(rBtnRemoto.isSelected()){
            tipo = "Remoto";
        }else if(rBtnMxito.isSelected()){
            tipo = "Mixto";
        }else{
            tipo = "Presencial";
        }
        if(campoVacio(nombre,"nombre", txtNombre)&& campoVacio(cedula,"cedula", txtCedula)&&
        campoVacio(direccion,"direccion", txtDireccion)&& campoVacio(telefono,"telefono", txtTelefono)&&
        campoVacio(mail,"mail", txtMail)&& campoVacio(linkedin,"linkedin", txtLinkedin)){
            
            Postulante p1 = new Postulante(nombre, cedula, direccion, mail, telefono, linkedin, tipo);
            if(!modelo.existePersona(p1)){
                txtNombre.setText("");
                txtCedula.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
                txtMail.setText("");
                txtLinkedin.setText("");
                VentanaTemasPostulante vent1 = new VentanaTemasPostulante(modelo, p1);
                vent1.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "La persona con esa cedula ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
        
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void txtCedulaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCedulaInputMethodTextChanged
        
    }//GEN-LAST:event_txtCedulaInputMethodTextChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup grupoTipoFormato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblError;
    private javax.swing.JRadioButton rBtnMxito;
    private javax.swing.JRadioButton rBtnPresencial;
    private javax.swing.JRadioButton rBtnRemoto;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
