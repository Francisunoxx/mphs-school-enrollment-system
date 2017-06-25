/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.PaymentTerm;

/**
 *
 * @author Acer
 */
public interface IPaymentTerm {
    List<PaymentTerm> getAllPaymentTermsInfo();
    List<PaymentTerm> getAllActivePaymentTerms();
    List<PaymentTerm> getAllInActivePaymentTerms();
    PaymentTerm getById(int aPaymentTermId);
    int getId(String aPaymentTerm);
    boolean add(PaymentTerm aPaymentTerm);
}
