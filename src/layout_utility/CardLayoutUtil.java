
package layout_utility;

import javax.swing.JPanel;

public class CardLayoutUtil {
    
    public static void flipCardTo(JPanel aCardContainer, JPanel aCardPanel){
        aCardContainer.removeAll();
        aCardContainer.add(aCardPanel);
        aCardContainer.repaint();
        aCardContainer.revalidate(); 
    }
}
