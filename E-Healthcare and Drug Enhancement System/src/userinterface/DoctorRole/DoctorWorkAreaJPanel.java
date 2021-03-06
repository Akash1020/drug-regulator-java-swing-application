/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Disease.DiseaseDirectory;
import Business.Enterprise.HospitalEnterprise;
import Business.Hospital.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DiseaseEvaluationWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mihir
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    DoctorOrganization doctorOrganization;
    HospitalEnterprise hospitalEnterprise;
    DiseaseDirectory diseaseDirectory;

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization doctorOrganization, HospitalEnterprise hospitalEnterprise, DiseaseDirectory diseaseDirectory) {
        initComponents();
        this.diseaseDirectory = diseaseDirectory;
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.doctorOrganization = doctorOrganization;
        this.hospitalEnterprise = hospitalEnterprise;

        populateTable();
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
        tblEvaluation = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        tblEvaluation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Patient Name", "Symptoms", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEvaluation);
        if (tblEvaluation.getColumnModel().getColumnCount() > 0) {
            tblEvaluation.getColumnModel().getColumn(0).setResizable(false);
            tblEvaluation.getColumnModel().getColumn(1).setResizable(false);
            tblEvaluation.getColumnModel().getColumn(2).setMinWidth(250);
            tblEvaluation.getColumnModel().getColumn(2).setMaxWidth(250);
            tblEvaluation.getColumnModel().getColumn(3).setResizable(false);
            tblEvaluation.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Doctor Work Area");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(292, 292, 292)
                            .addComponent(jLabel1))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEvaluation;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblEvaluation.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : doctorOrganization.getWorkQueue().getWorkRequestList()) {
            Object row[] = new Object[5];

            row[0] = request.getSender();
            row[1] = ((DiseaseEvaluationWorkRequest) request);
            row[2] = ((DiseaseEvaluationWorkRequest) request).getPatientVisit().getSymptoms();
            row[3] = request.getReceiver();
            row[4] = request.getStatus();

            dtm.addRow(row);
        }
    }
}
