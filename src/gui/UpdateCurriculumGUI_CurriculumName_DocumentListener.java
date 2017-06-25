package gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class UpdateCurriculumGUI_CurriculumName_DocumentListener implements DocumentListener {

    JButton jbtn;
    JLabel jlbl;
    JComboBox jcbx;
    String jtfOriginalStringDocument;
    String jlblOriginalString;

    public UpdateCurriculumGUI_CurriculumName_DocumentListener(JLabel p_jlbl, JComboBox p_jcbx, JButton p_jbtn) {
        this.jlbl = p_jlbl;
        this.jcbx = p_jcbx;
        this.jbtn = p_jbtn;
        this.jlblOriginalString = p_jlbl.getText().trim();
        this.jtfOriginalStringDocument = jcbx.getSelectedItem().toString();
        
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        if (!jtfOriginalStringDocument.equals(jcbx.getSelectedItem().toString() ) ) {
            this.jlbl.setText("* " + jlblOriginalString);
            this.jbtn.setEnabled(true);
            UpdateCurriculumGUI.setIsCurriculumChanged(Boolean.TRUE);
        }else{
            this.jlbl.setText(jlblOriginalString);
            UpdateCurriculumGUI.setIsCurriculumChanged(Boolean.FALSE);
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        if (!jtfOriginalStringDocument.equals(jcbx.getSelectedItem().toString())) {
            this.jlbl.setText("* " + jlblOriginalString);
            this.jbtn.setEnabled(true);
            UpdateCurriculumGUI.setIsCurriculumChanged(Boolean.TRUE);
        }else{
            this.jlbl.setText(jlblOriginalString);
            UpdateCurriculumGUI.setIsCurriculumChanged(Boolean.FALSE);
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        if (!jtfOriginalStringDocument.equals(jcbx.getSelectedItem().toString())) {
            this.jlbl.setText("* " + jlblOriginalString);
            this.jbtn.setEnabled(true);
            UpdateCurriculumGUI.setIsCurriculumChanged(Boolean.TRUE);
        }else{
            this.jlbl.setText(jlblOriginalString);
            UpdateCurriculumGUI.setIsCurriculumChanged(Boolean.FALSE);
        }
    }

}
