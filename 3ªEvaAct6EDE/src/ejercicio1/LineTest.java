package ejercicio1;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class LineTest {
	
	static Line linea,  linea2;
	static double x0 = 0, x1 = 2, y0 = 0, y1 = 2;
	
	@BeforeClass
	public static void inicializa()
	{
		
		linea2 = new Line(0,0,3,3);
		
		linea = new Line(x0,y0,x1,y1);
	}
	
	
	@Test
	public void testSlope() {
		
		
		assertEquals("Correcto",1, linea.getSlope(),0.001);
		assertEquals("Correcto",1, linea2.getSlope(),0.001);
	
	}
	
	@Test
	public void testDistance()
	{
		
		assertEquals("Primero",Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0)), linea.getDistance(), 0.001);
		assertEquals("Segundo",Math.sqrt((3 - 0) * (3 - 0) + (3 - 0) * (3 - 0)), linea2.getDistance(), 0.001);
		
	}
	
	@Test
	public void testParallel()
	{
		
		assertTrue("Primero",linea.parallelTo(linea2));
		
	}
	
}
