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

public class AreaTriangle extends JFrame {

	private JPanel contentPane;
	private static JTextField fieldBase;
	private static JTextField fieldHeight;
	private static JLabel labelArea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaTriangle frame = new AreaTriangle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		
	
	}

	
		public static void areaTriangle(){
			
			double base, height, area;
			
			base = Double.parseDouble(fieldBase.getText());
			height = Double.parseDouble(fieldHeight.getText());
			
			area = base * height / 2;
			
			labelArea.setText("The area is: "+Double.toString(area));
			
		}
		
									
	
	
	/**
	 * Create the frame.
	 */
	public AreaTriangle() {
		setTitle("Area of a Triangle");
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
		
		JLabel labelBase = new JLabel("Enter the base:");
		labelBase.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelBase.setBounds(21, 21, 139, 24);
		contentPane.add(labelBase);
		
		JLabel labelHeight = new JLabel("Enter the height:");
		labelHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHeight.setBounds(21, 86, 139, 24);
		contentPane.add(labelHeight);
		
		fieldBase = new JTextField();
		fieldBase.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fieldHeight.requestFocus();
				
			}
		});
		fieldBase.setBounds(170, 18, 254, 33);
		contentPane.add(fieldBase);
		fieldBase.setColumns(10);
		
		fieldHeight = new JTextField();
		fieldHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fieldHeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				areaTriangle();
				
			}
		});
		fieldHeight.setBounds(170, 77, 254, 33);
		contentPane.add(fieldHeight);
		fieldHeight.setColumns(10);
		
		JButton calculate = new JButton("Calculate");
		calculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				areaTriangle();
			
			}
		});
		calculate.setBounds(128, 133, 132, 52);
		contentPane.add(calculate);
		
		labelArea = new JLabel("The area is:");
		labelArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelArea.setBounds(21, 209, 413, 14);
		contentPane.add(labelArea);
		
		
		
	}

}
