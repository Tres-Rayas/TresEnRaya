package modelo;

public class GestionDatos {
	private DatosComun datos;

	public GestionDatos() {
		this.datos = new DatosComun();

	}

	public boolean hacerMovimiento(Coordenada cords) {
		if (datos.getNumerojugada() <= 5 && !datos.getHasGanado()) {
			GestionColocarFicha gestionColocar = new GestionColocarFicha(datos);
			datos = gestionColocar.hacerMovimiento(cords);
			return true;
		} else if (datos.getNumerojugada() > 5 && !datos.getHasGanado()) {
			GestionMoverFicha mover = new GestionMoverFicha(datos);
			datos = mover.MoverFicha(cords);
			return true;
		}

		return false;
	}

	public DatosComun getDatos() {
		return datos;
	}

	public int[][] getTablero() {
		return datos.getTablero().getTableroCompleto();
	}
	public Coordenada fichaSelec() {
		return datos.getLastcord();
	}

}
