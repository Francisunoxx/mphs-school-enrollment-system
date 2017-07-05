/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Acer
 */
public class SchoolYear {
    private Integer classHours;
    private int schoolYearId;
    private Integer yearFrom;
    private Integer yearTo;
    private Date start_date;
    private Date end_date;
    private boolean isActive;
    private boolean isCurrentSchoolYear;
    private List<Holiday> holidays;
    private Enrollment enrollment;
    private List<Quarter> quarters;

    public List<Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }
    
    public Integer getClassHours() {
        return classHours;
    }

    public void setClassHours(Integer classHours) {
        this.classHours = classHours;
    }

    public List<Quarter> getQuarters() {
        return quarters;
    }

    public void setQuarters(List<Quarter> quarters) {
        this.quarters = quarters;
    }
    
    public boolean isCurrentSchoolYear() {
        return isCurrentSchoolYear;
    }

    public void setIsCurrentSchoolYear(boolean isCurrentSchoolYear) {
        this.isCurrentSchoolYear = isCurrentSchoolYear;
    }
    
    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
    
    

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    

    public int getSchoolYearId() {
        return schoolYearId;
    }

    public void setSchoolYearId(int schoolYearId) {
        this.schoolYearId = schoolYearId;
    }

    public Integer getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(Integer yearFrom) {
        this.yearFrom = yearFrom;
    }

    public Integer getYearTo() {
        return yearTo;
    }

    public void setYearTo(Integer yearTo) {
        this.yearTo = yearTo;
    }
    
    
}
