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

public class Index extends JFrame {

	private JPanel contentPane;
	private static JTextField fieldIndex;
	private static JLabel labelAnswer;
	private JLabel labelChoice;
	private static JTextField fieldIndex1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public static void index(){
		
		double index, answer, choice;
		
		
		
		index = Double.parseDouble(fieldIndex.getText());
		choice = Double.parseDouble(fieldIndex1.getText());
		
		answer = Math.pow(index, choice);
		
		labelAnswer.setText("The answer is: "+Double.toString(answer));
		
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public Index() {
		setTitle("Index");
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
		
		JLabel labelIndex = new JLabel("Enter the number:");
		labelIndex.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelIndex.setBounds(10, 13, 147, 27);
		contentPane.add(labelIndex);
		
		fieldIndex = new JTextField();
		
		fieldIndex.setBounds(191, 10, 201, 36);
		contentPane.add(fieldIndex);
		fieldIndex.setColumns(10);
		
		JButton calculate = new JButton("Calculate");
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				index();
			
			}
		});
		calculate.setBounds(140, 126, 113, 44);
		contentPane.add(calculate);
		
		labelAnswer = new JLabel("The answer is:");
		labelAnswer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelAnswer.setBounds(10, 199, 414, 14);
		contentPane.add(labelAnswer);
		
		labelChoice = new JLabel("Enter the index:");
		labelChoice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelChoice.setBounds(10, 60, 147, 26);
		contentPane.add(labelChoice);
		
		fieldIndex1 = new JTextField();
		fieldIndex1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				index();
				
			}
		});
		fieldIndex1.setBounds(191, 57, 201, 36);
		contentPane.add(fieldIndex1);
		fieldIndex1.setColumns(10);
	}
}
