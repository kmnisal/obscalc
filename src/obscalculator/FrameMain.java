/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obscalculator;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class FrameMain extends javax.swing.JFrame {

    /**
     * Creates new form FrameMain
     */
    public FrameMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLrmpDd = new javax.swing.JTextField();
        txtLrmpMm = new javax.swing.JTextField();
        txtLrmpYy = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPoa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        calcButton = new javax.swing.JToggleButton();
        txtEddMm = new javax.swing.JTextField();
        txtEddDd = new javax.swing.JTextField();
        txtEddYy = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("ObsCalc");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 108, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Obstetric Calculator");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Enter LRMP");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtLrmpDd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLrmpDdActionPerformed(evt);
            }
        });
        getContentPane().add(txtLrmpDd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 51, -1));
        getContentPane().add(txtLrmpMm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 67, -1));

        txtLrmpYy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLrmpYyActionPerformed(evt);
            }
        });
        getContentPane().add(txtLrmpYy, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 59, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("Month (mm)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("Date (dd)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("Year (yyyy)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 71, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setText("POA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtPoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 140, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setText("EDD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        calcButton.setText("Calculate");
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });
        getContentPane().add(calcButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        txtEddMm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEddMmActionPerformed(evt);
            }
        });
        getContentPane().add(txtEddMm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 63, -1));

        txtEddDd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEddDdActionPerformed(evt);
            }
        });
        getContentPane().add(txtEddDd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 49, -1));

        txtEddYy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEddYyActionPerformed(evt);
            }
        });
        getContentPane().add(txtEddYy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 59, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setText("Date (dd)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel11.setText("Month (mm)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel12.setText("Year (yyyy)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 70, -1));

        jToggleButton1.setText("EXIT");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jToggleButton2.setText("Reset");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/obscalculator/baby_mum.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, -1, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLrmpDdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLrmpDdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLrmpDdActionPerformed

    private void txtLrmpYyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLrmpYyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLrmpYyActionPerformed

    private void txtPoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPoaActionPerformed

    private void txtEddMmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEddMmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEddMmActionPerformed

    private void txtEddDdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEddDdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEddDdActionPerformed

    private void txtEddYyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEddYyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEddYyActionPerformed

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        int dd;
        int mm;
        int yyyy;
        
        //dd = Integer.parseInt(txtLrmpDd.getText());
        //mm = Integer.parseInt(txtLrmpMm.getText())-1;
        //yyyy = Integer.parseInt(txtLrmpYy.getText());
        
        try{
            yyyy = Integer.parseInt(txtLrmpYy.getText().trim());
        } catch (Exception e)
           {System.out.println("e =" + e);
            JOptionPane.showMessageDialog(null, "Please enter correct year");
            txtLrmpYy.requestFocus();
            return;
            }
        
        try{
            mm = Integer.parseInt(txtLrmpMm.getText().trim())-1;
        } catch (Exception e)
           {System.out.println("e =" + e);
            JOptionPane.showMessageDialog(null, "Please enter correct month");
            txtLrmpMm.requestFocus();
            return;
            }
        
        try{
            dd = Integer.parseInt(txtLrmpDd.getText().trim());
        } catch (Exception e)
           {System.out.println("e =" + e);
            JOptionPane.showMessageDialog(null, "Please enter correct date");
            txtLrmpDd.requestFocus();
            return;
            }
        
        Calendar c = Calendar.getInstance();
        
        c.set(Calendar.YEAR, yyyy);
        c.set(Calendar.MONTH, mm);
        c.set(Calendar.DATE, dd);
        
        c.add(Calendar.DATE, 280);
        
        txtEddYy.setText(c.get(Calendar.YEAR) + "");
        txtEddMm.setText((c.get(Calendar.MONTH)+1) + "");
        txtEddDd.setText(c.get(Calendar.DATE) + "");
        
        Calendar a = Calendar.getInstance(); //today's date
        Calendar b = Calendar.getInstance(); //lrmp without adding 280 days
        
        b.set(Calendar.YEAR, yyyy); //getting values from previous integers
        b.set(Calendar.MONTH, mm); //getting values from previous integers
        b.set(Calendar.DATE, dd); //getting values from previous integers
                
        long poa = (a.getTimeInMillis()- b.getTimeInMillis()) / (1000*60*60*24*7);
        //should calculate the difference from miliseconds(365 days/366days). And it is a long value
        
        long poadays = ((a.getTimeInMillis()- b.getTimeInMillis()) / (1000*60*60*24))%7;
        
        txtPoa.setText(poa + "" + " weeks "+ poadays + "" + " days");
        
       
        
        
       
    }//GEN-LAST:event_calcButtonActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        txtLrmpDd.setText("");
        txtLrmpMm.setText("");
        txtLrmpYy.setText("");
        txtPoa.setText("");
        txtEddDd.setText("");
        txtEddMm.setText("");
        txtEddYy.setText("");
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton calcButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField txtEddDd;
    private javax.swing.JTextField txtEddMm;
    private javax.swing.JTextField txtEddYy;
    private javax.swing.JTextField txtLrmpDd;
    private javax.swing.JTextField txtLrmpMm;
    private javax.swing.JTextField txtLrmpYy;
    private javax.swing.JTextField txtPoa;
    // End of variables declaration//GEN-END:variables
}
