package com.headFirstJava.BeatBox;

import java.awt.*;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Andres Ramirez
 *
 */
public class MyDrawPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public void paintComponent( Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		Image img = new ImageIcon("./pic.png").getImage();
		
		int red = (int) (Math.random() * 256 );
		int green = (int) (Math.random() * 256 );
		int blue = (int) (Math.random() * 256 );
		Color startColor = new Color(red, green, blue);
		
		red = (int) (Math.random() * 256 );
		green = (int) (Math.random() * 256 );
		blue = (int) (Math.random() * 256 );
		Color endColor = new Color(red, green, blue);
		
		GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150, endColor);
		g2d.setPaint(gradient);
		g2d.fillOval(180, 200, 150, 150);
		g.drawImage(img, 3, 4, this);
	}
}
