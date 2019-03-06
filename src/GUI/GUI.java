
package GUI;

import java.util.ArrayList;
import data.*;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCliente = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 1024));
        setPreferredSize(new java.awt.Dimension(960, 530));
        setSize(new java.awt.Dimension(717, 510));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.jpg"))); // NOI18N

        btnCliente.setBackground(new java.awt.Color(237, 226, 193));
        btnCliente.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnAdmin.setBackground(new java.awt.Color(237, 226, 193));
        btnAdmin.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnAdmin.setText("ADMINISTRADOR");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btnAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        VentanaCliente vtnCli = new VentanaCliente();
        vtnCli.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        VentanaAdministrador vtnAdmin = new VentanaAdministrador();
        vtnAdmin.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed


    public static void main(String args[]) {
        
        //creacion del hotel(arreglo)
        ArrayList<Habitacion> hotel = new ArrayList<>();
        //creacion de las habitaciones
            //primer piso
        Habitacion h101 = new Habitacion(32000, "television, cama sencilla, wifi, baño con agua caliente", "Disponible",2, 1, 1, 101);
        Habitacion h102 = new Habitacion(40000, "television, cama sencilla, wifi, baño con agua caliente,cocina", "ocupado",2, 1, 1, 102);
        Habitacion h103 = new Habitacion(32000, "television, cama sencilla, wifi, baño con agua caliente", "ocupado",2, 1, 1, 103);
        Habitacion h104 = new Habitacion(40000, "television, cama sencilla, wifi, baño con agua caliente,cocina", "Disponible",2, 1, 1, 104);
            //segundo piso
        Habitacion h201 = new Habitacion(50000, "television, cama doble, wifi, baño con agua caliente, spa", "Disponible",2, 2, 1, 201);
        Habitacion h202 = new Habitacion(70000, "television, cama king, wifi, baño con agua caliente,cocina, spa", "ocupado",3, 1, 1, 202);
        Habitacion h203 = new Habitacion(50000, "television, cama doble, wifi, baño con agua caliente,spa", "ocupado",2, 2, 1, 203);
        Habitacion h204 = new Habitacion(70000, "television, cama doble, wifi, baño con agua caliente,cocina, sala , spa", "Disponible",2, 2, 1, 204);
            //Tecer piso(suits)
        Habitacion suite1 = new Habitacion(200000, "television, cama king, wifi, baño con agua caliente, spa , piscina , vista a la playa , servicio al cuarto", "Disponible",5, 1, 3, 301);
        Habitacion suite2 = new Habitacion(200000, "television, cama king, wifi, baño con agua caliente,cocina, spapiscina , vista a la playa , servicio al cuarto", "ocupado",5, 1, 3, 302);
        Habitacion suite3 = new Habitacion(200000, "television, cama king, wifi, baño con agua caliente,spa,piscina , vista a la playa , servicio al cuarto", "ocupado",5, 2, 2, 303);
        Habitacion suitePresidencial = new Habitacion(700000, "television,  cuatro camas doble, wifi, baño con agua caliente,cocina, sala , spa ,piscina , vista a la playa , servicio al cuarto", "Disponible",5, 4, 4, 304);
        
        hotel.add(h101);
        hotel.add(h102);
        hotel.add(h103);
        hotel.add(h104);
        hotel.add(h201);
        hotel.add(h202);
        hotel.add(h203);
        hotel.add(h204);
        hotel.add(suite1);
        hotel.add(suite2);
        hotel.add(suite3);
        hotel.add(suitePresidencial);
        
        //creacion recepcionista
        Recepcionista r1 = new Recepcionista("Cartagena", "recepcion principal", "lunes a domingo - 9:00 am a 12:00 pm", "marina", "1019153478", "contrasenna");
        
        
        
        
        
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
