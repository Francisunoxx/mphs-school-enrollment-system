
package model;

import java.util.List;


public class Curriculum {
    private int curriculumId;
    public GradeLevel gradeLevel = new GradeLevel();
    public Subject s = new Subject();
    public SchoolYear schoolYear = new SchoolYear(); //schoolyear when the curriculum was created
    private List<Subject> subject;
    private String description;
    private int isActive;
    private String dateCreated;
    public int getCurriculumId() {
        return curriculumId;
    }

    public void setCurriculumId(int curriculumId) {
        this.curriculumId = curriculumId;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public SchoolYear getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(SchoolYear schoolYear) {
        this.schoolYear = schoolYear;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }
    
    public void setCurriculumDescription(String description)
    {
        this.description = description;
    }
    
    public String getCurriculumDescription()
    {
        return description;
    }
    
    public void setIsActive(int isActive)
    {
        this.isActive = isActive;
    }
    
    public int getIsActive()
    {
        return isActive;
    }
    
    public void setDateCreated(String dateCreated)
    {
        this.dateCreated = dateCreated;
    }
    
    public String getDateCreated()
    {
        return dateCreated;
    }
    
}
