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

public class UI extends JFrame {
	private MyButton[][] botones = new MyButton[3][3];
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblMensaje;

	
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
		
		panel = new JPanel();
		panel.setBounds(105, 85, 230, 128);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		lblMensaje = new JLabel("");
		lblMensaje.setBounds(62, 43, 319, 20);
		contentPane.add(lblMensaje);
		
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
}
