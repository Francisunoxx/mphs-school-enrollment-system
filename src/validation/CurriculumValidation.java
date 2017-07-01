/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import daoimpl.CurriculumDaoImpl;
import java.util.ArrayList;
import java.util.List;
import model.Curriculum;

/**
 *
 * @author francisunoxx
 */
public class CurriculumValidation 
{
    CurriculumDaoImpl cdi = new CurriculumDaoImpl();
    
    Curriculum curriculum = new Curriculum();
    
    public List <Object> checkCurriculumChanges(Curriculum aCurriculum)
    {
        Object[] object = cdi.checkCurriculumChanges(aCurriculum).toArray();
        List <Object> list = new ArrayList();
        
        for(Object o : object)
        {
            Curriculum curriculum = (Curriculum)o;
            
            list.add(curriculum.gradeLevel.getLevel());
            list.add(curriculum.schoolYear.getYearFrom() + "-" +curriculum.schoolYear.getYearTo());
            list.add(curriculum.getCurriculumTitle());
            list.add(curriculum.getCurriculumDescription());
            list.add(curriculum.s.getSubjectCode());
            list.add(curriculum.s.getSubjectTitle());
        }
        
        
        return list;
    }
}
