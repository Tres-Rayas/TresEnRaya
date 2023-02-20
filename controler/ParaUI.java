package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.xml.crypto.Data;

import modelo.Coordenada;
import view.UI;

public class ParaUI extends UI {

	private ActionListener comportamiento;
	private Controlador controlador;

	public ParaUI() {
		super();
		this.controlador = new Controlador();
		crearComportamientoBotones();
		addComportamientoBotones();
		// SET CURRENT LABEL AL CONSTRUIR
		getLblCurrentPlayer().setText(controlador.devolverTurnoActual());
	}

	public void crearComportamientoBotones() {
		this.comportamiento = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyButton botonPulsado = (MyButton) e.getSource();
				// HACER MOVIMIENTO
				if (controlador.hacerMovimiento(((MyButton) e.getSource()).getCordenadas())) {
					imprimirBotones(controlador.getTablero());
				} 
				// IMPRIMIR EL TURNO ACTUAL
				getLblCurrentPlayer().setText(controlador.devolverTurnoActual());
				// IMPRIMIR MENSAJE SI HAS GANADO O SI NO HAS GANADO
				getLblMensaje().setText(controlador.mensajeHasGanado());
			}
		};
	}

	private void addComportamientoBotones() {
		for (int i = 0; i < getBotones().length; i++) {
			for (int j = 0; j < getBotones()[0].length; j++) {
				getBotones()[i][j].addActionListener(comportamiento);
			}
		}
	}

	private void imprimirBotones(int[][] tablero) {
		for (int i = 0; i < getBotones().length; i++) {
			for (int j = 0; j < getBotones()[0].length; j++) {
				if (tablero[i][j] == 1) {
					getBotones()[i][j].setText("X");
				} else if (tablero[i][j] == 2) {
					getBotones()[i][j].setText("O");
				} else {
					getBotones()[i][j].setText("");
				}
			}
		}
	}

}
