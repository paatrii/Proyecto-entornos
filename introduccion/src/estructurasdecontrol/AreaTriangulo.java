package estructurasdecontrol;

import java.util.Scanner;

public class AreaTriangulo {

		/*Este programa introduce por teclado el área del rectangulo*/
		public static void main(String args[])
		{
			//Creamos un objeto de tipo scanner
			Scanner  entrada= new Scanner(System.in);
			//Introducimos por teclado los datos
			System.out.println("Introduce la base: ");
			int base= entrada.nextInt();
			System.out.println("Introduce la altura: ");
			int altura= entrada.nextInt();
			//Calculamos el área
			int area = base * altura;
			//Enviamos a pantalla el resultado
			System.out.println("El área es: " + area); 
	}
}
