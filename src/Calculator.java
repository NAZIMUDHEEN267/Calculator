
	import java.awt.Color;
import java.awt.Font;

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
		SevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		SevenButton.setBackground(Color.white);
		
		JButton EightButton=new JButton("8");
		EightButton.setBounds(280,230,80,80);
		EightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		EightButton.setBackground(Color.white);
		
		
		JButton NineButton=new JButton("9");
		NineButton.setBounds(380,230,80,80);
		NineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		NineButton.setBackground(Color.white);
		
		JButton FourButton=new JButton("4");
		FourButton.setBounds(180,320,80,80);
		FourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		FourButton.setBackground(Color.white);
		
		JButton FiveButton=new JButton("5");
		FiveButton.setBounds(280,320,80,80);
		FiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		FiveButton.setBackground(Color.white);
		
		
		JButton SixButton=new JButton("6");
		SixButton.setBounds(380,320,80,80);
		SixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		SixButton.setBackground(Color.white);
		
		JButton OneButton=new JButton("1");
		OneButton.setBounds(180,410,80,80);
		OneButton.setFont(new Font("Arial", Font.PLAIN, 30));
		OneButton.setBackground(Color.white);
		
		JButton TwoButton=new JButton("2");
		TwoButton.setBounds(280,410,80,80);
		TwoButton.setFont(new Font("Arial", Font.PLAIN, 30));
		TwoButton.setBackground(Color.white);
		
		
		JButton ThreeButton=new JButton("3");
		ThreeButton.setBounds(380,410,80,80);
		ThreeButton.setFont(new Font("Arial", Font.PLAIN, 30));
		ThreeButton.setBackground(Color.white);
		
		JButton ZeroButton=new JButton("0");
		ZeroButton.setBounds(180,500,180,80);
		ZeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
		ZeroButton.setBackground(Color.white);
		
		JButton DotButton=new JButton(".");
		DotButton.setBounds(380,500,80,80);
		 DotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		 DotButton.setBackground(Color.white);
		
		
		
		//operator buttons
		
		JButton EqualButton=new JButton("=");
		EqualButton.setBounds(480,500,80,80);
		EqualButton.setFont(new Font("Arial", Font.PLAIN, 30));
		EqualButton.setBackground(Color.green);
		EqualButton.setForeground(Color.white);
		
		
		JButton AdditionButton=new JButton("+");
		AdditionButton.setBounds(480,410,80,80);
		AdditionButton.setFont(new Font("Arial", Font.PLAIN, 30));
		AdditionButton.setBackground(Color.white);
		
			
		JButton SubstractionButton=new JButton("-");
		SubstractionButton.setBounds(480,230,80,80);
		SubstractionButton.setFont(new Font("Arial", Font.PLAIN, 30));
		SubstractionButton.setBackground(Color.white);
		
		JButton MultiplicationButton=new JButton("*");
		MultiplicationButton.setBounds(480,320,80,80);
		MultiplicationButton.setFont(new Font("Arial", Font.PLAIN, 	30));
		MultiplicationButton.setBackground(Color.white);
		
		
		
		
		JButton divitionButton=new JButton("/");
		divitionButton.setBounds(480,140,80,80);
		divitionButton.setFont(new Font("Arial", Font.PLAIN, 30));
		divitionButton.setBackground(Color.white);
		
		
		JButton PercentageButton=new JButton("%");
		PercentageButton.setBounds(380,140,80,80);
		PercentageButton.setFont(new Font("Arial", Font.PLAIN, 30));
		PercentageButton.setBackground(Color.white);
		
		JButton ClearButton=new JButton("C");
		ClearButton.setBounds(280,140,80,80);
		ClearButton.setFont(new Font("Arial", Font.PLAIN, 30));
		ClearButton.setBackground(Color.yellow);
		ClearButton.setForeground(Color.white);
		
		JButton AllClearButton=new JButton("AC");
		AllClearButton.setBounds(180,140,80,80);
		AllClearButton.setFont(new Font("Arial", Font.PLAIN, 30));
		AllClearButton.setBackground(Color.red);
		AllClearButton.setForeground(Color.white);
		
		
		
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

