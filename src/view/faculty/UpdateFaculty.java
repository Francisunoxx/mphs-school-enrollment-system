package view.faculty;

import daoimpl.FacultyDaoImpl;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Faculty;

public class UpdateFaculty extends javax.swing.JDialog {

    private int facultyId;

    public UpdateFaculty(java.awt.Frame parent, boolean modal, int FacultyID) {

        super(parent, modal);
        initComponents();
        this.facultyId = FacultyID;

        loadFaculty();
        loadSpecializationToComboBox();
    }

    public void loadSpecializationToComboBox() {
        FacultyDaoImpl fdi = new FacultyDaoImpl();
        Object[] specializationData = fdi.getAllSpecializationInfo().toArray();
        DefaultComboBoxModel jcb = (DefaultComboBoxModel) update_specialization.getModel();

        for (Object faculty : specializationData) {
            Faculty f = (Faculty) faculty;
            jcb.addElement(f.getSpecializationTitle());
        }
        update_specialization.setModel(jcb);
    }

    public void loadFaculty() {
        FacultyDaoImpl fdi = new FacultyDaoImpl();
        Object[] FacultySpecialization = fdi.getFacultyAndSpecializationByFacultyID(this.facultyId).toArray();
        DefaultListModel dlm = new DefaultListModel();

        for (Object o : FacultySpecialization) {
            Faculty f = (Faculty) o;
            dlm.addElement(f.getSpecializationTitle());
            jtf_updateFirstName.setText(f.getFirstName());
            jtf_updateLastName.setText(f.getLastName());
            jtf_updateMiddleName.setText(f.getMiddleName());
            jtf_updateEmailAddress.setText(f.getEmailAddress());
            jtf_updateContact.setText(f.getContact());
            jcb_updateCivilStatus.setSelectedItem(f.getCivilStatus());
            jcb_updateDegree.setSelectedItem(f.getDegree());
            cb_status.isSelected();
            if (cb_status.isSelected() == true) {
                cb_status.setSelected(f.getStatus());
            }
        }
        jlist_UpdateSpecialization.setModel(dlm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcb_updateCivilStatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcb_updateDegree = new javax.swing.JComboBox<>();
        jtf_updateFirstName = new javax.swing.JTextField();
        jtf_updateLastName = new javax.swing.JTextField();
        jtf_updateMiddleName = new javax.swing.JTextField();
        jtf_updateEmailAddress = new javax.swing.JTextField();
        jtf_updateContact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cb_status = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        update_specialization = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlist_UpdateSpecialization = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        Clear = new javax.swing.JButton();
        jbtn_updateFacultyAndSpecialization = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Faculty Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 464));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("First Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 8, 4, 4);
        jPanel3.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Last Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Middle Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Email Address:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Contact Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Civil Status:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jLabel6, gridBagConstraints);

        jcb_updateCivilStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed", "In a Relationship" }));
        jcb_updateCivilStatus.setPreferredSize(new java.awt.Dimension(130, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jcb_updateCivilStatus, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Degree:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jLabel7, gridBagConstraints);

        jcb_updateDegree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Board Passer", "Masters", "Doctors", " " }));
        jcb_updateDegree.setPreferredSize(new java.awt.Dimension(130, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jcb_updateDegree, gridBagConstraints);

        jtf_updateFirstName.setPreferredSize(new java.awt.Dimension(130, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 8, 4, 4);
        jPanel3.add(jtf_updateFirstName, gridBagConstraints);

        jtf_updateLastName.setPreferredSize(new java.awt.Dimension(130, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jtf_updateLastName, gridBagConstraints);

        jtf_updateMiddleName.setPreferredSize(new java.awt.Dimension(130, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jtf_updateMiddleName, gridBagConstraints);

        jtf_updateEmailAddress.setPreferredSize(new java.awt.Dimension(130, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jtf_updateEmailAddress, gridBagConstraints);

        jtf_updateContact.setPreferredSize(new java.awt.Dimension(130, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jtf_updateContact, gridBagConstraints);

        jLabel8.setText("Status:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(jLabel8, gridBagConstraints);

        cb_status.setText("Active");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(16, 8, 6, 4);
        jPanel3.add(cb_status, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Specialization", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(374, 464));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(360, 350));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 344));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        update_specialization.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(50, 5, 5, 5);
        jPanel2.add(update_specialization, gridBagConstraints);

        jButton1.setText("+");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jButton1, gridBagConstraints);

        jButton4.setText("-");
        jButton4.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel5.add(jPanel2, gridBagConstraints);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 344));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel9.setLayout(new java.awt.GridBagLayout());

        jScrollPane3.setViewportView(jlist_UpdateSpecialization);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel9.add(jScrollPane3, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel9);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel7.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel5.add(jPanel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(jPanel5, gridBagConstraints);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(360, 80));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        Clear.setText("Cancel");
        Clear.setPreferredSize(new java.awt.Dimension(100, 30));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(Clear, gridBagConstraints);

        jbtn_updateFacultyAndSpecialization.setText("Update");
        jbtn_updateFacultyAndSpecialization.setPreferredSize(new java.awt.Dimension(100, 30));
        jbtn_updateFacultyAndSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_updateFacultyAndSpecializationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(jbtn_updateFacultyAndSpecialization, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel4.add(jPanel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel1.add(jPanel4, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        jtf_updateFirstName.setText("");
        jtf_updateLastName.setText("");
        jtf_updateMiddleName.setText("");
        jtf_updateEmailAddress.setText("");
        jtf_updateContact.setText("");
        jcb_updateCivilStatus.setSelectedItem("");
        jcb_updateDegree.setSelectedItem("");
    }//GEN-LAST:event_ClearActionPerformed


    private void jbtn_updateFacultyAndSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_updateFacultyAndSpecializationActionPerformed

        FacultyDaoImpl fdi = new FacultyDaoImpl();

        String lName = jtf_updateLastName.getText().trim();
        String fName = jtf_updateFirstName.getText().trim();
        String mName = jtf_updateMiddleName.getText().trim();

        int aFacultyId = this.facultyId;

        Faculty faculty = new Faculty();

        faculty.setFacultyID(aFacultyId);
        faculty.setFirstName(fName);
        faculty.setLastName(lName);
        faculty.setMiddleName(mName);
        faculty.setEmailAddress(jtf_updateEmailAddress.getText().trim());
        faculty.setContact(jtf_updateContact.getText().trim());
        faculty.setCivilStatus(jcb_updateCivilStatus.getSelectedItem().toString());
        faculty.setDegree(jcb_updateDegree.getSelectedItem().toString());

        boolean isActive;
        if (cb_status.isSelected()) {
            isActive = true;
        } else {
            isActive = false;
        }
        faculty.setStatus(isActive);

        int update = JOptionPane.showConfirmDialog(null, "Update faculty?", "SUBMIT", JOptionPane.YES_NO_OPTION);

        if (update == JOptionPane.YES_OPTION) {
            boolean isUpdated = fdi.updateFaculty(faculty);
            if (isUpdated) {

                jtf_updateFirstName.setText("");
                jtf_updateLastName.setText("");
                jtf_updateMiddleName.setText("");
                jtf_updateEmailAddress.setText("");
                jtf_updateContact.setText("");
                jcb_updateCivilStatus.setSelectedItem("");
                jcb_updateDegree.setSelectedItem("");
                JOptionPane.showMessageDialog(null, "Successfully Updated");
                loadFaculty();

            } else {
                JOptionPane.showMessageDialog(null, "Error occured during Updating ");
            }
        }
    }//GEN-LAST:event_jbtn_updateFacultyAndSpecializationActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        DefaultListModel dlm = new DefaultListModel();
        String o = update_specialization.getSelectedItem().toString();
        dlm.removeElement(o);
        jlist_UpdateSpecialization.setModel(dlm);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultListModel dlm = new DefaultListModel();
        String o = update_specialization.getSelectedItem().toString();
        dlm.addElement(o);
        jlist_UpdateSpecialization.setModel(dlm);

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JCheckBox cb_status;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtn_updateFacultyAndSpecialization;
    private javax.swing.JComboBox<String> jcb_updateCivilStatus;
    private javax.swing.JComboBox<String> jcb_updateDegree;
    private javax.swing.JList<String> jlist_UpdateSpecialization;
    private javax.swing.JTextField jtf_updateContact;
    private javax.swing.JTextField jtf_updateEmailAddress;
    private javax.swing.JTextField jtf_updateFirstName;
    private javax.swing.JTextField jtf_updateLastName;
    private javax.swing.JTextField jtf_updateMiddleName;
    private javax.swing.JComboBox<String> update_specialization;
    // End of variables declaration//GEN-END:variables
}
