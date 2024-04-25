package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class movietck {

	protected static final int YES = 0;
	protected static final int YES_OPTION = 0;
	protected static final JComboBox cb1 = null;
	private JFrame frame;
	private JTextField tb1;
	protected JComboBox cb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movietck window = new movietck();
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
	public movietck() {
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
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(131, 27, 147, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(71, 61, 46, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(163, 67, 108, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(56, 117, 95, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(44, 158, 115, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "SALAR ", "OM BHEEM BUSH", "PREMALU"}));
		cb1.setBounds(163, 113, 115, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6"}));
		cb2.setBounds(163, 163, 115, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\movie background.jpg"));
		lblNewLabel_4.setBounds(10, 11, 414, 250);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
                String ticket=(String) cb2.getSelectedItem();
                int nt=Integer.parseInt(ticket);
                int bill=0;
                if(movie.equals("RRR"));
                {
                     bill=bill+nt*150;
                }
                if(movie.equals("SALAR"));
                {
                     bill=bill+nt*250;
                }
				
                if(movie.equals("OM BHEEM BUSH"));
                {
                     bill=bill+nt*350;
                }
                if(movie.equals("PREMALU"));
                {
                     bill=bill+nt*450;
                }
                int res=0;
                res=JOptionPane.showConfirmDialog(btnNewButton, "NAME:"+name+"\n MOVIE NAME :"+movie+"\n NUMER TICKTS:"+nt);
                if(res==YES_OPTION)
                {
                	JOptionPane.showMessageDialog(btnNewButton,"BOOKING CONFIRMED");
                	}
                else
                {
                	JOptionPane.showMessageDialog(btnNewButton,"BOOKING CANCELLED");
                    
                }
			}
		});
		btnNewButton.setBounds(103, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
	
	}
}
