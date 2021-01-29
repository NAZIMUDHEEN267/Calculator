
	import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
	import javax.swing.JLabel;
import javax.swing.SwingConstants;

	public class Calculator {

	public Calculator(){
		
			// frame 
		
		JFrame frame=new JFrame("Calculator") ;
		frame.setLayout(null);
		frame.setSize(600,600);
		frame.setLocation(300,100);
		
		
		
		// label 
		
		JLabel DisplayLabel=new JLabel("hello");
		DisplayLabel.setBounds(30, 50, 540, 50);
		DisplayLabel.setBackground(Color.gray);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setForeground(Color.white);
		
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		//added label into the frame 
		
		frame.add(DisplayLabel);
		
		
		
		//Buttons
		
		JButton SevenButton=new JButton("7");
		SevenButton.setBounds(30,130,80,80);
		
		frame.add(SevenButton);
		
		
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	}

