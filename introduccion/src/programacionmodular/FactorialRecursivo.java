package programacionmodular;

import java.util.Scanner;

public class FactorialRecursivo {
	
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

		if(numero == 0)
			return 1;
		else
			return numero * calcularFactorial (numero - 1);
	}
	
///////////////////////////////////////////////////////////////
	
	public static void verResultado (int factorial, int numero) {
		System.out.println("El factorial de " + numero + " es: " + factorial);
	
	
	
	}
	
}



