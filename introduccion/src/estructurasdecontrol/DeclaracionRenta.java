/*Escribir un programa que pregunte al usuario su renta anual y muestre por pantalla el tipo
*impositivo que le corresponde.
*/
package estructurasdecontrol;

import java.util.Scanner; 

public class DeclaracionRenta {
	
	public static void main(String args[])
	{
		
		//Creamos un objeto de tipo scanner
	    Scanner entrada= new Scanner(System.in);
	    
		System.out.println("Introduce la renta: ");
	    
		//Declaramos una renta
		int renta = entrada.nextInt();
		//Creamos la variable impuestos
		int imp = 0;
		if (renta <= 0)
			System.out.println("la renta tiene que ser mayor que 0");
		else {
		if (renta < 10000) 
		imp = 5;
		
		else if (renta < 20000) 
		imp = 15;
		
		else if (renta < 35000) 
		imp = 20;
		
		else if (renta < 60000) 
		imp = 30;
		
		else 
	    imp = 45;
	    System.out.println("El porcentaje es: " + imp + "%");
	    
		
		}
	}
}
