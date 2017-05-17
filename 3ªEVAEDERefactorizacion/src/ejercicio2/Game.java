package ejercicio2;

public class Game {

	Player p;
	
	public void movement(String m){
		
		if(m.equalsIgnoreCase("Derecha"))
			p.mueveDerecha();
		if(m.equalsIgnoreCase("Izquierda"))
			p.mueveIzquierda();
		if(m.equalsIgnoreCase("Arriba"))
			p.mueveArriba();
		if(m.equalsIgnoreCase("Abajo"))
			p.mueveAbajo();
		
	}
	
}
