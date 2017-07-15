/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_utility;

import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author John Ferdinand Antonio
 */
public class JInternalFrameUtil {
    public static void removeTitleBar(JInternalFrame jInternalFrame){
        jInternalFrame.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
        ((BasicInternalFrameUI) jInternalFrame.getUI()).setNorthPane(null);
        jInternalFrame.setBorder(null);
    }
}
