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

public class CubeANDCuboid extends JFrame {

	private JPanel contentPane;
	private static JTextField fieldLength;
	private static JTextField fieldWidth;
	private static JTextField fieldHeight;
	private static JLabel labelVolume;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CubeANDCuboid frame = new CubeANDCuboid();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void volumeCubeAndCuboid(){
		
		double length, width, height, volume;
		
		length = Double.parseDouble(fieldLength.getText());
		width = Double.parseDouble(fieldWidth.getText());
		height = Double.parseDouble(fieldHeight.getText());
		
		volume = length * width * height;
		
		labelVolume.setText("The area is: "+ Double.toString(volume));
		
		
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public CubeANDCuboid() {
		setTitle("Volume of a Cube/Cuboid");
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
		labelLength.setBounds(10, 11, 111, 30);
		contentPane.add(labelLength);
		
		fieldLength = new JTextField();
		fieldLength.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldWidth.requestFocus();
			
			}
		});
		fieldLength.setBounds(131, 8, 293, 33);
		contentPane.add(fieldLength);
		fieldLength.setColumns(10);
		
		JLabel labelWidth = new JLabel("Enter the width:");
		labelWidth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelWidth.setBounds(10, 52, 111, 36);
		contentPane.add(labelWidth);
		
		JLabel labelHeight = new JLabel("Enter the height:");
		labelHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHeight.setBounds(10, 99, 118, 33);
		contentPane.add(labelHeight);
		
		fieldWidth = new JTextField();
		fieldWidth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldWidth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldHeight.requestFocus();
				
			}
		});
		fieldWidth.setBounds(131, 49, 293, 36);
		contentPane.add(fieldWidth);
		fieldWidth.setColumns(10);
		
		fieldHeight = new JTextField();
		fieldHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldHeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				volumeCubeAndCuboid();
			
			}
		});
		fieldHeight.setBounds(131, 96, 293, 36);
		contentPane.add(fieldHeight);
		fieldHeight.setColumns(10);
		
		labelVolume = new JLabel("The volume is:");
		labelVolume.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelVolume.setBounds(10, 226, 403, 14);
		contentPane.add(labelVolume);
		
		JButton calculate = new JButton("Calculate");
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				volumeCubeAndCuboid();
			
			}
		});
		calculate.setBounds(131, 151, 118, 47);
		contentPane.add(calculate);
	}
}
