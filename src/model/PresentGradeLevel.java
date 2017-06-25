
package model;

/**
 *
 * @author John Ferdinand Antonio
 */
public class PresentGradeLevel extends GradeLevel{
    private Boolean isPassed;
    private SchoolYear schoolYear;

    public SchoolYear getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(SchoolYear schoolYear) {
        this.schoolYear = schoolYear;
    }
    
    public Boolean getIsPassed() {
        return isPassed;
    }

    public void setIsPassed(Boolean isPassed) {
        this.isPassed = isPassed;
    }
    
    
}
