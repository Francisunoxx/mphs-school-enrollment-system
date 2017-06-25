
package model;

import java.util.Date;
import java.util.List;


public class Credential {
    private Integer credentialId;
    private String credentialName;
    private Date dateAdded;
    private Date dateReceived;
    private List<GradeLevel> gradeLevelsAssigned;
    private SchoolYear yearCreated;
    private String credentialDescription;

    public String getCredentialDescription() {
        return credentialDescription;
    }

    public void setCredentialDescription(String credentialDescription) {
        this.credentialDescription = credentialDescription;
    }
    
    public Integer getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(Integer credentialId) {
        this.credentialId = credentialId;
    }

    public String getCredentialName() {
        return credentialName;
    }

    public void setCredentialName(String credentialName) {
        this.credentialName = credentialName;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public List<GradeLevel> getGradeLevelsAssigned() {
        return gradeLevelsAssigned;
    }

    public void setGradeLevelsAssigned(List<GradeLevel> gradeLevelsAssigned) {
        this.gradeLevelsAssigned = gradeLevelsAssigned;
    }

    public SchoolYear getSchoolYearCreated() {
        return yearCreated;
    }

    public void setSchoolYearCreated(SchoolYear schoolYear) {
        this.yearCreated = schoolYear;
    }
    
    
   
}
