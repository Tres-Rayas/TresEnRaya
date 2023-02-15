package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;

public class UI extends JFrame {
	private JButton[][] botones = new JButton[3][3];
	private JPanel contentPane;

	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("3 EN RAYA");
		lblNewLabel.setBounds(196, 11, 52, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(105, 56, 230, 157);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				botones[i][j] = new JButton("");
				panel.add(botones[i][j]);
			}
		}
		
	}
	private JButton[][] getBotones() {
		return this.botones;
	}
}
