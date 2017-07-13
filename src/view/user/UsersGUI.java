package view.user;

import component_model_loader.JPanelGUIUtil;
import database_utility.DBType;
import database_utility.DBUtil;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import component_model_loader.ImageGUIUtil;

public class UsersGUI extends javax.swing.JPanel {

    String mode = "";
    
    JPanelGUIUtil fm = new JPanelGUIUtil();
    
    String HOME = "Home";
    String ADMIN = "Administration";
    String ADMIN_CURC = "Administration > Curriculum";
    String ADMIN_DISCOUNTS = "Administration > Discounts";
    String ADMIN_SECTIONS = "Administration > Sections";
    String ADMIN_USERS = "Administration > Users";
    String ADMIN_SCHED = "Administration > Schedule";
    String ADMIN_YRLEVEL = "Administration > Year Level";
    String PAYMENT = "Payment";
    String REGISTRATION = "Registration";
    String STUDENTS = "Students";
    String FACULTY = "Faculty";
    String REPORTS = "Reports";
    String SECTIONS = "Sections";

    String settingsComboBoxItems[] = 
        {HOME,ADMIN,ADMIN_CURC,ADMIN_DISCOUNTS,
            ADMIN_SECTIONS,ADMIN_USERS,ADMIN_SCHED,
            ADMIN_YRLEVEL,PAYMENT,REGISTRATION,STUDENTS,FACULTY,REPORTS,SECTIONS};
    DefaultComboBoxModel dcm = new DefaultComboBoxModel(settingsComboBoxItems);
    
    int userIdOfSelectedUser;    
        
    //CONSTRUCTOR    
    public UsersGUI() {
        initComponents();
        settingsComboBox.setModel(dcm);
        loadProfileTypes();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Manage_Users_tab = new javax.swing.JTabbedPane();
        User_Accounts = new javax.swing.JPanel();
        rightContainerPanel = new javax.swing.JPanel();
        UserInformation = new javax.swing.JPanel();
        userProfilePicPanel = new javax.swing.JPanel();
        photoPanel = new javax.swing.JPanel();
        photoPlaceholderJLabel = new javax.swing.JLabel();
        resetPasswordButton = new javax.swing.JButton();
        updatePhotoButton = new javax.swing.JButton();
        userBasicInfoPanel = new javax.swing.JPanel();
        userInformationUserNameTextField = new javax.swing.JTextField();
        userInformation_AccountCreationDate_Date_Label = new javax.swing.JLabel();
        UserInformation_AccountCreationDate_Label = new javax.swing.JLabel();
        profileTypeComboBox = new javax.swing.JComboBox();
        profileTypeLabel = new javax.swing.JLabel();
        userInformationUserNameLabel = new javax.swing.JLabel();
        lastNameJtf = new javax.swing.JTextField();
        firstNameJtf = new javax.swing.JTextField();
        middleNameJtf = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        middleNameLabel = new javax.swing.JLabel();
        addUserButtonsPanel = new javax.swing.JPanel();
        saveUserButton = new javax.swing.JButton();
        saveChangesOnEditButton = new javax.swing.JButton();
        allPermissionsJPanel = new javax.swing.JPanel();
        settingstButtonPanel = new javax.swing.JPanel();
        permissionsSettingsLabel = new javax.swing.JLabel();
        settingsComboBox = new javax.swing.JComboBox<>();
        cardContainerPanel = new javax.swing.JPanel();
        homePermissionsPanel = new javax.swing.JPanel();
        homePermissionsScrollPane = new javax.swing.JScrollPane();
        homePermssionsCheckBoxPanel = new javax.swing.JPanel();
        updateUserNameCheckBox = new javax.swing.JCheckBox();
        updatePasswordCheckBox = new javax.swing.JCheckBox();
        updatePhotoCheckBox = new javax.swing.JCheckBox();
        homeTabAccessChbx = new javax.swing.JCheckBox();
        administrationPermissionsPanel = new javax.swing.JPanel();
        administrationPermissionsScrollPane = new javax.swing.JScrollPane();
        administrationPermissionsCheckBoxPanel = new javax.swing.JPanel();
        administrationYrLevelMgmtCheckBox = new javax.swing.JCheckBox();
        administrationScheduleMgmtCheckBox = new javax.swing.JCheckBox();
        administrationUserMgmtCheckBox = new javax.swing.JCheckBox();
        administrationSectionsMgmtCheckBox = new javax.swing.JCheckBox();
        administrationDiscountsMgmtCheckBox = new javax.swing.JCheckBox();
        administrationCurriculumMgmtCheckBox = new javax.swing.JCheckBox();
        administrationTabAccess = new javax.swing.JCheckBox();
        accountingMgmtCheckbox = new javax.swing.JCheckBox();
        administrationCurriculumPanel = new javax.swing.JPanel();
        administrationCurriculumScrollPane = new javax.swing.JScrollPane();
        administrationCurriculumCheckBoxPanel = new javax.swing.JPanel();
        deleteSubjectButtonPermissionCheckbox = new javax.swing.JCheckBox();
        deleteCurriculumButtonPermissionCheckbox = new javax.swing.JCheckBox();
        editCurriculumButtonPermissionCheckbox = new javax.swing.JCheckBox();
        newCurriculumButtonPermissionCheckbox = new javax.swing.JCheckBox();
        subjectsTabCheckBox = new javax.swing.JCheckBox();
        curriculumCreatorTabCheckBox = new javax.swing.JCheckBox();
        createNewSubjectPermissionCheckbox = new javax.swing.JCheckBox();
        editSubjectCheckBox = new javax.swing.JCheckBox();
        administrationDiscountsPanel = new javax.swing.JPanel();
        administrationDiscountsScrollPane = new javax.swing.JScrollPane();
        administrationDiscountsCheckBoxPanel = new javax.swing.JPanel();
        createDiscountCheckBox = new javax.swing.JCheckBox();
        editDiscountSpecificationCheckBox = new javax.swing.JCheckBox();
        applyDiscountCheckBox = new javax.swing.JCheckBox();
        viewStudentDiscountCheckbox = new javax.swing.JCheckBox();
        removeDiscountsCheckbox = new javax.swing.JCheckBox();
        deactivateDiscountCheckBox = new javax.swing.JCheckBox();
        administrationSectionsPanel = new javax.swing.JPanel();
        administrationSectionsScrollPane = new javax.swing.JScrollPane();
        administrationSectionsCheckBoxPanel = new javax.swing.JPanel();
        editSectionGeneralSettingsCheckbox = new javax.swing.JCheckBox();
        createSectionCheckbox = new javax.swing.JCheckBox();
        editSectionSpecificationCheckbox = new javax.swing.JCheckBox();
        removeSectionCheckBox = new javax.swing.JCheckBox();
        administrationUsersPanel = new javax.swing.JPanel();
        administrationUsersScrollPane = new javax.swing.JScrollPane();
        administrationUsersCheckBoxPanel = new javax.swing.JPanel();
        addNewUserCheckBox = new javax.swing.JCheckBox();
        removeUserCheckBox = new javax.swing.JCheckBox();
        viewArchivedUserCheckBox = new javax.swing.JCheckBox();
        editUserPermissionsCheckBox = new javax.swing.JCheckBox();
        editUserProfileTypeCheckBox = new javax.swing.JCheckBox();
        resetUserPasswordCheckBox = new javax.swing.JCheckBox();
        editUserInformationCheckBox = new javax.swing.JCheckBox();
        administrationSchedulesPanel = new javax.swing.JPanel();
        administrationSchedulesScrollPane = new javax.swing.JScrollPane();
        administrationSchedulesCheckBoxPanel = new javax.swing.JPanel();
        createScheduleCheckBox = new javax.swing.JCheckBox();
        editScheduleCheckBox = new javax.swing.JCheckBox();
        removeScheduleCheckBox = new javax.swing.JCheckBox();
        administrationYearLevelsPanel = new javax.swing.JPanel();
        administrationYearLevelsScrollPane = new javax.swing.JScrollPane();
        administrationYearLevelsCheckBoxPanel = new javax.swing.JPanel();
        paymentPermissionsPanel = new javax.swing.JPanel();
        paymentPermissionsScrollPane = new javax.swing.JScrollPane();
        paymentPermissionsCheckBoxPanel = new javax.swing.JPanel();
        paymentTabCheckBox = new javax.swing.JCheckBox();
        processPaymentCheckBox = new javax.swing.JCheckBox();
        viewAccountsCheckBox = new javax.swing.JCheckBox();
        deactivateAccountCheckBox = new javax.swing.JCheckBox();
        removeAccountsCheckBox = new javax.swing.JCheckBox();
        modifyAccountCheckBox = new javax.swing.JCheckBox();
        registrationPermissionsPanel = new javax.swing.JPanel();
        registrationPermissionsScrollPane = new javax.swing.JScrollPane();
        registrationPermissionsCheckBoxPanel = new javax.swing.JPanel();
        registrationTabCheckBox = new javax.swing.JCheckBox();
        registerStudentCheckBox = new javax.swing.JCheckBox();
        deleteRegistrationCheckBox = new javax.swing.JCheckBox();
        viewRegisteredStudentCheckBox = new javax.swing.JCheckBox();
        editRegistrationInfoCheckBox = new javax.swing.JCheckBox();
        studentsPermissionsPanel = new javax.swing.JPanel();
        studentsPermissionsScrollPane = new javax.swing.JScrollPane();
        studentsPermissionsCheckBoxPanel = new javax.swing.JPanel();
        studentsTabAccessCheckBox = new javax.swing.JCheckBox();
        searchAndViewStudentRecord = new javax.swing.JCheckBox();
        addNewStudentRecordCheckBox = new javax.swing.JCheckBox();
        editStudentRecordCheckBox = new javax.swing.JCheckBox();
        deleteStudentRecordCheckBox = new javax.swing.JCheckBox();
        facultyPermissionsPanel = new javax.swing.JPanel();
        facultyPermissionsScrollPane = new javax.swing.JScrollPane();
        facultyPermissionsCheckBoxPanel = new javax.swing.JPanel();
        facultTabAccessCheckBox = new javax.swing.JCheckBox();
        addFacultyMemberCheckbox = new javax.swing.JCheckBox();
        editFacultyMemberCheckbox = new javax.swing.JCheckBox();
        removeFacultyMemberCheckbox = new javax.swing.JCheckBox();
        viewFacultyMemberInfoCheckbox = new javax.swing.JCheckBox();
        setFacultyMemberStatusCheckbox = new javax.swing.JCheckBox();
        reportsPermissionsPanel = new javax.swing.JPanel();
        reportsPermissionsScrollPane = new javax.swing.JScrollPane();
        reportsPermissionsCheckBoxPanel = new javax.swing.JPanel();
        reportsTabAccess = new javax.swing.JCheckBox();
        sectionsPermissionsPanel = new javax.swing.JPanel();
        sectionsPermissionsScrollPane = new javax.swing.JScrollPane();
        sectionsPermissionsCheckBoxPanel = new javax.swing.JPanel();
        sectionsTabAccess = new javax.swing.JCheckBox();
        saveButtonPanel = new javax.swing.JPanel();
        leftContainerPanel = new javax.swing.JPanel();
        Teachers = new javax.swing.JScrollPane();
        usersList = new javax.swing.JList();
        addDeleteUserPanel = new javax.swing.JPanel();
        newUserButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1000, 500));
        setLayout(new java.awt.GridBagLayout());

        Manage_Users_tab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Manage_Users_tab.setPreferredSize(new java.awt.Dimension(1006, 542));

        User_Accounts.setOpaque(false);
        User_Accounts.setLayout(new java.awt.GridBagLayout());

        rightContainerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rightContainerPanel.setOpaque(false);
        rightContainerPanel.setPreferredSize(new java.awt.Dimension(699, 400));
        rightContainerPanel.setLayout(new java.awt.GridBagLayout());

        UserInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        UserInformation.setPreferredSize(new java.awt.Dimension(350, 350));
        UserInformation.setLayout(new java.awt.GridBagLayout());

        userProfilePicPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userProfilePicPanel.setOpaque(false);
        userProfilePicPanel.setPreferredSize(new java.awt.Dimension(160, 400));
        userProfilePicPanel.setLayout(new java.awt.GridBagLayout());

        photoPanel.setMaximumSize(new java.awt.Dimension(250, 250));
        photoPanel.setPreferredSize(new java.awt.Dimension(150, 150));
        photoPanel.setLayout(new java.awt.BorderLayout());

        photoPlaceholderJLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        photoPlaceholderJLabel.setPreferredSize(new java.awt.Dimension(90, 90));
        photoPanel.add(photoPlaceholderJLabel, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userProfilePicPanel.add(photoPanel, gridBagConstraints);

        resetPasswordButton.setText("Reset Password");
        resetPasswordButton.setAlignmentY(0.0F);
        resetPasswordButton.setEnabled(false);
        resetPasswordButton.setPreferredSize(new java.awt.Dimension(101, 23));
        resetPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPasswordButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userProfilePicPanel.add(resetPasswordButton, gridBagConstraints);

        updatePhotoButton.setText("Update Photo");
        updatePhotoButton.setEnabled(false);
        updatePhotoButton.setPreferredSize(new java.awt.Dimension(101, 23));
        updatePhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePhotoButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userProfilePicPanel.add(updatePhotoButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        UserInformation.add(userProfilePicPanel, gridBagConstraints);

        userBasicInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userBasicInfoPanel.setPreferredSize(new java.awt.Dimension(200, 200));
        userBasicInfoPanel.setLayout(new java.awt.GridBagLayout());

        userInformationUserNameTextField.setColumns(20);
        userInformationUserNameTextField.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userBasicInfoPanel.add(userInformationUserNameTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userBasicInfoPanel.add(userInformation_AccountCreationDate_Date_Label, gridBagConstraints);

        UserInformation_AccountCreationDate_Label.setText("Creation Date:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userBasicInfoPanel.add(UserInformation_AccountCreationDate_Label, gridBagConstraints);

        profileTypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        profileTypeComboBox.setEnabled(false);
        profileTypeComboBox.setPreferredSize(new java.awt.Dimension(100, 20));
        profileTypeComboBox.setRequestFocusEnabled(false);
        profileTypeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                profileTypeComboBoxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userBasicInfoPanel.add(profileTypeComboBox, gridBagConstraints);

        profileTypeLabel.setText("Account Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userBasicInfoPanel.add(profileTypeLabel, gridBagConstraints);

        userInformationUserNameLabel.setText("Username ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userBasicInfoPanel.add(userInformationUserNameLabel, gridBagConstraints);

        lastNameJtf.setColumns(20);
        lastNameJtf.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userBasicInfoPanel.add(lastNameJtf, gridBagConstraints);

        firstNameJtf.setColumns(20);
        firstNameJtf.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userBasicInfoPanel.add(firstNameJtf, gridBagConstraints);

        middleNameJtf.setColumns(20);
        middleNameJtf.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userBasicInfoPanel.add(middleNameJtf, gridBagConstraints);

        lastNameLabel.setText("Last Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userBasicInfoPanel.add(lastNameLabel, gridBagConstraints);

        firstNameLabel.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userBasicInfoPanel.add(firstNameLabel, gridBagConstraints);

        middleNameLabel.setText("Middle Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        userBasicInfoPanel.add(middleNameLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        UserInformation.add(userBasicInfoPanel, gridBagConstraints);

        addUserButtonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addUserButtonsPanel.setLayout(new java.awt.GridBagLayout());

        saveUserButton.setText("SAVE");
        saveUserButton.setEnabled(false);
        saveUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUserButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        addUserButtonsPanel.add(saveUserButton, gridBagConstraints);

        saveChangesOnEditButton.setText("SAVE CHANGES");
        saveChangesOnEditButton.setVisible(false);
        saveChangesOnEditButton.setToolTipText("Save Changes");
        saveChangesOnEditButton.setEnabled(false);
        saveChangesOnEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesOnEditButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        addUserButtonsPanel.add(saveChangesOnEditButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        UserInformation.add(addUserButtonsPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        rightContainerPanel.add(UserInformation, gridBagConstraints);

        allPermissionsJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Permissions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        allPermissionsJPanel.setOpaque(false);
        allPermissionsJPanel.setPreferredSize(new java.awt.Dimension(400, 350));
        allPermissionsJPanel.setLayout(new java.awt.GridBagLayout());

        settingstButtonPanel.setLayout(new java.awt.GridBagLayout());

        permissionsSettingsLabel.setText("Settings for:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        settingstButtonPanel.add(permissionsSettingsLabel, gridBagConstraints);

        settingsComboBox.setEnabled(false);
        settingsComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                settingsComboBoxItemStateChanged(evt);
            }
        });
        settingsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        settingstButtonPanel.add(settingsComboBox, gridBagConstraints);
        settingsComboBox.getAccessibleContext().setAccessibleName("");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        allPermissionsJPanel.add(settingstButtonPanel, gridBagConstraints);

        cardContainerPanel.setLayout(new java.awt.CardLayout());

        homePermissionsPanel.setLayout(new java.awt.BorderLayout());

        homePermssionsCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Home", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        homePermssionsCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        updateUserNameCheckBox.setText("Update Username");
        updateUserNameCheckBox.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        homePermssionsCheckBoxPanel.add(updateUserNameCheckBox, gridBagConstraints);

        updatePasswordCheckBox.setText("Update Password");
        updatePasswordCheckBox.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        homePermssionsCheckBoxPanel.add(updatePasswordCheckBox, gridBagConstraints);

        updatePhotoCheckBox.setText("Update Profile Picture");
        updatePhotoCheckBox.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        homePermssionsCheckBoxPanel.add(updatePhotoCheckBox, gridBagConstraints);

        homeTabAccessChbx.setText("Home Tab Access");
        homeTabAccessChbx.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        homePermssionsCheckBoxPanel.add(homeTabAccessChbx, gridBagConstraints);

        homePermissionsScrollPane.setViewportView(homePermssionsCheckBoxPanel);

        homePermissionsPanel.add(homePermissionsScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(homePermissionsPanel, "");

        administrationPermissionsPanel.setLayout(new java.awt.BorderLayout());

        administrationPermissionsCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administration", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        administrationPermissionsCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        administrationYrLevelMgmtCheckBox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        administrationYrLevelMgmtCheckBox.setText("Year Level Management Access");
        administrationYrLevelMgmtCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationPermissionsCheckBoxPanel.add(administrationYrLevelMgmtCheckBox, gridBagConstraints);

        administrationScheduleMgmtCheckBox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        administrationScheduleMgmtCheckBox.setText("Schedule Management Access");
        administrationScheduleMgmtCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationPermissionsCheckBoxPanel.add(administrationScheduleMgmtCheckBox, gridBagConstraints);

        administrationUserMgmtCheckBox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        administrationUserMgmtCheckBox.setText("Users Management Access");
        administrationUserMgmtCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationPermissionsCheckBoxPanel.add(administrationUserMgmtCheckBox, gridBagConstraints);

        administrationSectionsMgmtCheckBox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        administrationSectionsMgmtCheckBox.setText("Sections Management Access");
        administrationSectionsMgmtCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationPermissionsCheckBoxPanel.add(administrationSectionsMgmtCheckBox, gridBagConstraints);

        administrationDiscountsMgmtCheckBox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        administrationDiscountsMgmtCheckBox.setText("Discounts Management Access");
        administrationDiscountsMgmtCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationPermissionsCheckBoxPanel.add(administrationDiscountsMgmtCheckBox, gridBagConstraints);

        administrationCurriculumMgmtCheckBox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        administrationCurriculumMgmtCheckBox.setText("Curriculum Management Access");
        administrationCurriculumMgmtCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationPermissionsCheckBoxPanel.add(administrationCurriculumMgmtCheckBox, gridBagConstraints);

        administrationTabAccess.setText("Administration Tab Access");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationPermissionsCheckBoxPanel.add(administrationTabAccess, gridBagConstraints);

        accountingMgmtCheckbox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        accountingMgmtCheckbox.setText("Accounting Management Access");
        accountingMgmtCheckbox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationPermissionsCheckBoxPanel.add(accountingMgmtCheckbox, gridBagConstraints);

        administrationPermissionsScrollPane.setViewportView(administrationPermissionsCheckBoxPanel);

        administrationPermissionsPanel.add(administrationPermissionsScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(administrationPermissionsPanel, "");

        administrationCurriculumPanel.setLayout(new java.awt.BorderLayout());

        administrationCurriculumCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administration > Curriculum Management", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        administrationCurriculumCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        deleteSubjectButtonPermissionCheckbox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        deleteSubjectButtonPermissionCheckbox.setText("Delete Subject (Subjects Tab)");
        deleteSubjectButtonPermissionCheckbox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationCurriculumCheckBoxPanel.add(deleteSubjectButtonPermissionCheckbox, gridBagConstraints);

        deleteCurriculumButtonPermissionCheckbox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        deleteCurriculumButtonPermissionCheckbox.setText("Delete Curriculum (Curriculum Creator Tab)");
        deleteCurriculumButtonPermissionCheckbox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationCurriculumCheckBoxPanel.add(deleteCurriculumButtonPermissionCheckbox, gridBagConstraints);

        editCurriculumButtonPermissionCheckbox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        editCurriculumButtonPermissionCheckbox.setText("Edit Curriculum (Curriculum Creator Tab)");
        editCurriculumButtonPermissionCheckbox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationCurriculumCheckBoxPanel.add(editCurriculumButtonPermissionCheckbox, gridBagConstraints);

        newCurriculumButtonPermissionCheckbox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        newCurriculumButtonPermissionCheckbox.setText("Create New Curriculum (Curriculum Creator Tab)");
        newCurriculumButtonPermissionCheckbox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationCurriculumCheckBoxPanel.add(newCurriculumButtonPermissionCheckbox, gridBagConstraints);

        subjectsTabCheckBox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        subjectsTabCheckBox.setText("Subjects Tab");
        subjectsTabCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationCurriculumCheckBoxPanel.add(subjectsTabCheckBox, gridBagConstraints);

        curriculumCreatorTabCheckBox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        curriculumCreatorTabCheckBox.setText("Curriculm Creator Tab");
        curriculumCreatorTabCheckBox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationCurriculumCheckBoxPanel.add(curriculumCreatorTabCheckBox, gridBagConstraints);

        createNewSubjectPermissionCheckbox.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        createNewSubjectPermissionCheckbox.setText("Create New Subject (Subjects Tab)");
        createNewSubjectPermissionCheckbox.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationCurriculumCheckBoxPanel.add(createNewSubjectPermissionCheckbox, gridBagConstraints);

        editSubjectCheckBox.setText("Edit Subject");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationCurriculumCheckBoxPanel.add(editSubjectCheckBox, gridBagConstraints);

        administrationCurriculumScrollPane.setViewportView(administrationCurriculumCheckBoxPanel);

        administrationCurriculumPanel.add(administrationCurriculumScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(administrationCurriculumPanel, "");

        administrationDiscountsPanel.setLayout(new java.awt.BorderLayout());

        administrationDiscountsCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administration > Discounts Management", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        administrationDiscountsCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        createDiscountCheckBox.setText("Create Discount");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationDiscountsCheckBoxPanel.add(createDiscountCheckBox, gridBagConstraints);

        editDiscountSpecificationCheckBox.setText("Edit Discount Specification / Information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationDiscountsCheckBoxPanel.add(editDiscountSpecificationCheckBox, gridBagConstraints);

        applyDiscountCheckBox.setText("Apply Discount To Student");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationDiscountsCheckBoxPanel.add(applyDiscountCheckBox, gridBagConstraints);

        viewStudentDiscountCheckbox.setText("View Students With Discount");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationDiscountsCheckBoxPanel.add(viewStudentDiscountCheckbox, gridBagConstraints);

        removeDiscountsCheckbox.setText("Remove Discount From Discounts List");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationDiscountsCheckBoxPanel.add(removeDiscountsCheckbox, gridBagConstraints);

        deactivateDiscountCheckBox.setText("Deactivate Discount");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationDiscountsCheckBoxPanel.add(deactivateDiscountCheckBox, gridBagConstraints);

        administrationDiscountsScrollPane.setViewportView(administrationDiscountsCheckBoxPanel);

        administrationDiscountsPanel.add(administrationDiscountsScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(administrationDiscountsPanel, "");

        administrationSectionsPanel.setLayout(new java.awt.BorderLayout());

        administrationSectionsCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administration > Sections Management", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        administrationSectionsCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        editSectionGeneralSettingsCheckbox.setText("Modify General Settings");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        administrationSectionsCheckBoxPanel.add(editSectionGeneralSettingsCheckbox, gridBagConstraints);

        createSectionCheckbox.setText("Create Section");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        administrationSectionsCheckBoxPanel.add(createSectionCheckbox, gridBagConstraints);

        editSectionSpecificationCheckbox.setText("Modify Section Specification");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        administrationSectionsCheckBoxPanel.add(editSectionSpecificationCheckbox, gridBagConstraints);

        removeSectionCheckBox.setText("Archive / Remove Section(s)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        administrationSectionsCheckBoxPanel.add(removeSectionCheckBox, gridBagConstraints);

        administrationSectionsScrollPane.setViewportView(administrationSectionsCheckBoxPanel);

        administrationSectionsPanel.add(administrationSectionsScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(administrationSectionsPanel, "");

        administrationUsersPanel.setLayout(new java.awt.BorderLayout());

        administrationUsersCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administration > Users Management", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        administrationUsersCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        addNewUserCheckBox.setText("Add New User");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationUsersCheckBoxPanel.add(addNewUserCheckBox, gridBagConstraints);

        removeUserCheckBox.setText("Archive / Remove User");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationUsersCheckBoxPanel.add(removeUserCheckBox, gridBagConstraints);

        viewArchivedUserCheckBox.setText("View Archived Users");
        viewArchivedUserCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewArchivedUserCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationUsersCheckBoxPanel.add(viewArchivedUserCheckBox, gridBagConstraints);

        editUserPermissionsCheckBox.setText("Modify User Permissions");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationUsersCheckBoxPanel.add(editUserPermissionsCheckBox, gridBagConstraints);

        editUserProfileTypeCheckBox.setText("Edit Profile Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationUsersCheckBoxPanel.add(editUserProfileTypeCheckBox, gridBagConstraints);

        resetUserPasswordCheckBox.setText("Reset User Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationUsersCheckBoxPanel.add(resetUserPasswordCheckBox, gridBagConstraints);

        editUserInformationCheckBox.setText("Modify User Information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationUsersCheckBoxPanel.add(editUserInformationCheckBox, gridBagConstraints);

        administrationUsersScrollPane.setViewportView(administrationUsersCheckBoxPanel);

        administrationUsersPanel.add(administrationUsersScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(administrationUsersPanel, "");

        administrationSchedulesPanel.setLayout(new java.awt.BorderLayout());

        administrationSchedulesCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administration > Schedules Management", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        administrationSchedulesCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        createScheduleCheckBox.setText("Create Schedule");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationSchedulesCheckBoxPanel.add(createScheduleCheckBox, gridBagConstraints);

        editScheduleCheckBox.setText("Edit Schedule");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationSchedulesCheckBoxPanel.add(editScheduleCheckBox, gridBagConstraints);

        removeScheduleCheckBox.setText("Archive / Remove Schedule");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        administrationSchedulesCheckBoxPanel.add(removeScheduleCheckBox, gridBagConstraints);

        administrationSchedulesScrollPane.setViewportView(administrationSchedulesCheckBoxPanel);

        administrationSchedulesPanel.add(administrationSchedulesScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(administrationSchedulesPanel, "");

        administrationYearLevelsPanel.setLayout(new java.awt.BorderLayout());

        administrationYearLevelsCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administration > Year Level Management", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        administrationYearLevelsCheckBoxPanel.setLayout(new java.awt.GridBagLayout());
        administrationYearLevelsScrollPane.setViewportView(administrationYearLevelsCheckBoxPanel);

        administrationYearLevelsPanel.add(administrationYearLevelsScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(administrationYearLevelsPanel, "");

        paymentPermissionsPanel.setLayout(new java.awt.BorderLayout());

        paymentPermissionsCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        paymentPermissionsCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        paymentTabCheckBox.setText("Payment Panel Tab Access");
        paymentTabCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentTabCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        paymentPermissionsCheckBoxPanel.add(paymentTabCheckBox, gridBagConstraints);

        processPaymentCheckBox.setText("Process Payment");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        paymentPermissionsCheckBoxPanel.add(processPaymentCheckBox, gridBagConstraints);

        viewAccountsCheckBox.setText("View Accounts (Search) ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        paymentPermissionsCheckBoxPanel.add(viewAccountsCheckBox, gridBagConstraints);

        deactivateAccountCheckBox.setText("Deactivate Accounts");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        paymentPermissionsCheckBoxPanel.add(deactivateAccountCheckBox, gridBagConstraints);

        removeAccountsCheckBox.setText("Remove / Archive Accounts");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        paymentPermissionsCheckBoxPanel.add(removeAccountsCheckBox, gridBagConstraints);

        modifyAccountCheckBox.setText("Modify Accounts");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        paymentPermissionsCheckBoxPanel.add(modifyAccountCheckBox, gridBagConstraints);

        paymentPermissionsScrollPane.setViewportView(paymentPermissionsCheckBoxPanel);

        paymentPermissionsPanel.add(paymentPermissionsScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(paymentPermissionsPanel, "");

        registrationPermissionsPanel.setLayout(new java.awt.BorderLayout());

        registrationPermissionsCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        registrationPermissionsCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        registrationTabCheckBox.setText("Registration Tab Access");
        registrationTabCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationTabCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        registrationPermissionsCheckBoxPanel.add(registrationTabCheckBox, gridBagConstraints);

        registerStudentCheckBox.setText("Register Student");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        registrationPermissionsCheckBoxPanel.add(registerStudentCheckBox, gridBagConstraints);

        deleteRegistrationCheckBox.setText("Delete Existing Registration");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        registrationPermissionsCheckBoxPanel.add(deleteRegistrationCheckBox, gridBagConstraints);

        viewRegisteredStudentCheckBox.setText("View Registered Students (Search)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        registrationPermissionsCheckBoxPanel.add(viewRegisteredStudentCheckBox, gridBagConstraints);

        editRegistrationInfoCheckBox.setText("Edit Existing Registration Information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        registrationPermissionsCheckBoxPanel.add(editRegistrationInfoCheckBox, gridBagConstraints);

        registrationPermissionsScrollPane.setViewportView(registrationPermissionsCheckBoxPanel);

        registrationPermissionsPanel.add(registrationPermissionsScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(registrationPermissionsPanel, "");

        studentsPermissionsPanel.setLayout(new java.awt.BorderLayout());

        studentsPermissionsCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Students", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        studentsPermissionsCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        studentsTabAccessCheckBox.setText("Students Tab Access");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentsPermissionsCheckBoxPanel.add(studentsTabAccessCheckBox, gridBagConstraints);

        searchAndViewStudentRecord.setText("Search & View Students Records");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentsPermissionsCheckBoxPanel.add(searchAndViewStudentRecord, gridBagConstraints);

        addNewStudentRecordCheckBox.setText("Add New Student Record");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentsPermissionsCheckBoxPanel.add(addNewStudentRecordCheckBox, gridBagConstraints);

        editStudentRecordCheckBox.setText("Edit Student Record");
        editStudentRecordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentRecordCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentsPermissionsCheckBoxPanel.add(editStudentRecordCheckBox, gridBagConstraints);

        deleteStudentRecordCheckBox.setText("Delete Student Record");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        studentsPermissionsCheckBoxPanel.add(deleteStudentRecordCheckBox, gridBagConstraints);

        studentsPermissionsScrollPane.setViewportView(studentsPermissionsCheckBoxPanel);

        studentsPermissionsPanel.add(studentsPermissionsScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(studentsPermissionsPanel, "");

        facultyPermissionsPanel.setLayout(new java.awt.BorderLayout());

        facultyPermissionsCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faculty", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        facultyPermissionsCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        facultTabAccessCheckBox.setText("Faculty Tab Access");
        facultTabAccessCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultTabAccessCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        facultyPermissionsCheckBoxPanel.add(facultTabAccessCheckBox, gridBagConstraints);

        addFacultyMemberCheckbox.setText("Add faculty member ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        facultyPermissionsCheckBoxPanel.add(addFacultyMemberCheckbox, gridBagConstraints);

        editFacultyMemberCheckbox.setText("Edit faculty member info ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        facultyPermissionsCheckBoxPanel.add(editFacultyMemberCheckbox, gridBagConstraints);

        removeFacultyMemberCheckbox.setText("Remove / archive faculty member ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        facultyPermissionsCheckBoxPanel.add(removeFacultyMemberCheckbox, gridBagConstraints);

        viewFacultyMemberInfoCheckbox.setText("View faculty member info ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        facultyPermissionsCheckBoxPanel.add(viewFacultyMemberInfoCheckbox, gridBagConstraints);

        setFacultyMemberStatusCheckbox.setText("Set Active / Inactive status ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        facultyPermissionsCheckBoxPanel.add(setFacultyMemberStatusCheckbox, gridBagConstraints);

        facultyPermissionsScrollPane.setViewportView(facultyPermissionsCheckBoxPanel);

        facultyPermissionsPanel.add(facultyPermissionsScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(facultyPermissionsPanel, "");

        reportsPermissionsPanel.setLayout(new java.awt.BorderLayout());

        reportsPermissionsCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reports", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        reportsPermissionsCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        reportsTabAccess.setText("Reports Tab Access");
        reportsPermissionsCheckBoxPanel.add(reportsTabAccess, new java.awt.GridBagConstraints());

        reportsPermissionsScrollPane.setViewportView(reportsPermissionsCheckBoxPanel);

        reportsPermissionsPanel.add(reportsPermissionsScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(reportsPermissionsPanel, "");

        sectionsPermissionsPanel.setLayout(new java.awt.BorderLayout());

        sectionsPermissionsCheckBoxPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sections", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        sectionsPermissionsCheckBoxPanel.setLayout(new java.awt.GridBagLayout());

        sectionsTabAccess.setText("Sections Tab Access");
        sectionsPermissionsCheckBoxPanel.add(sectionsTabAccess, new java.awt.GridBagConstraints());

        sectionsPermissionsScrollPane.setViewportView(sectionsPermissionsCheckBoxPanel);

        sectionsPermissionsPanel.add(sectionsPermissionsScrollPane, java.awt.BorderLayout.CENTER);

        cardContainerPanel.add(sectionsPermissionsPanel, "");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        allPermissionsJPanel.add(cardContainerPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        rightContainerPanel.add(allPermissionsJPanel, gridBagConstraints);

        saveButtonPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        rightContainerPanel.add(saveButtonPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        User_Accounts.add(rightContainerPanel, gridBagConstraints);

        leftContainerPanel.setPreferredSize(new java.awt.Dimension(140, 315));
        leftContainerPanel.setLayout(new java.awt.GridBagLayout());

        Teachers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Teachers.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        Teachers.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        Teachers.setPreferredSize(new java.awt.Dimension(120, 100));

        usersList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                usersListValueChanged(evt);
            }
        });
        usersList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usersListFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usersListFocusLost(evt);
            }
        });
        Teachers.setViewportView(usersList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.ipady = 77;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftContainerPanel.add(Teachers, gridBagConstraints);

        addDeleteUserPanel.setLayout(new java.awt.GridBagLayout());

        newUserButton.setText("CREATE USER");
        newUserButton.setPreferredSize(new java.awt.Dimension(57, 23));
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        addDeleteUserPanel.add(newUserButton, gridBagConstraints);

        deleteUserButton.setText("DELETE USER");
        deleteUserButton.setPreferredSize(new java.awt.Dimension(57, 23));
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        addDeleteUserPanel.add(deleteUserButton, gridBagConstraints);

        editUserButton.setText("EDIT USER");
        editUserButton.setPreferredSize(new java.awt.Dimension(57, 23));
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        addDeleteUserPanel.add(editUserButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        leftContainerPanel.add(addDeleteUserPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        User_Accounts.add(leftContainerPanel, gridBagConstraints);

        Manage_Users_tab.addTab("User Accounts", User_Accounts);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        add(Manage_Users_tab, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void loadProfileTypes(){
        profileTypeComboBox.setSelectedIndex(0);
    }
    
    private void resetAllFieldsDefaultState(){
        List<Component> userInfoFields = JPanelGUIUtil.getComponentsAsList(userBasicInfoPanel);
        List<Component> userPhotoPanelFields = JPanelGUIUtil.getComponentsAsList(userProfilePicPanel);
        List<Component> settingsForPanel = JPanelGUIUtil.getComponentsAsList(settingstButtonPanel);
            for(Component c : userInfoFields){
                c.setEnabled(false);
                if(c instanceof JTextField){
                    ((JTextField)c).setText("");
                }
            }
            for(Component c : userPhotoPanelFields){
                c.setEnabled(false);
            }
            for(Component c : settingsForPanel){
                c.setEnabled(false);
            }
        
        saveUserButton.setVisible(true);
        saveUserButton.setEnabled(false);
        saveChangesOnEditButton.setVisible(false);
    }
    
    private String generatePassword()
    {
        char[] chars = "abcdefghijklmnopqrstuvwxyz123456789".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        updateUserPassword(output);
        return output;
    }// --end of generatePassword()
    
    private void updateUserPassword(String password){
        JOptionPane.showMessageDialog(null, "New Password: "+password);
        String insertPassword = " UPDATE users SET PASSWORD=? WHERE USERID=? ";
        
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            PreparedStatement ps = con.prepareStatement(insertPassword);) 
        {
                ps.setString(1,password);
                ps.executeUpdate();
                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error@insertNewPassword().\n\n"+e.getMessage());
        } 
    }
    
    private void resetPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPasswordButtonActionPerformed
        updateUserPassword(generatePassword());
    }//GEN-LAST:event_resetPasswordButtonActionPerformed

    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserButtonActionPerformed
       mode = "create";
        
       usersList.clearSelection();
       deselectAllPermissionsCheckBoxes();
       enableAllPermissionsCheckBoxes();
       List userInformation   = fm.getComponentsAsList(userBasicInfoPanel);
       fm.enableFields(userInformation);
//       fm.clearFields(userInformation);
       
       List settingsButtonPanel = fm.getComponentsAsList(settingstButtonPanel);
       fm.enableFields(settingsButtonPanel);
       
       updatePhotoButton.setEnabled(true);
       saveUserButton.setEnabled(true);
       saveUserButton.setVisible(true);
       saveChangesOnEditButton.setVisible(false);
       userInformation_AccountCreationDate_Date_Label.setText("");
       
       settingsComboBox.setSelectedIndex(0);
       profileTypeComboBox.setSelectedIndex(0);
       CardLayout cl = (CardLayout)(cardContainerPanel.getLayout());
       cl.show(cardContainerPanel,HOME);
       
       mode = "";
    }//GEN-LAST:event_newUserButtonActionPerformed

    
    private void loadSelectedUserInformation(){
//        JOptionPane.showMessageDialog(null,"ID: "+ um.getIdOfSelected(usersList) );
            homeTabAccessChbx.setEnabled(false);
            saveUserButton.setEnabled(false);
            updatePhotoButton.setEnabled(false);
            resetPasswordButton.setEnabled(false);

            settingsComboBox.setEnabled(false);
            updateUserNameCheckBox.setEnabled(false);
            updatePasswordCheckBox.setEnabled(false);
            updatePhotoCheckBox.setEnabled(false);

            String selectIDQuery = "SELECT * FROM users WHERE USERID = ?";
            String completeName,fName,lName,mName;
            try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(selectIDQuery);   ) {
                    
                    try(ResultSet rs = ps.executeQuery();){
                        while(rs.next()){
                             rs.getInt("USERID");
                             userInformationUserNameTextField.setText(rs.getString("USERNAME"));
                             profileTypeComboBox.setSelectedItem(rs.getString("USERTYPE"));
                             userInformation_AccountCreationDate_Date_Label.setText(rs.getString("DATE_CREATED"));
                             lName = (rs.getString("U_LNAME"));
                             fName = (rs.getString("U_FNAME"));
                             mName = (rs.getString("U_MNAME"));
                             completeName=lName+", "+fName+" "+mName;
                             lastNameJtf.setText(lName);
                             firstNameJtf.setText(fName);
                             middleNameJtf.setText(mName);
                        }
                    }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error.\n\n"+e.getMessage());
                JOptionPane.showMessageDialog(null, "Error code: " + e.getErrorCode());
            } 
    }
    
    private void usersListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_usersListValueChanged
//            List myList = fm.getComponentsAsList(userBasicInfoPanel);
//            fm.disableAllJCheckBox(myList);
            disableAllPermissionsCheckBoxes();
            loadAllUserPermissionsSettings();
            loadSelectedUserInformation();
    }//GEN-LAST:event_usersListValueChanged

    private void usersListFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usersListFocusLost
    }//GEN-LAST:event_usersListFocusLost

    private void usersListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usersListFocusGained
    }//GEN-LAST:event_usersListFocusGained

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        
        if(usersList.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null,"Please select the user to delete.");
        }
        else{
            String sqlDelete = "DELETE FROM users WHERE USERID = ?";
            try(Connection con = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps = con.prepareStatement(sqlDelete);) 
            {

                int choice =
                   JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the selected user?");
                if(choice==0){
                    ps.executeUpdate(); //use executeUpdate for INSERT UPDATE DELETE
                    usersList.setSelectedIndex(-1);
//                    deselectAllCheckBoxes();
                }//end of if

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error occured.\n"+e.getMessage());
            } 
        
        }//end of main else
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    private void updatePhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePhotoButtonActionPerformed
       ImageGUIUtil im = new ImageGUIUtil();

        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            photoPlaceholderJLabel.setIcon(im.ResizeImage(path, photoPlaceholderJLabel));
        }
//        else if(result == JFileChooser.CANCEL_OPTION){
//            JOptionPane.showMessageDialog(null,"No file was selected");
//        }
    }//GEN-LAST:event_updatePhotoButtonActionPerformed

    
    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        mode = "edit";
        
        List home             = fm.getComponentsAsList(homePermssionsCheckBoxPanel);
        List adminPermissions = fm.getComponentsAsList(administrationPermissionsCheckBoxPanel);
        List adminCurriculum  = fm.getComponentsAsList(administrationCurriculumCheckBoxPanel);
        List adminDiscounts   = fm.getComponentsAsList(administrationDiscountsCheckBoxPanel);
        List adminSections    = fm.getComponentsAsList(administrationSectionsCheckBoxPanel);
        List adminUsers       = fm.getComponentsAsList(administrationUsersCheckBoxPanel);
        List adminSchedule    = fm.getComponentsAsList(administrationSchedulesCheckBoxPanel);
        List adminYrLevel     = fm.getComponentsAsList(administrationYearLevelsCheckBoxPanel);
        List payment          = fm.getComponentsAsList(paymentPermissionsCheckBoxPanel);
        List registration     = fm.getComponentsAsList(registrationPermissionsCheckBoxPanel);
        List students         = fm.getComponentsAsList(studentsPermissionsCheckBoxPanel);
        List faculty          = fm.getComponentsAsList(facultyPermissionsCheckBoxPanel);
        List reports          = fm.getComponentsAsList(reportsPermissionsCheckBoxPanel);
        List sections         = fm.getComponentsAsList(sectionsPermissionsCheckBoxPanel);
        
        fm.enableFields(home);  fm.enableFields(adminPermissions);  fm.enableFields(adminCurriculum);
        fm.enableFields(adminDiscounts);    fm.enableFields(adminSections); fm.enableFields(adminUsers);
        fm.enableFields(adminSchedule);     fm.enableFields(adminYrLevel);  fm.enableFields(payment);
        fm.enableFields(registration);  fm.enableFields(students);  fm.enableFields(faculty);
        
        if(usersList.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Please select the user to edit.");
        }
        
        else{
        settingsComboBox.setEnabled(true); // enable settings
        updateUserNameCheckBox.setEnabled(true); 
        updatePasswordCheckBox.setEnabled(true);
        updatePhotoCheckBox.setEnabled(true); 
        homeTabAccessChbx.setEnabled(true);
        saveUserButton.setVisible(false);
        saveChangesOnEditButton.setVisible(true);
        updatePhotoButton.setEnabled(true);
        resetPasswordButton.setEnabled(true);
        userInformationUserNameTextField.setEnabled(true);
        profileTypeComboBox.setEnabled(true);
        lastNameJtf.setEnabled(true);
        firstNameJtf.setEnabled(true);
        middleNameJtf.setEnabled(true);
        saveChangesOnEditButton.setEnabled(true);
        }//end of else
        
        mode = ""; // reset mode to empty
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void settingsComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_settingsComboBoxItemStateChanged
        CardLayout cl = (CardLayout)(cardContainerPanel.getLayout());
        cl.addLayoutComponent(homePermissionsPanel, HOME);
        cl.addLayoutComponent(administrationPermissionsPanel, ADMIN);
        cl.addLayoutComponent(administrationCurriculumPanel, ADMIN_CURC);
        cl.addLayoutComponent(administrationDiscountsPanel, ADMIN_DISCOUNTS);
        cl.addLayoutComponent(administrationSchedulesPanel, ADMIN_SCHED);
        cl.addLayoutComponent(administrationSectionsPanel, ADMIN_SECTIONS);
        cl.addLayoutComponent(administrationUsersPanel, ADMIN_USERS);
        cl.addLayoutComponent(administrationYearLevelsPanel, ADMIN_YRLEVEL);
        cl.addLayoutComponent(paymentPermissionsPanel, PAYMENT);
        cl.addLayoutComponent(registrationPermissionsPanel, REGISTRATION);
        cl.addLayoutComponent(studentsPermissionsPanel, STUDENTS);
        cl.addLayoutComponent(facultyPermissionsPanel, FACULTY);
        cl.addLayoutComponent(reportsPermissionsPanel, REPORTS);
        cl.addLayoutComponent(sectionsPermissionsPanel, SECTIONS);
        
        cl.show(cardContainerPanel, (String)evt.getItem());
    }//GEN-LAST:event_settingsComboBoxItemStateChanged

    
    private void settingsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsComboBoxActionPerformed

    private void saveAllPermissionsNewUser(String userName){
        String SQLmainTabs =
            "UPDATE homepermission SET HOME=?,ADMINISTRATION=?,PAYMENT=?,"
                + "REGISTRATION=?,REPORTS=?,STUDENTS=?,SECTIONS=?,FACULTY=? WHERE USERNAME=?";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            PreparedStatement ps = con.prepareStatement(SQLmainTabs);
            ){
            int homeTab     = ( homeTabAccessChbx.isSelected()          ) ?1:0;
            int adminTab    = ( administrationTabAccess.isSelected()    ) ?1:0;
            int paymentTab  = ( paymentTabCheckBox.isSelected()         ) ?1:0;
            int regTab      = ( registrationTabCheckBox.isSelected()    ) ?1:0;
            int reportsTab  = ( reportsTabAccess.isSelected()           ) ?1:0;
            int studentsTab = ( studentsTabAccessCheckBox.isSelected()  ) ?1:0;
            int sectionsTab = ( sectionsTabAccess.isSelected()          ) ?1:0;
            int facultyTab  = ( facultTabAccessCheckBox.isSelected()    ) ?1:0;
            ps.setInt(1, homeTab); ps.setInt(2, adminTab); ps.setInt(3, paymentTab); ps.setInt(4, regTab);
            ps.setInt(5, reportsTab); ps.setInt(6, studentsTab); ps.setInt(7, sectionsTab); ps.setInt(8, facultyTab);
            ps.setString(9, userName);
            ps.executeUpdate(); 
            //==================================================================================
            String SQLhomePermissions =
            "UPDATE allusers_homepermissions SET UPDATE_USERNAME=?,UPDATE_PASSWORD=?,"
                  + "UPDATE_PROFILEPIC=? WHERE USERNAME=?"; 
            try(Connection con1 = DBUtil.getConnection(DBType.MYSQL);
                  PreparedStatement ps1 = con1.prepareStatement(SQLhomePermissions)){
              int updateUserName    = ( updateUserNameCheckBox.isSelected() )   ?1:0;
              int updatePassword    = ( updatePasswordCheckBox.isSelected() )   ?1:0;
              int updateProfilePic  = ( updatePhotoCheckBox.isSelected()    )   ?1:0;
              ps1.setInt(1,updateUserName);  ps1.setInt(2,updatePassword);  ps1.setInt(3,updateProfilePic);
              ps1.setString(4, userName);
              ps1.executeUpdate();
            }
            //=================================================================================
            String SQLadminPermissions =
            "UPDATE allusers_admin_permissions SET CURC_BTN=?,DISCOUNTS_BTN=?,SECTIONS_BTN=?,"
                    + "USERS_BTN=?,SCHEDULING_BTN=?,YRLEVELS_BTN=?,ACCTG_BTN=? WHERE USERNAME=?"; 
            try(Connection con2 = DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps2 = con2.prepareStatement(SQLadminPermissions);)
            {
              int curriculum    = (administrationCurriculumMgmtCheckBox.isSelected()  )   ?1:0;
              int discounts     = (administrationDiscountsMgmtCheckBox.isSelected()   )   ?1:0;
              int sections      = (administrationSectionsMgmtCheckBox.isSelected()    )   ?1:0;
              int users         = (administrationUserMgmtCheckBox.isSelected()        )   ?1:0;
              int scheduling    = (administrationScheduleMgmtCheckBox.isSelected()    )   ?1:0;
              int yearLevels    = (administrationYrLevelMgmtCheckBox.isSelected()     )   ?1:0;
              int accounting    = (accountingMgmtCheckbox.isSelected()                )   ?1:0;
              ps2.setInt(1,curriculum);  ps2.setInt(2,discounts);  ps2.setInt(3,sections);
              ps2.setInt(4, users);      ps2.setInt(5, scheduling);     ps2.setInt(6, yearLevels);
              ps2.setInt(7, accounting);
              ps2.setString(8,userName);
              ps2.executeUpdate();
            }
            //=================================================================================
//            String SQLhomePermissions =
//            "UPDATE allusers_homepermissions SET UPDATE_USERNAME=?,UPDATE_PASSWORD=?,"
//                  + "UPDATE_PROFILEPIC=? WHERE USERNAME=?"; 
//            try(Connection con1 = DBUtil.getConnection(DBType.MYSQL);
//                  PreparedStatement ps1 = con1.prepareStatement(SQLhomePermissions)){
//              int updateUserName    = ( updateUserNameCheckBox.isSelected() )   ?1:0;
//              int updatePassword    = ( updatePasswordCheckBox.isSelected() )   ?1:0;
//              int updateProfilePic  = ( updatePhotoCheckBox.isSelected()    )   ?1:0;
//              ps1.setInt(1,updateUserName);  ps1.setInt(2,updatePassword);  ps1.setInt(3,updateProfilePic);
//              ps1.setString(4, userName);
//              ps1.executeUpdate();
//            }
            //=================================================================================
        }//--end of main try block
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error@updateMainTabs...\n"+e.getMessage());
        }
 
    }
    
    private void saveNewUser(){
        String addNewUserSQL = 
                "INSERT INTO users(USERNAME,PASSWORD,USERTYPE,U_LNAME,U_FNAME,U_MNAME)"
                + "VALUES(?,?,?,?,?,?)";
        try (Connection con = DBUtil.getConnection(DBType.MYSQL);
             PreparedStatement ps = con.prepareStatement(addNewUserSQL);
        ){
            ps.setString(1,userInformationUserNameTextField.getText());
            ps.setString(2,userInformationUserNameTextField.getText());
            ps.setString(3,profileTypeComboBox.getSelectedItem().toString());
            ps.setString(4,lastNameJtf.getText());
            ps.setString(5,firstNameJtf.getText());
            ps.setString(6,middleNameJtf.getText());
            ps.executeUpdate();

          JOptionPane.showMessageDialog(null, "Successully added" + userInformationUserNameTextField.getText());
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null,"Error@saveNewUser: "+ e.getMessage());
        } 
        saveAllPermissionsNewUser(userInformationUserNameTextField.getText());
    }//end of method
    
    private void saveUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUserButtonActionPerformed
        List myList = fm.getComponentsAsList(userBasicInfoPanel);
        
        if(fm.areFieldsEmpty(myList) == false) 
        {
            int confirmAddUser = 
                JOptionPane.showConfirmDialog(null,"Save changes?","Confirm",JOptionPane.YES_NO_OPTION);
            if(confirmAddUser==0){
                saveNewUser(); 
                resetAllFieldsDefaultState();  }
            
        }
        else{ JOptionPane.showMessageDialog(null,"Please fill out all necessary fields"); }
    }//GEN-LAST:event_saveUserButtonActionPerformed

    private void deselectAllPermissionsCheckBoxes(){
       List home             = fm.getComponentsAsList(homePermssionsCheckBoxPanel);
       List adminPermissions = fm.getComponentsAsList(administrationPermissionsCheckBoxPanel);
       List adminCurriculum  = fm.getComponentsAsList(administrationCurriculumCheckBoxPanel);
       List adminDiscounts   = fm.getComponentsAsList(administrationDiscountsCheckBoxPanel);
       List adminSections    = fm.getComponentsAsList(administrationSectionsCheckBoxPanel);
       List adminUsers       = fm.getComponentsAsList(administrationUsersCheckBoxPanel);
       List adminSchedule    = fm.getComponentsAsList(administrationSchedulesCheckBoxPanel);
       List adminYrLevel     = fm.getComponentsAsList(administrationYearLevelsCheckBoxPanel);
       List payment          = fm.getComponentsAsList(paymentPermissionsCheckBoxPanel);
       List registration     = fm.getComponentsAsList(registrationPermissionsCheckBoxPanel);
       List students         = fm.getComponentsAsList(studentsPermissionsCheckBoxPanel);
       List faculty          = fm.getComponentsAsList(facultyPermissionsCheckBoxPanel);
       List reports          = fm.getComponentsAsList(reportsPermissionsCheckBoxPanel);
       List sections         = fm.getComponentsAsList(sectionsPermissionsCheckBoxPanel);  
       
//       fm.clearJCheckBox(home);               fm.clearJCheckBox(adminPermissions);  
//       fm.clearJCheckBox(adminCurriculum);    fm.clearJCheckBox(adminDiscounts);
//       fm.clearJCheckBox(adminSections);      fm.clearJCheckBox(adminUsers);
//       fm.clearJCheckBox(adminSchedule);      fm.clearJCheckBox(adminYrLevel);
//       fm.clearJCheckBox(payment);            fm.clearJCheckBox(registration);
//       fm.clearJCheckBox(students);           fm.clearJCheckBox(faculty);
//       fm.clearJCheckBox(reports);            fm.clearJCheckBox(sections);
    }
    
    private void enableAllPermissionsCheckBoxes(){
       List home             = fm.getComponentsAsList(homePermssionsCheckBoxPanel);
       List adminPermissions = fm.getComponentsAsList(administrationPermissionsCheckBoxPanel);
       List adminCurriculum  = fm.getComponentsAsList(administrationCurriculumCheckBoxPanel);
       List adminDiscounts   = fm.getComponentsAsList(administrationDiscountsCheckBoxPanel);
       List adminSections    = fm.getComponentsAsList(administrationSectionsCheckBoxPanel);
       List adminUsers       = fm.getComponentsAsList(administrationUsersCheckBoxPanel);
       List adminSchedule    = fm.getComponentsAsList(administrationSchedulesCheckBoxPanel);
       List adminYrLevel     = fm.getComponentsAsList(administrationYearLevelsCheckBoxPanel);
       List payment          = fm.getComponentsAsList(paymentPermissionsCheckBoxPanel);
       List registration     = fm.getComponentsAsList(registrationPermissionsCheckBoxPanel);
       List students         = fm.getComponentsAsList(studentsPermissionsCheckBoxPanel);
       List faculty          = fm.getComponentsAsList(facultyPermissionsCheckBoxPanel);
       List reports          = fm.getComponentsAsList(reportsPermissionsCheckBoxPanel);
       List sections         = fm.getComponentsAsList(sectionsPermissionsCheckBoxPanel);  
       
       fm.enableFields(home);               fm.enableFields(adminPermissions);  
       fm.enableFields(adminCurriculum);    fm.enableFields(adminDiscounts);
       fm.enableFields(adminSections);      fm.enableFields(adminUsers);
       fm.enableFields(adminSchedule);      fm.enableFields(adminYrLevel);
       fm.enableFields(payment);            fm.enableFields(registration);
       fm.enableFields(students);           fm.enableFields(faculty);
       fm.enableFields(reports);            fm.enableFields(sections);
    }
    
    private void disableAllPermissionsCheckBoxes(){
       List home             = fm.getComponentsAsList(homePermssionsCheckBoxPanel);
       List adminPermissions = fm.getComponentsAsList(administrationPermissionsCheckBoxPanel);
       List adminCurriculum  = fm.getComponentsAsList(administrationCurriculumCheckBoxPanel);
       List adminDiscounts   = fm.getComponentsAsList(administrationDiscountsCheckBoxPanel);
       List adminSections    = fm.getComponentsAsList(administrationSectionsCheckBoxPanel);
       List adminUsers       = fm.getComponentsAsList(administrationUsersCheckBoxPanel);
       List adminSchedule    = fm.getComponentsAsList(administrationSchedulesCheckBoxPanel);
       List adminYrLevel     = fm.getComponentsAsList(administrationYearLevelsCheckBoxPanel);
       List payment          = fm.getComponentsAsList(paymentPermissionsCheckBoxPanel);
       List registration     = fm.getComponentsAsList(registrationPermissionsCheckBoxPanel);
       List students         = fm.getComponentsAsList(studentsPermissionsCheckBoxPanel);
       List faculty          = fm.getComponentsAsList(facultyPermissionsCheckBoxPanel);
       List reports          = fm.getComponentsAsList(reportsPermissionsCheckBoxPanel);
       List sections         = fm.getComponentsAsList(sectionsPermissionsCheckBoxPanel);  
       
       fm.disableJCheckBox(home);               fm.disableJCheckBox(adminPermissions);  
       fm.disableJCheckBox(adminCurriculum);    fm.disableJCheckBox(adminDiscounts);
       fm.disableJCheckBox(adminSections);      fm.disableJCheckBox(adminUsers);
       fm.disableJCheckBox(adminSchedule);      fm.disableJCheckBox(adminYrLevel);
       fm.disableJCheckBox(payment);            fm.disableJCheckBox(registration);
       fm.disableJCheckBox(students);           fm.disableJCheckBox(faculty);
       fm.disableJCheckBox(reports);            fm.disableJCheckBox(sections);
    }
    
    private void profileTypeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_profileTypeComboBoxItemStateChanged
           List home             = fm.getComponentsAsList(homePermssionsCheckBoxPanel);
           List adminPermissions = fm.getComponentsAsList(administrationPermissionsCheckBoxPanel);
           List adminCurriculum  = fm.getComponentsAsList(administrationCurriculumCheckBoxPanel);
           List adminDiscounts   = fm.getComponentsAsList(administrationDiscountsCheckBoxPanel);
           List adminSections    = fm.getComponentsAsList(administrationSectionsCheckBoxPanel);
           List adminUsers       = fm.getComponentsAsList(administrationUsersCheckBoxPanel);
           List adminSchedule    = fm.getComponentsAsList(administrationSchedulesCheckBoxPanel);
           List adminYrLevel     = fm.getComponentsAsList(administrationYearLevelsCheckBoxPanel);
           List payment          = fm.getComponentsAsList(paymentPermissionsCheckBoxPanel);
           List registration     = fm.getComponentsAsList(registrationPermissionsCheckBoxPanel);
           List students         = fm.getComponentsAsList(studentsPermissionsCheckBoxPanel);
           List faculty          = fm.getComponentsAsList(facultyPermissionsCheckBoxPanel);
           List reports          = fm.getComponentsAsList(reportsPermissionsCheckBoxPanel);
           List sections         = fm.getComponentsAsList(sectionsPermissionsCheckBoxPanel);  
        
        if( (evt.getItem().equals("Administrator")) && (usersList.isSelectionEmpty() == true) ){
           fm.setJCheckBoxSelected(home);               fm.setJCheckBoxSelected(adminPermissions);  
           fm.setJCheckBoxSelected(adminCurriculum);    fm.setJCheckBoxSelected(adminDiscounts);
           fm.setJCheckBoxSelected(adminSections);      fm.setJCheckBoxSelected(adminUsers);
           fm.setJCheckBoxSelected(adminSchedule);      fm.setJCheckBoxSelected(adminYrLevel);
           fm.setJCheckBoxSelected(payment);            fm.setJCheckBoxSelected(registration);
           fm.setJCheckBoxSelected(students);           fm.setJCheckBoxSelected(faculty);
           fm.setJCheckBoxSelected(reports);            fm.setJCheckBoxSelected(sections);
           settingsComboBox.setSelectedItem(ADMIN);
       }
       else if( (evt.getItem().toString().equals("Faculty Member")) && (usersList.isSelectionEmpty() == true) ){
           deselectAllPermissionsCheckBoxes();
           settingsComboBox.setSelectedItem(FACULTY);
           fm.setJCheckBoxSelected(home);   fm.setJCheckBoxSelected(faculty); 
       }
       else if( (evt.getItem().toString().equals("Registrar")) && (usersList.isSelectionEmpty() == true) ){
           deselectAllPermissionsCheckBoxes();
           CardLayout cl = (CardLayout)(cardContainerPanel.getLayout());
           settingsComboBox.setSelectedItem(REGISTRATION);
           fm.setJCheckBoxSelected(home);   fm.setJCheckBoxSelected(registration); 
       }
       else if( (evt.getItem().toString().equals("Accountant")) && (usersList.isSelectionEmpty() == true) ){
           deselectAllPermissionsCheckBoxes();
           CardLayout cl = (CardLayout)(cardContainerPanel.getLayout());
           settingsComboBox.setSelectedItem(PAYMENT);
           fm.setJCheckBoxSelected(home);   fm.setJCheckBoxSelected(payment); 
       }
       else if( (evt.getItem().toString().equals("None Selected")) && (usersList.isSelectionEmpty() == true) ){
           deselectAllPermissionsCheckBoxes();
           settingsComboBox.setSelectedItem(HOME);
       }
       
    }//GEN-LAST:event_profileTypeComboBoxItemStateChanged

 /*=========== START OF UPDATE USER METHODS =========================================== */
    private boolean updateUserInformation(){
        Boolean bool=null;
        String sqlUpdate=
                "UPDATE users SET USERNAME=?, USERTYPE=?,U_LNAME=?,U_FNAME=?,U_MNAME=?"
                +"WHERE USERID=? ";        
        try( Connection con = DBUtil.getConnection(DBType.MYSQL);
            PreparedStatement ps = con.prepareStatement(sqlUpdate); ) 
        {
            ps.setString( 1,userInformationUserNameTextField.getText());
            ps.setString( 2,profileTypeComboBox.getSelectedItem().toString());
            ps.setString( 3,lastNameJtf.getText() );
            ps.setString( 4,firstNameJtf.getText() );
            ps.setString( 5,middleNameJtf.getText() );
            
            int choice = JOptionPane.showConfirmDialog(null, "Save changes to "+userInformationUserNameTextField.getText());
            if(choice==0){
                ps.executeUpdate();
                bool = true;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error occured while editing.\n"+e.getMessage());
            bool = false;
        }
            return bool;
    }   
    
    private boolean updateUserFacultyTabPermissions(){
        Boolean bool=null;        
        String updateSql = "UPDATE users_faculty_permissions "
                + "SET ADD_FACULTY_MEMBER=?, "
                + "EDIT_FACULTY_MEMBER_INFO=?, "
                + "REMOVE_FACULTY_MEMBER=?, "
                + "VIEW_FACULTYMEMBER_INFO=?,"
                + "SET_FACULTYMEMBER_STATUS=? "
                + "WHERE USERID=? ";
        try(Connection con=DBUtil.getConnection(DBType.MYSQL);
            PreparedStatement ps=con.prepareStatement(updateSql);
        ){
            int addFacultyMember = (addFacultyMemberCheckbox.isSelected()) ?1:0;
            int editFacultyMember = (editFacultyMemberCheckbox.isSelected()) ?1:0;
            int removeFacultyMember = (removeFacultyMemberCheckbox.isSelected()) ?1:0;
            int viewFacultyMember = (viewFacultyMemberInfoCheckbox.isSelected()) ?1:0;
            int setFacultyMemberStatus = (setFacultyMemberStatusCheckbox.isSelected()) ?1:0;
                    
            ps.setInt(1,addFacultyMember); ps.setInt(2,editFacultyMember);
            ps.setInt(3, removeFacultyMember); ps.setInt(4,viewFacultyMember );
            ps.setInt(5, setFacultyMemberStatus);
            
            ps.executeUpdate();
            bool = true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error@updateUserFacultyTabPermissions()\n"+e.getMessage());
            bool = false;
        }
            return bool;
    }
    
    private boolean updateUserHomePermissions(){
        ArrayList<JCheckBox> homeCheckBoxes = new ArrayList<>();
            homeCheckBoxes.add(updateUserNameCheckBox); // 0
            homeCheckBoxes.add(updatePasswordCheckBox); // 1
            homeCheckBoxes.add(updatePhotoCheckBox);  // 2
        Boolean bool=null;
        
        String sqlUpdateSettings = 
         "UPDATE ALLUSERS_HOMEPERMISSIONS SET UPDATE_USERNAME=?,UPDATE_PASSWORD=?,UPDATE_PROFILEPIC=? WHERE USERID=?";
        try 
           (Connection con=DBUtil.getConnection(DBType.MYSQL); 
           PreparedStatement ps=con.prepareStatement(sqlUpdateSettings);){
            int x=1;
            int value=0;
            for(JCheckBox chbx : homeCheckBoxes){
                if(chbx.isSelected()==true) { value=1; }
                else if(chbx.isSelected()==false) { value=0; }
                    ps.setInt(x,value);
                x++;
            }// -- end of for loop
           ps.executeUpdate();
           bool = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error.\n"+ex.getMessage());
            bool = false;
        }
            return bool;
    }//-- end of method
    
    private boolean updateMainTabsAccess(){
        Boolean bool=null;
        
        String updateSql =
            "UPDATE homepermission SET HOME=?,ADMINISTRATION=?,PAYMENT=?,"
                + "REGISTRATION=?,REPORTS=?,STUDENTS=?,SECTIONS=?,FACULTY=? WHERE USERID=?";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            PreparedStatement ps = con.prepareStatement(updateSql);){
            int homeTab = ( homeTabAccessChbx.isSelected() ) ?1:0;
            int adminTab = ( administrationTabAccess.isSelected() ) ?1:0;
            int paymentTab = ( paymentTabCheckBox.isSelected() ) ?1:0;
            int regTab = ( registrationTabCheckBox.isSelected() ) ?1:0;
            int reportsTab = ( reportsTabAccess.isSelected() ) ?1:0;
            int studentsTab = ( studentsTabAccessCheckBox.isSelected() ) ?1:0;
            int sectionsTab = ( sectionsTabAccess.isSelected() ) ?1:0;
            int facultyTab = ( facultTabAccessCheckBox.isSelected() ) ?1:0;
            
            ps.setInt(1, homeTab); ps.setInt(2, adminTab); ps.setInt(3, paymentTab); ps.setInt(4, regTab);
            ps.setInt(5, reportsTab); ps.setInt(6, studentsTab); ps.setInt(7, sectionsTab); ps.setInt(8, facultyTab);
            
            ps.executeUpdate(); 
            bool = true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error@updateMainTabs...\n"+e.getMessage());
            bool = false;
        }
        return bool;
    }
    
    private boolean updateUserPaymentTabPermissions(){
        Boolean bool=null;
        
        String updateSql =
            "UPDATE allusers_payment_permissions SET PROCESS_PAYMENT=?, SEARCH_VIEW_ACCOUNTS=?, "
                + "DEACTIVATE_ACCOUNTS=?, "
                + "REMOVE_ARCHIVE_ACCOUNTS=?, MODIFY_ACCOUNTS=? WHERE USERID=?";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            PreparedStatement ps = con.prepareStatement(updateSql);){
            
            int processPayment = ( processPaymentCheckBox.isSelected() ) ?1:0;
            int searchAndViewAccounts = ( viewAccountsCheckBox.isSelected() ) ?1:0;
            int deactivateAcconts = ( deactivateAccountCheckBox.isSelected() ) ?1:0;
            int removeAndArchiveAccounts = ( removeAccountsCheckBox.isSelected() ) ?1:0;
            int modifyAccounts = ( modifyAccountCheckBox.isSelected() ) ?1:0;
            
            ps.setInt(1, processPayment); ps.setInt(2, searchAndViewAccounts); ps.setInt(3, deactivateAcconts); 
            ps.setInt(4, removeAndArchiveAccounts);
            
            ps.executeUpdate();
            bool = true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error@updateUserPaymentTabPermissions()\n"+e.getMessage());
            bool = false;
        }
        return bool;
    }
    
    private boolean updateUserRegistrationTabPermissions(){
        Boolean bool=null;
        
        String updateSql =
            "UPDATE allusers_registration_permissions "
                + "SET REGISTER_STUDENT=?, DELETE_EXISTING_REGISTRATION=?,"
                + "VIEW_REGISTRATION_RECORD=?, EDIT_REGISTRATION_RECORD=? WHERE USERID=?";
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            PreparedStatement ps = con.prepareStatement(updateSql);){
            int registerStudent = ( registerStudentCheckBox.isSelected() ) ?1:0;
            int deleteExistingRegistration = ( deleteRegistrationCheckBox.isSelected() ) ?1:0;
            int viewRegistrationRecord = ( viewRegisteredStudentCheckBox.isSelected() ) ?1:0;
            int editRegistrationRecord = ( editRegistrationInfoCheckBox.isSelected() ) ?1:0;
            
            ps.setInt(1, registerStudent); 
            ps.setInt(2, deleteExistingRegistration); 
            ps.setInt(3, viewRegistrationRecord); 
            ps.setInt(4, editRegistrationRecord);
            
            ps.executeUpdate(); 
            bool = true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error@updateUserRegistrationTabPermissions()\n"+e.getMessage());
            bool = false;
        }
        
        return bool;
    }
    
    private boolean updateUserReportsTabPermissions(){
        Boolean bool = null;
        return bool;
    }
    
    private boolean updateUserSectionsTabPermissions(){
        Boolean bool = null;
        return bool;
    }
    
    private boolean updateUserStudentsTabPermissions(){
        Boolean bool = null;
        
        String updateSql =
            " UPDATE allusers_students_permissions" 
          + " SET SEARCH_VIEW_STUDENT=?,"
          + " ADD_NEW_STUDENT_RECORD=?,"
          + " EDIT_STUDENT_RECORD=?,"
          + " DELETE_STUDENT_RECORD=? "
          + " WHERE USERID=? " ;
        try(Connection con = DBUtil.getConnection(DBType.MYSQL);
            PreparedStatement ps = con.prepareStatement(updateSql);){
            int searchAndViewStudent = ( registerStudentCheckBox.isSelected() ) ?1:0;
            int addNewStudent = ( deleteRegistrationCheckBox.isSelected() ) ?1:0;
            int editStudent = ( viewRegisteredStudentCheckBox.isSelected() ) ?1:0;
            int deleteStudent = ( editRegistrationInfoCheckBox.isSelected() ) ?1:0;
            
            ps.setInt(1, searchAndViewStudent); 
            ps.setInt(2, addNewStudent); 
            ps.setInt(3, editStudent); 
            ps.setInt(4, deleteStudent);
            
            ps.executeUpdate(); 
            bool = true;
        }//-- end of try
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error@updateUserStudentsTabPermissions()\n"+e.getMessage());
            bool = false;
        }
        return bool;
    }
    
    private void saveChangesOnEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesOnEditButtonActionPerformed
        updateMainTabsAccess();
        updateUserPaymentTabPermissions();
        updateUserRegistrationTabPermissions();
        updateUserStudentsTabPermissions();
        updateUserFacultyTabPermissions();
        updateUserHomePermissions(); //saves any update made on existing user settings/permissions
        updateUserInformation(); // sasve any update made on existing user information such as username
    }//GEN-LAST:event_saveChangesOnEditButtonActionPerformed

/*=============== END OF UPDATE USER METHODS =======================================================*/    
    
/*================ START OF LOAD USER PERMISSIONS METHODS ========================================*/
    private void loadAllUserPermissionsSettings(){
        loadUserMainTabsPermissions(); // --MainTabs
        loadUserHomePermissions(); // --Home
        loadUserFacultyPermissions(); // --Faculty
        loadUserPaymentPermissions(); // --Payment
        loadUserRegistrationPermissions(); // --Registration
        loadUserReportsPermissions(); // -- Reports
        loadUserSectionsPermissions(); // -- Sections
        loadUserStudentsPermissions(); // --Students
    }
    
    private void loadUserHomePermissions(){
        String selectAllUsersHomePermissions = "SELECT * FROM allusers_homepermissions WHERE USERID=? ";
        try(Connection con=DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps=con.prepareStatement(selectAllUsersHomePermissions);
                
        ){
            try(ResultSet rs=ps.executeQuery(); ){
                while(rs.next() ){
                    updateUserNameCheckBox.setSelected( rs.getBoolean("UPDATE_USERNAME") );
                    updatePasswordCheckBox.setSelected( rs.getBoolean("UPDATE_PASSWORD") );
                    updatePhotoCheckBox.setSelected( rs.getBoolean("UPDATE_PROFILEPIC") );
                }
            }//--end of nested try
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error@loadUserHomePermissions\n"+ ex.getMessage());
        }
    }//-- end of method
    
    private void loadUserMainTabsPermissions(){
        String selectMainTabsPermissions="SELECT * FROM homepermission WHERE USERID=?";
        try(Connection con=DBUtil.getConnection(DBType.MYSQL);
           PreparedStatement ps=con.prepareStatement(selectMainTabsPermissions);
        ){
           try(ResultSet rs=ps.executeQuery(); ){
               while(rs.next()){ 
                   homeTabAccessChbx.setSelected( rs.getBoolean("HOME") );
                   administrationTabAccess.setSelected( rs.getBoolean("ADMINISTRATION") );
                   paymentTabCheckBox.setSelected( rs.getBoolean("PAYMENT") );
                   registrationTabCheckBox.setSelected( rs.getBoolean("REGISTRATION") );
                   reportsTabAccess.setSelected( rs.getBoolean("REPORTS") );
                   studentsTabAccessCheckBox.setSelected( rs.getBoolean("STUDENTS") );
                   sectionsTabAccess.setSelected( rs.getBoolean("SECTIONS") );
                   facultTabAccessCheckBox.setSelected( rs.getBoolean("FACULTY") );
               }
           }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error@loadAllUserPermissionsSettings\n"+e.getMessage());
        } 
    }//--end of method
    
    private void loadUserFacultyPermissions(){
        String selectUserFacultyPermissions="SELECT * FROM allusers_faculty_permissions WHERE USERID=?";
        try(Connection con=DBUtil.getConnection(DBType.MYSQL);
           PreparedStatement ps=con.prepareStatement(selectUserFacultyPermissions);
        ){
           try(ResultSet rs=ps.executeQuery(); ){
               while(rs.next()){ 
                   addFacultyMemberCheckbox.setSelected( rs.getBoolean("ADD_FACULTY_MEMBER") );
                   editFacultyMemberCheckbox.setSelected( rs.getBoolean("EDIT_FACULTY_MEMBER_INFO") );
                   removeFacultyMemberCheckbox.setSelected( rs.getBoolean("REMOVE_FACULTY_MEMBER") );
                   viewFacultyMemberInfoCheckbox.setSelected( rs.getBoolean("VIEW_FACULTYMEMBER_INFO") );
                   setFacultyMemberStatusCheckbox.setSelected( rs.getBoolean("SET_FACULTYMEMBER_STATUS") );
               }
           }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error@loadAllUserPermissionsSettings\n"+e.getMessage());
        } 
    }
    
    private void loadUserPaymentPermissions(){
        String selectAllUsersPaymentPermissions = "SELECT * FROM allusers_payment_permissions WHERE USERID=? ";
        try(Connection con=DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps=con.prepareStatement(selectAllUsersPaymentPermissions);
        ){
            try(ResultSet rs=ps.executeQuery(); ){
                while(rs.next() ){
                    processPaymentCheckBox.setSelected( rs.getBoolean("PROCESS_PAYMENT") );
                    viewAccountsCheckBox.setSelected( rs.getBoolean("SEARCH_VIEW_ACCOUNTS") );
                    deactivateAccountCheckBox.setSelected( rs.getBoolean("DEACTIVATE_ACCOUNTS") );
                    removeAccountsCheckBox.setSelected( rs.getBoolean("REMOVE_ARCHIVE_ACCOUNTS") );
                    modifyAccountCheckBox.setSelected( rs.getBoolean("MODIFY_ACCOUNTS") );
                }
            }//--end of nested try
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error@loadUserHomePermissions\n"+ ex.getMessage());
        }
    }
    
    private void loadUserRegistrationPermissions(){
        String selectAllUsersRegistrationPermissions = "SELECT * FROM allusers_registration_permissions  WHERE USERID=? ";
        try(Connection con=DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps=con.prepareStatement(selectAllUsersRegistrationPermissions);
                
        ){
            try(ResultSet rs=ps.executeQuery(); ){
                while(rs.next() ){
                    registerStudentCheckBox.setSelected( rs.getBoolean("REGISTER_STUDENT") );
                    deleteRegistrationCheckBox.setSelected( rs.getBoolean("DELETE_EXISTING_REGISTRATION") );
                    viewRegisteredStudentCheckBox.setSelected( rs.getBoolean("VIEW_REGISTRATION_RECORD") );
                    editRegistrationInfoCheckBox.setSelected( rs.getBoolean("EDIT_REGISTRATION_RECORD") );
                }
            }//--end of nested try
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error@loadUserRegistrationPermissions\n"+ ex.getMessage());
        }
    }
    
    private void loadUserReportsPermissions(){
        String selectAllUsersReportsPermissions = "SELECT * FROM allusers_reports_permissions WHERE USERID=? ";
        try(Connection con=DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps=con.prepareStatement(selectAllUsersReportsPermissions);
        ){
            try(ResultSet rs=ps.executeQuery(); ){
                while(rs.next() ){
                    
                }
            }//--end of nested try
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error@loadUserReportsPermissions\n"+ ex.getMessage());
        }
    }
    
    private void loadUserSectionsPermissions(){
        String selectAllUsersReportsPermissions = "SELECT * FROM allusers_sections_permissions WHERE USERID=? ";
        try(Connection con=DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps=con.prepareStatement(selectAllUsersReportsPermissions);
        ){
            try(ResultSet rs=ps.executeQuery(); ){
                while(rs.next() ){
                    
                }
            }//--end of nested try
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error@loadUserSectionsPermissions\n"+ ex.getMessage());
        }
    }
    
    private void loadUserStudentsPermissions(){
        String selectAllUsersStudentsPermissions = "SELECT * FROM allusers_students_permissions WHERE USERID=? ";
        try(Connection con=DBUtil.getConnection(DBType.MYSQL);
                PreparedStatement ps=con.prepareStatement(selectAllUsersStudentsPermissions);
        ){
            try(ResultSet rs=ps.executeQuery(); ){
                while(rs.next() ){
                   searchAndViewStudentRecord.setSelected( rs.getBoolean("SEARCH_VIEW_STUDENT") );
                   addNewStudentRecordCheckBox.setSelected( rs.getBoolean("ADD_NEW_STUDENT_RECORD") );
                   editStudentRecordCheckBox.setSelected( rs.getBoolean("EDIT_STUDENT_RECORD") );
                   deleteStudentRecordCheckBox.setSelected( rs.getBoolean("DELETE_STUDENT_RECORD") );
                }
            }//--end of nested try
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error@loadUserStudentsPermissions()\n"+ ex.getMessage());
        }
    }
    
    private void paymentTabCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentTabCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentTabCheckBoxActionPerformed

    private void registrationTabCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationTabCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrationTabCheckBoxActionPerformed

    private void viewArchivedUserCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewArchivedUserCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewArchivedUserCheckBoxActionPerformed

    private void editStudentRecordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentRecordCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editStudentRecordCheckBoxActionPerformed

    private void facultTabAccessCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultTabAccessCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultTabAccessCheckBoxActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Manage_Users_tab;
    private javax.swing.JScrollPane Teachers;
    private javax.swing.JPanel UserInformation;
    private javax.swing.JLabel UserInformation_AccountCreationDate_Label;
    private javax.swing.JPanel User_Accounts;
    private javax.swing.JCheckBox accountingMgmtCheckbox;
    private javax.swing.JPanel addDeleteUserPanel;
    private javax.swing.JCheckBox addFacultyMemberCheckbox;
    private javax.swing.JCheckBox addNewStudentRecordCheckBox;
    private javax.swing.JCheckBox addNewUserCheckBox;
    private javax.swing.JPanel addUserButtonsPanel;
    private javax.swing.JPanel administrationCurriculumCheckBoxPanel;
    private javax.swing.JCheckBox administrationCurriculumMgmtCheckBox;
    private javax.swing.JPanel administrationCurriculumPanel;
    private javax.swing.JScrollPane administrationCurriculumScrollPane;
    private javax.swing.JPanel administrationDiscountsCheckBoxPanel;
    private javax.swing.JCheckBox administrationDiscountsMgmtCheckBox;
    private javax.swing.JPanel administrationDiscountsPanel;
    private javax.swing.JScrollPane administrationDiscountsScrollPane;
    private javax.swing.JPanel administrationPermissionsCheckBoxPanel;
    private javax.swing.JPanel administrationPermissionsPanel;
    private javax.swing.JScrollPane administrationPermissionsScrollPane;
    private javax.swing.JCheckBox administrationScheduleMgmtCheckBox;
    private javax.swing.JPanel administrationSchedulesCheckBoxPanel;
    private javax.swing.JPanel administrationSchedulesPanel;
    private javax.swing.JScrollPane administrationSchedulesScrollPane;
    private javax.swing.JPanel administrationSectionsCheckBoxPanel;
    private javax.swing.JCheckBox administrationSectionsMgmtCheckBox;
    private javax.swing.JPanel administrationSectionsPanel;
    private javax.swing.JScrollPane administrationSectionsScrollPane;
    private javax.swing.JCheckBox administrationTabAccess;
    private javax.swing.JCheckBox administrationUserMgmtCheckBox;
    private javax.swing.JPanel administrationUsersCheckBoxPanel;
    private javax.swing.JPanel administrationUsersPanel;
    private javax.swing.JScrollPane administrationUsersScrollPane;
    private javax.swing.JPanel administrationYearLevelsCheckBoxPanel;
    private javax.swing.JPanel administrationYearLevelsPanel;
    private javax.swing.JScrollPane administrationYearLevelsScrollPane;
    private javax.swing.JCheckBox administrationYrLevelMgmtCheckBox;
    private javax.swing.JPanel allPermissionsJPanel;
    private javax.swing.JCheckBox applyDiscountCheckBox;
    private javax.swing.JPanel cardContainerPanel;
    private javax.swing.JCheckBox createDiscountCheckBox;
    private javax.swing.JCheckBox createNewSubjectPermissionCheckbox;
    private javax.swing.JCheckBox createScheduleCheckBox;
    private javax.swing.JCheckBox createSectionCheckbox;
    private javax.swing.JCheckBox curriculumCreatorTabCheckBox;
    private javax.swing.JCheckBox deactivateAccountCheckBox;
    private javax.swing.JCheckBox deactivateDiscountCheckBox;
    private javax.swing.JCheckBox deleteCurriculumButtonPermissionCheckbox;
    private javax.swing.JCheckBox deleteRegistrationCheckBox;
    private javax.swing.JCheckBox deleteStudentRecordCheckBox;
    private javax.swing.JCheckBox deleteSubjectButtonPermissionCheckbox;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JCheckBox editCurriculumButtonPermissionCheckbox;
    private javax.swing.JCheckBox editDiscountSpecificationCheckBox;
    private javax.swing.JCheckBox editFacultyMemberCheckbox;
    private javax.swing.JCheckBox editRegistrationInfoCheckBox;
    private javax.swing.JCheckBox editScheduleCheckBox;
    private javax.swing.JCheckBox editSectionGeneralSettingsCheckbox;
    private javax.swing.JCheckBox editSectionSpecificationCheckbox;
    private javax.swing.JCheckBox editStudentRecordCheckBox;
    private javax.swing.JCheckBox editSubjectCheckBox;
    private javax.swing.JButton editUserButton;
    private javax.swing.JCheckBox editUserInformationCheckBox;
    private javax.swing.JCheckBox editUserPermissionsCheckBox;
    private javax.swing.JCheckBox editUserProfileTypeCheckBox;
    private javax.swing.JCheckBox facultTabAccessCheckBox;
    private javax.swing.JPanel facultyPermissionsCheckBoxPanel;
    private javax.swing.JPanel facultyPermissionsPanel;
    private javax.swing.JScrollPane facultyPermissionsScrollPane;
    private javax.swing.JTextField firstNameJtf;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JPanel homePermissionsPanel;
    private javax.swing.JScrollPane homePermissionsScrollPane;
    private javax.swing.JPanel homePermssionsCheckBoxPanel;
    private javax.swing.JCheckBox homeTabAccessChbx;
    private javax.swing.JTextField lastNameJtf;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel leftContainerPanel;
    private javax.swing.JTextField middleNameJtf;
    private javax.swing.JLabel middleNameLabel;
    private javax.swing.JCheckBox modifyAccountCheckBox;
    private javax.swing.JCheckBox newCurriculumButtonPermissionCheckbox;
    private javax.swing.JButton newUserButton;
    private javax.swing.JPanel paymentPermissionsCheckBoxPanel;
    private javax.swing.JPanel paymentPermissionsPanel;
    private javax.swing.JScrollPane paymentPermissionsScrollPane;
    private javax.swing.JCheckBox paymentTabCheckBox;
    private javax.swing.JLabel permissionsSettingsLabel;
    private javax.swing.JPanel photoPanel;
    private javax.swing.JLabel photoPlaceholderJLabel;
    private javax.swing.JCheckBox processPaymentCheckBox;
    private javax.swing.JComboBox profileTypeComboBox;
    private javax.swing.JLabel profileTypeLabel;
    private javax.swing.JCheckBox registerStudentCheckBox;
    private javax.swing.JPanel registrationPermissionsCheckBoxPanel;
    private javax.swing.JPanel registrationPermissionsPanel;
    private javax.swing.JScrollPane registrationPermissionsScrollPane;
    private javax.swing.JCheckBox registrationTabCheckBox;
    private javax.swing.JCheckBox removeAccountsCheckBox;
    private javax.swing.JCheckBox removeDiscountsCheckbox;
    private javax.swing.JCheckBox removeFacultyMemberCheckbox;
    private javax.swing.JCheckBox removeScheduleCheckBox;
    private javax.swing.JCheckBox removeSectionCheckBox;
    private javax.swing.JCheckBox removeUserCheckBox;
    private javax.swing.JPanel reportsPermissionsCheckBoxPanel;
    private javax.swing.JPanel reportsPermissionsPanel;
    private javax.swing.JScrollPane reportsPermissionsScrollPane;
    private javax.swing.JCheckBox reportsTabAccess;
    private javax.swing.JButton resetPasswordButton;
    private javax.swing.JCheckBox resetUserPasswordCheckBox;
    private javax.swing.JPanel rightContainerPanel;
    private javax.swing.JPanel saveButtonPanel;
    private javax.swing.JButton saveChangesOnEditButton;
    private javax.swing.JButton saveUserButton;
    private javax.swing.JCheckBox searchAndViewStudentRecord;
    private javax.swing.JPanel sectionsPermissionsCheckBoxPanel;
    private javax.swing.JPanel sectionsPermissionsPanel;
    private javax.swing.JScrollPane sectionsPermissionsScrollPane;
    private javax.swing.JCheckBox sectionsTabAccess;
    private javax.swing.JCheckBox setFacultyMemberStatusCheckbox;
    private javax.swing.JComboBox<String> settingsComboBox;
    private javax.swing.JPanel settingstButtonPanel;
    private javax.swing.JPanel studentsPermissionsCheckBoxPanel;
    private javax.swing.JPanel studentsPermissionsPanel;
    private javax.swing.JScrollPane studentsPermissionsScrollPane;
    private javax.swing.JCheckBox studentsTabAccessCheckBox;
    private javax.swing.JCheckBox subjectsTabCheckBox;
    private javax.swing.JCheckBox updatePasswordCheckBox;
    private javax.swing.JButton updatePhotoButton;
    private javax.swing.JCheckBox updatePhotoCheckBox;
    private javax.swing.JCheckBox updateUserNameCheckBox;
    private javax.swing.JPanel userBasicInfoPanel;
    private javax.swing.JLabel userInformationUserNameLabel;
    private javax.swing.JTextField userInformationUserNameTextField;
    private javax.swing.JLabel userInformation_AccountCreationDate_Date_Label;
    private javax.swing.JPanel userProfilePicPanel;
    private javax.swing.JList usersList;
    private javax.swing.JCheckBox viewAccountsCheckBox;
    private javax.swing.JCheckBox viewArchivedUserCheckBox;
    private javax.swing.JCheckBox viewFacultyMemberInfoCheckbox;
    private javax.swing.JCheckBox viewRegisteredStudentCheckBox;
    private javax.swing.JCheckBox viewStudentDiscountCheckbox;
    // End of variables declaration//GEN-END:variables
}
