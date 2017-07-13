/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.paymentsetting;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author John Ferdinand Antonio
 */
public class CancelController implements ActionListener{

    private final JDialog createView;
    
    public CancelController(JDialog createView){
        this.createView = createView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       int choice = JOptionPane.showConfirmDialog(null,"Exit?","Cancel",JOptionPane.YES_NO_OPTION);
       if(choice == JOptionPane.YES_OPTION){
           createView.dispose();
       }
    }
    
}
