 
package model;
 
public class Faculty {
    
    private int facultyID;
    private String firstName;
    private String lastName;
    private String middleName;
    private String civilStatus;
    private String contact;
    private String emailAddress;
    private String degree;
    private boolean status;
    
    private int specializationID;
    private String specializationTitle;
    private String specializationDescription;
    private String dateCreated;
    private boolean isActive;

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
   

    public void setFacultyID(int facultyID){
        this.facultyID = facultyID;
    }
    
    public int getFacultyID()
    {
        return facultyID;
    }
     

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
      
    public String getMiddleName() {
        return middleName;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }
    
    public String getCivilStatus() {
        return civilStatus;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public String getContact() {
        return contact;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    

    public boolean setStatus(boolean status) {
        this.status = status;
        return this.status;
    }
    
      public boolean getStatus() {
        return status;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getSpecializationID() {
        return specializationID;
    }

    public void setSpecializationID(int specializationID) {
        this.specializationID = specializationID;
    }

    public String getSpecializationTitle() {
        return specializationTitle;
    }

    public void setSpecializationTitle(String specializationTitle) {
        this.specializationTitle = specializationTitle;
    }

    public String getSpecializationDescription() {
        return specializationDescription;
    }

    public void setSpecializationDescription(String specializationDescription) {
        this.specializationDescription = specializationDescription;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
      
    
}
