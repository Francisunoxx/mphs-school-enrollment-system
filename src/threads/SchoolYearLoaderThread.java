/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import daoimpl.SchoolYearDaoImpl;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public  class SchoolYearLoaderThread extends Thread{
    JLabel schoolYearLabel;

    public SchoolYearLoaderThread(JLabel aJLabel) {
        this.schoolYearLabel = aJLabel;
    }

    @Override
    public void run() {
        while (true) {
            
            SchoolYearDaoImpl.setCurrentSchoolYear();
            int schoolYearFrom = SchoolYearDaoImpl.getCurrentSchoolYear().getYearFrom();
            int schoolYearTo = SchoolYearDaoImpl.getCurrentSchoolYear().getYearTo();
            schoolYearLabel.setText("SY:"+schoolYearFrom+"-"+schoolYearTo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null,e.getMessage() );
            }
        }
    }
}
