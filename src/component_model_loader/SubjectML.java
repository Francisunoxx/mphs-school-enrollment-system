/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import daoimpl.SubjectDaoImpl;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
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
    
    private Object[] header()
    {
        return new Object[]{"Id", "Subject Title", "Subject Code", "Description", "Status"};
    }
    
    public DefaultTableModel getAllSubjects()
    {
        
        Object[] obj = subjectDaoImpl.getAllSubjects().toArray();
        Object[] columnId = new Object[subjectDaoImpl.getAllSubjects().size()];
        Object[] columnTitle = new Object[subjectDaoImpl.getAllSubjects().size()];
        Object[] columnCode = new Object[subjectDaoImpl.getAllSubjects().size()];
        Object[] columnDescription = new Object[subjectDaoImpl.getAllSubjects().size()];
        Object[] columnStatus = new Object[subjectDaoImpl.getAllSubjects().size()];
        
        Object[][] data = new Object[subjectDaoImpl.getAllSubjects().size()][5];
        
        int counterId = 0;
        int counterTitle = 0;
        int counterCode = 0;
        int counterDescription = 0;
        int counterStatus = 0;
        
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;
        int counterFive = 0;
        
        for(Object o : obj)
        {
            Subject subject = (Subject)o;
        
            columnId[counterId++] = subject.getSubjectId();
            columnTitle[counterTitle++] = subject.getSubjectTitle();
            columnCode[counterCode++] = subject.getSubjectCode();
            columnDescription[counterDescription++] = subject.getSubjectDescription();
            columnStatus[counterStatus++] = subject.getIsActive();
        }
        
        for(int row = 0; row < data.length; row++)
        {
            for(int column = 0; column < data[row].length; column++)
            {
                switch(column)
                {
                    case 0:
                        data[row][column] = columnId[counterOne++];
                        break;
                    case 1:
                        data[row][column] = columnTitle[counterTwo++];
                        break;
                    case 2:
                        data[row][column] = columnCode[counterThree++];
                        break;
                    case 3:
                        data[row][column] = columnDescription[counterFour++];
                        break;
                    case 4:
                        data[row][column] = columnStatus[counterFive++];
                        break;
                }
            }
        }
        
        DefaultTableModel model = new DefaultTableModel(data, header())
        {
            
            @Override
            public Class getColumnClass(int c) 
            {
                return getValueAt(0, c).getClass();
            }
        };
        
        return model;
    }
    
    public DefaultTableModel getAllSubjectsByGradeLevelId(GradeLevel gl)
    {
        Object[] obj = subjectDaoImpl.getAllSubjectsByGradeLevelId(gl).toArray();
        
        Object[] columnId = new Object[subjectDaoImpl.getAllSubjectsByGradeLevelId(gl).size()];
        Object[] columnTitle = new Object[subjectDaoImpl.getAllSubjectsByGradeLevelId(gl).size()];
        Object[] columnCode = new Object[subjectDaoImpl.getAllSubjectsByGradeLevelId(gl).size()];
        Object[] columnDescription = new Object[subjectDaoImpl.getAllSubjectsByGradeLevelId(gl).size()];
        Object[] columnStatus = new Object[subjectDaoImpl.getAllSubjectsByGradeLevelId(gl).size()];
        
        Object[][] data = new Object[subjectDaoImpl.getAllSubjectsByGradeLevelId(gl).size()][5];
        
        int counterId = 0;
        int counterTitle = 0;
        int counterCode = 0;
        int counterDescription = 0;
        int counterStatus = 0;
        
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;
        int counterFive = 0;
        

        for(Object o : obj)
        {
            Subject s = (Subject)o;
            
            columnId[counterId++] = s.getSubjectId();
            columnTitle[counterTitle++] = s.getGradeLevel();
            columnCode[counterCode++] = s.getSubjectCode();
            columnDescription[counterDescription++] = s.getSubjectDescription();
            columnStatus[counterStatus++] = s.getIsActive();
        }
        
        for(int row = 0; row < data.length; row++)
        {
            for(int column = 0; column < data[row].length; column++)
            {
                switch(column)
                {
                    case 0:
                        data[row][column] = columnId[counterOne++];
                        break;
                    case 1:
                        data[row][column] = columnTitle[counterTwo++];
                        break;
                    case 2:
                        data[row][column] = columnCode[counterThree++];
                        break;
                    case 3:
                        data[row][column] = columnDescription[counterFour++];
                        break;
                    case 4:
                        data[row][column] = columnStatus[counterFive++];
                        break;
                }
            }
        }
        
        DefaultTableModel model = new DefaultTableModel(data, header())
        {
            @Override
            public Class getColumnClass(int c) 
            {
                return getValueAt(0, c).getClass();
            }
        };
        
        return model;
    }
}
