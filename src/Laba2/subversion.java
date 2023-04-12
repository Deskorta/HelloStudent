package Laba2; //пакет Java классов

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//библиотека для события слушателя

import javax.swing.*; // Библиотека для GUI (построена на основе awt)


public class subversion {
	public static JFrame main_GUI;
	public static JFrame main_jbc;
	public static JPanel main_panel;
	public static JComboBox editComboBox;
	public static final String[] items = {
			"Переместить логотип УГАТУ в верхний правый угол",
			"Переместить логотип УГАТУ в cередину",
			"Переместить логотип УГАТУ в левый верхний угол"
	};


	public subversion() {
		JFrame main_GUI = new JFrame("subversion");	// создание графического окна
		main_GUI.setTitle ("Hello!");
		main_GUI.setBounds(400,400,400,350);
		main_GUI.setResizable(false); // фиксированный размер окна


		main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null);
		main_GUI.add(main_panel);


		NewWindow button_info = new NewWindow();
		JButton button_inf = new JButton("Информация"); // кнопка отображения информации в другом окне
		button_inf.addActionListener(button_info);
		button_inf.setBounds(50,200,150,30);
		main_panel.add(button_inf);


		editComboBox = new JComboBox(items);
		editComboBox.setBounds(15, 50, 350, 30);
		ActionListener actionListeneer = new JComboBoxActionListener();
		editComboBox.addActionListener(actionListeneer);
		main_panel.add(editComboBox);


		JMenu menu = new JMenu("Меню");
		JMenuItem Logo = new JMenuItem("Отобразить логтип УГАТУ");
		JMenuItem Exit = new JMenuItem("Выход");
		ActionListener actionListen = new ListenerButton();
		Logo.addActionListener(new JMenuTest());
		Exit.addActionListener(actionListen);
		menu.add(Logo);
		menu.add(Exit);
		JMenuBar mb = new JMenuBar();
		mb.add(menu);
		main_GUI.setJMenuBar(mb);


		JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
		laba_info.setBounds(120,0,150,30);
		main_panel.add(laba_info);


		JButton button_exit = new JButton("Выход"); // добавляем кнопку
		button_exit.setBounds(270,200,100,40);
		ActionListener actionListener = new ListenerButton(); //создаем слушатель
		button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
		main_panel.add(button_exit);


		main_GUI.setVisible(true);

		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}


	public static void main(String [] args) {
		subversion student = new subversion();
	}




}
