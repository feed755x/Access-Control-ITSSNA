/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author feed755x
 */
public class modificar extends javax.swing.JFrame {

        
    Connection con = null;
    ResultSet rst = null;
    PreparedStatement pst = null;
    
    public modificar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        con = conector.ConnecrDb();
        
        numerocontrol.setEditable(false);
        numerocontrol.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombrea = new javax.swing.JTextField();
        apellidopaterno = new javax.swing.JTextField();
        apellidomaterno = new javax.swing.JTextField();
        numerocontrol = new javax.swing.JTextField();
        guardarcambios = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        cbcarrera = new javax.swing.JComboBox();
        cbsemestre = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar alumno");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Apellido paterno");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Apellido materno");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Numero de control");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Semestre");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Carrera");

        nombrea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombrea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreaKeyTyped(evt);
            }
        });

        apellidopaterno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        apellidopaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidopaternoKeyTyped(evt);
            }
        });

        apellidomaterno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        apellidomaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidomaternoKeyTyped(evt);
            }
        });

        numerocontrol.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numerocontrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerocontrolActionPerformed(evt);
            }
        });
        numerocontrol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numerocontrolKeyTyped(evt);
            }
        });

        guardarcambios.setBackground(new java.awt.Color(255, 255, 255));
        guardarcambios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        guardarcambios.setText("GUARDAR");
        guardarcambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarcambiosActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        cbcarrera.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbcarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INGENIERIA EN ADMINISTRACION", "INGENIERIA ELECTROMECANICA", "INGENIERIA EN SISTEMAS COMPUTACIONALES", "INGENIERIA INDUSTRIAL" }));

        cbsemestre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbsemestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO", "SEXTO", "SEPTIMO", "OCTAVO", "NOVENO", "DECIMO", "ONCEAVO", "DUODECIMO" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(nombrea)
                    .addComponent(jLabel5)
                    .addComponent(numerocontrol)
                    .addComponent(cbsemestre, 0, 150, Short.MAX_VALUE))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(apellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(apellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(guardarcambios)
                        .addGap(100, 100, 100)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(cbcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(numerocontrol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbsemestre)
                    .addComponent(cbcarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarcambios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
            this.dispose();
            inicio inicio1 = new inicio();
            inicio1.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void numerocontrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerocontrolActionPerformed
        
    }//GEN-LAST:event_numerocontrolActionPerformed

    private void guardarcambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarcambiosActionPerformed
            String nombrenew, apellidopnew, apellidomnew, ncontrolnew,carreranew, semestrenew;
            
            nombrenew = nombrea.getText();
            apellidopnew = apellidopaterno.getText();
            apellidomnew = apellidomaterno.getText();
            ncontrolnew = numerocontrol.getText();
            carreranew = cbcarrera.getSelectedItem().toString();
            semestrenew = cbsemestre.getSelectedItem().toString();
            
            try{
             //CodigoBR, Nombre, Precio, Cantidad
            String sql = "UPDATE alumnos SET nombre = ?,"+"apellidop = ?,"+"apellidom = ?, "+"carrera = ?,"+"semestre = ? "+"WHERE ncontrol = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nombrenew);
            pst.setString(2, apellidopnew);
            pst.setString(3, apellidomnew);
            pst.setString(4, carreranew);
            pst.setString(5, semestrenew);
            pst.setString(6, ncontrolnew);
            
            pst.executeUpdate();
         
            }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
             }finally{
               try{
               // rst.close();
                pst.close();
             }catch(Exception e){    
                 }
            }
            
            this.dispose();
            inicio inicio1 = new inicio();
            inicio1.setVisible(true);
            this.setVisible(false);
          
    }//GEN-LAST:event_guardarcambiosActionPerformed

    private void nombreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreaKeyTyped
                   char c=evt.getKeyChar();
             if(Character.isLowerCase(c)){
                 String cad=(""+c).toUpperCase();
                 c=cad.charAt(0);
                 evt.setKeyChar(c);
             }
    }//GEN-LAST:event_nombreaKeyTyped

    private void apellidopaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidopaternoKeyTyped
                     char c=evt.getKeyChar();
             if(Character.isLowerCase(c)){
                 String cad=(""+c).toUpperCase();
                 c=cad.charAt(0);
                 evt.setKeyChar(c);
             }
    }//GEN-LAST:event_apellidopaternoKeyTyped

    private void apellidomaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidomaternoKeyTyped
                     char c=evt.getKeyChar();
             if(Character.isLowerCase(c)){
                 String cad=(""+c).toUpperCase();
                 c=cad.charAt(0);
                 evt.setKeyChar(c);
             }
    }//GEN-LAST:event_apellidomaternoKeyTyped

    private void numerocontrolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numerocontrolKeyTyped
                    char c = evt.getKeyChar();
            if(Character.isLetter(c)){
                getToolkit().beep();
                evt.consume();
            }
    }//GEN-LAST:event_numerocontrolKeyTyped

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
            java.util.logging.Logger.getLogger(modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField apellidomaterno;
    public static javax.swing.JTextField apellidopaterno;
    private javax.swing.JComboBox cbcarrera;
    private javax.swing.JComboBox cbsemestre;
    private javax.swing.JButton guardarcambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField nombrea;
    public static javax.swing.JTextField numerocontrol;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
