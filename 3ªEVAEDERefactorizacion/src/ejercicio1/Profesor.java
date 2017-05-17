package ejercicio1;

import java.util.List;

public class Profesor extends Persona{

	private String nombre;
	private int edad;
	private List <Prestamo> prestamos;
	
	public Profesor(String numeroDeTelefono){
		super(numeroDeTelefono);
	}
	
	public void printInformacionPersonal(){
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Teléfono: "+this.numeroDeTelefono);
	}
	
	public void printTodaLaInformacion(){
		this.printInformacionPersonal();
		for (Prestamo p: prestamos){
			System.out.println(p);
		}
			
	}
	
}
