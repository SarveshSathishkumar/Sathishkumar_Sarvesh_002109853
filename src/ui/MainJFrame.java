/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.Image;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.util.Date;

/**
 *
 * @author rohinibalasubramanian
 */

public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
      Ecosystem ecosystem;
     UserAccountDirectory useraccountDirectory;
     UserAccount ua;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
     Date date;
    public MainJFrame() {
        initComponents();
       // dB4OUtil.removeEntries();
        ecosystem = dB4OUtil.retrieveSystem();
       useraccountDirectory = ecosystem.getUserAccountDirectory();
       // this.setSize(1680, 1050);
         //date.setText(" "+String.valueOf(LocalTime.now().getHour()) + ":"+String.valueOf(LocalTime.now().getMinute()));
         //lblHome.setIcon(new ImageIcon(new ImageIcon("src/Business/Util/Icon/Home.png").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
        ArrayList<UserAccount> users = useraccountDirectory.getUserAccountList();
         
         for(UserAccount ua: users)
         {
             if(ua.getUsername().equals("doctor4") || ua.getUsername().equals("doctor3"))
             {
                 ua.setEmail("charan.guttikonda@gmail.com");
             }
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
