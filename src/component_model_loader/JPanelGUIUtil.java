package component_model_loader;

import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JPanelGUIUtil {

    //this method gets any JComponents found in a container(JPanel..etc) 
    public static List<Component> getComponentsAsList(Container container) {
        List<Component> list = new ArrayList<>();
        list.addAll(Arrays.asList(container.getComponents()));
        return list;
    }

    public static void enableFields(List<Component> JComponents) {

        for (Component c : JComponents) // for every component
        {
            if (c instanceof JTextField) {
                c.setEnabled(true);
            }
            if (c instanceof JComboBox) {
                c.setEnabled(true);
            }
            if (c instanceof JCheckBox) {
                c.setEnabled(true);
            }
        }//--end of for each loop
    }// --end of method

    public static void disableAllJCheckBox(Container aContainer) {
        Component[] component = aContainer.getComponents();
        for (Component c : component) {
            if (c instanceof JCheckBox) {
                c.setEnabled(false);
            }
        }
    }

    public static List<Component> getAllComponents(final Container c) {
        Component[] comps = c.getComponents();
        List<Component> compList = new ArrayList<>();
        for (Component comp : comps) {
            compList.add(comp);
            if (comp instanceof Container) {
                compList.addAll(getAllComponents((Container) comp));
            }
        }
        return compList;
    }

    public static void clearJTextFields(Container container){
        Component[] comp = container.getComponents();
        for(Component c : comp){
            if(c instanceof JTextField){
                ((JTextField)c).setText("");
            }
        }
    }
    
    public static void clearFields(final Container aContainer) {
        Component[] myComponents = aContainer.getComponents();
        for (Component aComp : myComponents) {
            if (aComp instanceof JTextField) {
                ((JTextField) aComp).setText("");
            } else if (aComp instanceof JComboBox) {
                ((JComboBox) aComp).setSelectedIndex(-1);
            } else if (aComp instanceof JCheckBox) {
                ((JCheckBox) aComp).setSelected(false);
            } else if (aComp instanceof JTable) {
                DefaultTableModel jtblModel = (DefaultTableModel) ((JTable) aComp).getModel();
                jtblModel.setRowCount(0);
            }
        }
    }

    public static void resetJComboIndex(List<Component> JComponents) {
        for (Component c : JComponents) // for every component
        {
            if (c instanceof JComboBox) {
                ((JComboBox) c).setSelectedIndex(0);
            }
        }
    }

    public static void setJCheckBoxSelected(List<Component> comp) {
        for (Component c : comp) {
            if (c instanceof JCheckBox) {
                ((JCheckBox) c).setSelected(true);
            }
        }
    }

    public static void clearJCheckBox(Container aContainer) {
        Component[] components = aContainer.getComponents();
        for (Component c : components) {
            if (c instanceof JCheckBox) {
                ((JCheckBox) c).setSelected(false);
            }
        }
    }

    public static void enableJCheckBox(Container aContainer) {
        Component[] components = aContainer.getComponents();
        for (Component c : components) {
            if (c instanceof JCheckBox) {
                ((JCheckBox) c).setEnabled(true);
            }
        }
    }

    public static void disableJCheckBox(List<Component> comp) {
        for (Component c : comp) {
            if (c instanceof JCheckBox) {
                ((JCheckBox) c).setEnabled(false);
            }
        }
    }

    public static boolean hasNullComboBox(Container aContainer) {
        boolean hasNull = false;
        int jComboIndex;
        Component[] components = aContainer.getComponents();
        for (Component c : components) {
            if (c instanceof JComboBox) {
                jComboIndex = ((JComboBox) c).getSelectedIndex();
                hasNull = jComboIndex < 0;
            }
        }
        return hasNull;
    }

    public static boolean areFieldsEmpty(List<Component> comp) {
        Boolean bool = false;
        for (Component c : comp) {
            if (c instanceof JTextField) {
                bool = ((JTextField) c).getText().isEmpty();
            }
        }
        return bool;
    }

    
}
