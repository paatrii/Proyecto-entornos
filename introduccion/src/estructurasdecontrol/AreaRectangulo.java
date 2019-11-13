package estructurasdecontrol;

import java.util.Scanner;

public class AreaRectangulo {
	
	public static void main (String[] args)
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce la base: ");
		double base = entrada.nextDouble();
		
		System.out.println("Introduce la altura: ");
		double altura = entrada.nextDouble();
		
		double area = base * altura;
		System.out.println("El area del triangulo es: " + area );
		
		double perimetro = 2 * (base * altura);
		System.out.println("El perimetro del triangulo es: " + perimetro);
	}
	////////////////////////////////////////////////////////////////////
	
}
