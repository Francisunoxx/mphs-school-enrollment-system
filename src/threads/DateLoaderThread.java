/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.awt.Component;
import java.util.GregorianCalendar;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.joda.time.LocalDate;

/**
 *
 * @author Acer
 */
public class DateLoaderThread extends Thread {

    Component component;

    public DateLoaderThread(Component aComponent) {
        this.component = aComponent;
    }

    @Override
    public void run() {
        while (true) {
            if(component instanceof JLabel){
                
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null,e.getMessage() );
            }
        }
    }

}
