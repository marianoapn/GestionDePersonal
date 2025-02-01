//Mariano Perez
//Numero estudiante 306275

package Interfaz;

import dominio.Sistema;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Menu extends javax.swing.JFrame {

    private Sistema modelo;
    private final String ubicacion;
    public Menu(Sistema unModelo, String unaUbicacion) {
        this.modelo = unModelo;
        ubicacion = unaUbicacion;
        initComponents();
    }

    public void guardarDatos(String ubicacion, Sistema modelo){
        try {
            FileOutputStream ff = new FileOutputStream(ubicacion);
            BufferedOutputStream b = new BufferedOutputStream(ff);
            ObjectOutputStream so = new ObjectOutputStream(b);
            so.writeObject(modelo);
            so.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error de serializacion");

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAgregarTema = new javax.swing.JMenuItem();
        jMenuAgregarPostulante = new javax.swing.JMenuItem();
        jMenuEliminarPostulante = new javax.swing.JMenuItem();
        jMenuAgregarEvaluador = new javax.swing.JMenuItem();
        jMenuEntrevista = new javax.swing.JMenuItem();
        jMenuPuesto = new javax.swing.JMenuItem();
        jMenuConsultarPuesto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Personal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMenu1.setText("File");

        jMenuAgregarTema.setText("Agregar Tema");
        jMenuAgregarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgregarTemaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAgregarTema);

        jMenuAgregarPostulante.setText("Agregar Postulante");
        jMenuAgregarPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgregarPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAgregarPostulante);

        jMenuEliminarPostulante.setText("Eliminar Postulante");
        jMenuEliminarPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEliminarPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEliminarPostulante);

        jMenuAgregarEvaluador.setText("Agregar Evaluador");
        jMenuAgregarEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgregarEvaluadorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAgregarEvaluador);

        jMenuEntrevista.setText("Ingreso Entrevista");
        jMenuEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEntrevistaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEntrevista);

        jMenuPuesto.setText("Registro Puesto");
        jMenuPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPuestoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuPuesto);

        jMenuConsultarPuesto.setText("Consulta Puesto");
        jMenuConsultarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultarPuestoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuConsultarPuesto);

        jMenuItem1.setText("Historial Postulante");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Consulta Tematica");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(btnSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jMenuAgregarPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgregarPostulanteActionPerformed
            VentanaAgregarPostulante vent = new VentanaAgregarPostulante(modelo);
            vent.setVisible(true);
    }//GEN-LAST:event_jMenuAgregarPostulanteActionPerformed

    private void jMenuAgregarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgregarTemaActionPerformed
        VentanaAgregarTema vent = new VentanaAgregarTema(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuAgregarTemaActionPerformed

    private void jMenuEliminarPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEliminarPostulanteActionPerformed
        VentanaEliminarPostulante vent = new VentanaEliminarPostulante(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuEliminarPostulanteActionPerformed

    private void jMenuAgregarEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgregarEvaluadorActionPerformed
        VentanaAgregarEvaluador vent = new VentanaAgregarEvaluador(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuAgregarEvaluadorActionPerformed

    private void jMenuEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEntrevistaActionPerformed
        VentanaIngresarEntrevista  vent = new VentanaIngresarEntrevista(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuEntrevistaActionPerformed

    private void jMenuPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPuestoActionPerformed
        VentanaRegistroPuesto vent = new VentanaRegistroPuesto(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuPuestoActionPerformed

    private void jMenuConsultarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultarPuestoActionPerformed
        VentanaConsultaPuesto vent = new VentanaConsultaPuesto(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuConsultarPuestoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaHistoriaPostulante vent = new VentanaHistoriaPostulante(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VentanaConsultaTematica vent = new VentanaConsultaTematica(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        guardarDatos(ubicacion, modelo);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuAgregarEvaluador;
    private javax.swing.JMenuItem jMenuAgregarPostulante;
    private javax.swing.JMenuItem jMenuAgregarTema;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuConsultarPuesto;
    private javax.swing.JMenuItem jMenuEliminarPostulante;
    private javax.swing.JMenuItem jMenuEntrevista;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuPuesto;
    // End of variables declaration//GEN-END:variables
}
