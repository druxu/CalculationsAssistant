import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Volume extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volume frame = new Volume();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void findVolume(){
		
		
		
		
		
	}
	
	/**
	 * Create the frame.
	 */
	public Volume() {
		setTitle("Volume");
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
		
		JLabel lblWhatWouldYou = new JLabel("What would you like to find the volume of?");
		lblWhatWouldYou.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblWhatWouldYou.setBounds(51, 24, 326, 28);
		contentPane.add(lblWhatWouldYou);
		
		JComboBox comboVolume = new JComboBox();
		comboVolume.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboVolume.setBounds(100, 83, 228, 65);
		contentPane.add(comboVolume);
		comboVolume.setModel(new DefaultComboBoxModel(new String[] {"Cube, Cuboid", "Pyramid", "Sphere", "Cylinder", "Prism"}));
		
		
		
		
		JButton btnVolume = new JButton("OK");
		btnVolume.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			switch(comboVolume.getSelectedIndex()) {
			
			case 0:
				CubeANDCuboid cac = new CubeANDCuboid();
				cac.setVisible(true);
				break;
				
			case 1:
				Pyramid py = new Pyramid();
				py.setVisible(true);
				break;
				
			case 2: 
				Sphere s = new Sphere();
				s.setVisible(true);
				break;
				
			case 3:
				Cylinder cy = new Cylinder();
				cy.setVisible(true);
				break;
				
			case 4:
				Prism pr = new Prism();
				pr.setVisible(true);
			
			
			
			
			}
			
			
			
			}
		});
		btnVolume.setBounds(152, 175, 123, 51);
		contentPane.add(btnVolume);
	}
}
