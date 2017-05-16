package ejercicio2;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import org.junit.BeforeClass;
import org.junit.Test;

public class Ejercicio2 {

	static Calculadora calc;
	
	@BeforeClass
	public static void Inicializa()
	{
		calc = new Calculadora();
	}
		
		
	@Test
	public void TestSuma()
	{
		assertEquals("Suma",4.0,calc.suma(2.0,2.0),0.01);
	}
	
	@Test
	public void TestResta()
	{
		assertEquals("Resta",0,calc.resta(2.0, 2.0),0.1);
	}
	
	@Test
	public void TestMultiplicacion()
	{
		assertEquals("Multiplicacion",4.0,calc.multiplicacion(2.0, 2.0),0.1);
	}

	@Test
	public void TestDivision()
	{
		assertEquals("Division",2.0,calc.division(6, 3),0.1);
	}
}
