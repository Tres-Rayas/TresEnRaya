package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controler.MyButton;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class UI extends JFrame {
	private MyButton[][] botones = new MyButton[3][3];
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblMensaje;
	private JLabel lblCurrentPlayer;

	
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("3 EN RAYA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(105, 11, 187, 21);
		
		panel = new JPanel();
		panel.setBounds(105, 85, 230, 128);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		lblMensaje = new JLabel("");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMensaje.setBounds(62, 36, 319, 38);
		
		lblCurrentPlayer = new JLabel("x");
		lblCurrentPlayer.setBounds(23, 126, 52, 51);
		lblCurrentPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentPlayer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(panel);
		contentPane.add(lblMensaje);
		contentPane.add(lblCurrentPlayer);
		
		
		
		//CREAR BOTONES
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				getBotones()[i][j] = new MyButton("",i,j);
				getPanel().add(getBotones()[i][j]);
			}
		}

		
		
	}
	
	protected MyButton[][] getBotones() {
		return this.botones;
	}
	protected JPanel getPanel() {
		return panel;
	}
	public JLabel getLblMensaje() {
		return lblMensaje;
	}
	public JLabel getLblCurrentPlayer() {
		return lblCurrentPlayer;
	}

	
}
