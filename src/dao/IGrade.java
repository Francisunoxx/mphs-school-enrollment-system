/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Grade;

/**
 *
 * @author John Ferdinand Antonio
 */
public interface IGrade {
    boolean add(List<Grade> grades);
    List<Grade> get(int studentId);
    List<Grade> get(int studentId, int schoolYearId);
}
