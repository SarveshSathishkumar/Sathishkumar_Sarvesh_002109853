/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiframes;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import person.Person;

/**
 *
 * @author sarveshzeke
 * 
 */

public class DisplayJFrame extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJFrame
     */
    Person p;
    public DisplayJFrame(Person p) {
        initComponents();
        this.p = p;
        displaydetails();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gdatapanel = new javax.swing.JPanel();
        namelbl = new javax.swing.JLabel();
        doblbl = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        citylbl = new javax.swing.JLabel();
        citytf = new javax.swing.JTextField();
        countrylbl = new javax.swing.JLabel();
        countrytf = new javax.swing.JTextField();
        datechsr = new com.toedter.calendar.JDateChooser();
        personaldatapanel = new javax.swing.JPanel();
        telnolbl = new javax.swing.JLabel();
        telnotf = new javax.swing.JTextField();
        ssnlbl = new javax.swing.JLabel();
        ssntf = new javax.swing.JTextField();
        faxnolbl = new javax.swing.JLabel();
        faxnotf = new javax.swing.JTextField();
        emaillbl = new javax.swing.JLabel();
        emailtf = new javax.swing.JTextField();
        medrecnolbl = new javax.swing.JLabel();
        medrecnotf = new javax.swing.JTextField();
        banknolbl = new javax.swing.JLabel();
        banknotf = new javax.swing.JTextField();
        addnotf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bennotf = new javax.swing.JTextField();
        addemailtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        uniquenotf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        licensenolbl = new javax.swing.JLabel();
        licensenotf = new javax.swing.JTextField();
        vehiclenolbl = new javax.swing.JLabel();
        vehiclenotf = new javax.swing.JTextField();
        devicenolbl = new javax.swing.JLabel();
        devicenotf = new javax.swing.JTextField();
        ipalbl = new javax.swing.JLabel();
        ipatf = new javax.swing.JTextField();
        linkedinlbl = new javax.swing.JLabel();
        linkedintf = new javax.swing.JTextField();
        imagelbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 0, 51));

        gdatapanel.setBackground(new java.awt.Color(102, 102, 102));

        namelbl.setText("Name:");

        doblbl.setText("DOB:");

        citylbl.setText("City:");

        countrylbl.setText("Country:");

        datechsr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datechsrMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout gdatapanelLayout = new javax.swing.GroupLayout(gdatapanel);
        gdatapanel.setLayout(gdatapanelLayout);
        gdatapanelLayout.setHorizontalGroup(
            gdatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gdatapanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(gdatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gdatapanelLayout.createSequentialGroup()
                        .addComponent(countrylbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countrytf, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gdatapanelLayout.createSequentialGroup()
                        .addComponent(namelbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gdatapanelLayout.createSequentialGroup()
                        .addGroup(gdatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doblbl)
                            .addComponent(citylbl))
                        .addGroup(gdatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gdatapanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(citytf, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gdatapanelLayout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(datechsr, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 27, Short.MAX_VALUE)))))
                .addGap(6, 6, 6))
        );
        gdatapanelLayout.setVerticalGroup(
            gdatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gdatapanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(gdatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelbl))
                .addGap(15, 15, 15)
                .addGroup(gdatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(doblbl)
                    .addComponent(datechsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(gdatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(citytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(citylbl))
                .addGap(33, 33, 33)
                .addGroup(gdatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countrylbl)
                    .addComponent(countrytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        personaldatapanel.setBackground(new java.awt.Color(204, 255, 204));

        telnolbl.setText("Tel No:");

        ssnlbl.setText("SSN:");

        faxnolbl.setText("Fax No:");

        emaillbl.setText("Email:");

        medrecnolbl.setText("Medical Rec No:");

        medrecnotf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                medrecnotfKeyReleased(evt);
            }
        });

        banknolbl.setText("Bank_Acc_No:");

        banknotf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banknotfActionPerformed(evt);
            }
        });

        addnotf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnotfActionPerformed(evt);
            }
        });
        addnotf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addnotfKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addnotfKeyTyped(evt);
            }
        });

        jLabel1.setText("Medical Beneficiary No(MBI):");

        bennotf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bennotfKeyReleased(evt);
            }
        });

        addemailtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addemailtfKeyReleased(evt);
            }
        });

        jLabel3.setText("Unique Identifier");

        uniquenotf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                uniquenotfKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout personaldatapanelLayout = new javax.swing.GroupLayout(personaldatapanel);
        personaldatapanel.setLayout(personaldatapanelLayout);
        personaldatapanelLayout.setHorizontalGroup(
            personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personaldatapanelLayout.createSequentialGroup()
                .addGroup(personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personaldatapanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(faxnolbl)
                            .addComponent(telnolbl)
                            .addComponent(ssnlbl)
                            .addComponent(emaillbl)
                            .addComponent(medrecnolbl)
                            .addComponent(banknolbl)))
                    .addGroup(personaldatapanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personaldatapanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telnotf, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(faxnotf)
                    .addComponent(ssntf)
                    .addComponent(emailtf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(medrecnotf)
                    .addComponent(banknotf)
                    .addComponent(bennotf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uniquenotf, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addnotf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addemailtf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        personaldatapanelLayout.setVerticalGroup(
            personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personaldatapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telnotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telnolbl)
                    .addComponent(addnotf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faxnolbl)
                    .addComponent(faxnotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssnlbl)
                    .addComponent(ssntf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addemailtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medrecnolbl)
                    .addComponent(medrecnotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(banknolbl)
                    .addComponent(banknotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bennotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(personaldatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(uniquenotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        licensenolbl.setText("License No:");

        vehiclenolbl.setText("Vehicle No:");

        devicenolbl.setText("Device Identifier:");

        ipalbl.setText("IPA:");

        linkedinlbl.setText("LinkedIn:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(licensenolbl)
                    .addComponent(vehiclenolbl)
                    .addComponent(devicenolbl)
                    .addComponent(ipalbl)
                    .addComponent(linkedinlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(licensenotf)
                    .addComponent(vehiclenotf)
                    .addComponent(devicenotf)
                    .addComponent(ipatf)
                    .addComponent(linkedintf, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licensenolbl)
                    .addComponent(licensenotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehiclenolbl)
                    .addComponent(vehiclenotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(devicenolbl)
                    .addComponent(devicenotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipalbl)
                    .addComponent(ipatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(linkedinlbl)
                    .addComponent(linkedintf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gdatapanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(personaldatapanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(853, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(gdatapanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personaldatapanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)))
                .addComponent(imagelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void banknotfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banknotfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_banknotfActionPerformed

    private void datechsrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datechsrMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_datechsrMouseClicked

    private void medrecnotfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medrecnotfKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_medrecnotfKeyReleased

    private void addnotfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnotfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addnotfActionPerformed

    private void addnotfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addnotfKeyReleased
        // TODO add your handling code here:

       

    }//GEN-LAST:event_addnotfKeyReleased

    private void addnotfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addnotfKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addnotfKeyTyped

    private void bennotfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bennotfKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bennotfKeyReleased

    private void addemailtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addemailtfKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_addemailtfKeyReleased

    private void uniquenotfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uniquenotfKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_uniquenotfKeyReleased

private void displaydetails()
{
    
        addnotf.setVisible(true);
        addnotf.setBackground(Color.LIGHT_GRAY);
        addnotf.setText(p.getExtrano());
        addnotf.setEditable(false);
    
    nametf.setBackground(Color.LIGHT_GRAY);
    nametf.setText(p.getName());
    nametf.setEditable(false);
    datechsr.setBackground(Color.LIGHT_GRAY);
    datechsr.setDate(p.getDob());
    datechsr.setEnabled(false);
    citytf.setBackground(Color.LIGHT_GRAY);
    citytf.setText(p.getCity());
    citytf.setEditable(false);
    countrytf.setBackground(Color.LIGHT_GRAY);
    countrytf.setText(p.getCountry());
    countrytf.setEditable(false);
    telnotf.setBackground(Color.lightGray);
    telnotf.setText(p.getTelno());
    telnotf.setEditable(false);
    faxnotf.setBackground(Color.lightGray);
    faxnotf.setText(p.getFaxno());
    faxnotf.setEditable(false);
    ssntf.setBackground(Color.LIGHT_GRAY);  
    ssntf.setText(p.getSsn());
    ssntf.setEditable(false);
    emailtf.setBackground(Color.LIGHT_GRAY);
    emailtf.setText(p.getEmail());
    emailtf.setEditable(false);
    medrecnotf.setBackground(Color.LIGHT_GRAY);
    medrecnotf.setText(p.getMed_rec_no());
    medrecnotf.setEditable(false);
    banknotf.setBackground(Color.LIGHT_GRAY);
    banknotf.setText(p.getBank_acc_no());
    banknotf.setEditable(false);
    devicenotf.setBackground(Color.LIGHT_GRAY);
    devicenotf.setText(p.getDeviceno());
    devicenotf.setEditable(false);
    ipatf.setBackground(Color.LIGHT_GRAY);
    ipatf.setText(p.getIPA());
    ipatf.setEditable(false);
    licensenotf.setBackground(Color.LIGHT_GRAY);
    licensenotf.setText(p.getLicenseno());
    licensenotf.setEditable(false);
    vehiclenotf.setBackground(Color.LIGHT_GRAY);
    vehiclenotf.setText(p.getVehicleno());
    vehiclenotf.setEditable(false);
    linkedintf.setBackground(Color.LIGHT_GRAY);
    linkedintf.setText(p.getLinkedin());
    linkedintf.setEditable(false);
    devicenotf.setBackground(Color.LIGHT_GRAY);
    devicenotf.setText(p.getDeviceno());
    devicenotf.setEditable(false);
    bennotf.setBackground(Color.LIGHT_GRAY);
    bennotf.setText(p.getBeneficiary_num());
    bennotf.setEditable(false);
    addemailtf.setBackground(Color.LIGHT_GRAY);
    addemailtf.setText(p.getExtraemail());
    addemailtf.setEditable(false);
    uniquenotf.setBackground(Color.LIGHT_GRAY);
    uniquenotf.setText(p.getUniqueno());
    uniquenotf.setEditable(false);
    
    ImageIcon myimage = new ImageIcon(p.getImage_upload());
    Image image = myimage.getImage();
    imagelbl.setIcon(new ImageIcon(image));
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addemailtf;
    private javax.swing.JTextField addnotf;
    private javax.swing.JLabel banknolbl;
    private javax.swing.JTextField banknotf;
    private javax.swing.JTextField bennotf;
    private javax.swing.JLabel citylbl;
    private javax.swing.JTextField citytf;
    private javax.swing.JLabel countrylbl;
    private javax.swing.JTextField countrytf;
    private com.toedter.calendar.JDateChooser datechsr;
    private javax.swing.JLabel devicenolbl;
    private javax.swing.JTextField devicenotf;
    private javax.swing.JLabel doblbl;
    private javax.swing.JLabel emaillbl;
    private javax.swing.JTextField emailtf;
    private javax.swing.JLabel faxnolbl;
    private javax.swing.JTextField faxnotf;
    private javax.swing.JPanel gdatapanel;
    private javax.swing.JLabel imagelbl;
    private javax.swing.JLabel ipalbl;
    private javax.swing.JTextField ipatf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel licensenolbl;
    private javax.swing.JTextField licensenotf;
    private javax.swing.JLabel linkedinlbl;
    private javax.swing.JTextField linkedintf;
    private javax.swing.JLabel medrecnolbl;
    private javax.swing.JTextField medrecnotf;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametf;
    private javax.swing.JPanel personaldatapanel;
    private javax.swing.JLabel ssnlbl;
    private javax.swing.JTextField ssntf;
    private javax.swing.JLabel telnolbl;
    private javax.swing.JTextField telnotf;
    private javax.swing.JTextField uniquenotf;
    private javax.swing.JLabel vehiclenolbl;
    private javax.swing.JTextField vehiclenotf;
    // End of variables declaration//GEN-END:variables
}


