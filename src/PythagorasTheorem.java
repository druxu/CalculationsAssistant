import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PythagorasTheorem extends JFrame {

	private JPanel contentPane;
	private static JTextField fieldSide1;
	private static JTextField fieldSide2;
	private static JLabel labelPT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PythagorasTheorem frame = new PythagorasTheorem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void pt(){
		
		double s1, s2, pt;
		
		s1 = Double.parseDouble(fieldSide1.getText());
		s2 = Double.parseDouble(fieldSide2.getText());
		
		pt = Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
		
		labelPT.setText("The answer is: " + Double.toString(pt));
		
		
		
		
	}
	
	
	/**
	 * Create the frame.
	 */
	public PythagorasTheorem() {
		setTitle("Pythagoras' Theorem");
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
		
		JLabel labelSide1 = new JLabel("Enter the first side:");
		labelSide1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelSide1.setBounds(10, 11, 234, 30);
		contentPane.add(labelSide1);
		
		JLabel labelSide2 = new JLabel("Enter the second side: ");
		labelSide2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelSide2.setBounds(10, 52, 234, 40);
		contentPane.add(labelSide2);
		
		fieldSide1 = new JTextField();
		fieldSide1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldSide1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldSide2.requestFocus();
			
			}
		});
		fieldSide1.setBounds(169, 8, 255, 33);
		contentPane.add(fieldSide1);
		fieldSide1.setColumns(10);
		
		fieldSide2 = new JTextField();
		fieldSide2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldSide2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				pt();
			
			}
		});
		fieldSide2.setBounds(169, 62, 255, 30);
		contentPane.add(fieldSide2);
		fieldSide2.setColumns(10);
		
		labelPT = new JLabel("The answer is:");
		labelPT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelPT.setBounds(10, 195, 414, 30);
		contentPane.add(labelPT);
		
		JButton calculate = new JButton("Calculate");
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				pt();
			
			}
		});
		calculate.setBounds(142, 120, 135, 66);
		contentPane.add(calculate);
	}

}
