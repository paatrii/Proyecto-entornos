package estructurasdecontrol;

import java.util.Scanner;

public class CompruebaEmailFor {
	
	public static void main (String[] args) {
	
		boolean arroba=false;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el Email:");
		int email= entrada.nextInt();
		
		for(int i=0; i<email; i++) {
		
			if(email=='@'){
				
				arroba=true;
			}
		}
		
		if(arroba=true) {
			System.out.println("Es correco");
		}
		else {
			System.out.println("No es correcto");
		}
	}
	

}
