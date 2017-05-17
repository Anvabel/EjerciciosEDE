package ejercicio2;

public class Player {

	int x, y;

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
	
	public void mueveDerecha(){
		
		this.x += 1;
		
	}
	
	public void mueveIzquierda(){
		
		this.x += -1;
		
	}

	public void mueveArriba(){
	
		this.y += 1;
	
}

	public void mueveAbajo(){
	
		this.y += -1;
	
}
	
}
