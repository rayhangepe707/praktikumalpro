package pekan8;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class TugasKalkulator {

	private JFrame frame;
	private JTextField textField;
	private JButton btnbagi;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasKalkulator window = new TugasKalkulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TugasKalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 462, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 67, 426, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//===================================================================================================//
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(31, 149, 89, 53);
		frame.getContentPane().add(btnC);
		
		//===================================================================================================//
	
		
		JButton btnpersen = new JButton("%");
		btnpersen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnpersen.setBounds(229, 149, 89, 53);
		frame.getContentPane().add(btnpersen);
		
		//===================================================================================================//
			
		JButton btnb = new JButton("B");
		btnb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String backspace=null;
			if (textField.getText().length()>0)
			{
				
			}
			{
				StringBuilder str=new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backspace = str.toString();
				textField.setText(backspace);
			}
			
			}
		});		
		btnb.setBounds(130, 149, 89, 53);
		frame.getContentPane().add(btnb);
		
		//===================================================================================================//
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});

		btn7.setBounds(31, 213, 89, 53);
		frame.getContentPane().add(btn7);
		
		//===================================================================================================//
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});

		btn8.setBounds(130, 213, 89, 53);
		frame.getContentPane().add(btn8);
		
		//===================================================================================================//
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});

		btn9.setBounds(229, 213, 89, 53);
		frame.getContentPane().add(btn9);
		
		//===================================================================================================//
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});

		btn4.setBounds(31, 278, 89, 53);
		frame.getContentPane().add(btn4);
		
		//===================================================================================================//
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});

		btn5.setBounds(130, 278, 89, 53);
		frame.getContentPane().add(btn5);
		
		//===================================================================================================//
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});

		btn6.setBounds(229, 278, 89, 53);
		frame.getContentPane().add(btn6);
		
		//===================================================================================================//
		
		JButton btntitik = new JButton(".");
		btntitik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btntitik.getText();
				textField.setText(number);
			}
		});

		btntitik.setBounds(130, 406, 89, 53);
		frame.getContentPane().add(btntitik);
		
		//===================================================================================================//
		
		btnbagi = new JButton("/");
		btnbagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnbagi.setBounds(328, 149, 89, 53);
		frame.getContentPane().add(btnbagi);
		
		//===================================================================================================//
		
		JButton btnkali = new JButton("*");
		btnkali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				
				
			}
		});	
		btnkali.setBounds(328, 213, 89, 53);
		frame.getContentPane().add(btnkali);
		
		//===================================================================================================//
		
		JButton btnkurang = new JButton("-");
		btnkurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnkurang.setBounds(328, 278, 89, 53);
		frame.getContentPane().add(btnkurang);
		
		//===================================================================================================//
		
		JButton btnjumlah = new JButton("=");
		btnjumlah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if (operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f" ,result);
					textField.setText(answer);
				}
				else if ( operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if ( operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if ( operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if ( operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);				
				}
					
					
			}
		});
		btnjumlah.setBounds(229, 406, 188, 53);
		frame.getContentPane().add(btnjumlah);
		
		//===================================================================================================//
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});

		btn0.setBounds(31, 406, 89, 53);
		frame.getContentPane().add(btn0);
		
		//===================================================================================================//
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(31, 342, 89, 53);
		frame.getContentPane().add(btn1);
		
		//===================================================================================================//
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(130, 342, 89, 53);
		frame.getContentPane().add(btn2);
		
		//===================================================================================================//
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(229, 342, 89, 53);
		frame.getContentPane().add(btn3);
		
		//===================================================================================================//
		
		JButton btntambah = new JButton("+");
		btntambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btntambah.setBounds(328, 342, 89, 53);
		frame.getContentPane().add(btntambah);
		
		JLabel lblNewLabel = new JLabel("Lala's Calculator");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 21, 138, 24);
		frame.getContentPane().add(lblNewLabel);
	}
}
package pekan8;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class TugasKalkulator {

	private JFrame frame;
	private JTextField textField;
	private JButton btnbagi;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasKalkulator window = new TugasKalkulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TugasKalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 462, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 67, 426, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//===================================================================================================//
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(31, 149, 89, 53);
		frame.getContentPane().add(btnC);
		
		//===================================================================================================//
	
		
		JButton btnpersen = new JButton("%");
		btnpersen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnpersen.setBounds(229, 149, 89, 53);
		frame.getContentPane().add(btnpersen);
		
		//===================================================================================================//
			
		JButton btnb = new JButton("B");
		btnb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String backspace=null;
			if (textField.getText().length()>0)
			{
				
			}
			{
				StringBuilder str=new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backspace = str.toString();
				textField.setText(backspace);
			}
			
			}
		});		
		btnb.setBounds(130, 149, 89, 53);
		frame.getContentPane().add(btnb);
		
		//===================================================================================================//
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});

		btn7.setBounds(31, 213, 89, 53);
		frame.getContentPane().add(btn7);
		
		//===================================================================================================//
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});

		btn8.setBounds(130, 213, 89, 53);
		frame.getContentPane().add(btn8);
		
		//===================================================================================================//
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});

		btn9.setBounds(229, 213, 89, 53);
		frame.getContentPane().add(btn9);
		
		//===================================================================================================//
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});

		btn4.setBounds(31, 278, 89, 53);
		frame.getContentPane().add(btn4);
		
		//===================================================================================================//
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});

		btn5.setBounds(130, 278, 89, 53);
		frame.getContentPane().add(btn5);
		
		//===================================================================================================//
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});

		btn6.setBounds(229, 278, 89, 53);
		frame.getContentPane().add(btn6);
		
		//===================================================================================================//
		
		JButton btntitik = new JButton(".");
		btntitik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btntitik.getText();
				textField.setText(number);
			}
		});

		btntitik.setBounds(130, 406, 89, 53);
		frame.getContentPane().add(btntitik);
		
		//===================================================================================================//
		
		btnbagi = new JButton("/");
		btnbagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnbagi.setBounds(328, 149, 89, 53);
		frame.getContentPane().add(btnbagi);
		
		//===================================================================================================//
		
		JButton btnkali = new JButton("*");
		btnkali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				
				
			}
		});	
		btnkali.setBounds(328, 213, 89, 53);
		frame.getContentPane().add(btnkali);
		
		//===================================================================================================//
		
		JButton btnkurang = new JButton("-");
		btnkurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnkurang.setBounds(328, 278, 89, 53);
		frame.getContentPane().add(btnkurang);
		
		//===================================================================================================//
		
		JButton btnjumlah = new JButton("=");
		btnjumlah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if (operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f" ,result);
					textField.setText(answer);
				}
				else if ( operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if ( operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if ( operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if ( operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);				
				}
					
					
			}
		});
		btnjumlah.setBounds(229, 406, 188, 53);
		frame.getContentPane().add(btnjumlah);
		
		//===================================================================================================//
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});

		btn0.setBounds(31, 406, 89, 53);
		frame.getContentPane().add(btn0);
		
		//===================================================================================================//
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(31, 342, 89, 53);
		frame.getContentPane().add(btn1);
		
		//===================================================================================================//
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(130, 342, 89, 53);
		frame.getContentPane().add(btn2);
		
		//===================================================================================================//
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(229, 342, 89, 53);
		frame.getContentPane().add(btn3);
		
		//===================================================================================================//
		
		JButton btntambah = new JButton("+");
		btntambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btntambah.setBounds(328, 342, 89, 53);
		frame.getContentPane().add(btntambah);
		
		JLabel lblNewLabel = new JLabel("Lala's Calculator");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 21, 138, 24);
		frame.getContentPane().add(lblNewLabel);
	}
}