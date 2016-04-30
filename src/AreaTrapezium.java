import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AreaTrapezium extends JFrame {

	private JPanel contentPane;
	private static JTextField fieldHeight;
	private static JTextField fieldLength1;
	private static JTextField fieldLength2;
	private static JLabel labelArea;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaTrapezium frame = new AreaTrapezium();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		
	
	
	
	
	}

	
	public static void areaTrapezium(){
		
		double height, s1, s2, area;
		
		height = Double.parseDouble(fieldHeight.getText());
		s1 = Double.parseDouble(fieldLength1.getText());
		s2 = Double.parseDouble(fieldLength2.getText());
		
		area = 0.5 * height * (s1 + s2);
		
		labelArea.setText("The area is: " + Double.toString( + area));
		
		
		
	}
		
		
	
	
	
	/**
	 * Create the frame.
	 */
	public AreaTrapezium() {
		setTitle("Area of a Trapezium");
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
		
		JLabel labelHeight = new JLabel("Enter the height:");
		labelHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHeight.setBounds(10, 15, 231, 30);
		contentPane.add(labelHeight);
		
		JLabel labelLength1 = new JLabel("Enter the length of the first side:");
		labelLength1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelLength1.setBounds(10, 64, 231, 27);
		contentPane.add(labelLength1);
		
		JButton calculate = new JButton("Calculate");
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				areaTrapezium();
				
			}
		});
		calculate.setBounds(137, 156, 128, 54);
		contentPane.add(calculate);
		
		labelArea = new JLabel("The area is: ");
		labelArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelArea.setBounds(10, 221, 414, 14);
		contentPane.add(labelArea);
		
		fieldHeight = new JTextField();
		fieldHeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fieldLength1.requestFocus();
				
			}
		});
		fieldHeight.setBounds(260, 11, 164, 42);
		contentPane.add(fieldHeight);
		fieldHeight.setColumns(10);
		
		fieldLength1 = new JTextField();
		fieldLength1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fieldLength2.requestFocus();
				
				
				
			}
		});
		fieldLength1.setBounds(260, 60, 164, 39);
		contentPane.add(fieldLength1);
		fieldLength1.setColumns(10);
		
		JLabel labelLength2 = new JLabel("Enter the length of the second side:");
		labelLength2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelLength2.setBounds(10, 113, 240, 32);
		contentPane.add(labelLength2);
		
		fieldLength2 = new JTextField();
		fieldLength2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				areaTrapezium();
				
			}
		});
		fieldLength2.setBounds(260, 110, 164, 35);
		contentPane.add(fieldLength2);
		fieldLength2.setColumns(10);
	}
}
