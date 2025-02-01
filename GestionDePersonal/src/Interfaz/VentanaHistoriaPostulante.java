//Mariano Perez
//Numero estudiante 306275
package Interfaz;

import dominio.Entrevista;
import dominio.Evaluador;
import dominio.Postulante;
import dominio.Sistema;
import dominio.Tema;
import java.awt.Desktop;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class VentanaHistoriaPostulante extends javax.swing.JFrame implements PropertyChangeListener {
    private Sistema modelo;
    private Postulante p;
    public VentanaHistoriaPostulante(Sistema unModelo) {
        modelo = unModelo;
        modelo.addPropertyChangeListener(this);
        initComponents();
        objetoAPantalla();
    }
    public void objetoAPantalla(){
        cargarLista();
        cargarListaExpPostulante(p);
        cargarEntrevistasTabla(p);
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        objetoAPantalla();
        
    }
    public void cargarLista(){    
        lstPostulantes.setListData(modelo.getListaPostulantes().toArray());    
    }
    public void cargarListaExpPostulante(Postulante p){
        ArrayList<String> temasConValor = new ArrayList<>();
        try{
            for(Tema item : p.getTemasPostulante().keySet()){
                temasConValor.add(item + " ("+ p.getTemasPostulante().get(item)+")");
            }
            lstExperiencia.setListData(temasConValor.toArray());
        }catch(NullPointerException e){
            lstExperiencia.setListData(temasConValor.toArray());
        }
        
    }
    public void cargarEntrevistasTabla(Postulante p){
        DefaultTableModel model = (DefaultTableModel) tblDatosEntrevista.getModel();
        model.setRowCount(0);
        try{
            for(Entrevista e: p.getListaEntrevistas()){
                int numero = e.getNumeroDeEntrevista();
                Evaluador evaluador = e.getEvaluador();
                int puntaje = e.getPuntaje();
                String comentarios = e.getComentario();

                Object[] nuevaFila = {numero, evaluador, puntaje, comentarios };

                model.addRow(nuevaFila);
            }
        }catch(NullPointerException e){
            
        }
    }
    public void abrirEnlace(String url){
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException ex) {
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();
        lblFormatoT = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstExperiencia = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPostulantes = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txrBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnResetear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatosEntrevista = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Historial Postulante");
        setPreferredSize(new java.awt.Dimension(946, 732));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Postulantes:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(25, 41, 105, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 40, 70, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Historial Postulante");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 0, 230, 27);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Cedula:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 70, 70, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(460, 130, 70, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Direccion:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 100, 70, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Mail:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(460, 160, 37, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Linkendin:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(460, 190, 70, 16);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Formato:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(460, 220, 60, 16);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Experiencia: ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 250, 70, 16);

        lblCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(lblCedula);
        lblCedula.setBounds(560, 70, 180, 20);

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(560, 130, 260, 20);

        lblDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(560, 100, 190, 20);

        lblMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(lblMail);
        lblMail.setBounds(560, 160, 260, 20);

        lblLinkedin.setForeground(new java.awt.Color(51, 51, 255));
        lblLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkedinMouseClicked(evt);
            }
        });
        getContentPane().add(lblLinkedin);
        lblLinkedin.setBounds(560, 190, 270, 20);

        lblFormatoT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(lblFormatoT);
        lblFormatoT.setBounds(560, 220, 190, 20);

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(lblNombre);
        lblNombre.setBounds(560, 40, 190, 20);

        jScrollPane1.setViewportView(lstExperiencia);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(560, 250, 260, 100);

        lstPostulantes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPostulantesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstPostulantes);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(25, 69, 340, 280);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 370, 880, 10);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Buscar:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(30, 390, 43, 16);
        getContentPane().add(txrBuscar);
        txrBuscar.setBounds(100, 390, 280, 20);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(400, 390, 90, 22);

        btnResetear.setText("Resetear");
        btnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearActionPerformed(evt);
            }
        });
        getContentPane().add(btnResetear);
        btnResetear.setBounds(510, 390, 90, 22);

        tblDatosEntrevista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Evaluador", "Puntaje", "Comentarios"
            }
        ));
        tblDatosEntrevista.setEnabled(false);
        tblDatosEntrevista.setFocusable(false);
        tblDatosEntrevista.setGridColor(new java.awt.Color(204, 204, 255));
        jScrollPane3.setViewportView(tblDatosEntrevista);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 430, 870, 210);

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 660, 90, 22);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPostulantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPostulantesValueChanged
        p = (Postulante)lstPostulantes.getSelectedValue();
        if(p != null){
            lblNombre.setText(p.getNombre());
            lblCedula.setText(p.getCedula());
            lblDireccion.setText(p.getDireccion());
            lblTelefono.setText(p.getTelefono());
            lblMail.setText(p.getMail());
            
            lblLinkedin.setText(p.getLinkedin());
            lblFormatoT.setText(p.getFormatoTrabajo());
            cargarListaExpPostulante(p);
            cargarEntrevistasTabla(p);
        }else{
            lblNombre.setText("");
            lblCedula.setText("");
            lblDireccion.setText("");
            lblTelefono.setText("");
            lblMail.setText("");
            
            lblLinkedin.setText("");
            lblFormatoT.setText("");
            cargarListaExpPostulante(p);
            cargarEntrevistasTabla(p);
        }
    }//GEN-LAST:event_lstPostulantesValueChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        modelo.removePropertyChangeListener(this);
    }//GEN-LAST:event_formWindowClosed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String palabraBuscada = txrBuscar.getText().trim();
        DefaultTableModel model = (DefaultTableModel) tblDatosEntrevista.getModel();

        if (palabraBuscada.length() > 0) {
            cargarEntrevistasTabla(p);
            for (int fila = 0; fila < model.getRowCount(); fila++) {
                String comentarioOriginal = tblDatosEntrevista.getValueAt(fila, 3).toString();

                int comentarioColumn = 3;

                String regex = "(?i)" + palabraBuscada;
                java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
                java.util.regex.Matcher matcher = pattern.matcher(comentarioOriginal);

                StringBuffer sb = new StringBuffer();
                while (matcher.find()) {
                    matcher.appendReplacement(sb, "<span style='color:red;'>" + matcher.group() + "</span>");
                }
                matcher.appendTail(sb);

                model.setValueAt("<html>" + sb.toString() + "</html>", fila, comentarioColumn);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearActionPerformed
        cargarEntrevistasTabla(p);
    }//GEN-LAST:event_btnResetearActionPerformed

    private void lblLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkedinMouseClicked
        String url = lblLinkedin.getText();
        abrirEnlace(url);
    }//GEN-LAST:event_lblLinkedinMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnResetear;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFormatoT;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JList lstExperiencia;
    private javax.swing.JList lstPostulantes;
    private javax.swing.JTable tblDatosEntrevista;
    private javax.swing.JTextField txrBuscar;
    // End of variables declaration//GEN-END:variables
}
