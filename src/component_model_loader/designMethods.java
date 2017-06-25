
package component_model_loader;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class designMethods {
    
    public void setPanelTransparent(JPanel panel, int alphaValue){
        //example of method call: setPanelTransparent(this,20)
        panel.setBackground(new Color(0,0,0,alphaValue));
        panel.setOpaque(false);
    }
    
    public void setTabbedPaneTransparent(JTabbedPane tabPane, int alphaValue){
        
        tabPane.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI(){
        
        @Override
        protected void paintContentBorder(Graphics g,int tabPlacement,int selectedIndex){}
        });
        
        tabPane.setBackground(new Color(0,0,0,alphaValue));
        tabPane.setOpaque(false);
        
        
    }
}
