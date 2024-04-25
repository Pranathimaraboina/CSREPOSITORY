package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class metro {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
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
		
		JLabel lblNewLabel =  new JLabel("METEO TICKET BOOKING APP");
		lblNewLabel.setForeground(new Color(255, 128, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(103, 36, 220, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(90, 71, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(90, 121, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(90, 164, 68, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(90, 198, 108, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(234, 68, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "LB NAGAR", "VICTORIA", "CHAITHANYAPURI", "DILSHUKNAGAR"}));
		cb1.setBounds(234, 117, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHP", "ERRAGADA", "BHARATHNAGAR", "SR NAGAR"}));
		cb2.setBounds(234, 160, 89, 22);
		frame.getContentPane().add(cb2);
		
		JSpinner jsp1 = new JSpinner();
		jsp1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		jsp1.setBounds(234, 195, 86, 20);
		frame.getContentPane().add(jsp1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
                String s=(String) cb1.getSelectedItem();
                String d=(String) cb2.getSelectedItem();
                int nt=(int) jsp1.getValue();
                int bill=0;
                if(s.equals(d))
                {
                	JOptionPane.showMessageDialog(btnNewButton,"Please check satation ");
                }
                else
                {
                	bill=bill=nt*45;
                	JOptionPane.showMessageDialog( btnNewButton,"Name :"+name+"\n Source :"+s+"\nDestination :"+d+"\n Number Of Tickets : "+nt+"\n Amount :"
                	+bill+"\n!!-------HAPPY JOUNERY-------!!😂😂");
             }
			}
		});
		btnNewButton.setBounds(174, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setForeground(new Color(0, 255, 0));
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\metro1.jpg"));
		lblNewLabel_5.setBounds(0, 11, 434, 250);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
