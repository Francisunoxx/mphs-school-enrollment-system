
package view;

import view.CreateRoomForm;
import layout_utility.CardLayoutUtil;


public class RoomsContainer extends javax.swing.JPanel {

   
    public RoomsContainer() {
        initComponents();
        CardLayoutUtil.flipCardTo(roomsCardContainer, new RoomsListGUI());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        roomsListJbtn = new javax.swing.JButton();
        addRoomJbtn = new javax.swing.JButton();
        roomsCardContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        roomsListJbtn.setText("Room List");
        roomsListJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsListJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(roomsListJbtn, gridBagConstraints);

        addRoomJbtn.setText("Add Room");
        addRoomJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomJbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(addRoomJbtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jPanel3, gridBagConstraints);

        roomsCardContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Rooms Card Container"));
        roomsCardContainer.setLayout(new java.awt.CardLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel2.add(roomsCardContainer, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void roomsListJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsListJbtnActionPerformed
        CardLayoutUtil.flipCardTo(roomsCardContainer, new RoomsListGUI());
    }//GEN-LAST:event_roomsListJbtnActionPerformed

    private void addRoomJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomJbtnActionPerformed
        CardLayoutUtil.flipCardTo(roomsCardContainer, new CreateRoomForm());
    }//GEN-LAST:event_addRoomJbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoomJbtn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel roomsCardContainer;
    private javax.swing.JButton roomsListJbtn;
    // End of variables declaration//GEN-END:variables
}
