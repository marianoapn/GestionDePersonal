//Mariano Perez
//Numero estudiante 306275
package Interfaz;

import dominio.Sistema;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

public class TomarDatos extends javax.swing.JFrame {
    private Sistema modelo;
    private static final String UBICACION = "archivoDatos.ser"; 
    public TomarDatos() {
        initComponents();
    }
    
    public Sistema cargarSistema() {
        Sistema modelo = null;
        try {
            FileInputStream archivoEntrada = new FileInputStream(UBICACION);
            ObjectInputStream flujoObjetos = new ObjectInputStream(archivoEntrada);
            modelo = (Sistema) flujoObjetos.readObject();
            flujoObjetos.close();
            archivoEntrada.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "No se encontro ningun archivo, se inicializara un nuevo sistema","Atencion!",JOptionPane.WARNING_MESSAGE);
            modelo = new Sistema();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return modelo;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNo = new javax.swing.JButton();
        btnSi = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Toma de datos");
        setPreferredSize(new java.awt.Dimension(385, 130));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Desea tomar datos del sistema anterior?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(69, 6, 280, 16);

        btnNo.setText("NO");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNo);
        btnNo.setBounds(30, 60, 90, 22);

        btnSi.setText("SI");
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });
        getContentPane().add(btnSi);
        btnSi.setBounds(250, 60, 90, 22);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 30, 310, 3);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        modelo = cargarSistema();
        Menu menuInicial = new Menu(modelo,UBICACION);
        menuInicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSiActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        modelo = new Sistema();
        Menu menuInicial = new Menu(modelo,UBICACION);
        menuInicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
