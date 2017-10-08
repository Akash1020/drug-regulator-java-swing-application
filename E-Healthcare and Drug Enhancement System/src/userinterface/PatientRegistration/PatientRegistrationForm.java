/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRegistration;

import Business.Enterprise.HospitalEnterprise;
import Business.Hospital.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.Person.Person;
import Business.Role.PatientRole;
import Business.UserAccount.UserAccount;
import UserInterface.MainJFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.PatientRole.PatientWorkAreaJPanel;

/**
 *
 * @author Pushkar
 */
public class PatientRegistrationForm extends javax.swing.JPanel {

    /**
     * Creates new form PatientRegistrationForm
     */
    JPanel container;
    HospitalEnterprise hospitalEnterprise;
    PatientOrganization patientOrganization;
    JPanel userProccessContainer;
    private MainJFrame main;

    PatientRegistrationForm(JPanel userProccessContainer, HospitalEnterprise hospitalEnterprise, PatientOrganization patientOrganization, MainJFrame main) {
        initComponents();
        this.userProccessContainer = userProccessContainer;
        this.main = main;
        this.hospitalEnterprise = hospitalEnterprise;
        this.patientOrganization = patientOrganization;

        popolateCmbGender();
        populateCmbMarital();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPatientName = new javax.swing.JTextField();
        lblMaritalStatus = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblPatientName = new javax.swing.JLabel();
        btnRegisterPatient = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox();
        txtContact = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        cmbMaritalStatus = new javax.swing.JComboBox();
        lblGender = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        lblMaritalStatus.setText("Marital Status:");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblPatientName.setText("Patient name:");

        btnRegisterPatient.setText("Register Patient");
        btnRegisterPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterPatientActionPerformed(evt);
            }
        });

        lblAge.setText("Age:");

        lblEmail.setText("Username:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblPassword.setText("Password:");

        cmbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenderActionPerformed(evt);
            }
        });

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setText("Register Patient Panel");

        lblGender.setText("Gender:");

        lblContact.setText("Contact no.:");

        btnBack.setText("<<Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(160, 160, 160)
                                .addComponent(btnRegisterPatient))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAge)
                                    .addComponent(lblPatientName)
                                    .addComponent(lblGender)
                                    .addComponent(lblEmail)
                                    .addComponent(lblPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblContact)
                                        .addGap(141, 141, 141))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblMaritalStatus)
                                        .addGap(132, 132, 132)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblTitle)))
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientName))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContact)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaritalStatus)
                    .addComponent(cmbMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterPatient)
                    .addComponent(btnBack))
                .addGap(128, 128, 128))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnRegisterPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterPatientActionPerformed

        String name = txtPatientName.getText();
        String password = txtPassword.getText();
        String username = txtEmail.getText();
        int age = Integer.parseInt(txtAge.getText());
        int contact = Integer.parseInt(txtContact.getText());
        Patient.genderType gender = (Patient.genderType) cmbGender.getSelectedItem();
        Patient.maritalStatusType status = (Patient.maritalStatusType) cmbMaritalStatus.getSelectedItem();

        Person person = patientOrganization.getPersonDirectory().createPatient(name, age, gender, contact, status);
        UserAccount ua = patientOrganization.getUserAccountDirectory().createUserAccount(username, password, person, new PatientRole());
        main.disableLogOut();
        PatientWorkAreaJPanel pwj = new PatientWorkAreaJPanel(userProccessContainer, ua, patientOrganization, hospitalEnterprise);
        userProccessContainer.add("ManageDrugManufacturingOrganizations", pwj);
        CardLayout layout = (CardLayout) userProccessContainer.getLayout();
        layout.next(userProccessContainer);

    }//GEN-LAST:event_btnRegisterPatientActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void cmbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenderActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegisterPatient;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JComboBox cmbMaritalStatus;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblMaritalStatus;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables

    private void popolateCmbGender() {
        cmbGender.removeAllItems();
        cmbGender.addItem("Select");
        for (Object obj : Patient.genderType.values()) {
            cmbGender.addItem(obj);
        }
    }

    private void populateCmbMarital() {
        cmbMaritalStatus.removeAllItems();
        cmbMaritalStatus.addItem("Select");
        for (Object obj : Patient.maritalStatusType.values()) {
            cmbMaritalStatus.addItem(obj);
        }
    }
}
