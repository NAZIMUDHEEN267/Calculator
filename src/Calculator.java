
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
		frame.setSize(800,700);
		frame.setLocation(300,50);
		
		
		
		// label 
		
		JLabel DisplayLabel=new JLabel("hello");
		DisplayLabel.setBounds(50, 50, 680, 50);
		DisplayLabel.setBackground(Color.gray);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setForeground(Color.white);
		
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		//added label into the frame 
		
		frame.add(DisplayLabel);
		
		
		
		//Buttons
		
		JButton SevenButton=new JButton("7");
		SevenButton.setBounds(180,230,80,80);
		
		JButton EightButton=new JButton("8");
		EightButton.setBounds(280,230,80,80);
		
		
		JButton NineButton=new JButton("9");
		NineButton.setBounds(380,230,80,80);
		
		JButton FourButton=new JButton("4");
		FourButton.setBounds(180,320,80,80);
		
		JButton FiveButton=new JButton("5");
		FiveButton.setBounds(280,320,80,80);
		
		
		JButton SixButton=new JButton("6");
		SixButton.setBounds(380,320,80,80);
		
		JButton OneButton=new JButton("1");
		OneButton.setBounds(180,410,80,80);
		
		JButton TwoButton=new JButton("2");
		TwoButton.setBounds(280,410,80,80);
		
		
		JButton ThreeButton=new JButton("3");
		ThreeButton.setBounds(380,410,80,80);
		
		JButton ZeroButton=new JButton("0");
		ZeroButton.setBounds(180,500,180,80);
		
		JButton DotButton=new JButton(".");
		DotButton.setBounds(380,500,80,80);
		
		
		
		//operator buttons
		
		JButton EqualButton=new JButton("=");
		EqualButton.setBounds(480,500,80,80);
		
		JButton AdditionButton=new JButton("+");
		AdditionButton.setBounds(480,410,80,80);
		
			
		JButton SubstractionButton=new JButton("-");
		SubstractionButton.setBounds(480,230,80,80);
		
		JButton MultiplicationButton=new JButton("*");
		MultiplicationButton.setBounds(480,320,80,80);
		
		
		
		
		JButton divitionButton=new JButton("/");
		divitionButton.setBounds(480,140,80,80);
		
		
		JButton PercentageButton=new JButton("%");
		PercentageButton.setBounds(380,140,80,80);
		
		JButton ClearButton=new JButton("C");
		ClearButton.setBounds(280,140,80,80);
		
		JButton AllClearButton=new JButton("AC");
		AllClearButton.setBounds(180,140,80,80);
		
		
		
		//adding the buttons into frame
		
		frame.add(SevenButton);
		frame.add(EightButton);
		frame.add(NineButton);
		frame.add(FourButton);
		frame.add(FiveButton);
		frame.add(SixButton);
		frame.add(OneButton);
		frame.add(TwoButton);
		frame.add(ThreeButton);
		frame.add(ZeroButton);
		frame.add(DotButton);
		
		frame.add(EqualButton);
		frame.add(AdditionButton);
		frame.add(SubstractionButton);
		frame.add(MultiplicationButton);
		frame.add(divitionButton);
		frame.add(PercentageButton);
		frame.add(ClearButton);
		frame.add(AllClearButton);
		
		
		
		
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	}

