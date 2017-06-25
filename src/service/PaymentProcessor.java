/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.BalanceBreakDownFee;
import model.Payment;

/**
 *
 * @author John Ferdinand Antonio
 */
public class PaymentProcessor {

    private final Payment payment;

    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public double getParticularSum() {
        double balanceSum = 0;
        List<BalanceBreakDownFee> balanceBreakDownFees = payment.getParticulars().getBalanceBreakDownFees();
        for (BalanceBreakDownFee b : balanceBreakDownFees) {
            balanceSum += b.getBalance();
        }
        return balanceSum;
    }

    public double getChange() {
        double change;
        double amountTendered = this.payment.getAmountTendered();
        double particularsSum = this.getParticularSum();
        change = amountTendered - particularsSum < 0 ? 0.00 : amountTendered - particularsSum;
        return change;
    }

}
