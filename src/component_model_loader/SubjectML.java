/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import daoimpl.SubjectDaoImpl;
import java.util.List;
import javax.swing.DefaultListModel;
import model.GradeLevel;
import model.Subject;

/**
 *
 * @author Acer
 */
public class SubjectML 
{
    SubjectDaoImpl subjectDaoImpl = new SubjectDaoImpl();
    
    Subject subject = new Subject();
    public void getCreatedSubjects()
    {
        
    }
    
    public DefaultListModel getAllSubjects()
    {
        DefaultListModel dlm = new DefaultListModel();
        List <Subject> list = subjectDaoImpl.getAllSubjects();
        Object[] obj = list.toArray();
        
        for(Object o : obj)
        {
            Subject s = (Subject)o;
            dlm.addElement(s.getSubjectTitle());
        }
        
        return dlm;
    }
    
    public DefaultListModel getSubjectsByGradeLevel(GradeLevel gl)
    {
        DefaultListModel dlm = new DefaultListModel();
        List <Subject> list = subjectDaoImpl.getSubjectsByGradeLevel(gl);
        Object[] obj = list.toArray();
        
        for(Object o : obj)
        {
            Subject s = (Subject)o;
            dlm.addElement(s.getSubjectTitle());
        }
        
        return dlm;
    }
}
