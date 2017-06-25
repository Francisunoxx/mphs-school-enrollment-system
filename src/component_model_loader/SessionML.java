
package component_model_loader;

import daoimpl.SessionDaoImpl;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Session;


public class SessionML {
    private final SessionDaoImpl sessionDaoImpl = new SessionDaoImpl();
    
    public DefaultComboBoxModel getAllSessions(){
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        Object[] sessionList = sessionDaoImpl.getAll().toArray();
        for(Object o : sessionList){
            Session session = (Session)o;
            comboBoxModel.addElement(session.getSessionTitle());
        }
        return comboBoxModel;
    }
}
