package modelo;

public class DatosComun {
	private Tablero tablero;
	private int numerojugada;
	
	public DatosComun() {
		this.tablero=new Tablero();
		this.numerojugada = 0;
	}

	//GETTERS
	public Tablero getTablero() {
		return tablero;
	}
	public int getNumerojugada() {
		return numerojugada;
	}
	public void aumentarUnaJugada() {
		this.numerojugada++;
	}
	/**
	 * Informa de quien es el turno actual
	 * 
	 * @return 1 o 0 dependiendo de quien sea el propietario del turno
	 */
	public int verTurno() {
		if (this.numerojugada % 2 == 0)
			return 2;
		return 1;

	}
	
	
}
