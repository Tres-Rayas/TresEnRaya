package modelo;

public class GestionMoverFicha {
	/*
	 * DESPUÉS DE 6 MOVIMIENTO LOGICA DE MOVER FICHA
	 */
	private DatosComun datos;

	public GestionMoverFicha(DatosComun datos) {
		this.datos = datos;
	}

	public DatosComun MoverFicha(Coordenada cords) {
		this.datos.aumentarUnaJugada();
		if (datos.getTablero().comprobarPropiedad(cords, datos.verTurno())
				&& datos.getTablero().comprobarBloqueada(cords) && datos.contadorFicha() == 6) {
			eliminarFicha(cords);
			this.datos.disminuirUnaJugada();
			return this.datos;
		}
		this.datos.disminuirUnaJugada();
		if (comprobarPosDisponible(cords) && datos.contadorFicha() < 6) {
			this.datos.aumentarUnaJugada();
			colocarFicha(cords);
			// COMPROBAR SI HAS GANADO
			datos.setHasGanado(datos.getTablero().comprobarTresEnRaya());
			return this.datos;
		}
		return this.datos;

	}

	public boolean comprobarPosDisponible(Coordenada cords) {
		return datos.getTablero().mirarCasillaLibre(cords);
	}

	public void colocarFicha(Coordenada cords) {
		datos.getTablero().setValorPosicion(cords, datos.verTurno());
	}

	public void eliminarFicha(Coordenada cords) {
		datos.getTablero().setValorPosicion(cords, 0);
	}

}
