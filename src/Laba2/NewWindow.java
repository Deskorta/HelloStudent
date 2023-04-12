package Laba2;
import java.awt.event.*;
import javax.swing.*;

public class NewWindow extends AbstractAction{

	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {
		
		JFrame info = new JFrame("Информация");//Создание окна "Информация"
		info.setBounds(500,400,300,300);
		
		JLabel infoR = new JLabel("Юлия Валерьевна - 816");//Информация о разработчиках в окне
		infoR.setBounds(130, 50, 300, 50);
		
		JLabel infoA = new JLabel("Алсу Александровна - 389");
		infoA.setBounds(130, 90, 300, 50);
		byte b = (byte) 200;  
		System.out.print(b);
	
		
		JButton returnToMainButton = new JButton("Назад");
		returnToMainButton.setBounds(100,200,200,30);
		info.add(returnToMainButton);
		returnToMainButton.addActionListener(m -> {
			info.dispose(); //разрушение экземпляра info при нажатии внопки назад
			
		});
		

		info.add(infoR);
		info.add(infoA);
		info.setSize(400,400);
		info.setLayout(null);
		info.setVisible(true);
	}
}
