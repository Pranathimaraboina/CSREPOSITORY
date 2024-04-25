package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;

public class bookshop {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookshop window = new bookshop();
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
	public bookshop() {
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
		
		JLabel lblNewLabel = new JLabel("BOOK STORE APP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(117, 23, 149, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(239, 61, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\book1.jpg"));
		lblNewLabel_3.setBounds(10, 147, 69, 92);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\graph3.PNG"));
		lblNewLabel_4.setBounds(101, 131, 55, 108);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(239, 96, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
