package ejercicio1;

import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.*;

import org.junit.Before;
import org.junit.Test;


public class BinStringTest extends TestCase{

	private BinString binString;
	
	public BinStringTest(String name){
		super(name);
	}
	
	protected void inicializa(){
		binString = new BinString();
	}
	@Test
	public void testSumFunction(){
		int expected = 0;
		assertEquals(expected, binString.sumar(""));
		expected = 100;
		assertEquals(expected, binString.sumar("d"));
		expected = 265;
		assertEquals(expected, binString.sumar("Add"));
	}
	@Test
	public void testTotalConversion()
	{
		String expected = "1000001";
		assertEquals(expected, binString.convertir("A"));
	}
	
	
	

}
