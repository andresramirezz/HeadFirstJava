/**
 * 
 */
package com.headFirstJava.BeatBox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Andres Ramirez
 *
 */
public class SimpleGui3C implements ActionListener{
	
	JFrame frame;
	
	public static void main(String[] args) {
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton ("Change the colors");
		JButton myButton = new JButton ("Click me!!!");
		JButton myButton2 = new JButton ("Click me!!!");
		JButton myButton3 = new JButton ("Click me!!!");
		button.addActionListener(this);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.NORTH,myButton);
		frame.getContentPane().add(BorderLayout.WEST, myButton2);
		frame.getContentPane().add(BorderLayout.EAST, myButton3);
		frame.setSize( 631, 645 );
		frame.setVisible(true);
		
	}
	
	public void actionPerformed( ActionEvent event ) {
		frame.repaint();
	}

}
