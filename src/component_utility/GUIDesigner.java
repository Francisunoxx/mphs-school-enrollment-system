
package component_utility;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;


public class GUIDesigner {
   
    Color tabNameColor = new Color(49,43,31,255);
    Color tabPaneContentAreaColor = new Color(128,70,7,200);
    Color panelBgColor = new Color(49,43,31,60);
    
    public static void setUIFont (javax.swing.plaf.FontUIResource f){
        /*Call by 
          setUIFont (new javax.swing.plaf.FontUIResource("Serif",Font.ITALIC,12)); */
        
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
          Object key = keys.nextElement();
          Object value = UIManager.get (key);
          if (value != null && value instanceof javax.swing.plaf.FontUIResource)
            UIManager.put (key, f);
        }
    } 
    
    
    public void setButtonsProperties(Boolean bool, Color usersColor){
        if(bool = true)
        UIManager.put("Button.opaque", false);
        UIManager.put("Button.foreground",usersColor);
        UIManager.put("Button.background",new Color(49,43,31,255));
        UIManager.put("Button.select",Color.WHITE);//when clicked
        UIManager.put("Button.focus", new ColorUIResource(new Color(0,0,0,0)));
    }
    
    public void setLabelsProperties(){
        UIManager.put("Label.foreground",Color.BLACK );
        UIManager.put("Label.background",new ColorUIResource(new Color(0,0,0,0)));
    }
    
    public void setTextFieldInactiveForeground(){
        UIManager.put("FormattedTextField.inactiveForeground",Color.RED);
    }
    
    public void setPanelBorder(){
        Border border = BorderFactory.createLineBorder(Color.WHITE, 1, false);
        UIManager.put("Panel.border", border);
//        UIManager.put("Panel.opaque", false);
    }
    
    public void setTabbedPaneProperties(JTabbedPane tpane){
        tpane.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI(){
          protected void paintContentBorder(Graphics g,int tabPlacement,int selectedIndex){}
        });
        tpane.setOpaque(false);
        tpane.setBackground(new Color(49,43,31,60));
        
//        UIManager.put("TabbedPane.contentAreaColor", tabPaneContentAreaColor);
//        UIManager.put("TabbedPane.opaque", false);
    }
    
    public void setCheckBoxProperties(){
        UIManager.put("Checkbox.background", new ColorUIResource(new Color(0,0,0,0)));
        UIManager.put("Checkbox.foreground", Color.WHITE);
        UIManager.put("Checkbox.opaque", false);
        UIManager.put("Checkbox.font",Font.SERIF);
    }
    
    public void setTextAreProperties(){
        UIManager.put("TextArea.background", new ColorUIResource(new Color(49,43,31,255)));
        UIManager.put("TextArea.foreground", Color.WHITE);
    }
    
    public void setTitledBorderProperties(){
        UIManager.put("TitledBorder.titleColor",Color.BLACK);
    }
    
    public void setJListProperties(){
        UIManager.put("JList.background",new ColorUIResource(new Color(49,43,31,255)));
        UIManager.put("JList.foreground",Color.WHITE);
    }
    
    public void setScrollPaneProperties(){
        UIManager.put("ScrollPane.background", new ColorUIResource(new Color(49,43,31,255)));
        UIManager.put("ScrollPane.opaque", false);
        
    }
}
