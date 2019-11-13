package estructurasdecontrol;

import java.util.Scanner;

public class EvaluarEdadIf {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introducimos la edad: ");
		
		int  edad=entrada.nextInt();
		
		if(edad >=18) {
			
		 System.out.println("Eres mayor de edad.");
		 
		}
		else {
			System.out.println("Eres menor de edad.");
			
		}
		
		
	}
	
	
}
