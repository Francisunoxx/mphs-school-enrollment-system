/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import daoimpl.SubjectDaoImpl;
import java.util.ArrayList;
import java.util.List;
import model.Subject;

/**
 *
 * @author francisunoxx
 */
public class SubjectValidation 
{
    SubjectDaoImpl sdi = new SubjectDaoImpl();
    
    Subject subject = new Subject();
    
    public List <Object> checkSubjectChanges(Subject aSubject)
    {
        Object[] object = sdi.checkSubjectChanges(aSubject).toArray();
        List <Object> list = new ArrayList();
        
        for(Object o : object)
        {
            Subject subject = (Subject)o;
            
            list.add(subject.getSubjectTitle());
            list.add(subject.getSubjectCode());
            list.add(subject.gradeLevel.getLevel());
            list.add(subject.getSubjectDescription());
            
        }
        
        return list;
    }
}
