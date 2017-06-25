/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Acer
 */
public class GradeLevel {
    private int id;
    private Integer level;
    private boolean isActive;
    private List<Credential> credentialRequirements;

    public List<Credential> getCredentialRequirements() {
        return credentialRequirements;
    }

    public void setCredentialRequirements(List<Credential> credentialRequirements) {
        this.credentialRequirements = credentialRequirements;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    
}
