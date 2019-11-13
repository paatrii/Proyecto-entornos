package estructurasdecontrol;

import java.util.Scanner;

public class EvaluarEdadIfElse2 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introducimos la edad: ");
		
		int  edad=entrada.nextInt();
		
		if(edad < 18){
			
			System.out.println("Eres un adolescente.");
		}
		
		else if (edad < 40) {
			
			System.out.println("Eres joven.");
		}
		
		else if (edad <65 ) {
			System.out.println("Eres maduro.");
		}
		
		else {
			System.out.println("Cuidate.");
		}
		
	}
	
	
}