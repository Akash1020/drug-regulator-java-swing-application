/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Disease.DiseaseDirectory;
import Business.EcoSystem;
import Business.Enterprise.DrugManufacturingEnterprise;
import Business.Enterprise.Enterprise;
import Business.DrugManufacturing.Organization.DrugManufacturingOrganization;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DrugManufacturingRole.DrugManufacturingWorkAreaJPanel;


/**
 *
 * @author Pushkar
 */
public class DrugManufacturingRole extends Role{
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,DiseaseDirectory diseaseDirectory,Network network) {
        return new DrugManufacturingWorkAreaJPanel(userProcessContainer, account, (DrugManufacturingOrganization)organization,(DrugManufacturingEnterprise) enterprise,business.getDiseaseDirectory());
    }
}
