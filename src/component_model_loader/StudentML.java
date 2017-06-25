
package component_model_loader;

import daoimpl.StudentDaoImpl;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Student;


public class StudentML {
    StudentDaoImpl STUDENT_DAO_IMPL = new StudentDaoImpl();
    
    private static String getGradeLevelValue(int aGradeLevel){
        String gl="";
        if(aGradeLevel == 0){
            gl = "Kindergarten";
        }else{
            gl = "Grade "+aGradeLevel;
        }
        return gl;
    }
    
    public DefaultTableModel getAllStudentByKeyword(JTable aJtable,String aKeyword){
        DefaultTableModel aJtableModel = (DefaultTableModel) aJtable.getModel();
        aJtableModel.setRowCount(0);
        Object[] studentList = STUDENT_DAO_IMPL.getAllStudentsByKeyword(aKeyword).toArray();
        
        String[] columnNames = {
            "Student ID",
            "Registration ID", 
            "Student Type",
            "Last Name", 
            "First Name", 
            "Middle Name",
            "Status", 
            "Graduated",
            "Admission",
            "Present"
        };
        DefaultTableModel jTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTableModel.setColumnIdentifiers(columnNames);
        
        for (Object o : studentList) {
            Student s = (Student) o;
            Integer aStudentId = s.getStudentId();
            Integer aRegistrationId = STUDENT_DAO_IMPL.getRegistrationIdByStudentId(aStudentId);
            Integer admissionGradeLevel = STUDENT_DAO_IMPL.getAdmissionGradeLevelByRegistrationId(aRegistrationId);
            Integer aPresentGradeLevel = STUDENT_DAO_IMPL.getPresentGradeLevelByStudentId(aStudentId);
            
            Object[] rowData = {
                s.getStudentId(),
                aRegistrationId,
                s.getStudentType()==0? "Old":"New",
                s.getRegistration().getLastName(),
                s.getRegistration().getFirstName(),
                s.getRegistration().getMiddleName(),
                s.isActive() == true ? "Active" : "Inactive",
                s.getIsGraduated() == true ? "Yes" : "No",
                admissionGradeLevel==0? "Kindergarten":"Grade "+admissionGradeLevel,
                aPresentGradeLevel==null? "--": getGradeLevelValue(aPresentGradeLevel)
            };
            jTableModel.addRow(rowData);
        }
        return jTableModel;
    }
    
    public DefaultTableModel getAllStudents(JTable aJtable){
        DefaultTableModel aJtableModel = (DefaultTableModel) aJtable.getModel();
        aJtableModel.setRowCount(0);
        Object[] studentList = STUDENT_DAO_IMPL.getAllStudents().toArray();
        
        String[] columnNames = {
            "Student ID",
            "Registration ID", 
            "Student Type",
            "Last Name", 
            "First Name", 
            "Middle Name",
            "Status", 
            "Graduated",
            "Admission",
            "Present"
        };
        DefaultTableModel jTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTableModel.setColumnIdentifiers(columnNames);
        
        for (Object o : studentList) {
            Student s = (Student) o;
            Integer aStudentId = s.getStudentId();
            Integer aRegistrationId = STUDENT_DAO_IMPL.getRegistrationIdByStudentId(aStudentId);
            Integer admissionGradeLevel = STUDENT_DAO_IMPL.getAdmissionGradeLevelByRegistrationId(aRegistrationId);
            Integer aPresentGradeLevel = STUDENT_DAO_IMPL.getPresentGradeLevelByStudentId(aStudentId);
            
            Object[] rowData = {
                s.getStudentId(),
                aRegistrationId,
                s.getStudentType()==0? "Old":"New",
                s.getRegistration().getLastName(),
                s.getRegistration().getFirstName(),
                s.getRegistration().getMiddleName(),
                s.isActive() == true ? "Active" : "Inactive",
                s.getIsGraduated() == true ? "Yes" : "No",
                admissionGradeLevel==0? "Kindergarten":"Grade "+admissionGradeLevel,
                aPresentGradeLevel==null? "--": getGradeLevelValue(aPresentGradeLevel)
            };
            jTableModel.addRow(rowData);
        }
        return jTableModel;
    }
    
    public DefaultTableModel getAllInactiveStudents(JTable aJtable){
        DefaultTableModel aJtableModel = (DefaultTableModel) aJtable.getModel();
        aJtableModel.setRowCount(0);
        Object[] studentList = STUDENT_DAO_IMPL.getAllInactiveStudents().toArray();
        
        String[] columnNames = {
            "Student ID",
            "Registration ID", 
            "Student Type",
            "Last Name", 
            "First Name", 
            "Middle Name",
            "Status", 
            "Graduated",
            "Admission",
            "Present"
        };
        DefaultTableModel jTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTableModel.setColumnIdentifiers(columnNames);
        
        for (Object o : studentList) {
            Student s = (Student) o;
            Integer aStudentId = s.getStudentId();
            Integer aRegistrationId = STUDENT_DAO_IMPL.getRegistrationIdByStudentId(aStudentId);
            Integer admissionGradeLevel = STUDENT_DAO_IMPL.getAdmissionGradeLevelByRegistrationId(aRegistrationId);
            Integer aPresentGradeLevel = STUDENT_DAO_IMPL.getPresentGradeLevelByStudentId(aStudentId);
            
            Object[] rowData = {
                s.getStudentId(),
                aRegistrationId,
                s.getStudentType()==0? "Old":"New",
                s.getRegistration().getLastName(),
                s.getRegistration().getFirstName(),
                s.getRegistration().getMiddleName(),
                s.isActive() == true ? "Active" : "Inactive",
                s.getIsGraduated() == true ? "Yes" : "No",
                admissionGradeLevel==0? "Kindergarten":"Grade "+admissionGradeLevel,
                aPresentGradeLevel==null? "--": getGradeLevelValue(aPresentGradeLevel)
            };
            jTableModel.addRow(rowData);
        }
        return jTableModel;
    }
    
    public DefaultTableModel getAllActiveStudentsOfCurrentSchoolYear(JTable aJtable){
        DefaultTableModel aJtableModel = (DefaultTableModel) aJtable.getModel();
        aJtableModel.setRowCount(0);
        Object[] studentList = STUDENT_DAO_IMPL.getAllActiveStudentsOfCurrentSchoolYear().toArray();
        
        String[] columnNames = {
            "Student ID",
            "Registration ID", 
            "Student Type",
            "Last Name", 
            "First Name", 
            "Middle Name",
            "Status", 
            "Graduated",
            "Admission",
            "Present"
        };
        DefaultTableModel jTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTableModel.setColumnIdentifiers(columnNames);
        
        for (Object o : studentList) {
            Student s = (Student) o;
            Integer aStudentId = s.getStudentId();
            Integer aRegistrationId = STUDENT_DAO_IMPL.getRegistrationIdByStudentId(aStudentId);
            Integer admissionGradeLevel = STUDENT_DAO_IMPL.getAdmissionGradeLevelByRegistrationId(aRegistrationId);
            Integer aPresentGradeLevel = STUDENT_DAO_IMPL.getPresentGradeLevelByStudentId(aStudentId);
            
            Object[] rowData = {
                s.getStudentId(),
                aRegistrationId,
                s.getStudentType()==0? "Old":"New",
                s.getRegistration().getLastName(),
                s.getRegistration().getFirstName(),
                s.getRegistration().getMiddleName(),
                s.isActive() == true ? "Active" : "Inactive",
                s.getIsGraduated() == true ? "Yes" : "No",
                admissionGradeLevel==0? "Kindergarten":"Grade "+admissionGradeLevel,
                aPresentGradeLevel==null? "--": getGradeLevelValue(aPresentGradeLevel)
            };
            jTableModel.addRow(rowData);
        }
        return jTableModel;
    }
}
