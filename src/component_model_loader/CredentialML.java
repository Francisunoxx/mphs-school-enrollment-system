package component_model_loader;

import daoimpl.CredentialDaoImpl;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Credential;

public class CredentialML {
   
    private final CredentialDaoImpl credentialDaoImpl = new CredentialDaoImpl();
    
    public DefaultListModel getAllCredentialNames(){
        DefaultListModel listModel = new DefaultListModel();
        Object[] credentialList = credentialDaoImpl.getAllCredentials().toArray();
        for(Object o : credentialList){
            Credential c = (Credential)o;
            listModel.addElement(c.getCredentialName());
        }
        return listModel;
    }
    
    public DefaultComboBoxModel getAllCredentialNamesByGradeLevelId(int aGradeLevelId){
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        Object[] credentialList = credentialDaoImpl.getCredentialByGradeLevelId(aGradeLevelId).toArray();
        for(Object o : credentialList){
            Credential c = (Credential)o;
            comboBoxModel.addElement(c.getCredentialName());
        }
        return comboBoxModel;
    }
    
}
