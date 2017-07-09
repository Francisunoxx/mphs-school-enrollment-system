/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_model_loader;

import layout_utility.CardLayoutUtil;
import view.TopContainer;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NavigationImpl implements Navigation {

    private void returnHome() {
        CardLayoutUtil.flipCardTo(TopContainer.jpnlTopCardContainer, TopContainer.jpnlTopCard);
    }

    @Override
    public void exitRegistration(JPanel jPanelRegistration) {
        int choice = JOptionPane.showConfirmDialog(null, "Exit Registration?", "Exit Confirmation", JOptionPane.WARNING_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            TopContainer.jtpTopTabbedPane.remove(jPanelRegistration);
            returnHome();
            TopContainer.setREGISTRATION_INSTANCE(0);
        }
    }

    @Override
    public void exitEnrollment(JPanel jPanelEnrollment) {
        int choice = JOptionPane.showConfirmDialog(null, "Exit Enrollment?", "Exit Confirmation", JOptionPane.WARNING_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            TopContainer.jtpTopTabbedPane.remove(jPanelEnrollment);
            returnHome();
            TopContainer.setENROLLMENT_INSTANCE(0);
        }
    }

    @Override
    public void exitPayment(JPanel jPanelPayment) {
        int choice = JOptionPane.showConfirmDialog(null, "Exit Payment?", "Exit Confirmation", JOptionPane.WARNING_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            TopContainer.jtpTopTabbedPane.remove(jPanelPayment);
            returnHome();
            TopContainer.setPAYMENTS_INSTANCE(0);
        }
    }

    @Override
    public void exitReports(JPanel jPanelReports) {
        int choice = JOptionPane.showConfirmDialog(null, "Exit Reports", "Exit Confirmation", JOptionPane.WARNING_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            TopContainer.jtpTopTabbedPane.remove(jPanelReports);
            returnHome();
            TopContainer.setREPORTS_INSTANCE(0);
        }
    }

    @Override
    public void exitManagement(JPanel jPanelManagement) {
        int choice = JOptionPane.showConfirmDialog(null, "Exit Management?", "Exit Confirmation", JOptionPane.WARNING_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            TopContainer.jtpTopTabbedPane.remove(jPanelManagement);
            returnHome();
            TopContainer.setMANAGEMENT_INSTANCE(0);
        }
    }

    @Override
    public void exitGrades(JPanel jPanelGrades) {
        int choice = JOptionPane.showConfirmDialog(null, "Exit Grades?", "Exit Confirmation", JOptionPane.WARNING_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
             TopContainer.jtpTopTabbedPane.remove(jPanelGrades);
            returnHome();
            TopContainer.setGRADES_INSTANCE(0);
        }
    }

    @Override
    public void exitAccounts(JPanel jPanelAccounts) {
        int choice = JOptionPane.showConfirmDialog(null, "Exit Accounts?", "Exit Confirmation", JOptionPane.WARNING_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
             TopContainer.jtpTopTabbedPane.remove(jPanelAccounts);
            returnHome();
            TopContainer.setACCOUNTS_INSTANCE(0);
        }
    }

}
