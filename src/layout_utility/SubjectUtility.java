/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout_utility;

import daoimpl.SubjectDaoImpl;
import java.util.ArrayList;
import java.util.List;
import model.GradeLevel;
import model.Subject;

/**
 *
 * @author francisunoxx
 */
public class SubjectUtility 
{
    SubjectDaoImpl sdi = new SubjectDaoImpl();
    
    public List <Object> getCreatedSubjectInfoById(Subject aSubject, GradeLevel aGradeLevel)
    {
        List <Object> list = new ArrayList();
        Object[] obj = sdi.getCreatedSubjectInfoById(aSubject, aGradeLevel).toArray();
        
        for(Object o : obj)
        {
            Subject subject = (Subject)o;
            
            list.add(subject.getSubjectTitle());
            list.add(subject.getSubjectCode());
            list.add(subject.getSubjectDescription());
            list.add(subject.gradeLevel.getLevel());
        }
        
        return list;
    }
}
