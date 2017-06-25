/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component_renderers;

import java.awt.Color;
import java.awt.Component;
import javafx.scene.web.PromptData;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Acer
 */
public class JComboBoxRenderer_Month extends JLabel implements ListCellRenderer<Object> {

    private String prompt;
    
    public JComboBoxRenderer_Month(String aPrompt){
        this.prompt = aPrompt;
        this.setOpaque(true);
    }
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Object> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if(value instanceof Integer){
            switch((Integer)value){
                case 0: this.setText("Jan"); break;
                case 1: this.setText("Feb"); break;
                case 2: this.setText("Mar"); break;
                case 3: this.setText("Apr"); break;
                case 4: this.setText("May"); break;
                case 5: this.setText("Jun"); break;
                case 6: this.setText("Jul"); break;
                case 7: this.setText("Aug"); break;
                case 8: this.setText("Sep"); break;
                case 9: this.setText("Oct"); break;
                case 10: this.setText("Nov"); break;
                case 11: this.setText("Dec"); break;
            }
        }
        if (value == null) {
            this.setText(prompt);
        }

        if (isSelected) {
            this.setBackground(Color.YELLOW);
//            this.setBackground(list.getSelectionBackground());
            this.setForeground(list.getSelectionForeground());
        } else {
            this.setBackground(list.getBackground());
            this.setForeground(list.getForeground());
        }
        return this;
    }
    
}
