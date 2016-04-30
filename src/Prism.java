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

public class Prism extends JFrame {

	private JPanel contentPane;
	private static JTextField fieldLength;
	private static JTextField fieldBase;
	private static JTextField fieldHeight;
	private static JLabel labelVolume;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prism frame = new Prism();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void volumePrism(){
	
		double length, height, base, volume;
		
		length = Double.parseDouble(fieldLength.getText());
		base = Double.parseDouble(fieldBase.getText());
		height = Double.parseDouble(fieldHeight.getText());
		
		volume = 0.5 * length * base * height;
		labelVolume.setText("The volume is: " + Double.toString(volume));
		
		
		
	}
	
	
	/**
	 * Create the frame.
	 */
	public Prism() {
		setTitle("Volume of a Prism");
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
		labelLength.setBounds(10, 11, 123, 31);
		contentPane.add(labelLength);
		
		JLabel labelBase = new JLabel("Enter the base:");
		labelBase.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelBase.setBounds(10, 53, 123, 28);
		contentPane.add(labelBase);
		
		fieldLength = new JTextField();
		fieldLength.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldBase.requestFocus();
			
			}
		});
		fieldLength.setBounds(143, 8, 281, 31);
		contentPane.add(fieldLength);
		fieldLength.setColumns(10);
		
		fieldBase = new JTextField();
		fieldBase.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldHeight.requestFocus();
			
			}
		});
		fieldBase.setBounds(143, 50, 281, 31);
		contentPane.add(fieldBase);
		fieldBase.setColumns(10);
		
		labelVolume = new JLabel("The volume is:");
		labelVolume.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelVolume.setBounds(10, 206, 414, 28);
		contentPane.add(labelVolume);
		
		JButton calculate = new JButton("Calculate");
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				volumePrism();
				
			}
		});
		calculate.setBounds(143, 148, 107, 47);
		contentPane.add(calculate);
		
		JLabel labelHeight = new JLabel("Enter the height:");
		labelHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHeight.setBounds(10, 92, 123, 28);
		contentPane.add(labelHeight);
		
		fieldHeight = new JTextField();
		fieldHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldHeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			volumePrism();
			
			}
		});
		fieldHeight.setBounds(143, 89, 281, 31);
		contentPane.add(fieldHeight);
		fieldHeight.setColumns(10);
	}

}
