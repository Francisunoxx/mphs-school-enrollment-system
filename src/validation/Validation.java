/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import daoimpl.CurriculumDaoImpl;
import daoimpl.GradeLevelDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import daoimpl.SubjectDaoImpl;
import static view.CurriculumManagementContainer.getCbGradeLevel;
import static view.CurriculumManagementContainer.getCbSchoolYearEnd;
import static view.CurriculumManagementContainer.getCbSchoolYearStart;
import static view.UpdateSubject.getTfSubjectCode;
import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;
import model.Curriculum;
import model.GradeLevel;
import model.SchoolYear;
import model.Subject;

/**
 *
 * @author francisunoxx
 */
public class Validation extends InputVerifier
{
    SchoolYearDaoImpl sydi = new SchoolYearDaoImpl();
    CurriculumDaoImpl cdi = new CurriculumDaoImpl();
    GradeLevelDaoImpl gldi= new GradeLevelDaoImpl();
    SubjectDaoImpl sdi = new SubjectDaoImpl();
    
    GradeLevel gradeLevel = new GradeLevel();
    Curriculum curriculum = new Curriculum();
    SchoolYear schoolYear = new SchoolYear();
    Subject subject = new Subject();
    @Override
    public boolean verify(JComponent input) 
    {
        String componentName = input.getName();
        
        if(input instanceof JTextField)
        {
            String tfCurriculumText = ((JTextField) input).getText();
            if(componentName.equals("tfCurriculumName"))
            {
                gradeLevel.setId(gradeLevel.getId());
                schoolYear.getSchoolYearId();
                curriculum.setCurriculumTitle(tfCurriculumText);
                
                if(cdi.checkCurriculumExists(curriculum, gradeLevel, schoolYear) == false)
                {
                    input.setBackground(Color.WHITE);
//                    getCbSchoolYearStart().setBackground(Color.WHITE);
//                    getCbSchoolYearEnd().setBackground(Color.WHITE);
//                    getCbGradeLevel().setBackground(Color.WHITE);
                }
                else
                {
                    input.setBackground(Color.PINK);
//                    getCbSchoolYearStart().setBackground(Color.PINK);
//                    getCbSchoolYearEnd().setBackground(Color.PINK);
//                    getCbGradeLevel().setBackground(Color.PINK);
                    
                    return false;
                }
            }
            else if(componentName.equals("tfSubjectCode"))
            {
                subject.setSubjectCode(getTfSubjectCode().getText());
                
                if(sdi.checkSubjectExists(subject) == false)
                {
                    input.setBackground(Color.WHITE);
                    
                }
                else
                {
                    input.setBackground(Color.PINK);
                    
                    return false;
                }
                
                
            }
        }
        
        return true;
    }
    
}
