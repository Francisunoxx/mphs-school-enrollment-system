/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author John Ferdinand Antonio
 */
public class SummerClassSchedule {
    Integer schooyearId;
    Date startDate;
    Date endDate;

    public Integer getSchooyearId() {
        return schooyearId;
    }

    public void setSchooyearId(Integer schooyearId) {
        this.schooyearId = schooyearId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    
}
