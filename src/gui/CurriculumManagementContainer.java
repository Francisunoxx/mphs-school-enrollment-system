
package gui;

import gui.CreateCurriculumForm_Orig;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComponent;
import layout_utility.CardLayoutUtil;

public class CurriculumManagementContainer extends javax.swing.JPanel {

    public CurriculumManagementContainer() {
        initComponents();
        CardLayoutUtil.flipCardTo(jpnlCurriculumListCardContainer, new CurriculumListGUI());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtpCurriculum = new javax.swing.JTabbedPane();
        jpnlCurriculumListCardContainer = new javax.swing.JPanel();
        jpnlCurriculumCreatorCardContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jtpCurriculum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtpCurriculumMouseClicked(evt);
            }
        });

        jpnlCurriculumListCardContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Curriculum Card Container"));
        jpnlCurriculumListCardContainer.setLayout(new java.awt.CardLayout());
        jtpCurriculum.addTab("Curriculum List", jpnlCurriculumListCardContainer);

        jpnlCurriculumCreatorCardContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Curriculum Card Container"));
        jpnlCurriculumCreatorCardContainer.setLayout(new java.awt.CardLayout());
        jtpCurriculum.addTab("Curriculum Creator", jpnlCurriculumCreatorCardContainer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel2.add(jtpCurriculum, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jPanel2, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jtpCurriculumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtpCurriculumMouseClicked
        
        if(jtpCurriculum.getSelectedIndex() == 0){
            CardLayoutUtil.flipCardTo(jpnlCurriculumCreatorCardContainer, new CreateCurriculumForm());
            CardLayoutUtil.flipCardTo(jpnlCurriculumListCardContainer, new CurriculumListGUI());
        }else if(jtpCurriculum.getSelectedIndex() == 1){
            CardLayoutUtil.flipCardTo(jpnlCurriculumListCardContainer, new CurriculumListGUI());
            CardLayoutUtil.flipCardTo(jpnlCurriculumCreatorCardContainer, new CreateCurriculumForm());
        }
        
    }//GEN-LAST:event_jtpCurriculumMouseClicked

    public static void flipCardToCurriculumList(){
        CardLayoutUtil.flipCardTo(jpnlCurriculumListCardContainer, new CurriculumListGUI());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jpnlCurriculumCreatorCardContainer;
    public static javax.swing.JPanel jpnlCurriculumListCardContainer;
    private javax.swing.JTabbedPane jtpCurriculum;
    // End of variables declaration//GEN-END:variables
}
