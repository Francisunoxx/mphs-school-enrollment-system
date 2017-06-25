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
public class OtherFees {
    private List<Fee> fees;
    private double sum;

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public double getSum() {
        for(Fee f:fees){
            sum = 0;
            sum += f.getAmount();
        }
        return sum;
    }
    
    
}
