
package gui;

import daoimpl.SchoolYearDaoImpl;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;


public class SchoolYearGUI extends javax.swing.JPanel {

    
    
    public SchoolYearGUI() {
        initComponents();
        
        SchoolYearDaoImpl sy = new SchoolYearDaoImpl();
       // schoolYearStartJcbx.setModel(sy.getAllSchoolYearStart());
        //schoolYearEndJcbx.setModel(new DefaultComboBoxModel(schoolyear.getAllSchoolYearEnd().toArray()));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        schoolYearJlbl = new javax.swing.JLabel();
        schoolYearStartJcbx = new javax.swing.JComboBox<>();
        toJlbl = new javax.swing.JLabel();
        schoolYearEndJcbx = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.GridBagLayout());

        schoolYearJlbl.setText("School Year :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(schoolYearJlbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(schoolYearStartJcbx, gridBagConstraints);

        toJlbl.setText("to");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(toJlbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(schoolYearEndJcbx, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> schoolYearEndJcbx;
    private javax.swing.JLabel schoolYearJlbl;
    private javax.swing.JComboBox<String> schoolYearStartJcbx;
    private javax.swing.JLabel toJlbl;
    // End of variables declaration//GEN-END:variables
}
