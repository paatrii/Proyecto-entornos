package estructurasdecontrol;

import java.util.Scanner;

public class AreaRectangulo2 {
	
	public static void main (String[] args)
	{
		double base = pedirBase();
		double altura = pedirAltura();
		double area = calcularArea(base, altura);
		double perimetro = calcularPerimetro (base, altura);
		verResultado(area, perimetro);

	}
	////////////////////////////////////////////////////////////////////
	public static double pedirBase()

	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce la base: ");
		return entrada.nextDouble();
	}
	////////////////////////////////////////////////////////////////////////
	public static double pedirAltura( )
	{
		Scanner entrada = new Scanner (System.in);
				System.out.println("Introduce la altura: ");
				return entrada.nextDouble();
	}
	////////////////////////////////////////////////////////////
	public static double calcularArea (double base, double altura)
	{
		
		return base * altura;
	}
	//////////////////////////////////////////////////////////////////////////
	public static double calcularPerimetro (double base, double altura)
	{
		return 2 * (base + altura);
	}
	//////////////////////////////////////////////////////////////////
	public static void  verResultado (double area, double perimetro)
	{

		System.out.println("El area es: " + area + perimetro);
	}
}