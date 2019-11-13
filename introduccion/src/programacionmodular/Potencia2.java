/*
 * Introducimos por teclado la base y el exponente y conseguimos
 * la potencia.
 */
package programacionmodular;

import java.util.Scanner;

public class Potencia2 {

	public static void main(String[] args)
	{
		int base = pedirBase();
		int exponente = pedirExponente();
		int calcular = calcularPotencia(base, exponente);
		verResultado (base, exponente, calcular);
	}
///////////////////////////////////////////////////////////////////////////
	public static int pedirBase() {
		//Introducimos la base y el exponente.
				Scanner entrada = new Scanner(System.in);
				System.out.println("Introducimos la base: ");
				return entrada.nextInt();
	}
	
/////////////////////////////////////////////////////////////////
	public static int pedirExponente() {
				Scanner entrada = new Scanner(System.in);
				System.out.println("Introducimos el exponente: ");
				return entrada.nextInt();
	}
	
////////////////////////////////////////////////////////////////////////
	public static int calcularPotencia (int base, int exponente)
	{
				//Calculamos la potencia
				//Inicializamos el acumulador
				int resultado = 1;
				for(int i =1; i <= exponente; i++)
				{
					resultado = resultado * base;
				}
				return resultado;
	}

//////////////////////////////////////////////////////////////////////////
	public static void verResultado (int base, int exponente, int calcular) {
		//Enviamos a pantalla el resultado
		System.out.println(base + "elevado a" + exponente + "=" + calcular);
		
			
	}

}

