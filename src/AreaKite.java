import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AreaKite extends JFrame {

	private JPanel contentPane;
	private static JLabel labelArea;
	private static JTextField fieldDiag1;
	private static JTextField fieldDiag2;
	private static JButton calculate;
	private static JLabel labelDiag1;
	private static JLabel labelDiag2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaKite frame = new AreaKite();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		
			
	}
	
	public static void areaKite() {
		
		double d1 = 0, d2 = 0, kiteArea = 0;
		
		d1 = Double.parseDouble(fieldDiag1.getText());
		d2 = Double.parseDouble(fieldDiag2.getText());
		
		kiteArea = d1 * d2 / 2;
			
		labelArea.setText("The area is: " + Double.toString(kiteArea));

		
		
	}
	
		
		
		
		
	
	
	/**
	 * Create the frame.
	 */
	public AreaKite() {
		setTitle("Area of a Kite/Rhombus");
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
		
		
		JLabel labelDiag1 = new JLabel("Enter the first diagonal:");
		labelDiag1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelDiag1.setBounds(10, 33, 172, 21);
		contentPane.add(labelDiag1);
		
		JLabel labelDiag2 = new JLabel("Enter the second diagonal:");
		labelDiag2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelDiag2.setBounds(10, 83, 182, 29);
		contentPane.add(labelDiag2);
		
		fieldDiag1 = new JTextField();
		fieldDiag1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldDiag1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fieldDiag2.requestFocus();
				
			}
		});
		fieldDiag1.setBounds(202, 22, 222, 43);
		contentPane.add(fieldDiag1);
		fieldDiag1.setColumns(10);
		
		fieldDiag2 = new JTextField();
		fieldDiag2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldDiag2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				areaKite();
			
			}
		});
		fieldDiag2.setBounds(202, 76, 222, 43);
		contentPane.add(fieldDiag2);
		fieldDiag2.setColumns(10);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					areaKite();
				
				
			}
		});
		calculate.setBounds(141, 143, 118, 57);
		contentPane.add(calculate);
		
		labelArea = new JLabel("The area is:");
		labelArea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		labelArea.setBounds(10, 211, 414, 21);
		contentPane.add(labelArea);
	}

}
