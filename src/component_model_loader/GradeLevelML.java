
package component_model_loader;

import daoimpl.GradeLevelDaoImpl;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.GradeLevel;


public class GradeLevelML {
    
    //HAS-A
    GradeLevelDaoImpl gradeLevelDaoImpl = new GradeLevelDaoImpl();
    
    public DefaultComboBoxModel getAllGradeLevels(){
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        List<GradeLevel> gradeLevelList = gradeLevelDaoImpl.getAllGradeLevelsInfo();
        Object[] gObj = gradeLevelList.toArray();
        for(Object o : gObj){
            GradeLevel g = (GradeLevel)o;
            dcm.addElement(g.getLevel());
        }
        return dcm;
    }
    
    public DefaultComboBoxModel getAllRegisteredSubjectGradeLevel()
    {
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        List<GradeLevel> gradeLevelList = gradeLevelDaoImpl.getAllRegisteredSubjectGradeLevel();
        Object[] obj = gradeLevelList.toArray();
        
        for(Object o : obj)
        {
            GradeLevel g = (GradeLevel)o;
            dcm.addElement(g.getLevel());
        }
        
        return dcm;
    }
}
