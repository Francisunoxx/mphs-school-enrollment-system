/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Jordan
 */
public class Payment {
    
    private double amountTendered;
    private double change;
    private Date dateOfPayment;
    private Student student;
    private SchoolYear schoolYear;
    private Particulars particulars;

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }
    
    public Particulars getParticulars() {
        return particulars;
    }

    public void setParticulars(Particulars particulars) {
        this.particulars = particulars;
    }
    
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public SchoolYear getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(SchoolYear schoolYear) {
        this.schoolYear = schoolYear;
    }

    public double getAmountTendered() {
        return amountTendered;
    }

    public void setAmountTendered(double amountTendered) {
        this.amountTendered = amountTendered;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }
    
    
}
