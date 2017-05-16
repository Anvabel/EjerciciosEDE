package ejercicio1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.BeforeClass;
import org.junit.Test;

public class Ejercicio1 {

	static ArrayList<Publicacion> publi;
	static Scanner teclea;
	Publicacion p;
	
	@BeforeClass
	public static void inicializa() {
		
		publi = new ArrayList<Publicacion>();
		teclea = new Scanner(System.in);
		
		publi.add(new Libro(111111,"Las sombras del viento",600,"Terror"));
		publi.add(new Comic(222222,"Los vengadores", 200, 6963));
	}
	
	@Test
	public void pruebaPosicion()
	{
		assertEquals("Libro",111111,publi.get(0).ISBN);
		assertEquals("Comic",222222,publi.get(1).ISBN);
	}

}
