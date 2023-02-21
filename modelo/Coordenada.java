package modelo;

public class Coordenada {
	private int x, y;

	public Coordenada(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void asignarCoordenada(Coordenada destino) {
		this.setX(destino.getX());
		this.setY(destino.getY());
	}
	public static boolean casillaContigua(Coordenada destino, Coordenada origen) {
		int x = destino.getX() - origen.getX(), y = destino.getY() - origen.getY();
		if (x > -2 && x < 2 && y > -2 && y < 2)
			return true;
		return false;

	}
	public boolean compareTo(Coordenada otraCord) {
		return this.getX()==otraCord.getX() && this.getY()==otraCord.getY();
	}

	@Override
	public String toString() {
		return "" + x + ":" + y;
	}
}
