import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SqRoot extends JFrame {

	private JPanel contentPane;
	private static JTextField fieldSqRoot;
	private JButton calculate;
	private static JLabel labelAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SqRoot frame = new SqRoot();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void sqRoot(){
		
		double sqRoot = Double.parseDouble(fieldSqRoot.getText());
		
		double answer = Math.sqrt(sqRoot);
		
		labelAnswer.setText("The answer is: "+ Double.toString(answer));
		
		
	}
	
	/**
	 * Create the frame.
	 */
	public SqRoot() {
		setTitle("Square Root");
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
		
		JLabel labelSqRoot = new JLabel("Enter the number you would like to find the square root of:");
		labelSqRoot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelSqRoot.setBounds(10, 18, 414, 24);
		contentPane.add(labelSqRoot);
		
		fieldSqRoot = new JTextField();
		fieldSqRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				sqRoot();
				
			}
		});
		fieldSqRoot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldSqRoot.setBounds(10, 53, 199, 36);
		contentPane.add(fieldSqRoot);
		fieldSqRoot.setColumns(10);
		
		calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				sqRoot();
			
			}
		});
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		calculate.setBounds(148, 113, 144, 58);
		contentPane.add(calculate);
		
		labelAnswer = new JLabel("The answer is:");
		labelAnswer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelAnswer.setBounds(10, 195, 394, 27);
		contentPane.add(labelAnswer);
	}
}
