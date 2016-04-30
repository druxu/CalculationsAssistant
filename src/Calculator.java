import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCalc;
	private double num1;
	private double num2;
	private double answer;
	private int operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			fieldCalc.setText(fieldCalc.getText() + "1");
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn1.setBounds(20, 49, 54, 43);
		contentPane.add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldCalc.setText(fieldCalc.getText() + "4");
			
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn4.setBounds(20, 103, 54, 41);
		contentPane.add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldCalc.setText(fieldCalc.getText() + "7");
			
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn7.setBounds(20, 155, 54, 41);
		contentPane.add(btn7);
		
		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldCalc.setText(fieldCalc.getText() + "2");
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn2.setBounds(84, 49, 54, 43);
		contentPane.add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldCalc.setText(fieldCalc.getText() + "5");
			
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn5.setBounds(84, 103, 54, 41);
		contentPane.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldCalc.setText(fieldCalc.getText() + "8");
			
			}
		});
		btn8.setBounds(84, 155, 54, 41);
		contentPane.add(btn8);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldCalc.setText(fieldCalc.getText() + "0");
			
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn0.setBounds(84, 207, 54, 43);
		contentPane.add(btn0);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldCalc.setText(fieldCalc.getText() + "3");
			
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn3.setBounds(148, 49, 54, 43);
		contentPane.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldCalc.setText(fieldCalc.getText() + "6");
			
			}
		});
		btn6.setBounds(148, 103, 54, 41);
		contentPane.add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldCalc.setText(fieldCalc.getText() + "9");
			
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn9.setBounds(148, 155, 54, 41);
		contentPane.add(btn9);
		
		JButton btnDec = new JButton(".");
		btnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldCalc.setText(fieldCalc.getText() + ".");
			
			}
		});
		btnDec.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDec.setBounds(148, 207, 54, 44);
		contentPane.add(btnDec);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				num1 = Double.parseDouble(fieldCalc.getText());
				fieldCalc.setText("");
				operator = 0;
			
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAdd.setBounds(227, 49, 89, 43);
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				num1 = Double.parseDouble(fieldCalc.getText());
				fieldCalc.setText("");
				operator = 1;
				
			
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSub.setBounds(227, 103, 89, 41);
		contentPane.add(btnSub);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				num1 = Double.parseDouble(fieldCalc.getText());
				fieldCalc.setText("");
				operator = 2;
			
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnMult.setBounds(227, 155, 89, 41);
		contentPane.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				num1 = Double.parseDouble(fieldCalc.getText());
				fieldCalc.setText("");
				operator = 3;
			
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDiv.setBounds(227, 207, 89, 44);
		contentPane.add(btnDiv);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			fieldCalc.setText("");
			num1 = 0;
			
			
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnClear.setBounds(345, 155, 79, 96);
		contentPane.add(btnClear);
		
		fieldCalc = new JTextField();
		fieldCalc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		fieldCalc.setBounds(20, 11, 295, 31);
		contentPane.add(fieldCalc);
		fieldCalc.setColumns(10);
		
		JButton btnPosNeg = new JButton("+/-");
		btnPosNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				num1 =  Double.parseDouble(fieldCalc.getText());
				fieldCalc.setText(Double.toString(num1 * -1));
				
			
			}
		});
		btnPosNeg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPosNeg.setBounds(20, 207, 54, 44);
		contentPane.add(btnPosNeg);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
			if(operator == 0 || operator == 1 || operator == 2 || operator == 3 && num1 != 0){
				
				num2 = Double.parseDouble(fieldCalc.getText());
				
				
				switch(operator){
				
				case 0:
					answer = num1 + num2;
					fieldCalc.setText(Double.toString(answer));
					break;
					
				case 1:
					answer = num1 - num2;
					fieldCalc.setText(Double.toString(answer));
					break;
					
				case 2:
					answer = num1 * num2;
					fieldCalc.setText(Double.toString(answer));
					break;
				
				case 3:
					answer = num1 / num2;
					fieldCalc.setText(Double.toString(answer));
					break;
					
				
					
				}
				
				
				
				
			}
			
			}
		});
		btnEq.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEq.setBounds(345, 49, 79, 95);
		contentPane.add(btnEq);
		
		
		
	}
}
