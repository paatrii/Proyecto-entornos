package programacionmodular;

//Importamos la clase Scanner
import java.util.Scanner;

public class calculadora3 {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ejecutarPrograma();

	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void ejecutarPrograma() {
		boolean salir;
		do{
			int opcion = verMenu();
			salir = (opcion == 5);
			Operaciones(opcion);
			

		}while(!salir);
		
		if(salir) {
			System.out.println("Salir del programa");
		}
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static int verMenu() {
		boolean opcionValida;
		int opcion;
		System.out.println("MENU");
		System.out.println("1.-Suma");
		System.out.println("2.-Resta");
		System.out.println("3.-Multiplicacion");
		System.out.println("4.-Division");
		System.out.println("5.-Salir");
		System.out.print("Introduzca la operacion a realizar: ");
		do {
			opcion = entrada.nextInt();
			opcionValida = opcion >= 1 && opcion < 6;
			
			if (!opcionValida) {
				System.out.print("Error. Elija una opcion entre 1 y 5: ");
			}
		}while(!opcionValida);
		
		return opcion;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void Operaciones(int opcion) {
		
		if(opcion != 5) {
			
		System.out.print("Introduce el numero 1: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Introduce el numero 2: ");
		int num2 = entrada.nextInt();
		
		switch(opcion) {
			case 1:
				int suma = calcSuma(num1, num2);
				System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
				break;
			
			case 2:
				int resta = calcResta(num1, num2);
				System.out.println("La resta de " + num1 + " menos " + num2 + " es " + resta);
			
			case 3:
				int multiplicacion = calcMultiplicacion(num1, num2);
				System.out.println("La multiplicacion de " + num1 + " por " + num2 + " es igual a " + multiplicacion);
				
			case 4:
				int division = calcDivision(num1, num2);
				System.out.println("La division de " + num1 + " entre " + num2 + " es igual a " + division);
				
		}
		
	  }
		
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	public static int calcSuma(int num1, int num2) {
		return num1 + num2;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static int calcResta(int num1, int num2) {
		return num1 - num2;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static int calcMultiplicacion(int num1, int num2) {
		return num1 * num2;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static int calcDivision(int num1, int num2) {

		if (num2 <= 0) {
			System.out.println("Error: El segundo operando tiene que ser mayor que cero para poder dividir");
		}
		
		return num1 / num2;
	}
}