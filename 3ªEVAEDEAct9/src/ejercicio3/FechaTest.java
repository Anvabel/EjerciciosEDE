package ejercicio3;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class FechaTest extends TestCase{

	/* Escribe las pruebas para comprobar:
	* - Para una fecha correcta
	* - Pon dos meses que estén mal
	* - Pon dos días que estén mal
	* - Que el més de noviembre tiene día 31
	* - Que el més de diciembre tiene día 31
	* - Que el mes de febrero tiene día 30
	* - Que el 29 de febrero existe para 2008 (que es bisiesto)
	* - Que el 29 de febrero no existe para un año que no sea
	bisiesto
	* - Comprobar que el año 1900 es bisiesto
	*/
	
	Fecha fecha = new Fecha(31,10,1997);
	

	@Test
	public void testValida() {
		

		
		assertTrue("fecha correcta", fecha.valida());
		
		fecha = new Fecha(31,100,1997);
		assertFalse("fechaMesMal1", fecha.valida());
		
		fecha =  new Fecha(31,13,1997);
		assertFalse("fechaMesMal2", fecha.valida());
		
		fecha =  new Fecha(31,13,1997);
		assertFalse("fechaNoviembre31", fecha.valida());
		
		fecha = new Fecha(31,12,1997);
		assertTrue("fechaDiciembre31", fecha.valida());
		
		fecha = new Fecha(30,2,1997);
		assertFalse("fechaFebrero30", fecha.valida());
		
		fecha = new Fecha(29,2,2008);
		assertTrue("fechaFebrero29B", fecha.valida());
		
		fecha = new Fecha(29,2,1997);
		assertFalse("fechaFebrero29N", fecha.valida());
		
		fecha = new Fecha(29,2,1900);
		assertFalse("fecha1900B", fecha.valida());
		
	/* Para cada una de las fechas creadas anteriormente, hacer
	las comprobaciones
	* utilizando el método más adecuado para el caso
	*/
	}
	


}
