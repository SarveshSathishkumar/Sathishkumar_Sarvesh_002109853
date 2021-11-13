/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import business.Customer.Customer;
import business.Customer.CustomerDirectory;
import business.DeliveryMan.DeliveryMan;
import business.DeliveryMan.DeliveryManDirectory;
import business.Ecosystem;
import business.Employee.Employee;
import business.Restaurant.Restaurant;
import business.Restaurant.RestaurantDirectory;
import business.Role.AdminRole;
import business.Role.CustomerRole;
import business.Role.DeliveryManRole;
import business.useraccount.UserAccount;
import business.useraccount.UserAccountDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sarveshzeke
 */
public class SystemAdminWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaPanel
     */
    JPanel userProcessContainer;
    Ecosystem system;
    UserAccount ua;
    DeliveryMan delman;
    CustomerDirectory cd;
    RestaurantDirectory rd;
    DeliveryManDirectory dmd;
    Restaurant res;
    Customer customer;
    
    public SystemAdminWorkAreaPanel(JPanel userProcessContainer,Ecosystem ecosystem) {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        createuserbtn = new javax.swing.JButton();
        CreateUserjp = new javax.swing.JPanel();
        rolecmbbx = new javax.swing.JComboBox<>();
        sysadminnametf = new javax.swing.JTextField();
        sysadminusernametf = new javax.swing.JTextField();
        sysadminrestf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sysadminpasstf = new javax.swing.JPasswordField();
        adduserbtn = new javax.swing.JButton();
        deleteuserbtn = new javax.swing.JButton();
        DeleteUserjp = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel1);

        createuserbtn.setText("Create User");
        createuserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createuserbtnActionPerformed(evt);
            }
        });

        CreateUserjp.setBackground(new java.awt.Color(204, 204, 255));

        rolecmbbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Role");

        jLabel2.setText("Name");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        jLabel5.setText("Restaurant Name");

        sysadminpasstf.setText("jPasswordField1");

        adduserbtn.setText("Add User");
        adduserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreateUserjpLayout = new javax.swing.GroupLayout(CreateUserjp);
        CreateUserjp.setLayout(CreateUserjpLayout);
        CreateUserjpLayout.setHorizontalGroup(
            CreateUserjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateUserjpLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(CreateUserjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CreateUserjpLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(sysadminrestf, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(adduserbtn))
                    .addGroup(CreateUserjpLayout.createSequentialGroup()
                        .addGroup(CreateUserjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CreateUserjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sysadminnametf)
                            .addComponent(rolecmbbx, 0, 131, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(CreateUserjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(CreateUserjpLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sysadminpasstf))
                            .addGroup(CreateUserjpLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sysadminusernametf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 52, Short.MAX_VALUE))
        );
        CreateUserjpLayout.setVerticalGroup(
            CreateUserjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateUserjpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreateUserjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rolecmbbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(sysadminusernametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateUserjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sysadminnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(sysadminpasstf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(CreateUserjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sysadminrestf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adduserbtn))
                .addGap(22, 22, 22))
        );

        CreateUserjpLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {sysadminnametf, sysadminrestf});

        deleteuserbtn.setText("Delete User");
        deleteuserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteuserbtnActionPerformed(evt);
            }
        });

        DeleteUserjp.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout DeleteUserjpLayout = new javax.swing.GroupLayout(DeleteUserjp);
        DeleteUserjp.setLayout(DeleteUserjpLayout);
        DeleteUserjpLayout.setHorizontalGroup(
            DeleteUserjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );
        DeleteUserjpLayout.setVerticalGroup(
            DeleteUserjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteuserbtn)
                    .addComponent(createuserbtn))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteUserjp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateUserjp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(createuserbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteuserbtn)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateUserjp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(DeleteUserjp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createuserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createuserbtnActionPerformed
        // TODO add your handling code here:
        CreateUserjp.setVisible(true);
    }//GEN-LAST:event_createuserbtnActionPerformed

    private void deleteuserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteuserbtnActionPerformed
        // TODO add your handling code here:
        DeleteUserjp.setVisible(true);
    }//GEN-LAST:event_deleteuserbtnActionPerformed

    private void adduserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserbtnActionPerformed
        // TODO add your handling code here:
        UserAccountDirectory usersList = system.getUserAccountDirectory();
        String role = (String) rolecmbbx.getSelectedItem();
        Employee employee = new Employee();
        employee.setName(sysadminusernametf.getText());
        boolean userDoNotExists = true;
        ArrayList<UserAccount> users = usersList.getUserAccountList();
        for(UserAccount ua : users)
        {
            if(ua.getUsername().equals(sysadminusernametf.getText()))
            userDoNotExists = false;
        }

        if(userDoNotExists)
        {
                switch (role) {
                    //Create Restaurant Admin user
                    case "Restaurant (Admin)":
                    usersList.createUserAccount(sysadminusernametf.getText(),sysadminpasstf.getText(), employee, new AdminRole());
                    ua = usersList.getUserAccount(sysadminusernametf.getText());
                    res = new Restaurant(ua);
                    res.setName(sysadminrestf.getText());
                    rd = system.getRestaurantDirectory();
                    rd.addRestaurant(res);
                    system.setRestaurantDirectory(rd);
                    break;
                    //Create Customer User
                    case "Customer":
                    usersList.createUserAccount(sysadminusernametf.getText(),sysadminpasstf.getText(), employee, new CustomerRole());
                    ua = usersList.getUserAccount(sysadminusernametf.getText());
                    customer = new Customer(ua);
                    cd = system.getCustomerDirectory();
                    cd.addCustomer(customer);
                    break;
                    //Create Delivery Man User
                    case "Delivery Man":
                    usersList.createUserAccount(sysadminusernametf.getText(),sysadminpasstf.getText(), employee, new DeliveryManRole());
                    ua = usersList.getUserAccount(sysadminusernametf.getText());
                    delman = new DeliveryMan(ua);
                    dmd = system.getDeliveryManDirectory();
                    dmd.addDeliveryDir(delman);
                    break;
                    default:
                    break;
                }

                JOptionPane.showMessageDialog(this,"User created");
                sysadminusernametf.setText("");
                sysadminpasstf.setText("");
                sysadminnametf.setText("");
                sysadminrestf.setText("");
        }
        else
        JOptionPane.showMessageDialog(this,"This user already exist. Please create a new user.");
    }//GEN-LAST:event_adduserbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateUserjp;
    private javax.swing.JPanel DeleteUserjp;
    private javax.swing.JButton adduserbtn;
    private javax.swing.JButton createuserbtn;
    private javax.swing.JButton deleteuserbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JComboBox<String> rolecmbbx;
    private javax.swing.JTextField sysadminnametf;
    private javax.swing.JPasswordField sysadminpasstf;
    private javax.swing.JTextField sysadminrestf;
    private javax.swing.JTextField sysadminusernametf;
    // End of variables declaration//GEN-END:variables
}
