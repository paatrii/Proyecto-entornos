package programacionmodular;

import java.util.Scanner;

public class ValidarFecha {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int ano = pedirAno();
		int mes = pedirMes();
		int dia = pedirDia();
		validarDia (mes, ano, dia);
		
	}
	
////////////////////////////////////////////////////////////////////////////////////////////
	
	public static int pedirAno() {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introducimos el año: ");
		return entrada.nextInt();
///////////////////////////////////////////////////////////////////////////////////////////
	
	public static int pedirMes() {
			
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introducimos el mes: ");
		return entrada.nextInt();
	}
////////////////////////////////////////////////////////////////////////////////////
		
		public static int pedirDia() {
			
			Scanner entrada = new Scanner (System.in);
			
		}
		
		
		
	}

}