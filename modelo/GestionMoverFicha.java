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
		
		//COMPROBAR FICHAS
		if (datos.getLastcord()==null && datos.getTablero().comprobarPropiedad(cords, datos.verTurno())&& datos.getTablero().comprobarBloqueada(cords)) {
			eliminarFicha(cords);
			datos.setLastcord(cords);
			return this.datos;
		}
		else if (datos.getLastcord()!=null && comprobarPosDisponible(cords) && Coordenada.casillaContigua(cords, datos.getLastcord())) {
			if(datos.getLastcord()==cords) {
				colocarFicha(cords);
				datos.setLastcord(null);
				return this.datos;
			}
			colocarFicha(cords);
			//PONER NULL EL ULTIMO TURNO
			this.datos.setLastcord(null);
			// COMPROBAR SI HAS GANADO
			datos.setHasGanado(datos.getTablero().comprobarTresEnRaya());
			//SUMAR TURNO SI NO HAS GANADO
			if(!datos.getHasGanado()) {
				datos.aumentarUnaJugada();
			}
			
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
