package gui;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import component_model_loader.ImageGUIUtil;
import utility.PasswordUtil;
import gui.TopContainer;
import daoimpl.LoginDaoImpl;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class LoginForm extends javax.swing.JFrame {
//ImageIcon is used for JLABELs
    // Image is used for JPANELS

    private static int loginAttemptCount = 0;
    Image usernameIcon;
    Image passwordIcon;
    Image loginBgIcon;

    public LoginForm() {
        initComponents();
        loginBgIcon = new ImageGUIUtil().getResourceImage("assets/LoginBgImage.jpg", jpnlBody);

        usernameIcon = new ImageGUIUtil().getResourceImage("assets/usernameIcon.png", jpnlUserNameIconContainer);
        passwordIcon = new ImageGUIUtil().getResourceImage("assets/password.png", jpnlPasswordIconContainer);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jpnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnlBody = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(loginBgIcon,0,0,getWidth(),getHeight(),this);
                repaint();
            }
        };
        jpnlSubBody = new javax.swing.JPanel();
        jpnlUserLoginHeader = new javax.swing.JPanel();
        jlblUserLogin = new javax.swing.JLabel();
        jbtnExitProgram = new javax.swing.JButton();
        jpnlUserLogin = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jpnlUserNameLabel = new javax.swing.JPanel();
        jlblUserName = new javax.swing.JLabel();
        jpnlUserNameField = new javax.swing.JPanel();
        jtfUserName = new javax.swing.JTextField();
        jpnlUserNameIconContainer = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(usernameIcon,0,0,getWidth(),getHeight(),this);
                repaint();
            }

        };
        jpnlPasswordLabel = new javax.swing.JPanel();
        jlblPassword = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jpnlPasswordIconContainer = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(passwordIcon,0,0,getWidth(),getHeight(),this);
                repaint();
            }
        };
        jpfPasswordField = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jbtnSignIn = new javax.swing.JButton();
        jlblForgotPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("LoginFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jpnlHeader.setBackground(new java.awt.Color(0, 114, 188));
        jpnlHeader.setPreferredSize(new java.awt.Dimension(607, 35));
        jpnlHeader.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mother of Perpetual Help School Enrollment System");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jpnlHeader.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(jpnlHeader, gridBagConstraints);

        jpnlBody.setOpaque(false);
        jpnlBody.setPreferredSize(new java.awt.Dimension(607, 280));
        jpnlBody.setLayout(new java.awt.GridBagLayout());

        jpnlSubBody.setOpaque(false);
        jpnlSubBody.setLayout(new java.awt.GridBagLayout());

        jpnlUserLoginHeader.setOpaque(false);
        jpnlUserLoginHeader.setLayout(new java.awt.GridBagLayout());

        jlblUserLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlblUserLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlblUserLogin.setText("User Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
        jpnlUserLoginHeader.add(jlblUserLogin, gridBagConstraints);

        jbtnExitProgram.setBackground(new java.awt.Color(255, 255, 255));
        jbtnExitProgram.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtnExitProgram.setForeground(new java.awt.Color(255, 255, 255));
        jbtnExitProgram.setText("Exit Program");
        jbtnExitProgram.setBorder(null);
        jbtnExitProgram.setBorderPainted(false);
        jbtnExitProgram.setOpaque(false);
        jbtnExitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitProgramActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 20);
        jpnlUserLoginHeader.add(jbtnExitProgram, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jpnlSubBody.add(jpnlUserLoginHeader, gridBagConstraints);

        jpnlUserLogin.setOpaque(false);
        jpnlUserLogin.setPreferredSize(new java.awt.Dimension(300, 180));
        jpnlUserLogin.setLayout(new java.awt.GridBagLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jpnlUserNameLabel.setOpaque(false);
        jpnlUserNameLabel.setLayout(new java.awt.GridBagLayout());

        jlblUserName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlblUserName.setForeground(new java.awt.Color(255, 255, 255));
        jlblUserName.setText("Username :");
        jpnlUserNameLabel.add(jlblUserName, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jpnlUserNameLabel, gridBagConstraints);

        jpnlUserNameField.setBackground(new java.awt.Color(255, 255, 255));
        jpnlUserNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnlUserNameField.setPreferredSize(new java.awt.Dimension(235, 40));
        jpnlUserNameField.setLayout(new java.awt.GridBagLayout());

        jtfUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfUserName.setBorder(null);
        jtfUserName.setPreferredSize(new java.awt.Dimension(180, 15));
        jtfUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfUserNameMouseClicked(evt);
            }
        });
        jtfUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUserNameActionPerformed(evt);
            }
        });
        jtfUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfUserNameKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnlUserNameField.add(jtfUserName, gridBagConstraints);

        jpnlUserNameIconContainer.setBackground(new java.awt.Color(255, 255, 255));
        jpnlUserNameIconContainer.setOpaque(false);
        jpnlUserNameIconContainer.setPreferredSize(new java.awt.Dimension(20, 20));
        jpnlUserNameIconContainer.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 6);
        jpnlUserNameField.add(jpnlUserNameIconContainer, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jpnlUserNameField, gridBagConstraints);

        jpnlPasswordLabel.setOpaque(false);
        jpnlPasswordLabel.setLayout(new java.awt.GridBagLayout());

        jlblPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlblPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlblPassword.setText("Password :");
        jpnlPasswordLabel.add(jlblPassword, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jpnlPasswordLabel, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jpnlPasswordIconContainer.setBackground(new java.awt.Color(255, 255, 255));
        jpnlPasswordIconContainer.setOpaque(false);
        jpnlPasswordIconContainer.setPreferredSize(new java.awt.Dimension(20, 20));
        jpnlPasswordIconContainer.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 6);
        jPanel4.add(jpnlPasswordIconContainer, gridBagConstraints);

        jpfPasswordField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpfPasswordField.setBorder(null);
        jpfPasswordField.setPreferredSize(new java.awt.Dimension(180, 15));
        jpfPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpfPasswordFieldMouseClicked(evt);
            }
        });
        jpfPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpfPasswordFieldKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(jpfPasswordField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        jPanel2.add(jPanel4, gridBagConstraints);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jbtnSignIn.setBackground(new java.awt.Color(0, 114, 188));
        jbtnSignIn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSignIn.setText("Sign In");
        jbtnSignIn.setPreferredSize(new java.awt.Dimension(71, 30));
        jbtnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSignInActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel5.add(jbtnSignIn, gridBagConstraints);

        jlblForgotPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jlblForgotPassword.setForeground(new java.awt.Color(0, 153, 255));
        jlblForgotPassword.setText("Forgot Password");
        jlblForgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel5.add(jlblForgotPassword, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        jPanel2.add(jPanel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 200, 0, 0);
        jpnlUserLogin.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jpnlSubBody.add(jpnlUserLogin, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jpnlBody.add(jpnlSubBody, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(jpnlBody, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validateLogin(){
        String usernameStr = jtfUserName.getText().trim();
        char[] charPassword = jpfPasswordField.getPassword();
        String stringPassword = PasswordUtil.toString(charPassword);

        if (usernameStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your username.");
        } else if (stringPassword.isEmpty() && usernameStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "You didn't enter any information!\n Please try again!");
        } else if (usernameStr.equals("enter username")) {
            JOptionPane.showMessageDialog(null, "Please enter your username");
        } else if (stringPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your password");
        } else if (LoginDaoImpl.isValid(usernameStr, stringPassword)) {
            if (LoginDaoImpl.isLocked(usernameStr)) {
                JOptionPane.showMessageDialog(null, "Your account is locked.\n Please contact your administrator to gain access.");
            } else {
                this.dispose();
                TopContainer mainFrame = new TopContainer();
                mainFrame.setPreferredSize(new Dimension(1300, 768)); //set it's dimensions or it's size
                mainFrame.setVisible(true); //sets it's initial visibility to true so it shows on the screen when objects are created from this class
                mainFrame.setResizable(true);
                mainFrame.setTitle("Mother Of Perpetual Help Enrollment System");
                mainFrame.setMinimumSize(new Dimension(800,600));
                //always put pack() first before setLocationRelativeTo(null)
                mainFrame.pack();
                mainFrame.setLocationRelativeTo(null);

                LoginDaoImpl.setLastLoginDate(usernameStr);
            }
        } else if (!LoginDaoImpl.isValid(usernameStr, stringPassword)) {
            if (!LoginDaoImpl.exists(usernameStr)) {
                JOptionPane.showMessageDialog(null, "Username entered doesn't exist.");
            } else if (LoginDaoImpl.isLocked(usernameStr)) {
                JOptionPane.showMessageDialog(null, "Your account is locked.\n Please contact your administrator to gain access.");
            } else {
                loginAttemptCount++;
                System.out.println(loginAttemptCount);
                JOptionPane.showMessageDialog(rootPane, "Username or Password incorrect.");
                if (loginAttemptCount >= 3) {
                    JOptionPane.showMessageDialog(null, "Maximum login attempt reached.");
                    LoginDaoImpl.lockUser(usernameStr);
                    JOptionPane.showMessageDialog(null, "Your account is locked.\n Please contact your administrator to gain access.");
                    loginAttemptCount = 0;
                }
            }//end of nested ifelse
        }
    }
    
    private void jbtnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignInActionPerformed
        validateLogin();
    }//GEN-LAST:event_jbtnSignInActionPerformed

    private void jpfPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpfPasswordFieldMouseClicked
        jpfPasswordField.setText("");
    }//GEN-LAST:event_jpfPasswordFieldMouseClicked

    private void jtfUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUserNameActionPerformed

    }//GEN-LAST:event_jtfUserNameActionPerformed

    private void jtfUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUserNameMouseClicked
        jtfUserName.setText("");
    }//GEN-LAST:event_jtfUserNameMouseClicked

    private void jtfUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUserNameKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            validateLogin();
        }
        
    }//GEN-LAST:event_jtfUserNameKeyPressed

    private void jpfPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfPasswordFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            validateLogin();
        }
    }//GEN-LAST:event_jpfPasswordFieldKeyPressed

    private void jbtnExitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitProgramActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Exit Program?", "Exit", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitProgramActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbtnExitProgram;
    private javax.swing.JButton jbtnSignIn;
    private javax.swing.JLabel jlblForgotPassword;
    private javax.swing.JLabel jlblPassword;
    private javax.swing.JLabel jlblUserLogin;
    private javax.swing.JLabel jlblUserName;
    private javax.swing.JPasswordField jpfPasswordField;
    private javax.swing.JPanel jpnlBody;
    private javax.swing.JPanel jpnlHeader;
    private javax.swing.JPanel jpnlPasswordIconContainer;
    private javax.swing.JPanel jpnlPasswordLabel;
    private javax.swing.JPanel jpnlSubBody;
    private javax.swing.JPanel jpnlUserLogin;
    private javax.swing.JPanel jpnlUserLoginHeader;
    private javax.swing.JPanel jpnlUserNameField;
    private javax.swing.JPanel jpnlUserNameIconContainer;
    private javax.swing.JPanel jpnlUserNameLabel;
    private javax.swing.JTextField jtfUserName;
    // End of variables declaration//GEN-END:variables
}
