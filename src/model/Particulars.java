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
public class Particulars {
    private double balanceSum;
    private List<BalanceBreakDownFee> balanceBreakDownFees;

    public double getBalanceSum() {
        return balanceSum;
    }

    public void setBalanceSum(double balanceSum) {
        this.balanceSum = balanceSum;
    }

    public List<BalanceBreakDownFee> getBalanceBreakDownFees() {
        return balanceBreakDownFees;
    }

    public void setBalanceBreakDownFees(List<BalanceBreakDownFee> balanceBreakDownFees) {
        this.balanceBreakDownFees = balanceBreakDownFees;
    }
    
    
}
