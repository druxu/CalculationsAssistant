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

public class Sphere extends JFrame {

	private JPanel contentPane;
	private static JTextField fieldRadius;
	private static JLabel labelVolume;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sphere frame = new Sphere();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void volumeSphere(){
		
		double radius, volume;
		
		radius = Double.parseDouble(fieldRadius.getText());
		
		volume = 4 * ( Math.PI * Math.pow(radius, 3) / 3 );
		
		labelVolume.setText("The volume is: " + Double.toString(volume));
		
		
	}
	
	/**
	 * Create the frame.
	 */
	public Sphere() {
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
		labelRadius.setBounds(10, 30, 111, 14);
		contentPane.add(labelRadius);
		
		fieldRadius = new JTextField();
		fieldRadius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				volumeSphere();
			
			}
		});
		fieldRadius.setBounds(131, 27, 86, 20);
		contentPane.add(fieldRadius);
		fieldRadius.setColumns(10);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				volumeSphere();
				
			}
		});
		calculate.setBounds(10, 91, 111, 43);
		contentPane.add(calculate);
		
		labelVolume = new JLabel("The volume is:");
		labelVolume.setBounds(10, 179, 414, 14);
		contentPane.add(labelVolume);
	}

}
