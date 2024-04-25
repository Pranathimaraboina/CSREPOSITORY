package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOGINPAGE {

	private JFrame frame;
	private JTextField tb1;
	private JTextField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINPAGE window = new LOGINPAGE();
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
	public LOGINPAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String pwd=p1.getText();
				if(name.equals("pranathi") && pwd.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "VALID USER");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,  "INVALID USER");
				}
			}
		});
		btnNewButton.setBounds(152, 161, 120, 17);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(96, 57, 104, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(102, 111, 67, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN PAGE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(168, 11, 104, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(217, 55, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JTextField();
		p1.setBounds(217, 109, 86, 20);
		frame.getContentPane().add(p1);
		p1.setColumns(10);
	}
}
