package mphs;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import gui.LoginForm;

public class ProgramDriver {

    public static void main(String[] args) {

        LoginForm logInForm = new LoginForm();
        logInForm.setPreferredSize(new Dimension(610,280));
        logInForm.setVisible(true);
        logInForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logInForm.pack();
        logInForm.setLocationRelativeTo(null);


//        ProgramDriver programDriver = new ProgramDriver();
    }
    
    public ProgramDriver() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } 
                catch (ClassNotFoundException | InstantiationException | 
                        IllegalAccessException | UnsupportedLookAndFeelException ex) 
                {
                    ex.printStackTrace();
                }
                LoginForm logInForm = new LoginForm();
                logInForm.setVisible(true);
                logInForm.pack();
                logInForm.setLocationRelativeTo(null);
            }
        });
    }
    
}
