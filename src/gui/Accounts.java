
package gui;

import layout_utility.CardLayoutUtil;


public class Accounts extends javax.swing.JPanel {

    
    public Accounts() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        staffProfileJbtn = new javax.swing.JButton();
        usersJbtn = new javax.swing.JButton();
        facultyJbtn = new javax.swing.JButton();
        studentsJbtn = new javax.swing.JButton();
        separatorPanel = new javax.swing.JPanel();
        accountsCardContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        buttonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonsPanel.setLayout(new java.awt.GridBagLayout());

        staffProfileJbtn.setText("Staff Profile");
        staffProfileJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffProfileJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        buttonsPanel.add(staffProfileJbtn, gridBagConstraints);

        usersJbtn.setText("Users");
        usersJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        buttonsPanel.add(usersJbtn, gridBagConstraints);

        facultyJbtn.setText("Faculty");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        buttonsPanel.add(facultyJbtn, gridBagConstraints);

        studentsJbtn.setText("Students");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        buttonsPanel.add(studentsJbtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(buttonsPanel, gridBagConstraints);

        separatorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        separatorPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(separatorPanel, gridBagConstraints);

        accountsCardContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Accounts Card Container"));
        accountsCardContainer.setLayout(new java.awt.CardLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(accountsCardContainer, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void staffProfileJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffProfileJbtnActionPerformed
        CardLayoutUtil.flipCardTo(accountsCardContainer, new StaffProfile());
    }//GEN-LAST:event_staffProfileJbtnActionPerformed

    private void usersJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersJbtnActionPerformed
         CardLayoutUtil.flipCardTo(accountsCardContainer, new Users());
    }//GEN-LAST:event_usersJbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountsCardContainer;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton facultyJbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel separatorPanel;
    private javax.swing.JButton staffProfileJbtn;
    private javax.swing.JButton studentsJbtn;
    private javax.swing.JButton usersJbtn;
    // End of variables declaration//GEN-END:variables
}
