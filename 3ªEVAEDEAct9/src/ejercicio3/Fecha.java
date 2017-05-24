package ejercicio3;

public class Fecha {


		private int dia;
		private int mes;
		private int anio;
		
		
		public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		}
		
		public boolean valida () {
			
			
		if (dia < 1 || dia > 31)
		return false;
		
		if (mes < 1 || mes > 12)
		return false;
		
		// determinamos la cantidad de d�as del mes:
		int diasDelMes = 0;
		
		switch (mes) {
		
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			diasDelMes = 31;
			break;
			
			case 4:
			case 6:
			case 9:
			case 11 :
			diasDelMes = 30;
			break;
			
			case 2 : // verificaci�n de a�o bisiesto
				if ( bisiesto() )
			diasDelMes = 29;
			else
			diasDelMes = 28;
			break;
		}
		
		if (dia > diasDelMes)
		return false;
		else return true;
		}
		// � m�s m�todos
		
		
		public boolean bisiesto(){
			if ( (anio % 400 == 0) || ( (anio % 4 == 0) && (anio% 100 != 0) ) )
				return true;
			else return false;
		}
	
}
