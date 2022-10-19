package vista;

import controlador.Controlador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;

public class Vista extends JFrame {

	public final JButton pedir;
	public final JButton plantarse;
	public final JLabel lbl1;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
					Controlador ctrl = new Controlador(frame);
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

		lbl1 = new JLabel("");
		lbl1.setForeground(Color.BLACK);
		lbl1.setBackground(Color.WHITE);
		lbl1.setBounds(51, 54, 127, 180);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setBounds(187, 54, 127, 180);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setBounds(324, 54, 127, 180);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setBounds(461, 54, 127, 180);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setForeground(Color.BLACK);
		lbl5.setBackground(Color.WHITE);
		lbl5.setBounds(598, 54, 127, 180);
		contentPane.add(lbl5);
		
		JLabel lbl6 = new JLabel("");
		lbl6.setForeground(Color.BLACK);
		lbl6.setBackground(Color.WHITE);
		lbl6.setBounds(735, 54, 127, 180);
		contentPane.add(lbl6);
		
		JLabel lbl7 = new JLabel("");
		lbl7.setForeground(Color.BLACK);
		lbl7.setBackground(Color.WHITE);
		lbl7.setBounds(51, 245, 127, 180);
		contentPane.add(lbl7);
		
		JLabel lbl8 = new JLabel("");
		lbl8.setBounds(187, 245, 127, 180);
		contentPane.add(lbl8);
		
		JLabel lbl9 = new JLabel("");
		lbl9.setBounds(324, 245, 127, 180);
		contentPane.add(lbl9);
		
		JLabel lbl10 = new JLabel("");
		lbl10.setBounds(461, 245, 127, 180);
		contentPane.add(lbl10);
		
		JLabel lbl11 = new JLabel("");
		lbl11.setForeground(Color.BLACK);
		lbl11.setBackground(Color.WHITE);
		lbl11.setBounds(598, 245, 127, 180);
		contentPane.add(lbl11);
		
		JLabel lbl12 = new JLabel("");
		lbl12.setForeground(Color.BLACK);
		lbl12.setBackground(Color.WHITE);
		lbl12.setBounds(735, 245, 127, 180);
		contentPane.add(lbl12);
		
		JLabel lbl13 = new JLabel("");
		lbl13.setForeground(Color.BLACK);
		lbl13.setBackground(Color.WHITE);
		lbl13.setBounds(51, 477, 127, 180);
		contentPane.add(lbl13);
		
		JLabel lbl14 = new JLabel("");
		lbl14.setBounds(187, 477, 127, 180);
		contentPane.add(lbl14);
		
		JLabel lbl15 = new JLabel("");
		lbl15.setBounds(324, 477, 127, 180);
		contentPane.add(lbl15);
		
		JLabel lbl16 = new JLabel("");
		lbl16.setBounds(461, 477, 127, 180);
		contentPane.add(lbl16);
		
		JLabel lbl17 = new JLabel("");
		lbl17.setForeground(Color.BLACK);
		lbl17.setBackground(Color.WHITE);
		lbl17.setBounds(598, 477, 127, 180);
		contentPane.add(lbl17);
		
		JLabel lbl18 = new JLabel("");
		lbl18.setForeground(Color.BLACK);
		lbl18.setBackground(Color.WHITE);
		lbl18.setBounds(735, 477, 127, 180);
		contentPane.add(lbl18);
		
		JLabel lbl19 = new JLabel("");
		lbl19.setForeground(Color.BLACK);
		lbl19.setBackground(Color.WHITE);
		lbl19.setBounds(51, 668, 127, 180);
		contentPane.add(lbl19);
		
		JLabel lbl20 = new JLabel("");
		lbl20.setBounds(187, 668, 127, 180);
		contentPane.add(lbl20);
		
		JLabel lbl21 = new JLabel("");
		lbl21.setBounds(324, 668, 127, 180);
		contentPane.add(lbl21);
		
		JLabel lbl22 = new JLabel("");
		lbl22.setBounds(461, 668, 127, 180);
		contentPane.add(lbl22);
		
		JLabel lbl23 = new JLabel("");
		lbl23.setForeground(Color.BLACK);
		lbl23.setBackground(Color.WHITE);
		lbl23.setBounds(598, 668, 127, 180);
		contentPane.add(lbl23);
		
		JLabel lbl24 = new JLabel("");
		lbl24.setForeground(Color.BLACK);
		lbl24.setBackground(Color.WHITE);
		lbl24.setBounds(735, 668, 127, 180);
		contentPane.add(lbl24);

		pedir = new JButton("New button");
		pedir.setBounds(1162, 385, 89, 23);
		contentPane.add(pedir);

		plantarse = new JButton("New button");
		plantarse.setBounds(1162, 419, 89, 23);
		contentPane.add(plantarse);
	}
}
