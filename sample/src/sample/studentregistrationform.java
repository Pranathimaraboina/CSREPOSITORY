package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentregistrationform {

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
					studentregistrationform window = new studentregistrationform();
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
	public studentregistrationform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel stu = new JLabel("STUDENT REG FORM");
		stu.setFont(new Font("Tahoma", Font.BOLD, 11));
		stu.setBounds(144, 22, 134, 19);
		frame.getContentPane().add(stu);
		
		JLabel name = new JLabel("ROLL NUMBER");
		name.setFont(new Font("Tahoma", Font.BOLD, 11));
		name.setBounds(84, 57, 86, 14);
		frame.getContentPane().add(name);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(84, 85, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(84, 110, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(84, 143, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(203, 54, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(203, 79, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox ctb = new JComboBox();
		ctb.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "CS", "IOT", "DS", "AIML", "ECE", "MECH"}));
		ctb.setBounds(203, 106, 86, 22);
		frame.getContentPane().add(ctb);
		
		JRadioButton r1 = new JRadioButton("FEMALE");
		r1.setBounds(197, 140, 92, 20);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("MALE");
		r2.setBounds(294, 139, 101, 20);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_5 = new JLabel("PROG LANG");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(84, 182, 72, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox c1 = new JCheckBox("JAVA");
		c1.setBounds(197, 178, 65, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("PYTHON");
		c2.setBounds(269, 178, 77, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("C");
		c3.setBounds(356, 178, 72, 23);
		frame.getContentPane().add(c3);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String roll=tb1.getText();
				String name=tb2.getText();
			   String branch=(String) ctb.getSelectedItem();
			   String gender=" ";
			   String langs=" ";
			if(r1.isSelected())
			{
				gender="female";
			}
			if(r2.isSelected())
			{
				gender="male";
			}
			
				if(c1.isSelected())
				{
				    langs=langs+"java";
				}
				if(c2.isSelected())
				{
					langs=langs+"python";
				}
					if(c3.isSelected())
					{
						langs=langs+"c";
					}
					JOptionPane.showMessageDialog(btnNewButton,"ROLL NO:"+roll+"\n NAME:"+name+"\n BRANCH:"+branch+"\n GENDER:"+gender+"\n PROG LANG:"+langs);
					
					
			   
				
			}
		});
		btnNewButton.setBounds(162, 214, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
