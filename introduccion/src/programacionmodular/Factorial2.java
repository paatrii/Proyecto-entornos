package programacionmodular;

import java.util.Scanner;

public class Factorial2 {
	
	public static void main (String [] args) 
	{
		/*Este programa muestra el factorial de un numero*/
		
		int numero = pedirNumero ();
		int factorial = calcularFactorial(numero);
		verResultado (factorial, numero);
	}
		
	
//////////////////////////////////////////////////////////////////////////////////////
		
	public static int pedirNumero () {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un numero: ");
		return entrada.nextInt();
	}
///////////////////////////////////////////////////////////////////////////
	public static int calcularFactorial (int numero) {
		int factor = 1;
		
		for(int i = numero; i >= 1; i--)
		{
			factor = factor * i; 
		}
	return factor;
	}
	
///////////////////////////////////////////////////////////////
	
	public static void verResultado (int factorial, int numero) {
		System.out.println("El factorial de " + numero + "es: " + factorial);
	
	
	
	}
	
}
	


