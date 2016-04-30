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

public class Pyramid extends JFrame {

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
					Pyramid frame = new Pyramid();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void volumePyramid(){
		
		double length, width, height, volume;
		
		length = Double.parseDouble(fieldLength.getText());
		width = Double.parseDouble(fieldWidth.getText());
		height = Double.parseDouble(fieldHeight.getText());
		
		volume = length * width * height / 3;
		
		labelVolume.setText("The volume is: " + Double.toString(volume));
		
		
	}
	
	
	/**
	 * Create the frame.
	 */
	public Pyramid() {
		setTitle("Volume of a Pyramid");
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
		labelLength.setBounds(10, 11, 122, 31);
		contentPane.add(labelLength);
		
		JLabel labelWidth = new JLabel("Enter the width:");
		labelWidth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelWidth.setBounds(10, 53, 122, 28);
		contentPane.add(labelWidth);
		
		JLabel labelHeight = new JLabel("Enter the height:");
		labelHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHeight.setBounds(10, 99, 122, 28);
		contentPane.add(labelHeight);
		
		fieldLength = new JTextField();
		fieldLength.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldWidth.requestFocus();
				
			}
		});
		fieldLength.setBounds(142, 8, 282, 31);
		contentPane.add(fieldLength);
		fieldLength.setColumns(10);
		
		fieldWidth = new JTextField();
		fieldWidth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldWidth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldHeight.requestFocus();
			
			}
		});
		fieldWidth.setBounds(142, 50, 282, 31);
		contentPane.add(fieldWidth);
		fieldWidth.setColumns(10);
		
		fieldHeight = new JTextField();
		fieldHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldHeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				volumePyramid();
			
			}
		});
		fieldHeight.setBounds(142, 96, 282, 31);
		contentPane.add(fieldHeight);
		fieldHeight.setColumns(10);
		
		labelVolume = new JLabel("The volume is: ");
		labelVolume.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelVolume.setBounds(10, 218, 393, 14);
		contentPane.add(labelVolume);
		
		JButton calculate = new JButton("Calculate");
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				volumePyramid();
			
			}
		});
		calculate.setBounds(142, 148, 104, 45);
		contentPane.add(calculate);
	}

}
