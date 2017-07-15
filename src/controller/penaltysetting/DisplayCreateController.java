/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.penaltysetting;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.penalty.CreatePenalty;

/**
 *
 * @author John Ferdinand Antonio
 */
public class DisplayCreateController implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        CreatePenalty cp = new CreatePenalty(null, true);
        cp.setPreferredSize(new Dimension(400,400));
        cp.pack();
        cp.setLocationRelativeTo(null);
        cp.setVisible(true);
    }
    
}
