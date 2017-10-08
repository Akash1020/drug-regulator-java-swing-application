/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CompoundSupplierRole;

import Business.DrugManufacturing.Organization.CompoundSupplierOrganization;
import Business.Enterprise.DrugManufacturingEnterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mihir
 */
public class CompoundSupplierWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CompoundSupplierWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    CompoundSupplierOrganization compoundSupplierOrganization;
    DrugManufacturingEnterprise drugManufacturingEnterprise;

    public CompoundSupplierWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CompoundSupplierOrganization compoundSupplierOrganization, DrugManufacturingEnterprise drugManufacturingEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.compoundSupplierOrganization = compoundSupplierOrganization;
        this.drugManufacturingEnterprise = drugManufacturingEnterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnViewRequest = new javax.swing.JButton();
        btnManageInventory = new javax.swing.JButton();

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Compound Supplier Work Area");

        btnViewRequest.setText("View Request");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });

        btnManageInventory.setText("Manage Inventory");
        btnManageInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageInventoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnViewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnManageInventory)))
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewRequest)
                    .addComponent(btnManageInventory))
                .addGap(300, 300, 300))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        ViewRequestJPanel vrjp = new ViewRequestJPanel(userProcessContainer, compoundSupplierOrganization, drugManufacturingEnterprise, account);
        userProcessContainer.add("ViewRequestJPanel", vrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnManageInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageInventoryActionPerformed
        // TODO add your handling code here:
        ManageInventoryJPanel mijp = new ManageInventoryJPanel(userProcessContainer,drugManufacturingEnterprise);
        userProcessContainer.add("ManageInventoryJPanel", mijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageInventoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageInventory;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
