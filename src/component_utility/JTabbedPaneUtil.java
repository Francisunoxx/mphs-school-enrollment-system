
package component_utility;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class JTabbedPaneUtil {
    
    public void setTabbedPaneTransparent(JTabbedPane jTabbedPane, int alphaValue) {

        jTabbedPane.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI() {
            @Override
            protected void paintContentBorder(Graphics g, int tabPlacement, int selectedIndex) {
            }
        });
        jTabbedPane.setBackground(new Color(0, 0, 0, alphaValue));
        jTabbedPane.setOpaque(false);
    }
}
