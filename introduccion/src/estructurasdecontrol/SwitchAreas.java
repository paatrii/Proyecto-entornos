package estructurasdecontrol;

import java.util.Scanner;

public class SwitchAreas {

	public static void main(String[] args){

		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Elige una opci�n: \n1: Cuadrado \n2: Rect�ngulo \n3: Tri�ngulo \n4: Circulo");
		
		int figura=entrada.nextInt();
		
		switch(figura) {
		
		case 1:
			
			System.out.println("Introduce el lado: ");
			double lado=entrada.nextDouble();
			System.out.println("El �rea del cuadrado  es: " +lado);

			break;
			
		case 2:
			
			System.out.println("Introduce la base: ");
			double base=entrada.nextDouble();
			System.out.println("Introduce la altura: ");
			double altura=entrada.nextDouble();
			System.out.println("El �rea del rect�ngulo es: " +base*altura);
			
			break;
			
		case 3: 
			
			System.out.println("Introduce la base: ");
			base=entrada.nextDouble();
			System.out.println("Introduce la altura: ");
			altura=entrada.nextDouble();
			
			System.out.println("El �rea del tri�ngulo es: " +(base*altura)/2);
			
			break;
			
		case 4:
			
			System.out.println("Introduce el radio: ");
			double radio=entrada.nextDouble();
			System.out.println("Introduzca pi:");
			double pi = entrada.nextDouble();
			System.out.println("El �rea del c�rculo es: " + (pi*(radio*2)));
		
			break;
			
		default:
			System.out.println("La opci�n no es correcta");
			
		}  
	
		
	}
	
}
