package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.BuzonSingleton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import model.MensajeModelo;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;



public class VistaPantalla extends javax.swing.JFrame {
        
        String remitente,destinario,mensaje;
    ArrayList<MensajeModelo> lista = new ArrayList<>();

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        DefaultTableModel dtm= new DefaultTableModel();
        
    public VistaPantalla() {
        initComponents();
        tbl_Mensaje.setModel(dtm);
        String columnas[]={"REMITENTE","DESTINARIO","CONTENIDO"};
        dtm.setColumnIdentifiers(columnas);
        
        
        
        tbl_Mensaje.addMouseListener(new MouseAdapter(){
        DefaultTableModel model = new DefaultTableModel();
        
        public void mouseClicked(MouseEvent e){
        int i = tbl_Mensaje.getSelectedRow();
        remitente = (tbl_Mensaje.getValueAt(i, 0).toString());
        destinario = (tbl_Mensaje.getValueAt(i, 1).toString());
        mensaje = (tbl_Mensaje.getValueAt(i, 2).toString());
        
        }});
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Mensajes = new javax.swing.JTextField();
        btn_Crear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Remitente = new javax.swing.JTextField();
        txt_Destinatario = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Mensaje = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardaModificacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Crear.setText("ENVIAR");
        btn_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel1.setText("CARTA");

        jLabel2.setText("INGRESE EL NOMBRE DEL REMITENTE");

        jLabel3.setText("INGRESE EL NOMBRE DEL DESTINARIO");

        jLabel4.setText("INGRESE EL MENSAJE A ENVIAR");

        txt_Remitente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_RemitenteKeyTyped(evt);
            }
        });

        tbl_Mensaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "REMITENTE", "DESTINARIO", "MENSAJE"
            }
        ));
        jScrollPane2.setViewportView(tbl_Mensaje);

        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardaModificacion.setText("Guardar Modificación");
        btnGuardaModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaModificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_Mensajes, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_Destinatario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_Remitente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnGuardaModificacion)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnModificar)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Mensajes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Crear)
                            .addComponent(jButton1)
                            .addComponent(btnModificar))
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardaModificacion)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearActionPerformed
        String de = txt_Destinatario.getText();
        String re = txt_Remitente.getText();
        String me = txt_Mensajes.getText();
        BuzonSingleton.getInstancia().AgregarMensaje(re,de , me);
        for (MensajeModelo mensajeModelo : BuzonSingleton.getInstancia().MostarMensaje()) {
        dtm.addRow(new Object[]{mensajeModelo.Remitente,mensajeModelo.Destinario,mensajeModelo.Mensaje});
        }



        txt_Remitente.setText("");
        txt_Destinatario.setText("");
        txt_Mensajes.setText("");


    }//GEN-LAST:event_btn_CrearActionPerformed

    private void txt_RemitenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RemitenteKeyTyped
        char c= evt.getKeyChar();
        
        if (!Character.isDefined(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txt_RemitenteKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = 0; i < lista.size(); i++) {
            if(remitente.equals(lista.get(i).getRemitente())){
            lista.remove(i);
            }
            }
         mostrarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        txt_Remitente.setText(remitente);
        txt_Destinatario.setText(destinario);
        txt_Mensajes.setText(mensaje);

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardaModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaModificacionActionPerformed

        for (int i = 0; i < lista.size(); i++) {
            if(mensaje.equals(lista.get(i).getMensaje())){
                lista.get(i).setRemitente(txt_Remitente.getText());
                lista.get(i).setDestinario(txt_Destinatario.getText());
                lista.get(i).setMensaje(txt_Mensajes.getText());
            }
        }

        txt_Remitente.setText("");
        txt_Destinatario.setText("");
        txt_Mensajes.setText("");

        mostrarDatos();

    }//GEN-LAST:event_btnGuardaModificacionActionPerformed
 public void mostrarDatos(){
    String matriz[][] = new String[lista.size()][4];
    
        for (int i = 0; i < lista.size(); i++) {
            
            matriz[i][0]=lista.get(i).getRemitente();
            matriz[i][1]=lista.get(i).getDestinario();
            matriz[i][2]=lista.get(i).getMensaje();
                              
        }
        
        tbl_Mensaje.setModel(new javax.swing.table.DefaultTableModel(matriz, new String [] {"REMITENTE","DESTINARIO","CONTENIDO"}) );
               
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardaModificacion;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btn_Crear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_Mensaje;
    private javax.swing.JTextField txt_Destinatario;
    private javax.swing.JTextField txt_Mensajes;
    private javax.swing.JTextField txt_Remitente;
    // End of variables declaration//GEN-END:variables
}
