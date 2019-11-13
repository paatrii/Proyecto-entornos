package programacionmodular;

import java.util.Scanner;

public class calculadora2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcion=1;
		double num1=0;
		double num2=0;
		double resultado=0;
		boolean salir = false;
		ejecutarPrograma();
		
	}
		
/////////////////////////////////////////////////////////////////////
		public static int ejecutarPrograma() {
			boolean salir;
			do{
				int opcion = verMenu();
				salir = (opcion == 5);
				Operaciones(opcion);
				

			}while(!salir);
			
			if(salir){
				System.out.println("Saliendo del programa");
			}
		}
		
		
////////////////////////////////////////////////////////////////////////////////
		
		public static int verMenu() {
			
			boolean opcionValida;
			int opcion;
			System.out.println("1 Suma");
			System.out.println("2 Resta");
			System.out.println("3 Multiplicacion");
			System.out.println("4 Division");
			System.out.println("5 Salir");
			
			System.out.print("Introduce una opcion: ");
			do {
				opcion = entrada.nextInt();
				opcionValida = opcion >= 1 && opcion < 6;
				
				if (!opcionValida) {
					System.out.print("Error, elija una opcion entre 1 y 5: ");
				}
			}while(!opcionValida);
			
			return opcion;
		}
	
///////////////////////////////////////////////////////////////////////////////
		
		public static void Operaciones (int opcion) {
			System.out.println("Introduzca numero 1: ");
			int num1=entrada.nextDouble();
			System.out.println("Introduce numero 2: ");
			int num2=entrada.nextDouble();
			
			switch(opcion) {
			case 1:
				int suma = calcularSuma(num1, num2);
				System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
				break;
			
			case 2:
				int resta = calcularResta(num1, num2);
				System.out.println("La resta de " + num1 + " menos " + num2 + " es " + resta);
			
			case 3:
				int multiplicacion = calcularMultiplicacion(num1, num2);
				System.out.println("La multiplicacion de " + num1 + " por " + num2 + " es igual a " + multiplicacion);
				
			case 4:
				int division = calcularDivision(num1, num2);
				System.out.println("La division de " + num1 + " entre " + num2 + "es igual a " + division);
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////
		
		public static int calcularSuma(int num1, int num2) {
			return num1 + num2;
		}
		
//////////////////////////////////////////////////////////////////////////////////////
		
		public static int calcularResta(int num1, int num2) {
			return num1-num2;
		}
		
//////////////////////////////////////////////////////////////////////////////////
		
		public static int caslcularMultiplicacion(int num1, int num2) {
			return num1*num2;
		}
		
////////////////////////////////////////////////////////////////////////
		
		public static int calcularDivision(int num1, int num2) {

			if (num2 <= 0) {
				System.out.println("Error: El segundo operando tiene que ser mayor que cero para poder dividir");
			}
			
			return num1 / num2;
		}
	}
	

