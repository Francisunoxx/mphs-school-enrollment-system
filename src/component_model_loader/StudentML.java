package component_model_loader;

import daoimpl.GradeLevelDaoImpl;
import daoimpl.StudentDaoImpl;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.GradeLevel;
import model.Student;

public class StudentML {

    StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
    GradeLevelDaoImpl gldi = new GradeLevelDaoImpl();

    private static String getGradeLevelValue(int aGradeLevel) {
        String gl = "";
        if (aGradeLevel == 0) {
            gl = "Kindergarten";
        } else {
            gl = "Grade " + aGradeLevel;
        }
        return gl;
    }

    public DefaultTableModel getAllStudentByKeyword(JTable aJtable, String aKeyword) {
        DefaultTableModel aJtableModel = (DefaultTableModel) aJtable.getModel();
        aJtableModel.setRowCount(0);
        Object[] studentList = studentDaoImpl.get(aKeyword).toArray();

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
            Integer aRegistrationId = studentDaoImpl.getRegistrationIdByStudentId(aStudentId);
            Integer admissionGradeLevel = studentDaoImpl.getAdmissionGradeLevelByRegistrationId(aRegistrationId);
            Integer aPresentGradeLevel = studentDaoImpl.getPresentGradeLevelByStudentId(aStudentId);

            Object[] rowData = {
                s.getStudentId(),
                aRegistrationId,
                s.getStudentType() == 0 ? "Old" : "New",
                s.getRegistration().getLastName(),
                s.getRegistration().getFirstName(),
                s.getRegistration().getMiddleName(),
                s.isActive() == true ? "Active" : "Inactive",
                s.getIsGraduated() == true ? "Yes" : "No",
                admissionGradeLevel == 0 ? "Kindergarten" : "Grade " + admissionGradeLevel,
                aPresentGradeLevel == null ? "--" : getGradeLevelValue(aPresentGradeLevel)
            };
            jTableModel.addRow(rowData);
        }
        return jTableModel;
    }

    public DefaultTableModel getAllStudents(JTable aJtable) {
        DefaultTableModel aJtableModel = (DefaultTableModel) aJtable.getModel();
        aJtableModel.setRowCount(0);
        Object[] studentList = studentDaoImpl.get().toArray();

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
            Integer aRegistrationId = studentDaoImpl.getRegistrationIdByStudentId(aStudentId);
            Integer admissionGradeLevel = studentDaoImpl.getAdmissionGradeLevelByRegistrationId(aRegistrationId);
            Integer aPresentGradeLevel = studentDaoImpl.getPresentGradeLevelByStudentId(aStudentId);

            Object[] rowData = {
                s.getStudentId(),
                aRegistrationId,
                s.getStudentType() == 0 ? "Old" : "New",
                s.getRegistration().getLastName(),
                s.getRegistration().getFirstName(),
                s.getRegistration().getMiddleName(),
                s.isActive() == true ? "Active" : "Inactive",
                s.getIsGraduated() == true ? "Yes" : "No",
                admissionGradeLevel == 0 ? "Kindergarten" : "Grade " + admissionGradeLevel,
                aPresentGradeLevel == null ? "--" : getGradeLevelValue(aPresentGradeLevel)
            };
            jTableModel.addRow(rowData);
        }
        return jTableModel;
    }

    public DefaultTableModel getAllInactiveStudents(JTable aJtable) {
        DefaultTableModel aJtableModel = (DefaultTableModel) aJtable.getModel();
        aJtableModel.setRowCount(0);
        Object[] studentList = studentDaoImpl.getInactive().toArray();

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
            Integer aRegistrationId = studentDaoImpl.getRegistrationIdByStudentId(aStudentId);
            Integer admissionGradeLevel = studentDaoImpl.getAdmissionGradeLevelByRegistrationId(aRegistrationId);
            Integer aPresentGradeLevel = studentDaoImpl.getPresentGradeLevelByStudentId(aStudentId);

            Object[] rowData = {
                s.getStudentId(),
                aRegistrationId,
                s.getStudentType() == 0 ? "Old" : "New",
                s.getRegistration().getLastName(),
                s.getRegistration().getFirstName(),
                s.getRegistration().getMiddleName(),
                s.isActive() == true ? "Active" : "Inactive",
                s.getIsGraduated() == true ? "Yes" : "No",
                admissionGradeLevel == 0 ? "Kindergarten" : "Grade " + admissionGradeLevel,
                aPresentGradeLevel == null ? "--" : getGradeLevelValue(aPresentGradeLevel)
            };
            jTableModel.addRow(rowData);
        }
        return jTableModel;
    }

    public DefaultTableModel getAllActiveStudentsOfCurrentSchoolYear(JTable aJtable) {
        DefaultTableModel aJtableModel = (DefaultTableModel) aJtable.getModel();
        aJtableModel.setRowCount(0);
        Object[] studentList = studentDaoImpl.getActiveOfCurrentSchoolYear().toArray();

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
            Integer aRegistrationId = studentDaoImpl.getRegistrationIdByStudentId(aStudentId);
            Integer admissionGradeLevel = studentDaoImpl.getAdmissionGradeLevelByRegistrationId(aRegistrationId);
            Integer aPresentGradeLevel = studentDaoImpl.getPresentGradeLevelByStudentId(aStudentId);

            Object[] rowData = {
                s.getStudentId(),
                aRegistrationId,
                s.getStudentType() == 0 ? "Old" : "New",
                s.getRegistration().getLastName(),
                s.getRegistration().getFirstName(),
                s.getRegistration().getMiddleName(),
                s.isActive() == true ? "Active" : "Inactive",
                s.getIsGraduated() == true ? "Yes" : "No",
                admissionGradeLevel == 0 ? "Kindergarten" : "Grade " + admissionGradeLevel,
                aPresentGradeLevel == null ? "--" : getGradeLevelValue(aPresentGradeLevel)
            };
            jTableModel.addRow(rowData);
        }
        return jTableModel;
    }

    public DefaultComboBoxModel getStudentNameByGradeLevelId(GradeLevel aGradeLevel) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] obj = gldi.getStudentNameByGradeLevelId(aGradeLevel).toArray();
        for (Object o : obj) {
            Student student = (Student) o;

            model.addElement(student.getFirstName() + " " + student.getMiddleName() + ", " + student.getLastName());
        }
        return model;
    }

}
