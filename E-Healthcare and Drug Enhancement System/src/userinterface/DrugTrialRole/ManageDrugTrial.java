/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugTrialRole;

import Business.DrugManufacturing.Organization.DrugTrialOrganization;
import Business.Enterprise.DrugManufacturingEnterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DrugTrialWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pushkar
 */
public class ManageDrugTrial extends javax.swing.JPanel {

    /**
     * Creates new form ManageDrugTrial
     */
    JPanel userProcessContainer;
    DrugTrialOrganization drugTrialOrganization;
    DrugManufacturingEnterprise drugManufacturingEnterprise;
    UserAccount account;

    public ManageDrugTrial(JPanel userProcessContainer, DrugTrialOrganization drugTrialOrganization, DrugManufacturingEnterprise drugManufacturingEnterprise, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.drugManufacturingEnterprise = drugManufacturingEnterprise;
        this.drugTrialOrganization = drugTrialOrganization;

        populateTable();
    }

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblTrials.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : drugTrialOrganization.getWorkQueue().getWorkRequestList()) {
            Object row[] = new Object[8];

            row[0] = ((DrugTrialWorkRequest) request);
            row[1] = ((DrugTrialWorkRequest) request).getDrugVersions().getDrugNumber();
            row[2] = ((DrugTrialWorkRequest) request).getDisease();
            row[3] = ((DrugTrialWorkRequest) request).getDrugVersions().getTrialDirectory().getTrialDirectory().size();
            row[4] = request.getSender();
            row[5] = request.getReceiver();
            row[6] = request.getStatus();
            row[7] = request.getStatus() == "Completed" ? (((DrugTrialWorkRequest) request).getDrugVersions().isApproved() ? "Yes" : "No") : "Under Trial";

            dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrials = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnTrial = new javax.swing.JButton();
        btnTrialHistory = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();

        tblTrials.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug", "Version", "Disease", "Trials Performed", "Sender", "Reciever", "Request Status", "Approval Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTrials);

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("MANAGE DRUG TRIALS");

        btnTrial.setText("Perform Trial");
        btnTrial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrialActionPerformed(evt);
            }
        });

        btnTrialHistory.setText("View History");

        jButton3.setText("<<Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137)
                                .addComponent(btnTrialHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(btnTrial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrial)
                    .addComponent(jButton3)
                    .addComponent(btnTrialHistory)
                    .addComponent(btnAssign))
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DrugTrialWorkAreaJPanel panel = (DrugTrialWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnTrialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrialActionPerformed
     PerformTrial pft = new PerformTrial(userProcessContainer, drugTrialOrganization, drugManufacturingEnterprise, account);
        userProcessContainer.add("ProcureCompounds", pft);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnTrialActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedRow = tblTrials.getSelectedRow();
        DrugTrialWorkRequest request = (DrugTrialWorkRequest) tblTrials.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        populateTable();
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnTrial;
    private javax.swing.JButton btnTrialHistory;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblTrials;
    // End of variables declaration//GEN-END:variables

}
