
package model;

import java.util.Date;


public class Student {
    private int studentId;
    private int studentType; 
    private Registration registration;
    private Admission admission;
    private GradeLevel admissionGradeLevel;
    private PromotedGradeLevel promotedGradeLevel;
    private SchoolYear schoolYearEnrolled;
    private PresentGradeLevel presentGradeLevel;
    private GradeLevel recommendedGradeLevelToEnroll;
    private GradeLevel lastGradeLevelEnrolled;
    private SchoolYear lastGradeLevelEnrolledSchoolYear;
    private boolean isActive;
    private boolean isGraduated;
    private Date entryDate;
    private Date dateGraduated;
    private TuitionFee tuition;

    private String firstName;
    private String lastName;
    private String middleName;
    public GradeLevel gradeLevel;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
    
    
    public TuitionFee getTuition() {
        return tuition;
    }

    public void setTuition(TuitionFee tuition) {
        this.tuition = tuition;
    }
    
    public GradeLevel getRecommendedGradeLevelToEnroll() {
        return recommendedGradeLevelToEnroll;
    }

    public void setRecommendedGradeLevelToEnroll(GradeLevel recommendedGradeLevelToEnroll) {
        this.recommendedGradeLevelToEnroll = recommendedGradeLevelToEnroll;
    }
    
    public int getStudentType() {
        return studentType;
    }

    public void setStudentType(int studentType) {
        this.studentType = studentType;
    }

    public GradeLevel getAdmissionGradeLevel() {
        return admissionGradeLevel;
    }

    public void setAdmissionGradeLevel(GradeLevel admissionGradeLevel) {
        this.admissionGradeLevel = admissionGradeLevel;
    }

    public PromotedGradeLevel getPromotedGradeLevel() {
        return promotedGradeLevel;
    }

    public void setPromotedGradeLevel(PromotedGradeLevel promotedGradeLevel) {
        this.promotedGradeLevel = promotedGradeLevel;
    }

    public GradeLevel getLastGradeLevelEnrolled() {
        return lastGradeLevelEnrolled;
    }

    public void setLastGradeLevelEnrolled(GradeLevel lastGradeLevelEnrolled) {
        this.lastGradeLevelEnrolled = lastGradeLevelEnrolled;
    }

    public SchoolYear getSchoolYearEnrolled() {
        return schoolYearEnrolled;
    }

    public void setSchoolYearEnrolled(SchoolYear schoolYearEnrolled) {
        this.schoolYearEnrolled = schoolYearEnrolled;
    }
    
    public SchoolYear getLastGradeLevelEnrolledSchoolYear() {
        return lastGradeLevelEnrolledSchoolYear;
    }

    public void setLastGradeLevelEnrolledSchoolYear(SchoolYear lastGradeLevelEnrolledSchoolYear) {
        this.lastGradeLevelEnrolledSchoolYear = lastGradeLevelEnrolledSchoolYear;
    }

    
    public PresentGradeLevel getPresentGradeLevel() {
        return presentGradeLevel;
    }

    public void setPresentGradeLevel(PresentGradeLevel presentGradeLevel) {
        this.presentGradeLevel = presentGradeLevel;
    }

    
    
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public Admission getAdmission() {
        return admission;
    }

    public void setAdmission(Admission admission) {
        this.admission = admission;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsGraduated() {
        return isGraduated;
    }

    public void setIsGraduated(boolean isGraduated) {
        this.isGraduated = isGraduated;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getDateGraduated() {
        return dateGraduated;
    }

    public void setDateGraduated(Date dateGraduated) {
        this.dateGraduated = dateGraduated;
    }
    
        
}
