package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frndshp {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frndshp window = new frndshp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frndshp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FRIENDSHIP CALCULATOR APP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(99, 11, 285, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("YOUR NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(105, 96, 110, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FRIEND NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(105, 127, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(213, 93, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(213, 124, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JButton btnNewButton = new JButton("CHECK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String fname=tb2.getText();
				JOptionPane.showMessageDialog(btnNewButton,"Name :"+name+"\nFRIEND NAME :"+fname+"\n MATCHING :"+Math.random()*100);
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(147, 163, 132, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\frnds.jpg"));
		lblNewLabel_4.setBounds(10, 11, 424, 246);
		frame.getContentPane().add(lblNewLabel_4);
	}

}
