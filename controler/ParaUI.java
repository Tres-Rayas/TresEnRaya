package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.UI;

public class ParaUI extends UI {
	
	private ActionListener comportamiento;
	private Controlador controlador;
	
	public ParaUI() {
		super();
		this.controlador = new Controlador();
		crearComportamientoBotones();
		addComportamientoBotones();
	}
	
	
	public void crearComportamientoBotones(){
		this.comportamiento = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyButton botonPulsado = (MyButton)e.getSource();
				if(controlador.hacerMovimiento(botonPulsado.getCordenadas()) ) {
					if(controlador.gestion.numerojugada%2==0) {
						botonPulsado.setText("O");
					}
					else {
						botonPulsado.setText("X");
					}
				}
				
			}
		};
	}
	
	
	
	private void addComportamientoBotones() {
		for(int i=0;i<getBotones().length;i++) {
			for(int j=0;j<getBotones()[0].length;j++) {
				getBotones()[i][j].addActionListener(comportamiento);
			}
		}
	}
	
	

}
