/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author John Ferdinand Antonio
 */
public class SchoolFees {
    private double sum;
    private BasicFee basicFee;
    private DownPaymentFee downPaymentFee;
    private MiscellaneousFees miscellaneousFees;
    private OtherFees otherFees;

    public BasicFee getBasicFee() {
        return basicFee;
    }

    public void setBasicFee(BasicFee basicFee) {
        this.basicFee = basicFee;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
    
    public DownPaymentFee getDownPaymentFee() {
        return downPaymentFee;
    }

    public void setDownPaymentFee(DownPaymentFee downPaymentFee) {
        this.downPaymentFee = downPaymentFee;
    }
    
    public MiscellaneousFees getMiscellaneousFees() {
        return miscellaneousFees;
    }

    public void setMiscellaneousFees(MiscellaneousFees miscellaneousFees) {
        this.miscellaneousFees = miscellaneousFees;
    }

    public OtherFees getOtherFees() {
        return otherFees;
    }

    public void setOtherFees(OtherFees otherFees) {
        this.otherFees = otherFees;
    }
    
}
