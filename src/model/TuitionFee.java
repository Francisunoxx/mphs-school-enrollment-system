/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author John Ferdinand Antonio
 */
public class TuitionFee {

    private Payment payment;
    private boolean hasDiscount;
    private double sum;
    private boolean exists;
    private double totalPaid;
    private double balance;
    private PaymentTerm paymentTerm;
    private Discount discount;
    private List<BalanceBreakDownFee> balanceBreakDownFees;
    private SchoolYear schoolYear;
    private Student student;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public boolean hasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
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

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public boolean exists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public PaymentTerm getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(PaymentTerm paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public List<BalanceBreakDownFee> getBalanceBreakDownFees() {
        return balanceBreakDownFees;
    }

    public void setBalanceBreakDownFees(List<BalanceBreakDownFee> balanceBreakDownFees) {
        this.balanceBreakDownFees = balanceBreakDownFees;
    }

}
