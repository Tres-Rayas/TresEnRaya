package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.UI;

public class ParaUI extends UI {

	public ParaUI() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				getBotones()[i][j] = new JButton("");
				getBotones()[i][j].addActionListener(new ComportamientoBoton());
				getPanel().add(getBotones()[i][j]);
			}
		}
	}

}
