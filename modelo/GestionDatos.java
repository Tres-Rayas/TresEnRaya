package modelo;

public class GestionDatos{
	private DatosComun datos;
	public GestionDatos() {
		this.datos = new DatosComun();
		
	}
	
	
	public int[][] hacerMovimiento(Coordenada cords) {
		if(datos.getNumerojugada()<6 && !datos.getHasGanado()) {
			GestionColocarFicha gestionColocar = new GestionColocarFicha(datos);
			datos = gestionColocar.hacerMovimiento(cords);
		}
		
		return datos.getTablero().tablero;
	}


	public DatosComun getDatos() {
		return datos;
	}
	
	
	
}


