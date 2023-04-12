package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuTest implements ActionListener {
	
	public static Image ugatu;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (ugatu!=null)return;
		ugatu = new Image();
		ugatu.setSize(200,250);
		ugatu.setLocation(100,10);
		
		subversion.main_panel.add(ugatu);
		subversion.main_panel.repaint();
	}
}
