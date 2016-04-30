import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Area extends JFrame {

	private JPanel contentPane;
	public static double length, height, width, radius, area;
	private JComboBox comboBox;
	private JLabel lblTitle;
	private JButton btnGo;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Area frame = new Area();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	public Area() {
		setTitle("Area");
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
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Square, Rectangle, Parallelogram", "Triangle", "Trapezium", "Kite", "Circle", "Semi Circle"}));
		comboBox.setBounds(61, 86, 301, 51);
		contentPane.add(comboBox);
		
		lblTitle = new JLabel("What would you like to find the area of:");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTitle.setBounds(10, 11, 324, 51);
		contentPane.add(lblTitle);
		
		btnGo = new JButton("OK");
		btnGo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				switch(comboBox.getSelectedIndex()){
				
				case 0:
					AreaRegQuad arq = new AreaRegQuad();
					arq.setVisible(true);
					break;
					
				case 1: 
					AreaTriangle atri = new AreaTriangle();
					atri.setVisible(true);
					break;
					
				case 2:
					AreaTrapezium atrap = new AreaTrapezium();
					atrap.setVisible(true);
					break;
					
				case 3:
					AreaKite ak = new AreaKite();
					ak.setVisible(true);
					break;
					
				case 4:
					AreaCircle ac = new AreaCircle();
					ac.setVisible(true);
					break;
					
				case 5:
					AreaSemiCircle asc = new AreaSemiCircle();
					asc.setVisible(true);
				
				
				
				}
				
				
			}
		});
		btnGo.setBounds(151, 179, 109, 51);
		contentPane.add(btnGo);
	}
}
