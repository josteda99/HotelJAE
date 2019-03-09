
package GUI;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import data.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
public class VentanaAdministrador extends javax.swing.JFrame {

    String nombre = " ";
    String apellido = " ";
    String posicion = " ";
    String genero = " ";
    DefaultTableModel modelo;
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
            //Tercer piso(suits)
        Habitacion suite1 = new Habitacion(200000, "television, cama king, wifi, baño con agua caliente, spa , piscina , vista a la playa , servicio al cuarto", "Disponible",5, 1, 3, 301);
        Habitacion suite2 = new Habitacion(200000, "television, cama king, wifi, baño con agua caliente,cocina, spapiscina , vista a la playa , servicio al cuarto", "ocupado",5, 1, 3, 302);
        Habitacion suite3 = new Habitacion(200000, "television, cama king, wifi, baño con agua caliente,spa,piscina , vista a la playa , servicio al cuarto", "ocupado",5, 2, 2, 303);
        Habitacion suitePresidencial = new Habitacion(700000, "television,  cuatro camas doble, wifi, baño con agua caliente,cocina, sala , spa ,piscina , vista a la playa , servicio al cuarto", "Disponible",5, 4, 4, 304);
        
    public VentanaAdministrador() {
        initComponents();
        cargarHabitaciones(hotel);
    }

    private void cargarHabitaciones(ArrayList<Habitacion> hotel){
        int numeroCuarto;
       
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
        
        String[] titulos = {"Numero de Habitacion" , "Capacidad" , "Precio" , "Disponibilidad"};
        String[] registro = new String[4];
        modelo = new DefaultTableModel(null,titulos);
        for(Habitacion hb : hotel){
            String numeroHabitacionesString = String.valueOf(hb.getNumeroCuarto());
            String capacidadString = String.valueOf(hb.getCapacidad());
            String precioString = String.valueOf(hb.getPrecio());
            registro[0] = numeroHabitacionesString;
            registro[3] = hb.getDisponibilidad();
            registro[1] = capacidadString;
            registro[2] = precioString;
            modelo.addRow(registro);
        }
        tblHabitacion.setModel(modelo);
        
        cbxSelHabitacion.addItem(hotel.get(0).getNumeroCuarto());
        cbxSelHabitacion.addItem(hotel.get(1).getNumeroCuarto());
        cbxSelHabitacion.addItem(hotel.get(2).getNumeroCuarto());
        cbxSelHabitacion.addItem(hotel.get(3).getNumeroCuarto());
        cbxSelHabitacion.addItem(hotel.get(4).getNumeroCuarto());
        cbxSelHabitacion.addItem(hotel.get(5).getNumeroCuarto());
        cbxSelHabitacion.addItem(hotel.get(6).getNumeroCuarto());
        cbxSelHabitacion.addItem(hotel.get(7).getNumeroCuarto());
        cbxSelHabitacion.addItem(hotel.get(8).getNumeroCuarto());
        cbxSelHabitacion.addItem(hotel.get(9).getNumeroCuarto());
        cbxSelHabitacion.addItem(hotel.get(10).getNumeroCuarto());
        cbxSelHabitacion.addItem(hotel.get(11).getNumeroCuarto());
        
       
        
        cbxSelHabitacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox(hotel,cbxSelHabitacion);

            }
        });

    }
    
    private void comboBox(ArrayList<Habitacion> hotel,JComboBox cbxSelHabitacion){
        int item = (int) cbxSelHabitacion.getSelectedItem();
        
        for (int i = 0 ; i < hotel.size(); i++ ){
            if(item == (hotel.get(i).getNumeroCuarto())){
               txtAreaEspecificaciones.setText(hotel.get(i).toString());

            }
        }   
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHabitacion = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        ejemplo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaEspecificaciones = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        buscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbxSelHabitacion = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(204, 0, 102));

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tblHabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHabitacionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHabitacion);

        jPanel7.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setText("Habitaciones");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 153, 51));

        ejemplo.setText("Especificaciones de la Habitacion");

        txtAreaEspecificaciones.setColumns(20);
        txtAreaEspecificaciones.setRows(5);
        jScrollPane1.setViewportView(txtAreaEspecificaciones);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(ejemplo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ejemplo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        buscar.setText("jButton4");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 255, 102));

        cbxSelHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSelHabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(cbxSelHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(cbxSelHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(buscar))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(348, 348, 348))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(buscar)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
       
    }//GEN-LAST:event_buscarActionPerformed

    private void tblHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHabitacionMouseClicked
        System.out.println("tal vez funcione");
    }//GEN-LAST:event_tblHabitacionMouseClicked

    private void cbxSelHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSelHabitacionActionPerformed

    }//GEN-LAST:event_cbxSelHabitacionActionPerformed

    
    public static void main(String args[]) {
        
        
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
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox cbxSelHabitacion;
    private javax.swing.JLabel ejemplo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHabitacion;
    private javax.swing.JTextArea txtAreaEspecificaciones;
    // End of variables declaration//GEN-END:variables
}
