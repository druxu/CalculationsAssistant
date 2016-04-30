import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CbRoot extends JFrame {

	private JPanel contentPane;
	private static JTextField fieldCbRoot;
	private static JLabel labelAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CbRoot frame = new CbRoot();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void cbRoot(){
		
		double cbroot = Double.parseDouble(fieldCbRoot.getText());
		
		double answer = Math.cbrt(cbroot);
		
		labelAnswer.setText("The answer is: "+Double.toString(answer));
		
		
	}
		
	/**
	 * Create the frame.
	 */
	public CbRoot() {
		setTitle("Cube Root");
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
		
		JLabel labelCbRoot = new JLabel("Enter the number you would like to find the cube root of:");
		labelCbRoot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelCbRoot.setBounds(10, 11, 387, 26);
		contentPane.add(labelCbRoot);
		
		fieldCbRoot = new JTextField();
		fieldCbRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				cbRoot();
			
			}
		});
		fieldCbRoot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldCbRoot.setBounds(20, 57, 186, 29);
		contentPane.add(fieldCbRoot);
		fieldCbRoot.setColumns(10);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				cbRoot();
			
			}
		});
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		calculate.setBounds(147, 119, 126, 53);
		contentPane.add(calculate);
		
		labelAnswer = new JLabel("The answer is:");
		labelAnswer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelAnswer.setBounds(10, 193, 414, 37);
		contentPane.add(labelAnswer);
	}

}
