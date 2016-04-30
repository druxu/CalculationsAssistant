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

public class AreaSemiCircle extends JFrame {

	private JPanel contentPane;
	private static JTextField fieldRadius;
	private static JLabel labelArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaSemiCircle frame = new AreaSemiCircle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		
	
	}

		
		public static void areaSemiCircle(){
			
			double radius, area;
			
			radius = Double.parseDouble(fieldRadius.getText());
			
			area = (Math.PI * Math.pow(radius, 2)) / 2;
			
			labelArea.setText("The area is: " + Double.toString(area));
			
			
		}
		
		
		
		
	
	
	/**
	 * Create the frame.
	 */
	public AreaSemiCircle() {
		setTitle("Area of a Semi Circle");
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
		labelRadius.setBounds(10, 49, 137, 14);
		contentPane.add(labelRadius);
		
		fieldRadius = new JTextField();
		fieldRadius.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldRadius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				areaSemiCircle();
			
			}
		});
		fieldRadius.setBounds(195, 38, 229, 38);
		contentPane.add(fieldRadius);
		fieldRadius.setColumns(10);
		
		JButton calculate = new JButton("Calculate");
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				areaSemiCircle();
			
			}
		});
		calculate.setBounds(133, 114, 114, 49);
		contentPane.add(calculate);
		
		labelArea = new JLabel("The area is:");
		labelArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelArea.setBounds(10, 206, 414, 14);
		contentPane.add(labelArea);
		
		
		
	}

}
