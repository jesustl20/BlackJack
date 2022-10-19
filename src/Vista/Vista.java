package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

public class Vista extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l = new JLabel("");
		l.setForeground(Color.BLACK);
		l.setBackground(Color.WHITE);
		l.setBounds(51, 54, 127, 180);
		contentPane.add(l);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(187, 54, 127, 180);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(324, 54, 127, 180);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(461, 54, 127, 180);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setBounds(598, 54, 127, 180);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(735, 54, 127, 180);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setBounds(51, 245, 127, 180);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(187, 245, 127, 180);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(324, 245, 127, 180);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(461, 245, 127, 180);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1.setBounds(598, 245, 127, 180);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setForeground(Color.BLACK);
		lblNewLabel_5_1.setBackground(Color.WHITE);
		lblNewLabel_5_1.setBounds(735, 245, 127, 180);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel l_1 = new JLabel("");
		l_1.setForeground(Color.BLACK);
		l_1.setBackground(Color.WHITE);
		l_1.setBounds(51, 477, 127, 180);
		contentPane.add(l_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setBounds(187, 477, 127, 180);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setBounds(324, 477, 127, 180);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setBounds(461, 477, 127, 180);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setForeground(Color.BLACK);
		lblNewLabel_4_2.setBackground(Color.WHITE);
		lblNewLabel_4_2.setBounds(598, 477, 127, 180);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setForeground(Color.BLACK);
		lblNewLabel_5_2.setBackground(Color.WHITE);
		lblNewLabel_5_2.setBounds(735, 477, 127, 180);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setForeground(Color.BLACK);
		lblNewLabel_6_1.setBackground(Color.WHITE);
		lblNewLabel_6_1.setBounds(51, 668, 127, 180);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setBounds(187, 668, 127, 180);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setBounds(324, 668, 127, 180);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setBounds(461, 668, 127, 180);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setForeground(Color.BLACK);
		lblNewLabel_4_1_1.setBackground(Color.WHITE);
		lblNewLabel_4_1_1.setBounds(598, 668, 127, 180);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setForeground(Color.BLACK);
		lblNewLabel_5_1_1.setBackground(Color.WHITE);
		lblNewLabel_5_1_1.setBounds(735, 668, 127, 180);
		contentPane.add(lblNewLabel_5_1_1);
	}
}
