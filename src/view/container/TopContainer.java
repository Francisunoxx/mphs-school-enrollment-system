package view.container;

import view.enrollment.EnrollmentPanel;
import view.user.Accounts;
import view.registration.RegistrationForm;
import view.payment.PaymentsPanel;
import calendar_utility.CalendarUtil;
import layout_utility.CardLayoutUtil;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import daoimpl.LoginDaoImpl;
import component_model_loader.ImageGUIUtil;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import threads.SchoolYearLoaderThread;

public class TopContainer extends javax.swing.JFrame{

    private Image imageSchoolLogo;
    private Image imageHomeIcon;
    private Image imageSwitchUser;
    private Image imageExitIcon;
    private Image imageEnrollment;
    private Image imageRegistration;
    private Image imageGrades;
    private Image imageManagement;
    private Image imageAccounts;
    private Image imagePayments;
    private Image imageReports;
    private Image imageHeader;
    private Image imageCalendar;
    private Image imageUser;

    private ImageIcon imageIconHome;

    private final GUIManager guiManager = new GUIManager();
    private final LoginDaoImpl loginDaoImpl = new LoginDaoImpl();

    private static int REGISTRATION_INSTANCE = 0;
    private static int ENROLLMENT_INSTANCE = 0;
    private static int GRADES_INSTANCE = 0;
    private static int REPORTS_INSTANCE = 0;
    private static int MANAGEMENT_INSTANCE = 0;
    private static int ACCOUNTS_INSTANCE = 0;
    private static int PAYMENTS_INSTANCE = 0;
    
    public TopContainer() {
        initComponents();
        guiManager.prepareImageBackgrounds();
        guiManager.setGUIComponentProperties();
        
        SchoolYearLoaderThread schoolYearThread = new SchoolYearLoaderThread(jlblCurrentSchoolYear);
        schoolYearThread.start();
    }

    public static int getREGISTRATION_INSTANCE() {
        return REGISTRATION_INSTANCE;
    }

    public static void setREGISTRATION_INSTANCE(int REGISTRATION_INSTANCE) {
        TopContainer.REGISTRATION_INSTANCE = REGISTRATION_INSTANCE;
    }

    public static int getENROLLMENT_INSTANCE() {
        return ENROLLMENT_INSTANCE;
    }

    public static void setENROLLMENT_INSTANCE(int ENROLLMENT_INSTANCE) {
        TopContainer.ENROLLMENT_INSTANCE = ENROLLMENT_INSTANCE;
    }

    public static int getGRADES_INSTANCE() {
        return GRADES_INSTANCE;
    }

    public static void setGRADES_INSTANCE(int GRADES_INSTANCE) {
        TopContainer.GRADES_INSTANCE = GRADES_INSTANCE;
    }

    public static int getREPORTS_INSTANCE() {
        return REPORTS_INSTANCE;
    }

    public static void setREPORTS_INSTANCE(int REPORTS_INSTANCE) {
        TopContainer.REPORTS_INSTANCE = REPORTS_INSTANCE;
    }

    public static int getMANAGEMENT_INSTANCE() {
        return MANAGEMENT_INSTANCE;
    }

    public static void setMANAGEMENT_INSTANCE(int MANAGEMENT_INSTANCE) {
        TopContainer.MANAGEMENT_INSTANCE = MANAGEMENT_INSTANCE;
    }

    public static int getACCOUNTS_INSTANCE() {
        return ACCOUNTS_INSTANCE;
    }

    public static void setACCOUNTS_INSTANCE(int ACCOUNTS_INSTANCE) {
        TopContainer.ACCOUNTS_INSTANCE = ACCOUNTS_INSTANCE;
    }

    public static int getPAYMENTS_INSTANCE() {
        return PAYMENTS_INSTANCE;
    }

    public static void setPAYMENTS_INSTANCE(int PAYMENTS_INSTANCE) {
        TopContainer.PAYMENTS_INSTANCE = PAYMENTS_INSTANCE;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jspTopMost = new javax.swing.JScrollPane();
        jpnlTopPanel = new javax.swing.JPanel();
        jtpTopTabbedPane = new javax.swing.JTabbedPane();
        jpnlTopCardContainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jpnlTopCard = new javax.swing.JPanel();
        jpnlHeader = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setComposite(AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, 0.8f));
            g2d.drawImage(imageHeader, 0, 0, getWidth(), getHeight(), null);
            jpnlTopPanel.repaint();
        }
    };
    iconsContainer = new javax.swing.JPanel();
    jpnlExitIcon = new javax.swing.JPanel(){
        public void paintComponent(Graphics g){
            super.repaint();
            g.drawImage(imageExitIcon, 0, 0, getWidth(),getHeight(),this);
        }
    };
    jpnlSchoolYear = new javax.swing.JPanel();
    jlblCurrentSchoolYear = new javax.swing.JLabel();
    jpnlBody = new javax.swing.JPanel();
    jspCardContainer = new javax.swing.JScrollPane();
    cardContainer = new javax.swing.JPanel();
    jpnlLaunchPad = new javax.swing.JPanel();
    jPanel1 = new javax.swing.JPanel();
    jpnlCalendar = new javax.swing.JPanel() {
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, 0.8f));
        g2d.drawImage(imageCalendar, 0, 0, getWidth(), getHeight(), null);

        jpnlTopPanel.repaint();
    }
    };
    calendarPanel = new javax.swing.JPanel();
    jlblDayToday = new javax.swing.JLabel();
    jlblDateToday = new javax.swing.JLabel();
    jpnlButtons = new javax.swing.JPanel() {
        public void paintComponent(Graphics g){

            g.drawImage(imageSchoolLogo,0,0,getWidth(),getHeight(),this);
            super.repaint();
        }
    };
    jpnlPaymentButton = new javax.swing.JPanel() {
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, 0.8f));
        g2d.drawImage(imagePayments, 0, 0, getWidth(), getHeight(), null);

        super.repaint();
    }
    };
    jLabel7 = new javax.swing.JLabel();
    jpnlRegistrationButton = new javax.swing.JPanel() {
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, 0.8f));
        g2d.drawImage(imageRegistration, 0, 0, getWidth(), getHeight(), null);
        super.repaint();
    }
    };
    jLabel1 = new javax.swing.JLabel();
    jpnlEnrollmentButton = new javax.swing.JPanel() {
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, 0.8f));
        g2d.drawImage(imageEnrollment, 0, 0, getWidth(), getHeight(), null);

        super.repaint();
    }
    };
    jLabel3 = new javax.swing.JLabel();
    jpnlGradesButton = new javax.swing.JPanel() {
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, 0.8f));
        g2d.drawImage(imageGrades, 0, 0, getWidth(), getHeight(), null);

        super.repaint();
    }
    };
    jLabel5 = new javax.swing.JLabel();
    jpnlManagementButton = new javax.swing.JPanel(){
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, 0.8f));
        g2d.drawImage(imageManagement, 0, 0, getWidth(), getHeight(), null);

        super.repaint();
    }
    };
    jLabel17 = new javax.swing.JLabel();
    jpnlAccountsButton = new javax.swing.JPanel(){
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, 0.8f));
        g2d.drawImage(imageAccounts, 0, 0, getWidth(), getHeight(), null);

        super.repaint();
    }
    };
    jLabel8 = new javax.swing.JLabel();
    jpnlReportsButton = new javax.swing.JPanel(){
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, 0.8f));
        g2d.drawImage(imageReports, 0, 0, getWidth(), getHeight(), null);

        super.repaint();
    }
    };
    jLabel6 = new javax.swing.JLabel();
    jpnlUserInformation = new javax.swing.JPanel();
    jpnlUserImage = new javax.swing.JPanel(){
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, 0.8f));
        g2d.drawImage(imageUser, 0, 0, getWidth(), getHeight(), null);
        super.repaint();
    }
    };
    jpnlAccountInformation = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jlblStatus = new javax.swing.JLabel();
    jlblStatusText = new javax.swing.JLabel();
    jlblStudentId = new javax.swing.JLabel();
    jlblStudentIdText = new javax.swing.JLabel();
    jlblLastName = new javax.swing.JLabel();
    jlblLastNameText = new javax.swing.JLabel();
    jlblFirstName = new javax.swing.JLabel();
    jlblFirstNameText = new javax.swing.JLabel();
    jlblMiddleName = new javax.swing.JLabel();
    jlblMiddleNameText = new javax.swing.JLabel();
    jpnlHelloUser = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jlblHelloUserNameText = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setTitle("Enrollment System");
    setBounds(new java.awt.Rectangle(0, 0, 0, 0));
    setMinimumSize(new java.awt.Dimension(800, 600));
    getContentPane().setLayout(new java.awt.GridBagLayout());

    jspTopMost.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    jspTopMost.setFocusCycleRoot(true);
    jspTopMost.setMinimumSize(new java.awt.Dimension(900, 650));
    jspTopMost.setPreferredSize(new java.awt.Dimension(900, 900));

    jpnlTopPanel.setBackground(new java.awt.Color(0, 114, 187));
    jpnlTopPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
    jpnlTopPanel.setMinimumSize(new java.awt.Dimension(900, 400));
    jpnlTopPanel.setPreferredSize(new java.awt.Dimension(900, 400));
    jpnlTopPanel.setLayout(new java.awt.BorderLayout());

    jtpTopTabbedPane.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jtpTopTabbedPane.setMinimumSize(new java.awt.Dimension(900, 650));
    jtpTopTabbedPane.setPreferredSize(new java.awt.Dimension(900, 400));
    jtpTopTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jtpTopTabbedPaneMouseClicked(evt);
        }
    });

    jpnlTopCardContainer.setPreferredSize(new java.awt.Dimension(900, 400));
    jpnlTopCardContainer.setLayout(new java.awt.BorderLayout());

    jPanel2.setMinimumSize(new java.awt.Dimension(900, 400));
    jPanel2.setPreferredSize(new java.awt.Dimension(900, 400));
    jPanel2.setLayout(new java.awt.BorderLayout());

    jpnlTopCard.setBackground(new java.awt.Color(0, 114, 187));
    jpnlTopCard.setPreferredSize(new java.awt.Dimension(1560, 400));
    jpnlTopCard.setLayout(new java.awt.GridBagLayout());

    jpnlHeader.setBackground(new java.awt.Color(0, 114, 188));
    jpnlHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jpnlHeader.setPreferredSize(new java.awt.Dimension(1200, 100));
    jpnlHeader.setLayout(new java.awt.GridBagLayout());

    iconsContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    iconsContainer.setOpaque(false);
    iconsContainer.setPreferredSize(new java.awt.Dimension(200, 75));
    iconsContainer.setLayout(new java.awt.GridBagLayout());

    jpnlExitIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jpnlExitIcon.setPreferredSize(new java.awt.Dimension(50, 50));
    jpnlExitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jpnlExitIconMouseClicked(evt);
        }
    });
    jpnlExitIcon.setLayout(new java.awt.GridBagLayout());
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.ipadx = 50;
    gridBagConstraints.ipady = 50;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
    iconsContainer.add(jpnlExitIcon, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlHeader.add(iconsContainer, gridBagConstraints);

    jpnlSchoolYear.setOpaque(false);
    jpnlSchoolYear.setLayout(new java.awt.GridBagLayout());

    jlblCurrentSchoolYear.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jlblCurrentSchoolYear.setForeground(new java.awt.Color(255, 255, 255));
    jlblCurrentSchoolYear.setText("School Year: ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlSchoolYear.add(jlblCurrentSchoolYear, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlHeader.add(jpnlSchoolYear, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    jpnlTopCard.add(jpnlHeader, gridBagConstraints);

    jpnlBody.setBackground(new java.awt.Color(255, 255, 255));
    jpnlBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jpnlBody.setMaximumSize(new java.awt.Dimension(1080, 328));
    jpnlBody.setMinimumSize(new java.awt.Dimension(1080, 328));
    jpnlBody.setPreferredSize(new java.awt.Dimension(1100, 400));
    jpnlBody.setLayout(new java.awt.BorderLayout());

    jspCardContainer.setPreferredSize(new java.awt.Dimension(900, 326));

    cardContainer.setMinimumSize(new java.awt.Dimension(920, 400));
    cardContainer.setOpaque(false);
    cardContainer.setPreferredSize(new java.awt.Dimension(920, 300));
    cardContainer.setLayout(new java.awt.BorderLayout());

    jpnlLaunchPad.setMinimumSize(new java.awt.Dimension(928, 400));
    jpnlLaunchPad.setOpaque(false);
    jpnlLaunchPad.setPreferredSize(new java.awt.Dimension(1010, 400));
    jpnlLaunchPad.setLayout(new java.awt.BorderLayout());

    jPanel1.setMinimumSize(new java.awt.Dimension(850, 400));
    jPanel1.setPreferredSize(new java.awt.Dimension(850, 400));
    jPanel1.setLayout(new java.awt.GridBagLayout());

    jpnlCalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jpnlCalendar.setMinimumSize(new java.awt.Dimension(210, 180));
    jpnlCalendar.setPreferredSize(new java.awt.Dimension(210, 180));
    jpnlCalendar.setLayout(new java.awt.GridBagLayout());

    calendarPanel.setOpaque(false);
    calendarPanel.setLayout(new java.awt.GridBagLayout());

    jlblDayToday.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    jlblDayToday.setForeground(new java.awt.Color(255, 255, 255));
    jlblDayToday.setText("dayTodayText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(20, 220, 0, 0);
    calendarPanel.add(jlblDayToday, gridBagConstraints);

    jlblDateToday.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    jlblDateToday.setForeground(new java.awt.Color(255, 255, 255));
    jlblDateToday.setText("dateTodayText");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 220, 0, 0);
    calendarPanel.add(jlblDateToday, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlCalendar.add(calendarPanel, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(jpnlCalendar, gridBagConstraints);

    jpnlButtons.setBackground(new java.awt.Color(255, 255, 255));
    jpnlButtons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jpnlButtons.setMinimumSize(new java.awt.Dimension(850, 442));
    jpnlButtons.setPreferredSize(new java.awt.Dimension(850, 442));
    jpnlButtons.setLayout(new java.awt.GridBagLayout());

    jpnlPaymentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jpnlPaymentButton.setMinimumSize(new java.awt.Dimension(1000, 1000));
    jpnlPaymentButton.setPreferredSize(new java.awt.Dimension(1000, 1000));
    jpnlPaymentButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jpnlPaymentButtonMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnlPaymentButtonMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jpnlPaymentButtonMouseExited(evt);
        }
    });
    jpnlPaymentButton.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            jpnlPaymentButtonKeyPressed(evt);
        }
    });
    jpnlPaymentButton.setLayout(new java.awt.GridBagLayout());

    jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Payments");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 150, 0, 0);
    jpnlPaymentButton.add(jLabel7, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jpnlButtons.add(jpnlPaymentButton, gridBagConstraints);

    jpnlRegistrationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jpnlRegistrationButton.setMinimumSize(new java.awt.Dimension(1000, 1000));
    jpnlRegistrationButton.setPreferredSize(new java.awt.Dimension(1000, 1000));
    jpnlRegistrationButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jpnlRegistrationButtonMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnlRegistrationButtonMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jpnlRegistrationButtonMouseExited(evt);
        }
    });
    jpnlRegistrationButton.setLayout(new java.awt.GridBagLayout());

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Registration");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 150, 0, 0);
    jpnlRegistrationButton.add(jLabel1, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jpnlButtons.add(jpnlRegistrationButton, gridBagConstraints);

    jpnlEnrollmentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jpnlEnrollmentButton.setMinimumSize(new java.awt.Dimension(1000, 1000));
    jpnlEnrollmentButton.setPreferredSize(new java.awt.Dimension(1000, 1000));
    jpnlEnrollmentButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jpnlEnrollmentButtonMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnlEnrollmentButtonMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jpnlEnrollmentButtonMouseExited(evt);
        }
    });
    jpnlEnrollmentButton.setLayout(new java.awt.GridBagLayout());

    jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Enrollment");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 150, 0, 0);
    jpnlEnrollmentButton.add(jLabel3, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jpnlButtons.add(jpnlEnrollmentButton, gridBagConstraints);

    jpnlGradesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jpnlGradesButton.setMinimumSize(new java.awt.Dimension(1000, 1000));
    jpnlGradesButton.setPreferredSize(new java.awt.Dimension(1000, 1000));
    jpnlGradesButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jpnlGradesButtonMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnlGradesButtonMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jpnlGradesButtonMouseExited(evt);
        }
    });
    jpnlGradesButton.setLayout(new java.awt.GridBagLayout());

    jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setText("Grades");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 150, 0, 0);
    jpnlGradesButton.add(jLabel5, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jpnlButtons.add(jpnlGradesButton, gridBagConstraints);

    jpnlManagementButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jpnlManagementButton.setMinimumSize(new java.awt.Dimension(1000, 1000));
    jpnlManagementButton.setPreferredSize(new java.awt.Dimension(1000, 1000));
    jpnlManagementButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jpnlManagementButtonMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnlManagementButtonMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jpnlManagementButtonMouseExited(evt);
        }
    });
    jpnlManagementButton.setLayout(new java.awt.GridBagLayout());

    jLabel17.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(255, 255, 255));
    jLabel17.setText("Settings");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 150, 0, 0);
    jpnlManagementButton.add(jLabel17, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jpnlButtons.add(jpnlManagementButton, gridBagConstraints);

    jpnlAccountsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jpnlAccountsButton.setMinimumSize(new java.awt.Dimension(1000, 1000));
    jpnlAccountsButton.setPreferredSize(new java.awt.Dimension(1000, 1000));
    jpnlAccountsButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jpnlAccountsButtonMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnlAccountsButtonMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jpnlAccountsButtonMouseExited(evt);
        }
    });
    jpnlAccountsButton.setLayout(new java.awt.GridBagLayout());

    jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Accounts");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 150, 0, 0);
    jpnlAccountsButton.add(jLabel8, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jpnlButtons.add(jpnlAccountsButton, gridBagConstraints);

    jpnlReportsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jpnlReportsButton.setMinimumSize(new java.awt.Dimension(1000, 1000));
    jpnlReportsButton.setPreferredSize(new java.awt.Dimension(1000, 1000));
    jpnlReportsButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jpnlReportsButtonMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnlReportsButtonMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jpnlReportsButtonMouseExited(evt);
        }
    });
    jpnlReportsButton.setLayout(new java.awt.GridBagLayout());

    jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Reports");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(0, 150, 0, 0);
    jpnlReportsButton.add(jLabel6, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jpnlButtons.add(jpnlReportsButton, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weighty = 0.5;
    jPanel1.add(jpnlButtons, gridBagConstraints);

    jpnlLaunchPad.add(jPanel1, java.awt.BorderLayout.CENTER);

    cardContainer.add(jpnlLaunchPad, java.awt.BorderLayout.CENTER);

    jspCardContainer.setViewportView(cardContainer);

    jpnlBody.add(jspCardContainer, java.awt.BorderLayout.CENTER);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    jpnlTopCard.add(jpnlBody, gridBagConstraints);

    jpnlUserInformation.setBackground(new java.awt.Color(0, 114, 187));
    jpnlUserInformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jpnlUserInformation.setMinimumSize(new java.awt.Dimension(250, 250));
    jpnlUserInformation.setPreferredSize(new java.awt.Dimension(250, 250));
    jpnlUserInformation.setLayout(new java.awt.GridBagLayout());

    jpnlUserImage.setMaximumSize(new java.awt.Dimension(200, 200));
    jpnlUserImage.setMinimumSize(new java.awt.Dimension(200, 200));
    jpnlUserImage.setOpaque(false);
    jpnlUserImage.setPreferredSize(new java.awt.Dimension(200, 200));
    jpnlUserImage.setLayout(new java.awt.GridBagLayout());
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlUserInformation.add(jpnlUserImage, gridBagConstraints);

    jpnlAccountInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Account Information"));
    jpnlAccountInformation.setMinimumSize(new java.awt.Dimension(150, 150));
    jpnlAccountInformation.setOpaque(false);
    jpnlAccountInformation.setPreferredSize(new java.awt.Dimension(150, 149));
    jpnlAccountInformation.setLayout(new java.awt.GridBagLayout());

    jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(102, 153, 255));
    jLabel4.setText("Change Password");
    jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccountInformation.add(jLabel4, gridBagConstraints);

    jlblStatus.setText("Last Login :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccountInformation.add(jlblStatus, gridBagConstraints);

    jlblStatusText.setText("Last Login Date");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccountInformation.add(jlblStatusText, gridBagConstraints);

    jlblStudentId.setText("Account ID :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccountInformation.add(jlblStudentId, gridBagConstraints);

    jlblStudentIdText.setText("Account ID Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccountInformation.add(jlblStudentIdText, gridBagConstraints);

    jlblLastName.setText("Last Name :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccountInformation.add(jlblLastName, gridBagConstraints);

    jlblLastNameText.setText("Last Name Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccountInformation.add(jlblLastNameText, gridBagConstraints);

    jlblFirstName.setText("First Name :");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccountInformation.add(jlblFirstName, gridBagConstraints);

    jlblFirstNameText.setText("First Name Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccountInformation.add(jlblFirstNameText, gridBagConstraints);

    jlblMiddleName.setText("Middle Name : ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccountInformation.add(jlblMiddleName, gridBagConstraints);

    jlblMiddleNameText.setText("Middle Name Text");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlAccountInformation.add(jlblMiddleNameText, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlUserInformation.add(jpnlAccountInformation, gridBagConstraints);

    jpnlHelloUser.setOpaque(false);
    jpnlHelloUser.setPreferredSize(new java.awt.Dimension(800, 12));
    jpnlHelloUser.setLayout(new java.awt.GridBagLayout());

    jPanel3.setOpaque(false);
    jPanel3.setLayout(new java.awt.GridBagLayout());

    jlblHelloUserNameText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jlblHelloUserNameText.setForeground(new java.awt.Color(255, 255, 255));
    jlblHelloUserNameText.setText("username");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel3.add(jlblHelloUserNameText, gridBagConstraints);

    jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Hello");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jPanel3.add(jLabel2, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlHelloUser.add(jPanel3, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    jpnlUserInformation.add(jpnlHelloUser, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
    jpnlTopCard.add(jpnlUserInformation, gridBagConstraints);

    jPanel2.add(jpnlTopCard, java.awt.BorderLayout.CENTER);

    jpnlTopCardContainer.add(jPanel2, java.awt.BorderLayout.CENTER);

    jtpTopTabbedPane.addTab("", jpnlTopCardContainer);

    jpnlTopPanel.add(jtpTopTabbedPane, java.awt.BorderLayout.CENTER);

    jspTopMost.setViewportView(jpnlTopPanel);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.weighty = 0.5;
    getContentPane().add(jspTopMost, gridBagConstraints);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    public class GUIManager {

        private void setGUIComponentProperties() {
            jlblDateToday.setText(CalendarUtil.getDateToday());
            jlblDayToday.setText(CalendarUtil.getDayToday());
            jtpTopTabbedPane.setIconAt(0, imageIconHome);
            jlblHelloUserNameText.setText(LoginDaoImpl.getCompleteName(LoginDaoImpl.getUsername()));

            jspTopMost.getVerticalScrollBar().setUnitIncrement(26);
            jspCardContainer.getVerticalScrollBar().setUnitIncrement(26);
        }

        private void prepareImageBackgrounds() {
            imageHeader = new ImageGUIUtil().getRenderedImageForJPanel("assets/headerNoText.jpg", jpnlHeader);
            imageSchoolLogo = new ImageGUIUtil().getRenderedImageForJPanel("assets/LaunchPadBg.jpg", jpnlLaunchPad);
            imageExitIcon = new ImageGUIUtil().getRenderedImageForJPanel("assets/exit.jpg", jpnlExitIcon);
            imageReports = new ImageGUIUtil().getRenderedImageForJPanel("assets/reportsNoText.jpg", jpnlReportsButton);
            imageRegistration = new ImageGUIUtil().getRenderedImageForJPanel("assets/registrationNoText.jpg", jpnlRegistrationButton);
            imageEnrollment = new ImageGUIUtil().getRenderedImageForJPanel("assets/enrollmentNoText.jpg", jpnlEnrollmentButton);
            imageGrades = new ImageGUIUtil().getRenderedImageForJPanel("assets/gradesNoText.jpg", jpnlGradesButton);
            imageManagement = new ImageGUIUtil().getRenderedImageForJPanel("assets/managementNoText.jpg", jpnlManagementButton);
            imageAccounts = new ImageGUIUtil().getRenderedImageForJPanel("assets/accountsNoText.jpg", jpnlAccountsButton);
            imagePayments = new ImageGUIUtil().getRenderedImageForJPanel("assets/paymentsNotext.jpg", jpnlPaymentButton);
            imageCalendar = new ImageGUIUtil().getRenderedImageForJPanel("assets/calendarNoText.jpg", jpnlCalendar);
            imageUser = new ImageGUIUtil().getRenderedImageForJPanel("assets/usernameIcon.jpg", jpnlUserImage);
            imageIconHome = new ImageGUIUtil().getResourceAsImageIcon("/assets/home.png", 20, 20);
        }

    }

    public static void flipCardToLaunchPad() {
        CardLayoutUtil.flipCardTo(cardContainer, jpnlLaunchPad);
    }

    private void jpnlExitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlExitIconMouseClicked
        int choice
                = JOptionPane.showConfirmDialog(null, "Exit Program?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jpnlExitIconMouseClicked

    private void jpnlRegistrationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlRegistrationButtonMouseClicked
        
        if (evt.getClickCount() >= 1) {
            if (REGISTRATION_INSTANCE <= 0) {
                RegistrationForm registrationForm = new RegistrationForm();
                jtpTopTabbedPane.add("Registration", registrationForm);
                jtpTopTabbedPane.setSelectedComponent(registrationForm);
                int index = jtpTopTabbedPane.getSelectedIndex();
                setREGISTRATION_INSTANCE(1);
            }
        }
    }//GEN-LAST:event_jpnlRegistrationButtonMouseClicked

    private void jpnlEnrollmentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlEnrollmentButtonMouseClicked
//        CardLayoutUtil.flipCardTo(jpnlTopCardContainer, new EnrollmentPanel());
        if (evt.getClickCount() >= 1) {
            if (ENROLLMENT_INSTANCE <= 0) {
                EnrollmentPanel enrollmentPanel = new EnrollmentPanel();
                jtpTopTabbedPane.add("Enrollment", enrollmentPanel);
                jtpTopTabbedPane.setSelectedComponent(enrollmentPanel);
                setENROLLMENT_INSTANCE(1);
            }
        }
    }//GEN-LAST:event_jpnlEnrollmentButtonMouseClicked

    private void jpnlGradesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlGradesButtonMouseClicked
        if (evt.getClickCount() >= 1){
            
        }
    }//GEN-LAST:event_jpnlGradesButtonMouseClicked

    private void jpnlPaymentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlPaymentButtonMouseClicked
//        CardLayoutUtil.flipCardTo(jpnlTopCardContainer, new PaymentsPanel());
        if (evt.getClickCount() >= 1) {
            if (PAYMENTS_INSTANCE <= 0) {
                PaymentsPanel paymentPanel = new PaymentsPanel();
                jtpTopTabbedPane.add("Payment", paymentPanel);
                jtpTopTabbedPane.setSelectedComponent(paymentPanel);
                setPAYMENTS_INSTANCE(1);
            }
        }
    }//GEN-LAST:event_jpnlPaymentButtonMouseClicked

    private void jpnlManagementButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlManagementButtonMouseClicked
//        CardLayoutUtil.flipCardTo(jpnlTopCardContainer, new ManagementPanel());

        if (evt.getClickCount() >= 1) {
            if (MANAGEMENT_INSTANCE <= 0) {
                ManagementPanel managementPanel = new ManagementPanel();
                jtpTopTabbedPane.add("Management", managementPanel);
                jtpTopTabbedPane.setSelectedComponent(managementPanel);
                setMANAGEMENT_INSTANCE(1);
            }
        }
    }//GEN-LAST:event_jpnlManagementButtonMouseClicked

    private void jpnlAccountsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlAccountsButtonMouseClicked
//        CardLayoutUtil.flipCardTo(jpnlTopCardContainer, new Accounts());
        if (evt.getClickCount() >= 1) {
            if (ACCOUNTS_INSTANCE <= 0) {
                Accounts accountsPanel = new Accounts();
                jtpTopTabbedPane.add("Accounts", accountsPanel);
                jtpTopTabbedPane.setSelectedComponent(accountsPanel);
                setACCOUNTS_INSTANCE(1);
            }
        }
    }//GEN-LAST:event_jpnlAccountsButtonMouseClicked

    private void jpnlReportsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlReportsButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpnlReportsButtonMouseClicked

    private void jpnlPaymentButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpnlPaymentButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpnlPaymentButtonKeyPressed

    private void jpnlRegistrationButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlRegistrationButtonMouseEntered
        Border myBorder = new LineBorder(Color.YELLOW, 4);
        jpnlRegistrationButton.setBorder(myBorder);
    }//GEN-LAST:event_jpnlRegistrationButtonMouseEntered

    private void jpnlRegistrationButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlRegistrationButtonMouseExited
        jpnlRegistrationButton.setBorder(null);
    }//GEN-LAST:event_jpnlRegistrationButtonMouseExited

    private void jpnlManagementButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlManagementButtonMouseEntered
        Border myBorder = new LineBorder(Color.YELLOW, 4);
        jpnlManagementButton.setBorder(myBorder);
    }//GEN-LAST:event_jpnlManagementButtonMouseEntered

    private void jpnlManagementButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlManagementButtonMouseExited
        jpnlManagementButton.setBorder(null);
    }//GEN-LAST:event_jpnlManagementButtonMouseExited

    private void jpnlEnrollmentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlEnrollmentButtonMouseEntered
        Border myBorder = new LineBorder(Color.YELLOW, 4);
        jpnlEnrollmentButton.setBorder(myBorder);
    }//GEN-LAST:event_jpnlEnrollmentButtonMouseEntered

    private void jpnlEnrollmentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlEnrollmentButtonMouseExited
        jpnlEnrollmentButton.setBorder(null);
    }//GEN-LAST:event_jpnlEnrollmentButtonMouseExited

    private void jpnlAccountsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlAccountsButtonMouseEntered
        Border myBorder = new LineBorder(Color.YELLOW, 4);
        jpnlAccountsButton.setBorder(myBorder);
    }//GEN-LAST:event_jpnlAccountsButtonMouseEntered

    private void jpnlAccountsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlAccountsButtonMouseExited
        jpnlAccountsButton.setBorder(null);
    }//GEN-LAST:event_jpnlAccountsButtonMouseExited

    private void jpnlGradesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlGradesButtonMouseEntered
        Border myBorder = new LineBorder(Color.YELLOW, 4);
        jpnlGradesButton.setBorder(myBorder);
    }//GEN-LAST:event_jpnlGradesButtonMouseEntered

    private void jpnlGradesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlGradesButtonMouseExited
        jpnlGradesButton.setBorder(null);
    }//GEN-LAST:event_jpnlGradesButtonMouseExited

    private void jpnlPaymentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlPaymentButtonMouseEntered
        Border myBorder = new LineBorder(Color.YELLOW, 4);
        jpnlPaymentButton.setBorder(myBorder);
    }//GEN-LAST:event_jpnlPaymentButtonMouseEntered

    private void jpnlPaymentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlPaymentButtonMouseExited
        jpnlPaymentButton.setBorder(null);
    }//GEN-LAST:event_jpnlPaymentButtonMouseExited

    private void jpnlReportsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlReportsButtonMouseEntered
        Border myBorder = new LineBorder(Color.YELLOW, 4);
        jpnlReportsButton.setBorder(myBorder);
    }//GEN-LAST:event_jpnlReportsButtonMouseEntered

    private void jpnlReportsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlReportsButtonMouseExited
        jpnlReportsButton.setBorder(null);
    }//GEN-LAST:event_jpnlReportsButtonMouseExited

    private void jtpTopTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtpTopTabbedPaneMouseClicked
        if (evt.getClickCount() >= 1) {
            if (jtpTopTabbedPane.getSelectedIndex() == 0) {
                CardLayoutUtil.flipCardTo(jpnlTopCardContainer, jpnlTopCard);
            }
        }
    }//GEN-LAST:event_jtpTopTabbedPaneMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel calendarPanel;
    public static javax.swing.JPanel cardContainer;
    private javax.swing.JPanel iconsContainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jlblCurrentSchoolYear;
    private javax.swing.JLabel jlblDateToday;
    private javax.swing.JLabel jlblDayToday;
    private javax.swing.JLabel jlblFirstName;
    private javax.swing.JLabel jlblFirstNameText;
    private javax.swing.JLabel jlblHelloUserNameText;
    private javax.swing.JLabel jlblLastName;
    private javax.swing.JLabel jlblLastNameText;
    private javax.swing.JLabel jlblMiddleName;
    private javax.swing.JLabel jlblMiddleNameText;
    private javax.swing.JLabel jlblStatus;
    private javax.swing.JLabel jlblStatusText;
    private javax.swing.JLabel jlblStudentId;
    private javax.swing.JLabel jlblStudentIdText;
    private javax.swing.JPanel jpnlAccountInformation;
    private javax.swing.JPanel jpnlAccountsButton;
    private javax.swing.JPanel jpnlBody;
    private javax.swing.JPanel jpnlButtons;
    private javax.swing.JPanel jpnlCalendar;
    private javax.swing.JPanel jpnlEnrollmentButton;
    private javax.swing.JPanel jpnlExitIcon;
    private javax.swing.JPanel jpnlGradesButton;
    private javax.swing.JPanel jpnlHeader;
    private javax.swing.JPanel jpnlHelloUser;
    public static javax.swing.JPanel jpnlLaunchPad;
    private javax.swing.JPanel jpnlManagementButton;
    private javax.swing.JPanel jpnlPaymentButton;
    private javax.swing.JPanel jpnlRegistrationButton;
    private javax.swing.JPanel jpnlReportsButton;
    private javax.swing.JPanel jpnlSchoolYear;
    public static javax.swing.JPanel jpnlTopCard;
    public static javax.swing.JPanel jpnlTopCardContainer;
    private javax.swing.JPanel jpnlTopPanel;
    private javax.swing.JPanel jpnlUserImage;
    private javax.swing.JPanel jpnlUserInformation;
    private javax.swing.JScrollPane jspCardContainer;
    private javax.swing.JScrollPane jspTopMost;
    public static javax.swing.JTabbedPane jtpTopTabbedPane;
    // End of variables declaration//GEN-END:variables
}
