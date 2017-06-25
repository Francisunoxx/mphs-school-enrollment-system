package component_model_loader;

import daoimpl.SectionDaoImpl;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import model.Section;

public class SectionML {
    private final SectionDaoImpl sectionDaoImpl = new SectionDaoImpl();
    
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
    
    public DefaultListModel getSectionBySchoolYearForJList(int aSchoolYearId){
        DefaultListModel listModel = new DefaultListModel();
        Object[] sectionList = sectionDaoImpl.getSectionsBySchoolYear(aSchoolYearId).toArray();
        for(Object o : sectionList){
            Section section = (Section)o;
            String sectionName = section.getSectionName();
            String sessionTitle = section.getSessionList().get(0).getSessionTitle();
            String gradeLevel = section.getGradeLevel().getLevel()==0?"Kindergarten":"Grade "+section.getGradeLevel().getLevel();
            String element = sectionName +" - "+sessionTitle+" ("+gradeLevel+") ";
            
            System.out.println("getSectionBySchoolYearForJList: \n");
            System.out.println(sectionName);
            System.out.println(sessionTitle);
            System.out.println(gradeLevel);
            
            listModel.addElement(element);
        }
        return listModel;
    }
    
    public DefaultListModel getSectionByGradeLevelForJList(int aGradeLevelId){
        DefaultListModel listModel = new DefaultListModel();
        Object[] sectionList = sectionDaoImpl.getSectionsBySchoolYear(aGradeLevelId).toArray();
        for(Object o : sectionList){
            Section section = (Section)o;
            String sectionName = section.getSectionName();
            String sessionTitle = section.getSessionList().get(0).getSessionTitle();
            String gradeLevel = section.getGradeLevel().getLevel()==0?"Kindergarten":"Grade "+section.getGradeLevel().getLevel();
            String element = sectionName +" - "+sessionTitle+" ("+gradeLevel+") ";
            
            System.out.println("getSectionByGradeLevelForJList: \n");
            System.out.println(sectionName);
            System.out.println(sessionTitle);
            System.out.println(gradeLevel);
            listModel.addElement(element);
        }
        return listModel;
    }
    
    public DefaultListModel getSectionBySchoolYearAndGradeLevelForJList(int aSchoolYearId, int aGradeLevelId){
        DefaultListModel listModel = new DefaultListModel();
        Object[] sectionList = sectionDaoImpl.getSectionsBySchoolYear(aGradeLevelId).toArray();
        for(Object o : sectionList){
            Section section = (Section)o;
            String sectionName = section.getSectionName();
            String sessionTitle = section.getSessionList().get(0).getSessionTitle();
            String gradeLevel = section.getGradeLevel().getLevel()==0?"Kindergarten":"Grade "+section.getGradeLevel().getLevel();
            String element = sectionName +" - "+sessionTitle+" ("+gradeLevel+") ";
            
            System.out.println("getSectionBySchoolYearAndGradeLevelForJList: \n");
            System.out.println(sectionName);
            System.out.println(sessionTitle);
            System.out.println(gradeLevel);
            
            listModel.addElement(element);
        }
        return listModel;
    }
    
    public DefaultComboBoxModel getSectionForJComboBox(){
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        Object[] sectionList = sectionDaoImpl.getAllSections().toArray();
        for(Object o : sectionList){
            Section section = (Section)o;
            String sectionName = section.getSectionName();
            String sessionTitle = section.getSessionList().get(0).getSessionTitle();
            String element = sectionName + " - "+sessionTitle;
            comboBoxModel.addElement(element);
        }
        return comboBoxModel;
    }
    
    
}
