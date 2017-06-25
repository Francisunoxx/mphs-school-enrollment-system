/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Student;
import model.TuitionFee;

/**
 *
 * @author John Ferdinand Antonio
 */
public interface ITuitionFee{
    boolean add(TuitionFee tuitionFee);
    TuitionFee get(int studentId, int schoolyearId);
    boolean pay(TuitionFee tuitionFee);
}
