package Laba2;

import javax.swing.JComponent;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image extends JComponent {

	private  BufferedImage ugatu;
	
	public Image() {
		try {
			ugatu = ImageIO.read(new File("src/Laba2/12.jpg"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}}
		
	public void paintComponent(Graphics g)
	
	{
		if (ugatu==null) return; //отоброжение изображения
		g.drawImage(ugatu, 0, 0, null);
	}
	
}
