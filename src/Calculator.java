
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


public class  Calculator implements ActionListener{

	
		//global 
	
		boolean isOperatorClicked=false;
		String oldValue;
	
		JFrame frame;
		
		JLabel DisplayLabel;
		
		JButton SevenButton;
		
		JButton EightButton;
		
		JButton NineButton;
		
		JButton FourButton;
		
		JButton FiveButton;

		
		JButton SixButton;

		JButton OneButton;
		
		JButton TwoButton;
		
		JButton ThreeButton;
		
		JButton ZeroButton;
		
		JButton DotButton;
		
		JButton EqualButton;
		
		JButton AdditionButton;
					
		JButton SubstractionButton;
		
		JButton MultiplicationButton;
				
		JButton divitionButton;
		
		JButton PercentageButton;
		
		JButton ClearButton;

		JButton AllClearButton;
		
		
		
			public Calculator(){
		
			// frame 
		
		frame=new JFrame("Calculator") ;
		frame.setLayout(null);
		frame.setSize(800,700);
		frame.setLocation(300,50);
		
		
		
		
		// label 
		
		DisplayLabel=new JLabel();
		DisplayLabel.setBounds(50, 50, 680, 50);
		DisplayLabel.setBackground(Color.white);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		DisplayLabel.setForeground(Color.black);
		Border border = BorderFactory.createLineBorder(Color.gray, 5);
		 
        // set the border of this component
        DisplayLabel.setBorder(border);
 
		
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		//added label into the frame 
		
		frame.add(DisplayLabel);
		
		
		
		//Buttons
		
		SevenButton=new JButton("7");
		SevenButton.setBounds(180,230,80,80);
		SevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		SevenButton.setBackground(Color.white);
		SevenButton.addActionListener(this);
		
		EightButton=new JButton("8");
		EightButton.setBounds(280,230,80,80);
		EightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		EightButton.setBackground(Color.white);
		EightButton.addActionListener(this);
		
		
		NineButton=new JButton("9");
		NineButton.setBounds(380,230,80,80);
		NineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		NineButton.setBackground(Color.white);
		NineButton.addActionListener(this);
		
		FourButton=new JButton("4");
		FourButton.setBounds(180,320,80,80);
		FourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		FourButton.setBackground(Color.white);
		FourButton.addActionListener(this);
		
		FiveButton=new JButton("5");
		FiveButton.setBounds(280,320,80,80);
		FiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		FiveButton.setBackground(Color.white);
		FiveButton.addActionListener(this);
		
		
		SixButton=new JButton("6");
		SixButton.setBounds(380,320,80,80);
		SixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		SixButton.setBackground(Color.white);
		SixButton.addActionListener(this);
		
		OneButton=new JButton("1");
		OneButton.setBounds(180,410,80,80);
		OneButton.setFont(new Font("Arial", Font.PLAIN, 30));
		OneButton.setBackground(Color.white);
		OneButton.addActionListener(this);
		
		TwoButton=new JButton("2");
		TwoButton.setBounds(280,410,80,80);
		TwoButton.setFont(new Font("Arial", Font.PLAIN, 30));
		TwoButton.setBackground(Color.white);
		TwoButton.addActionListener(this);
		
		ThreeButton=new JButton("3");
		ThreeButton.setBounds(380,410,80,80);
		ThreeButton.setFont(new Font("Arial", Font.PLAIN, 30));
		ThreeButton.setBackground(Color.white);
		ThreeButton.addActionListener(this);
		
		ZeroButton=new JButton("0");
		ZeroButton.setBounds(180,500,180,80);
		ZeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
		ZeroButton.setBackground(Color.white);
		ZeroButton.addActionListener(this);
		
		DotButton=new JButton(".");
		DotButton.setBounds(380,500,80,80);
		 DotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		 DotButton.setBackground(Color.white);
		 DotButton.addActionListener(this);
		
		
		
		//operator buttons
		
		EqualButton=new JButton("=");
		EqualButton.setBounds(480,500,80,80);
		EqualButton.setFont(new Font("Arial", Font.PLAIN, 30));
		EqualButton.setBackground(Color.green);
		EqualButton.setForeground(Color.white);
		EqualButton.addActionListener(this);
		
		
		AdditionButton=new JButton("+");
		AdditionButton.setBounds(480,410,80,80);
		AdditionButton.setFont(new Font("Arial", Font.PLAIN, 30));
		AdditionButton.setBackground(Color.white);
		AdditionButton.addActionListener(this);
		
			
		SubstractionButton=new JButton("-");
		SubstractionButton.setBounds(480,230,80,80);
		SubstractionButton.setFont(new Font("Arial", Font.PLAIN, 30));
		SubstractionButton.setBackground(Color.white);
		SubstractionButton.addActionListener(this);
		
		MultiplicationButton=new JButton("*");
		MultiplicationButton.setBounds(480,320,80,80);
		MultiplicationButton.setFont(new Font("Arial", Font.PLAIN, 	30));
		MultiplicationButton.setBackground(Color.white);
		MultiplicationButton.addActionListener(this);
		
		
		
		
		divitionButton=new JButton("/");
		divitionButton.setBounds(480,140,80,80);
		divitionButton.setFont(new Font("Arial", Font.PLAIN, 30));
		divitionButton.setBackground(Color.white);
		divitionButton.addActionListener(this);
		
		
		PercentageButton=new JButton("%");
		PercentageButton.setBounds(380,140,80,80);
		PercentageButton.setFont(new Font("Arial", Font.PLAIN, 30));
		PercentageButton.setBackground(Color.white);
		PercentageButton.addActionListener(this);
		
		ClearButton=new JButton("C");
		ClearButton.setBounds(280,140,80,80);
		ClearButton.setFont(new Font("Arial", Font.PLAIN, 30));
		ClearButton.setBackground(Color.yellow);
		ClearButton.setForeground(Color.white);
		ClearButton.addActionListener(this);
		
		AllClearButton=new JButton("AC");
		AllClearButton.setBounds(180,140,80,80);
		AllClearButton.setFont(new Font("Arial", Font.PLAIN, 30));
		AllClearButton.setBackground(Color.red);
		AllClearButton.setForeground(Color.white);
		AllClearButton.addActionListener(this);
		
		
		
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

		
		public void actionPerformed(ActionEvent e){
			if (e.getSource()==SevenButton) {
				if (isOperatorClicked) {
					DisplayLabel.setText("7");
					isOperatorClicked=false;
				}else {
					String labelText=DisplayLabel.getText();
					DisplayLabel.setText(labelText+"7");
				}
								
			}else if (e.getSource()==EightButton) {
				if (isOperatorClicked) {
					DisplayLabel.setText("8");
					isOperatorClicked=false;
				}else {
					String labelText=DisplayLabel.getText();
					DisplayLabel.setText(labelText+"8");
				}
					
			}else if(e.getSource()==NineButton) {
				if (isOperatorClicked) {
					DisplayLabel.setText("9");
					isOperatorClicked=false;
				}else {
					String labelText=DisplayLabel.getText();
					DisplayLabel.setText(labelText+"9");
				}
					
			}else if(e.getSource()==FourButton) {
				if (isOperatorClicked) {
					DisplayLabel.setText("4");
					isOperatorClicked=false;
				}else {
					String labelText=DisplayLabel.getText();
					DisplayLabel.setText(labelText+"4");
				}
					
			}
			else if(e.getSource()==FiveButton) {
				if (isOperatorClicked) {
					DisplayLabel.setText("5");
					isOperatorClicked=false;
				}else {
					String labelText=DisplayLabel.getText();
					DisplayLabel.setText(labelText+"5");
				}
					
			}
			else if(e.getSource()==SixButton) {
				if (isOperatorClicked) {
					DisplayLabel.setText("6");
					isOperatorClicked=false;
				}else {
					String labelText=DisplayLabel.getText();
					DisplayLabel.setText(labelText+"6");
				}
					
				
			}
			
			else if(e.getSource()==OneButton) {
				if (isOperatorClicked) {
					DisplayLabel.setText("1");
					isOperatorClicked=false;
				}else {
					String labelText=DisplayLabel.getText();
					DisplayLabel.setText(labelText+"1");
				}
					
				
			}
			else if(e.getSource()==TwoButton) {
				if (isOperatorClicked) {
					DisplayLabel.setText("2");
					isOperatorClicked=false;
				}else {
					String labelText=DisplayLabel.getText();
					DisplayLabel.setText(labelText+"2");
				}
					
				
			}
			else if(e.getSource()==ThreeButton) {
				if (isOperatorClicked) {
					DisplayLabel.setText("3");
					isOperatorClicked=false;
				}else {
					String labelText=DisplayLabel.getText();
					DisplayLabel.setText(labelText+"3");
				}
					
				
			}
			else if(e.getSource()==ZeroButton) {
				if (isOperatorClicked) {
					DisplayLabel.setText("0");
					isOperatorClicked=false;
				}else {
					String labelText=DisplayLabel.getText();
					DisplayLabel.setText(labelText+"0");
				}
					
			}else if(e.getSource()==DotButton) {
				if (isOperatorClicked) {
					DisplayLabel.setText(".");
					isOperatorClicked=false;
				}else {
					String labelText=DisplayLabel.getText();
					DisplayLabel.setText(labelText+".");
				}
					
			}
			
			
			
			
			
			else if (e.getSource()==AdditionButton) {
				oldValue=DisplayLabel.getText();
				isOperatorClicked=true;
				
				DisplayLabel.setText("+");
				
			}else if(e.getSource()==MultiplicationButton) {	
				oldValue=DisplayLabel.getText();
				isOperatorClicked=true;
				DisplayLabel.setText("*");
				
			}else if(e.getSource()==SubstractionButton) {
				oldValue=DisplayLabel.getText();
				isOperatorClicked=true;
				DisplayLabel.setText("-");
				
			}
			else if(e.getSource()==divitionButton) {
				oldValue=DisplayLabel.getText();
				isOperatorClicked=true;
				DisplayLabel.setText("/");
				
			}
			else if(e.getSource()==PercentageButton) {
				oldValue=DisplayLabel.getText();
				isOperatorClicked=true;
				DisplayLabel.setText("%");
				
			}
			else if(e.getSource()==AllClearButton) {
				DisplayLabel.setText("");
				
			}
			
		}
	}

