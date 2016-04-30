import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Cylinder extends JFrame {

	private JPanel contentPane;
	private static JTextField fieldRadius;
	private static JTextField fieldHeight;
	private static JLabel labelVolume;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cylinder frame = new Cylinder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void volumeCylinder(){
		
		double radius, volume, height;
		
		radius = Double.parseDouble(fieldRadius.getText());
		height = Double.parseDouble(fieldHeight.getText());
		
		volume = Math.PI * (Math.pow(radius, 2)) *height;
		
		labelVolume.setText("The volume is: " + Double.toString(volume));
		
	}
	
	/**
	 * Create the frame.
	 */
	public Cylinder() {
		setTitle("Volume of a Cylinder");
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
		
		JLabel labelRadius = new JLabel("Enter the radius:");
		labelRadius.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelRadius.setBounds(10, 32, 134, 19);
		contentPane.add(labelRadius);
		
		JLabel labelHeight = new JLabel("Enter the height:");
		labelHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHeight.setBounds(10, 86, 134, 26);
		contentPane.add(labelHeight);
		
		labelVolume = new JLabel("The volume is:");
		labelVolume.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelVolume.setBounds(10, 224, 398, 14);
		contentPane.add(labelVolume);
		
		JButton calculate = new JButton("Calculate");
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				volumeCylinder();
				
			}
		});
		calculate.setBounds(144, 152, 111, 43);
		contentPane.add(calculate);
		
		fieldRadius = new JTextField();
		fieldRadius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fieldHeight.requestFocus();
				
			}
		});
		fieldRadius.setBounds(154, 25, 270, 33);
		contentPane.add(fieldRadius);
		fieldRadius.setColumns(10);
		
		fieldHeight = new JTextField();
		fieldHeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				volumeCylinder();
			
			}
		});
		fieldHeight.setBounds(154, 85, 270, 33);
		contentPane.add(fieldHeight);
		fieldHeight.setColumns(10);
	}
}
