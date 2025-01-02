package pekan8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.DropMode;

public class TugasKalkulator {

	private JFrame frame;
	protected String operation;
	protected double first;

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
		frame.setBounds(100, 100, 356, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 319, 65);
		frame.getContentPane().add(textArea);
		
		JButton Kembali = new JButton("←");
		Kembali.setFont(new Font("Tahoma", Font.BOLD, 15));
		Kembali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Kembali=null;
				if(textArea.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textArea.getText());
					str.deleteCharAt(textArea.getText().length()-1);
					Kembali=str.toString();
					textArea.setText(Kembali);
				}
			}
		});
		Kembali.setBounds(10, 87, 80, 60);
		frame.getContentPane().add(Kembali);
		
		JButton Clear = new JButton("C");
		Clear.setFont(new Font("Tahoma", Font.BOLD, 15));
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		Clear.setBounds(89, 87, 80, 60);
		frame.getContentPane().add(Clear);
		
		JButton Angka9 = new JButton("9");
		Angka9.setFont(new Font("Tahoma", Font.BOLD, 15));
		Angka9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+Angka9.getText();
				textArea.setText(number);
			}
		});
		Angka9.setBounds(169, 147, 80, 60);
		frame.getContentPane().add(Angka9);
		
		JButton DuaNol = new JButton("00");
		DuaNol.setFont(new Font("Tahoma", Font.BOLD, 15));
		DuaNol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+DuaNol.getText();
				textArea.setText(number);
			}
		});
		DuaNol.setBounds(169, 87, 80, 60);
		frame.getContentPane().add(DuaNol);
		
		JButton Angka7 = new JButton("7");
		Angka7.setFont(new Font("Tahoma", Font.BOLD, 15));
		Angka7 .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+Angka7 .getText();
				textArea.setText(number);
			}
		});
		Angka7.setBounds(10, 147, 80, 60);
		frame.getContentPane().add(Angka7);
		
		JButton Angka8 = new JButton("8");
		Angka8.setFont(new Font("Tahoma", Font.BOLD, 15));
		Angka8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+Angka8.getText();
				textArea.setText(number);
			}
		});
		Angka8.setBounds(89, 147, 80, 60);
		frame.getContentPane().add(Angka8);
		
		JButton Angka6 = new JButton("6");
		Angka6.setFont(new Font("Tahoma", Font.BOLD, 15));
		Angka6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+Angka6.getText();
				textArea.setText(number);
			}
		});
		Angka6.setBounds(169, 207, 80, 60);
		frame.getContentPane().add(Angka6);
		
		JButton Tambah = new JButton("+");
		Tambah.setFont(new Font("Tahoma", Font.BOLD, 15));
		Tambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation="+";
			}
		});
		Tambah.setBounds(249, 87, 80, 60);
		frame.getContentPane().add(Tambah);
		
		JButton Angka4 = new JButton("4");
		Angka4.setFont(new Font("Tahoma", Font.BOLD, 15));
		Angka4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+Angka4.getText();
				textArea.setText(number);
			}
		});
		Angka4.setBounds(10, 207, 80, 60);
		frame.getContentPane().add(Angka4);
		
		JButton Angka5 = new JButton("5");
		Angka5.setFont(new Font("Tahoma", Font.BOLD, 15));
		Angka5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+Angka5.getText();
				textArea.setText(number);
			}
		});
		Angka5.setBounds(89, 207, 80, 60);
		frame.getContentPane().add(Angka5);
		
		JButton Angka3 = new JButton("3");
		Angka3.setFont(new Font("Tahoma", Font.BOLD, 15));
		Angka3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+Angka3.getText();
				textArea.setText(number);
			}
		});
		Angka3.setBounds(169, 267, 80, 60);
		frame.getContentPane().add(Angka3);
		
		JButton kurang = new JButton("-");
		kurang.setFont(new Font("Tahoma", Font.BOLD, 15));
		kurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation="-";
			}
		});
		kurang.setBounds(249, 147, 80, 60);
		frame.getContentPane().add(kurang);
		
		JButton Angka1 = new JButton("1");
		Angka1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Angka1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+Angka1.getText();
				textArea.setText(number);
			}
		});
		Angka1.setBounds(10, 267, 80, 60);
		frame.getContentPane().add(Angka1);
		
		JButton Angka2 = new JButton("2");
		Angka2.setFont(new Font("Tahoma", Font.BOLD, 15));
		Angka2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+Angka2.getText();
				textArea.setText(number);
			}
		});
		Angka2.setBounds(89, 267, 80, 60);
		frame.getContentPane().add(Angka2);
		
		JButton Titik = new JButton(".");
		Titik.setFont(new Font("Tahoma", Font.BOLD, 15));
		Titik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+Titik.getText();
				textArea.setText(number);
			}
		});
		Titik.setBounds(10, 327, 80, 60);
		frame.getContentPane().add(Titik);
		
		JButton SamaDengan = new JButton("=");
		SamaDengan.setFont(new Font("Tahoma", Font.BOLD, 15));
		SamaDengan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				double second = Double.parseDouble(textArea.getText());
				double result;
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.0f", result);
					textArea.setText(answer);
				}
				else if (operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textArea.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textArea.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textArea.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textArea.setText(answer);
				}
			}
		});
		SamaDengan.setBounds(169, 327, 80, 60);
		frame.getContentPane().add(SamaDengan);
		
		JButton Angka0 = new JButton("0");
		Angka0.setFont(new Font("Tahoma", Font.BOLD, 15));
		Angka0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText()+Angka0.getText();
				textArea.setText(number);
			}
		});
		Angka0.setBounds(89, 327, 80, 60);
		frame.getContentPane().add(Angka0);
		
		JButton Kali = new JButton("*");
		Kali.setFont(new Font("Tahoma", Font.BOLD, 15));
		Kali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation="*";
			}
		});
		Kali.setBounds(249, 207, 80, 60);
		frame.getContentPane().add(Kali);
		
		JButton Bagi = new JButton("/");
		Bagi.setFont(new Font("Tahoma", Font.BOLD, 15));
		Bagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation="/";
			}
		});
		Bagi.setBounds(249, 267, 80, 60);
		frame.getContentPane().add(Bagi);
		
		JButton Modulo = new JButton("%");
		Modulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		Modulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation="%";
		Modulo.setBounds(249, 327, 80, 60);
		frame.getContentPane().add(Modulo);
			}
		});
		Modulo.setBounds(249, 327, 80, 60);
		frame.getContentPane().add(Modulo);
		
	}		
}

	