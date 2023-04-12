package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Обработчки действий нажатия на пункты выпадающего списка

public class JComboBoxActionListener implements ActionListener {
    public JComboBoxActionListener() {
    }

    public void actionPerformed(ActionEvent e) {
        if (subversion.editComboBox.getSelectedItem() == "Переместить логотип УГАТУ в верхний правый угол") {
            try {
                JMenuTest.ugatu.setLocation(180, 5);
            } catch (NullPointerException var5) {
            }
        } else if (subversion.editComboBox.getSelectedItem() == "Переместить логотип УГАТУ в cередину") {
            try {
            	JMenuTest.ugatu.setLocation(100, 20);
            } catch (NullPointerException var4) {
            }
        } else if (subversion.editComboBox.getSelectedItem() == "Переместить логотип УГАТУ в левый верхний угол") {
            try {
            	JMenuTest.ugatu.setLocation(5, 5);
            } catch (NullPointerException var3) {
            }
        }

    }
}