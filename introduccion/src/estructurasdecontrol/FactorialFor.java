package estructurasdecontrol;

import java.util.Scanner;

public class FactorialFor {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int resultado=1;
		int numero=entrada.nextInt();
		
		for(int i=numero; i>0; i--) {
			
			resultado=resultado*i;
		}
		
		System.out.println("El factorial de " + numero + " es " + resultado);
	}
}
