package controler;

import modelo.Coordenada;
import modelo.GestionDatos;

public class Controlador {
	GestionDatos gestion = new GestionDatos();
	
	public Controlador(){
		
	}
	public boolean hacerMovimiento(Coordenada cords) {
		return gestion.posibleColocarFicha(cords);
	}
	

}
