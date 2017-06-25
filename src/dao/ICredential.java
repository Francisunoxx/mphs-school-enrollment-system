/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Credential;
import model.GradeLevel;

/**
 *
 * @author Jordan
 */
public interface ICredential {
    boolean removeCredentialById(int aCredentialId );
    List<Credential> getAllCredentials();
    List<Credential> getCredentialByGradeLevelId(int aGradeLevelId);
    List<GradeLevel> getGradeLevelsAssignedToCredentialById(int aCredentialId);
    boolean addCredential(Credential aCredential);
    Integer getCredentialIdByName(String aCredentialName);
    boolean alreadyExists(String aCredentialName);
}
