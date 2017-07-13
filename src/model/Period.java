/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * <p>
 * <h2>Period</h2>
 * <br>
 * is a class that represents a payment term's divisions. <br>
 * Payment Terms are :
 * <br>
 * 1.) Cash <br>
 * 2.) Semestral <br>
 * 3.) Quarterly <br>
 * 4.) Monthly <br>
 * <br>
 * For instance, 
 * <br>
 * * First Semester <br>
 * * Second Semester <br>
 * * First Quarter <br>
 * * Second Quarter <br>
 * * Third Quarter <br> and so on<br><br>... are all considered of type <b>Period</b>
 * <br>
 * </p>
 * 
 *
 * @author John Ferdinand Antonio
 */
public class Period {
    private int periodId;
    private String code;
    private String description;

    public int getPeriodId() {
        return periodId;
    }

    public void setPeriodId(int periodId) {
        this.periodId = periodId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
