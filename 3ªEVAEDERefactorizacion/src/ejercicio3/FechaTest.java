package ejercicio3;


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
		
	
		Fecha fCorrecta1 = new Fecha(31,1,1997);
		Fecha fmalmes1 = new Fecha(31,16,1999);
		Fecha fmalmes2 = new Fecha(31,49,2240);
		Fecha fmaldia1 = new Fecha(700,5,3000);
		Fecha fmaldia2 = new Fecha(48,12,72);
		
		Fecha fnoviembre1 = new Fecha(31,11,1999);
		Fecha fdiciembre1 = new Fecha(31,12,1999);
		
		Fecha fFebrero1 = new Fecha(29,2,2008);
		Fecha fFebrero2 = new Fecha(19,2,2009);
		Fecha f1900 = new Fecha(29,2,1900);
		@Test
		public void testValida() {
		/* Para cada una de las fechas creadas anteriormente, hacer
		las comprobaciones
		* utilizando el método más adecuado para el caso
		*/
			
			assertTrue("Fecha Correcta",fCorrecta1.valida());
			
			assertFalse("Fecha Mes Incorrecto 1",fmalmes1.valida());
			
			assertFalse("Fecha Mes Incorrecto 2",fmalmes2.valida());
			
			assertFalse("Fecha Dia Incorrecto 1",fmaldia1.valida());
			
			assertFalse("Fecha Dia Incorrecto 2",fmaldia2.valida());
			
			assertFalse("Fecha Noviembre Incorrecta",fnoviembre1.valida());
			
			assertTrue("Fehca Diciembre Correcta",fdiciembre1.valida());
			
			assertTrue("Fecha Febrero Correcta",fFebrero1.valida());
			
			assertTrue("Fecha Febrero Incorrecta",fFebrero2.valida());
			
			assertFalse("Fecha 1900 Bisiesto",f1900.valida());
		}
	

}
