package ejercicio2;

public class Game {

	protected Player p;
	
	public void movement(String m){
		
		if(m.equalsIgnoreCase("derecha")){
			p.setX(1);
		}
		
		if(m.equalsIgnoreCase("izquierda")){
			p.setX(-1);
		}
		
		if(m.equalsIgnoreCase("arriba")){
			p.setY(1);
		}
		
		if(m.equalsIgnoreCase("abajo")){
			p.setY(-1);
		}
	}
	
}
