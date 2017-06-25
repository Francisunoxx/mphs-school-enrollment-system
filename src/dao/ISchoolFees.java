/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.BasicFee;
import model.DownPaymentFee;
import model.MiscellaneousFees;
import model.OtherFees;
import model.SchoolFees;

/**
 *
 * @author John Ferdinand Antonio
 */
public interface ISchoolFees {
    SchoolFees get(int gradeLevelId);
    BasicFee getBasicFee(int gradeLevelId);
    DownPaymentFee getDownPayment(int gradeLevelId);
    MiscellaneousFees getMiscellaneous(int gradeLevelId);
    OtherFees getOther(int gradeLevelId);
}
