/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import javax.swing.JPanel;

public interface Navigation {
    void exitRegistration(JPanel jPanelRegistration);
    void exitEnrollment(JPanel jPanelEnrollment);
    void exitPayment(JPanel jPanelPayment);
    void exitReports(JPanel jPanelReports);
    void exitManagement(JPanel jPanelManagement);
    void exitGrades(JPanel jPanelGrades);
    void exitAccounts(JPanel jPanelAccounts);
}
