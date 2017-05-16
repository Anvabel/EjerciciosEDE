package ejercicio2;

public class Calculadora {

	private float num1, num2;
	
	public Calculadora()
	{
		super();
		this.setNum1(0);
		this.setNum2(0);
	}
	
	public double suma(double num1, double num2)
	{
		return num1 + num2;
	}
	
	public double resta(double num1,double num2)
	{
		return num1 - num2;
	}
	
	public double multiplicacion(double num1,double num2)
	{
		return num1*num2;
	}
	
	public double division(double num1, double num2)
	{
		return num1/num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}
