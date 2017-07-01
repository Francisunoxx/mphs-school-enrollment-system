/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout_utility;

import daoimpl.CurriculumDaoImpl;
import java.util.ArrayList;
import java.util.List;
import model.Curriculum;

/**
 *
 * @author francisunoxx
 */
public class CurriculumUtility 
{
    CurriculumDaoImpl cdi = new CurriculumDaoImpl();
    
    public List <Object> getCreatedCurriculumInfoById(Curriculum aCurriculum)
    {
        List <Object> list = new ArrayList();
        Object[] obj = cdi.getCreatedCurriculumInfoById(aCurriculum).toArray();
        
        for(Object o : obj)
        {
            Curriculum curriculum = (Curriculum)o;
            
            list.add(curriculum.getCurriculumTitle());
            list.add(curriculum.getCurriculumDescription());
            list.add(curriculum.s.getSubjectCode());
            list.add(curriculum.s.getSubjectTitle());
            list.add(curriculum.gradeLevel.getLevel());
            list.add(curriculum.schoolYear.getYearFrom());
            list.add(curriculum.schoolYear.getYearTo());
        }
        
        return list;
    }
    
    
}
