/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugTrialRole;

import Business.DrugManufacturing.Organization.DrugTrialOrganization;
import Business.Enterprise.DrugManufacturingEnterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Pushkar
 */
public class ManageFDAApplications extends javax.swing.JPanel {

    /**
     * Creates new form ManageFDAApplications
     */
    JPanel userProcessContainer;
    UserAccount account;
    DrugTrialOrganization drugTrialOrganization;
    DrugManufacturingEnterprise drugManufacturingEnterprise;
    Network network;

    public ManageFDAApplications(JPanel userProcessContainer, UserAccount account, DrugTrialOrganization drugTrialOrganization, DrugManufacturingEnterprise drugManufacturingEnterprise, Network network) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.drugManufacturingEnterprise = drugManufacturingEnterprise;
        this.drugTrialOrganization = drugTrialOrganization;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
