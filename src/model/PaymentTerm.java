/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Acer
 */
public class PaymentTerm {
    private List<Division> divisions; //Sem1, Sem2, Q1,Q1,Q3,Q4, Mo1, Mo2, Mo3....
    private int id;
    private String name;
    private boolean isActive;
    private double lateFeeAmount;
    private int divisor;

    public List<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }
    
    public double getLateFeeAmount() {
        return lateFeeAmount;
    }

    public void setLateFeeAmount(double lateFeeAmount) {
        this.lateFeeAmount = lateFeeAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    
}
