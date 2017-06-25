/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import daoimpl.CurriculumDaoImpl;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Curriculum;
import model.GradeLevel;
import model.SchoolYear;
import model.Subject;

/**
 *
 * @author Acer
 */
/**
 *
 * @author francisunoxx
 */
public class CurriculumML {

    CurriculumDaoImpl cdi = new CurriculumDaoImpl();

    private Object[] columnNames() {
        return new Object[]{"Code", "Subject Name", "Description", "Year Level"};
    }

    public DefaultTableModel getAllSubjectsWithGradeLevel() {
        List<Subject> list = cdi.getAllSubjectForCurriculum();
        Object[] columnObject = list.toArray();
        Object[] columnCode = new Object[list.size()];
        Object[] columnTitle = new Object[list.size()];
        Object[] columnDescription = new Object[list.size()];
        Object[] columnYearLevel = new Object[list.size()];
        Object[][] obj = new Object[list.size()][4];
        int counterCode = 0;
        int counterTitle = 0;
        int counterDescription = 0;
        int counterYearLevel = 0;
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;

        for (Object a : columnObject) {
            Subject aSubject = (Subject) a;
            columnCode[counterCode++] = aSubject.getSubjectCode();
            columnTitle[counterTitle++] = aSubject.getSubjectTitle();
            columnDescription[counterDescription++] = aSubject.getSubjectDescription();
            columnYearLevel[counterYearLevel++] = aSubject.gradeLevel.getLevel();
        }

        for (int row = 0; row < obj.length; row++) {                               //Sub-array
            for (int column = 0; column < obj[row].length; column++) {
                if (column == 0) {
                    obj[row][column] = columnCode[counterOne++];
                } else if (column == 1) {
                    obj[row][column] = columnTitle[counterTwo++];
                } else if (column == 2) {
                    obj[row][column] = columnDescription[counterThree++];
                } else {
                    obj[row][column] = columnYearLevel[counterFour++];
                }
            }
        }

        DefaultTableModel dtm = new DefaultTableModel(obj, columnNames()) {
            @Override
            public boolean isCellEditable(int row, int col) {
                //Note that the data/cell address is constant,
                //no matter where the cell appears onscreen.
                if (col < 4) {
                    return false;
                } else {
                    return true;
                }

            }
        ;
        };
        return dtm;
    }

    public DefaultTableModel getAllSubjectsByGradeLevel(GradeLevel aGradeLevel) {
        List<Subject> list = cdi.getEachSubjectByGradeLevelForCurriculum(aGradeLevel);
        Object[] columnObject = list.toArray();
        Object[] columnCode = new Object[list.size()];
        Object[] columnTitle = new Object[list.size()];
        Object[] columnDescription = new Object[list.size()];
        Object[] columnYearLevel = new Object[list.size()];
        Object[][] obj = new Object[list.size()][4];
        int counterCode = 0;
        int counterTitle = 0;
        int counterDescription = 0;
        int counterYearLevel = 0;
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;

        for (Object a : columnObject) {
            Subject aSubject = (Subject) a;
            columnCode[counterCode++] = aSubject.getSubjectCode();
            columnTitle[counterTitle++] = aSubject.getSubjectTitle();
            columnDescription[counterDescription++] = aSubject.getSubjectDescription();
            columnYearLevel[counterYearLevel++] = aSubject.gradeLevel.getLevel();
        }

        for (int row = 0; row < obj.length; row++) {                               //Sub-array
            for (int column = 0; column < obj[row].length; column++) {
                if (column == 0) {
                    obj[row][column] = columnCode[counterOne++];
                } else if (column == 1) {
                    obj[row][column] = columnTitle[counterTwo++];
                } else if (column == 2) {
                    obj[row][column] = columnDescription[counterThree++];
                } else {
                    obj[row][column] = columnYearLevel[counterFour++];
                }
            }
        }

        DefaultTableModel dtm = new DefaultTableModel(obj, columnNames()) {
            @Override
            public boolean isCellEditable(int row, int col) {
                //Note that the data/cell address is constant,
                //no matter where the cell appears onscreen.
                if (col < 4) {
                    return false;
                } else {
                    return true;
                }
            }
        ;
        };
        return dtm;
    }

    private Object[] curriculumColumnNames() {
        return new Object[]{"School Year", "Grade Level", "Description", "Date Created"};
    }

    public DefaultTableModel getAllCurriculum() {
        List<Curriculum> list = cdi.getAllCurriculum();
        Object[] columnObject = list.toArray();
        Object[] columnSchoolYear = new Object[list.size()];
        Object[] columnGradeLevel = new Object[list.size()];
        Object[] columnDescription = new Object[list.size()];
        Object[] columnDateCreated = new Object[list.size()];
        Object[][] obj = new Object[list.size()][4];

        int counterSchoolYear = 0;
        int counterGradeLevel = 0;
        int counterDescription = 0;
        int counterDateCreated = 0;
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;

        for (Object a : columnObject) {
            Curriculum curriculum = (Curriculum) a;
            columnSchoolYear[counterSchoolYear++] = curriculum.schoolYear.getYearFrom() + " - " + curriculum.schoolYear.getYearTo();
            columnGradeLevel[counterGradeLevel++] = curriculum.gradeLevel.getLevel();
            columnDescription[counterDescription++] = curriculum.getCurriculumDescription();
            columnDateCreated[counterDateCreated++] = curriculum.getDateCreated();
        }

        for (int row = 0; row < obj.length; row++) {
            for (int column = 0; column < obj[row].length; column++) {
                if (column == 0) {
                    obj[row][column] = columnSchoolYear[counterOne++];
                } else if (column == 1) {
                    obj[row][column] = columnGradeLevel[counterTwo++];
                } else if (column == 2) {
                    obj[row][column] = columnDescription[counterThree++];
                } else {
                    obj[row][column] = columnDateCreated[counterFour++];
                }
            }
        }

        DefaultTableModel dtm = new DefaultTableModel(obj, curriculumColumnNames()) {
            @Override
            public boolean isCellEditable(int row, int col) {
                //Note that the data/cell address is constant,
                //no matter where the cell appears onscreen.
                if (col < 4) {
                    return false;
                } else {
                    return true;
                }

            }
        ;
        };
        return dtm;
    }

    public DefaultTableModel getEachCurriculum(Curriculum aCurriculum, SchoolYear aSchoolYear) {
        List<Curriculum> list = cdi.getEachCurriculum(aCurriculum, aSchoolYear);
        Object[] columnObject = list.toArray();
        Object[] columnSchoolYear = new Object[list.size()];
        Object[] columnGradeLevel = new Object[list.size()];
        Object[] columnDescription = new Object[list.size()];
        Object[] columnDateCreated = new Object[list.size()];
        Object[][] obj = new Object[list.size()][4];

        int counterSchoolYear = 0;
        int counterGradeLevel = 0;
        int counterDescription = 0;
        int counterDateCreated = 0;
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;

        for (Object a : columnObject) {
            Curriculum curriculum = (Curriculum) a;
            columnSchoolYear[counterSchoolYear++] = curriculum.schoolYear.getYearFrom() + " - " + curriculum.schoolYear.getYearTo();
            columnGradeLevel[counterGradeLevel++] = curriculum.gradeLevel.getLevel();
            columnDescription[counterDescription++] = curriculum.getCurriculumDescription();
            columnDateCreated[counterDateCreated++] = curriculum.getDateCreated();
        }

        for (int row = 0; row < obj.length; row++) {
            for (int column = 0; column < obj[row].length; column++) {
                if (column == 0) {
                    obj[row][column] = columnSchoolYear[counterOne++];
                } else if (column == 1) {
                    obj[row][column] = columnGradeLevel[counterTwo++];
                } else if (column == 2) {
                    obj[row][column] = columnDescription[counterThree++];
                } else {
                    obj[row][column] = columnDateCreated[counterFour++];
                }
            }
        }

        DefaultTableModel dtm = new DefaultTableModel(obj, curriculumColumnNames()) {
            @Override
            public boolean isCellEditable(int row, int col) {
                //Note that the data/cell address is constant,
                //no matter where the cell appears onscreen.
                if (col < 4) {
                    return false;
                } else {
                    return true;
                }

            }
        ;
        };
        return dtm;
    }

}
