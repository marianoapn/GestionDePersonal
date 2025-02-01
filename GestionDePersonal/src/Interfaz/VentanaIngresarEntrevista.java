//Mariano Perez
//Numero estudiante 306275
package Interfaz;

import dominio.Evaluador;
import dominio.Postulante;
import dominio.Sistema;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class VentanaIngresarEntrevista extends javax.swing.JFrame implements PropertyChangeListener{

    private Sistema modelo;
    
    public VentanaIngresarEntrevista(Sistema unModelo) {
        this.modelo = unModelo;
        modelo.addPropertyChangeListener(this);
        initComponents();
        soloNumero(txtPuntaje);
        objetoAPantalla();
        
    }
    public void objetoAPantalla(){
        cargarCombo();
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        objetoAPantalla();
    }
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
    public void cargarCombo(){
        try{
        DefaultComboBoxModel<Postulante> model = new DefaultComboBoxModel<>();

        for (Postulante item : modelo.getListaPostulantes()) {
                model.addElement(item);
        }
       
        cbmPostulante.setModel(model);
        DefaultComboBoxModel<Evaluador> model1 = new DefaultComboBoxModel<>();

        for (Evaluador item : modelo.getListaEvaluadores()) {
                model1.addElement(item);
        }
       
        cbmEvaluador.setModel(model1);
        }catch(NullPointerException e){
            
        }
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
        jSeparator1 = new javax.swing.JSeparator();
        cbmEvaluador = new javax.swing.JComboBox();
        cbmPostulante = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPuntaje = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso de Entrevista");
        setPreferredSize(new java.awt.Dimension(450, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Ingreso de Entrevista");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 160, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 30, 410, 10);

        getContentPane().add(cbmEvaluador);
        cbmEvaluador.setBounds(120, 80, 220, 22);

        getContentPane().add(cbmPostulante);
        cbmPostulante.setBounds(120, 120, 220, 22);

        jLabel2.setText("Evaluador:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 86, 16);

        jLabel3.setText("Postulante:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 86, 16);

        jLabel4.setText("Puntaje:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 160, 86, 16);
        getContentPane().add(txtPuntaje);
        txtPuntaje.setBounds(120, 160, 220, 22);

        jLabel5.setText("Comentarios:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 210, 86, 16);

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane1.setViewportView(txtComentario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 210, 220, 86);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 320, 86, 22);

        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 320, 89, 22);

        lblError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblError);
        lblError.setBounds(120, 50, 300, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Evaluador eva = (Evaluador)cbmEvaluador.getSelectedItem();
       Postulante pos =(Postulante) cbmPostulante.getSelectedItem();
       String puntaje = txtPuntaje.getText().trim();
       String comentario = txtComentario.getText().trim();
       if(campoVacio(puntaje, "puntaje", txtPuntaje) && campoVacio(comentario, "comentario", txtComentario)){
           int punt = Integer.parseInt(puntaje);
           if(punt>0 && punt<101){
               if(eva != null && pos !=null){
                txtPuntaje.setBorder(new LineBorder(Color.black));
                lblError.setText("");
                modelo.agregarEntrevista(eva, pos, punt, comentario);
                txtComentario.setText("");
                txtPuntaje.setText("");
                JOptionPane.showMessageDialog(this, "La entrevista fue ingresada correctamente","Aceptada",JOptionPane.INFORMATION_MESSAGE);
               }else{
                   JOptionPane.showMessageDialog(this, "El campo de Evaluador y Postulante no pueden estar vacios","Error",JOptionPane.ERROR_MESSAGE);
               }
            }else{
               txtPuntaje.setBorder(new LineBorder(Color.red));
               lblError.setText("Error: el puntaje tiene que estar en rango de 1-100");    
           }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbmEvaluador;
    private javax.swing.JComboBox cbmPostulante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtPuntaje;
    // End of variables declaration//GEN-END:variables
}
