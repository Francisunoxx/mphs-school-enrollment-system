package component_model_loader;

import daoimpl.SectionDaoImpl;
import daoimpl.StudentDaoImpl;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import model.GradeLevel;
import model.SchoolYear;
import model.Section;
import model.Session;
import model.Student;
import model.Subject;

public class SectionML {
    private final SectionDaoImpl sectionDaoImpl = new SectionDaoImpl();
    private StudentDaoImpl sdi = new StudentDaoImpl();
    
    private Object[] columnNames = new Object[]{"Id","Section Name", "Category", "Grade Range", "Capacity", "Session", "School Year", "Date Created", "Status"};
    private Object[] columnStudent = new Object[]{"Id", "Student Name", "Grade Level", "General Average", "Entrance Exam Average"};
    private Object[] columnStudentBySection = new Object[]{"Id", "Student Name", "Grade Level"};
    private SchoolYear aSchoolYear = new SchoolYear();
    private GradeLevel aGradeLevel = new GradeLevel();
    private Section aSection = new Section();
    
    public DefaultListModel getSectionForJList(){
        DefaultListModel listModel = new DefaultListModel();
        Object[] sectionList = sectionDaoImpl.getAllSections().toArray();
        for(Object o : sectionList){
            Section section = (Section)o;
            String sectionName = section.getSectionName();
            String sessionTitle = section.getSessionList().get(0).getSessionTitle();
            String gradeLevel = section.getGradeLevel().getLevel()==0?"Kindergarten":"Grade "+section.getGradeLevel().getLevel();
            String element = sectionName +" - "+sessionTitle+" ("+gradeLevel+") ";
            listModel.addElement(element);
        }
        return listModel;
    }
    
    
    
    public DefaultTableModel getAllSections() {
        Object[] obj = sectionDaoImpl.getAllSections().toArray();

        Object[] columnSectionId = new Object[sectionDaoImpl.getAllSections().size()];
        Object[] columnSectionName = new Object[sectionDaoImpl.getAllSections().size()];
        Object[] columnCategory = new Object[sectionDaoImpl.getAllSections().size()];
        Object[] columnGradeRange = new Object[sectionDaoImpl.getAllSections().size()];
        Object[] columnCapacity = new Object[sectionDaoImpl.getAllSections().size()];
        Object[] columnSession = new Object[sectionDaoImpl.getAllSections().size()];
        Object[] columnSchoolYear = new Object[sectionDaoImpl.getAllSections().size()];
        Object[] columnDateCreated = new Object[sectionDaoImpl.getAllSections().size()];
        Object[] columnStatus = new Object[sectionDaoImpl.getAllSections().size()];
        Object[][] data = new Object[sectionDaoImpl.getAllSections().size()][9];

        int counterSectionId = 0;
        int counterSectionName = 0;
        int counterCategory = 0;
        int counterGradeRange = 0;
        int counterCapacity = 0;
        int counterSession = 0;
        int counterSchoolYear = 0;
        int counterDateCreated = 0;
        int counterStatus = 0;

        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;
        int counterFive = 0;
        int counterSix = 0;
        int counterSeven = 0;
        int counterEight = 0;
        int counterNine = 0;

        for (Object o : obj) {
            Section aSection = (Section) o;

            columnSectionId[counterSectionId++] = aSection.getSectionId();
            columnSectionName[counterSectionName++] = aSection.getSectionName();
            columnCategory[counterCategory++] = aSection.getCategory();
            columnGradeRange[counterGradeRange++] = aSection.getGradeFrom() + "-" + aSection.getGradeTo();
            columnCapacity[counterCapacity++] = aSection.session.getCapacity();
            columnSession[counterSession++] = aSection.session.getSessionTitle();
            columnSchoolYear[counterSchoolYear++] = aSection.schoolYear.getYearFrom() + "-" + aSection.schoolYear.getYearTo();
            columnDateCreated[counterDateCreated++] = aSection.getDateCreated();

            if (aSection.getIsActive() == 1) {
                columnStatus[counterStatus++] = true;
            } else {
                columnStatus[counterStatus++] = false;
            }

        }

        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[row].length; column++) {
                switch (column) {
                    case 0:
                        data[row][column] = columnSectionId[counterOne++];
                        break;
                    case 1:
                        data[row][column] = columnSectionName[counterTwo++];
                        break;
                    case 2:
                        data[row][column] = columnCategory[counterThree++];
                        break;
                    case 3:
                        data[row][column] = columnGradeRange[counterFour++];
                        break;
                    case 4:
                        data[row][column] = columnCapacity[counterFive++];
                        break;
                    case 5:
                        data[row][column] = columnSession[counterSix++];
                        break;
                    case 6:
                        data[row][column] = columnSchoolYear[counterSeven++];
                        break;
                    case 7:
                        data[row][column] = columnDateCreated[counterEight++];
                        break;
                    default:
                        data[row][column] = columnStatus[counterNine++];
                        break;
                }
            }
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public Class getColumnClass(int c) {
                return getValueAt(0, c).getClass();
            }

            @Override
            public boolean isCellEditable(int row, int col) {
                //Note that the data/cell address is constant,
                //no matter where the cell appears onscreen.
                if (col < 9) {
                    return false;
                } else {
                    return true;
                }
            }
        };

        return model;
    }

    public DefaultTableModel getAllSectionsByGradeLevelId(GradeLevel aGradeLevel) {
        Object[] obj = sectionDaoImpl.getAllSectionsByGradeLevelId(aGradeLevel).toArray();
        Object[] columnSectionId = new Object[sectionDaoImpl.getAllSectionsByGradeLevelId(aGradeLevel).size()];
        Object[] columnSectionName = new Object[sectionDaoImpl.getAllSectionsByGradeLevelId(aGradeLevel).size()];
        Object[] columnCategory = new Object[sectionDaoImpl.getAllSectionsByGradeLevelId(aGradeLevel).size()];
        Object[] columnGradeRange = new Object[sectionDaoImpl.getAllSectionsByGradeLevelId(aGradeLevel).size()];
        Object[] columnCapacity = new Object[sectionDaoImpl.getAllSectionsByGradeLevelId(aGradeLevel).size()];
        Object[] columnSession = new Object[sectionDaoImpl.getAllSectionsByGradeLevelId(aGradeLevel).size()];
        Object[] columnSchoolYear = new Object[sectionDaoImpl.getAllSectionsByGradeLevelId(aGradeLevel).size()];
        Object[] columnDateCreated = new Object[sectionDaoImpl.getAllSectionsByGradeLevelId(aGradeLevel).size()];
        Object[] columnStatus = new Object[sectionDaoImpl.getAllSectionsByGradeLevelId(aGradeLevel).size()];
        Object[][] data = new Object[sectionDaoImpl.getAllSectionsByGradeLevelId(aGradeLevel).size()][9];

        int counterSectionId = 0;
        int counterSectionName = 0;
        int counterCategory = 0;
        int counterGradeRange = 0;
        int counterCapacity = 0;
        int counterSession = 0;
        int counterSchoolYear = 0;
        int counterDateCreated = 0;
        int counterStatus = 0;

        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;
        int counterFive = 0;
        int counterSix = 0;
        int counterSeven = 0;
        int counterEight = 0;
        int counterNine = 0;

        for (Object o : obj) {
            Section section = (Section) o;

            columnSectionId[counterSectionId++] = section.getSectionId();
            columnSectionName[counterSectionName++] = section.getSectionName();
            columnCategory[counterCategory++] = section.getCategory();
            columnGradeRange[counterGradeRange++] = section.getGradeFrom() + "-" + section.getGradeTo();
            columnCapacity[counterCapacity++] = section.session.getCapacity();
            columnSession[counterSession++] = section.session.getSessionTitle();
            columnSchoolYear[counterSchoolYear++] = section.schoolYear.getYearFrom() + "-" + section.schoolYear.getYearTo();
            columnDateCreated[counterDateCreated++] = section.getDateCreated();

            if (aSection.getIsActive() == 1) {
                columnStatus[counterStatus++] = true;
            } else {
                columnStatus[counterStatus++] = false;
            }
        }

        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[row].length; column++) {
                switch (column) {
                    case 0:
                        data[row][column] = columnSectionId[counterOne++];
                        break;
                    case 1:
                        data[row][column] = columnSectionName[counterTwo++];
                        break;
                    case 2:
                        data[row][column] = columnCategory[counterThree++];
                        break;
                    case 3:
                        data[row][column] = columnGradeRange[counterFour++];
                        break;
                    case 4:
                        data[row][column] = columnCapacity[counterFive++];
                        break;
                    case 5:
                        data[row][column] = columnSession[counterSix++];
                        break;
                    case 6:
                        data[row][column] = columnSchoolYear[counterSeven++];
                        break;
                    case 7:
                        data[row][column] = columnDateCreated[counterEight++];
                        break;
                    default:
                        data[row][column] = columnStatus[counterNine++];
                        break;
                }
            }
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public Class getColumnClass(int c) {
                return getValueAt(0, c).getClass();
            }

            @Override
            public boolean isCellEditable(int row, int col) {
                //Note that the data/cell address is constant,
                //no matter where the cell appears onscreen.
                if (col < 9) {
                    return false;
                } else {
                    return true;
                }
            }
        };
        return model;
    }
    
    
    public DefaultTableModel getAllRegisteredStudentsByGradeId(GradeLevel aGradeLevel)
    {
        Object[] obj = sdi.getAllRegisteredStudentsByGradeId(aGradeLevel).toArray();
        
        Object[] columnId = new Object[sdi.getAllRegisteredStudentsByGradeId(aGradeLevel).size()];
        Object[] columnFullName = new Object[sdi.getAllRegisteredStudentsByGradeId(aGradeLevel).size()];
        Object[] columnGradeLevel = new Object[sdi.getAllRegisteredStudentsByGradeId(aGradeLevel).size()];
        Object[][] data = new Object[sdi.getAllRegisteredStudentsByGradeId(aGradeLevel).size()][4];
        
        
        int counterId = 0;
        int counterFullName = 0;
        int counterGradeLevel = 0;
        
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        
        for(Object o : obj)
        {
            Student student = (Student)o;
            
            columnId[counterId++] = student.getStudentId();
            columnFullName[counterFullName++] = student.getFirstName() + " " + student.getMiddleName() + " " + student.getLastName();
            columnGradeLevel[counterGradeLevel++] = student.gradeLevel.getLevel();
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
                        data[row][column] = columnFullName[counterTwo++];
                        break;
                    case 2:
                        data[row][column] = columnGradeLevel[counterThree++];
                        break;
                }
            }
        }
        
        DefaultTableModel model = new DefaultTableModel(data, columnStudent)
        {
            @Override
            public boolean isCellEditable(int row, int col) {
                //Note that the data/cell address is constant,
                //no matter where the cell appears onscreen.
                if (col < 3) {
                    return false;
                } else {
                    return true;
                }
            }
        };
                
        return model;
    }
    
    public DefaultTableModel getAllStudentsBySection(Session aSession, Section aSection, GradeLevel aGradeLevel)
    {
        Object[] obj = sectionDaoImpl.getAllStudentsBySection(aSession, aSection, aGradeLevel).toArray();
        Object[] columnId = new Object[sectionDaoImpl.getAllStudentsBySection(aSession, aSection, aGradeLevel).size()];
        Object[] columnFullName = new Object[sectionDaoImpl.getAllStudentsBySection(aSession, aSection, aGradeLevel).size()];
        Object[] columnGradeLevel = new Object[sectionDaoImpl.getAllStudentsBySection(aSession, aSection, aGradeLevel).size()];
        Object[][] data = new Object[sectionDaoImpl.getAllStudentsBySection(aSession, aSection, aGradeLevel).size()][2];
        
        int counterId = 0;
        int counterFullName = 0;
        int counterGradeLevel = 0;
        
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        
        for(Object o : obj)
        {
            Student student = (Student)o;
        
            columnId[counterId++] = student.getStudentId();
            columnFullName[counterFullName++] = student.getFirstName() + " " + student.getMiddleName() + " " + student.getLastName();
            columnGradeLevel[counterGradeLevel++] = student.gradeLevel.getLevel();
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
                        data[row][column] = columnFullName[counterTwo++];
                        break;
                    case 2:
                        data[row][column] = columnFullName[counterThree++];
                        break;
                }
            }
        }
        
        DefaultTableModel model = new DefaultTableModel(data, columnStudentBySection)
        {
            @Override
            public boolean isCellEditable(int row, int col) {
                //Note that the data/cell address is constant,
                //no matter where the cell appears onscreen.
                if (col < 3) {
                    return false;
                } else {
                    return true;
                }
            }
        };
        
        return model;
    }
    
    public DefaultComboBoxModel getAllSectionName()
    {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] obj = sectionDaoImpl.getAllSections().toArray();
        
        for(Object o : obj)
        {
            Section section = (Section)o;
        
            model.addElement(section.getSectionName());
        }
        
        return model;
    }
    
}
