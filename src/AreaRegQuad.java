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

public class AreaRegQuad extends JFrame {

	private JPanel contentPane;
	private static JTextField fieldLength;
	private static JTextField fieldWidth;
	private static JLabel labelArea;
	private static JButton calculate;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaRegQuad frame = new AreaRegQuad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

public static void areaReg(){
		
		double length, width, area, height;
											
			length = Double.parseDouble(fieldLength.getText());
			width = Double.parseDouble(fieldWidth.getText());
			
			
			area = length * width;
			
			labelArea.setText("The area is: " + Double.toString(area));		
		
	}		
	
	public AreaRegQuad() {
		setTitle("Area of a Square/Rectangle/Parallelogram");
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
		
		JLabel labelLength = new JLabel("Enter the length:");
		labelLength.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelLength.setBounds(10, 26, 166, 34);
		contentPane.add(labelLength);
		
		fieldLength = new JTextField();
		fieldLength.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			fieldWidth.requestFocus();
			
			}
		});
		fieldLength.setBounds(186, 25, 238, 37);
		contentPane.add(fieldLength);
		fieldLength.setColumns(10);
		
		JLabel labelWidth = new JLabel("Enter the width:");
		labelWidth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelWidth.setBounds(10, 101, 170, 35);
		contentPane.add(labelWidth);
		
		fieldWidth = new JTextField();
		fieldWidth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldWidth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
						
			areaReg();
			
			}
		});
		fieldWidth.setBounds(186, 98, 238, 38);
		contentPane.add(fieldWidth);
		fieldWidth.setColumns(10);
		
		JButton calculate = new JButton("Calculate");
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				areaReg();
			
			
			}
		});
		calculate.setBounds(137, 150, 121, 50);
		contentPane.add(calculate);
		
		labelArea = new JLabel("The area is:");
		labelArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelArea.setBounds(10, 211, 414, 14);
		contentPane.add(labelArea);
	}

}
